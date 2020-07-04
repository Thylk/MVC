package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.LigneCommande;
import fr.doranco.eboutique.entity.Produit;

public class LigneCommandeDAO implements ILigneCommandeDAO {

	@Override
	public LigneCommande addLigneCommande(LigneCommande ligneCommande, Integer idCommande) {
		
		Connection connection = null;
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO ligne_commande (produit_id, quantite, commande_id) VALUES (?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setInt(1, ligneCommande.getProduit().getId());
			pstatement.setInt(2, ligneCommande.getQuantite());
			pstatement.setInt(3, idCommande);

			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				ligneCommande.setId(rs.getInt(1));
			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return ligneCommande;
	}

	@Override
	public List<LigneCommande> getLigneCommande(Integer idCommande, Produit produit) {
		
		LigneCommande ligneCommande = null;
		Connection connection = null;
		List<LigneCommande> listeLigneCommande = new ArrayList<LigneCommande>();
		
		try {
			String requete = "SELECT * FROM ligne_commande WHERE commande_id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idCommande);

			ResultSet rs = pstatement.executeQuery();

			while (rs.next()) {
				
				ligneCommande = new LigneCommande();
				ligneCommande.setId(rs.getInt("id"));
				ligneCommande.setProduit(produit);
				ligneCommande.setQuantite(rs.getInt("quantite"));
				
				listeLigneCommande.add(ligneCommande);
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (connection != null) {
					connection.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return listeLigneCommande;
	}

}

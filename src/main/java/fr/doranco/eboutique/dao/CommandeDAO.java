package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.Commande;

public class CommandeDAO implements ICommandeDAO {
	
	@Override
	public Commande addCommande(Commande commande, Integer idUtilisateur) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO commande (date_creation, date_livraison, prix_total, commande_utilisateur_id) VALUES(?, ?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setString(1, commande.getDateCreation());
			pstatement.setString(2, commande.getDateLivraison());
			pstatement.setFloat(3, commande.getPrixTotal());
			pstatement.setInt(4, idUtilisateur);

			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				commande.setId(rs.getInt(1));
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
		
		return commande;
	}
	
	@Override
	public Commande getCommande(Integer idCommande) {
		
		Commande commande = null;
		Connection connection = null;

		try {
			String requete = "SELECT * FROM commande WHERE id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idCommande);

			ResultSet rs = pstatement.executeQuery();

			if (rs.next()) {
				commande = new Commande();
				commande.setId(rs.getInt("id"));
				commande.setDateCreation(rs.getString("date_creation"));
				commande.setDateLivraison(rs.getString("date_livraison"));
				commande.setPrixTotal(rs.getFloat("prix_total"));
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
		return commande;
	}

	@Override
	public List<Commande> getCommandes(Integer idUtilisateur) {

		Commande commande = null;
		Connection connection = null;
		List<Commande> listeCommandeUtilisateur = new ArrayList<Commande>();
		
		try {
			String requete = "SELECT * FROM commande WHERE commande_utilisateur_id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idUtilisateur);

			ResultSet rs = pstatement.executeQuery();

			while (rs.next()) {
				
				commande = new Commande();
				commande.setId(rs.getInt("id"));
				commande.setDateCreation(rs.getString("date_creation"));
				commande.setDateLivraison(rs.getString("date_livraison"));
				commande.setPrixTotal(rs.getFloat("prix_total"));
				
				listeCommandeUtilisateur.add(commande);
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
		return listeCommandeUtilisateur;
		
	}

}

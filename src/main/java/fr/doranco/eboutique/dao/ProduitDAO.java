package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.Produit;

public class ProduitDAO implements IProduitDAO {

	public ProduitDAO() {
		
	}
	
	@Override
	public Produit addProduit(Produit produit) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO produit (nom, description, prix, remise, categorie) VALUES(?, ?, ?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setString(1, produit.getNom());
			pstatement.setString(2, produit.getDescription());
			pstatement.setInt(3, produit.getPrix());
			pstatement.setInt(4, produit.getRemise());
			pstatement.setString(5, produit.getCategorie());

			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				produit.setId(rs.getInt(1));
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

		return produit;
		
	}

	@Override
	public Produit getProduit(Integer idProduit) {
		
		Produit produit = null;
		Connection connection = null;

		try {
			String requete = "SELECT * FROM produit WHERE id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idProduit);

			ResultSet rs = pstatement.executeQuery();

			if (rs.next()) {
				produit = new Produit();
				produit.setId(rs.getInt("id"));
				produit.setNom(rs.getString("nom"));
				produit.setDescription(rs.getString("description"));
				produit.setPrix(rs.getInt("prix"));
				produit.setRemise(rs.getInt("remise"));
				produit.setCategorie(rs.getString("categorie"));
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
		return produit;
		
	}

	@Override
	public List<Produit> getProduitsByCategorie(String categorie) {

		Produit produit = null;
		Connection connection = null;
		List<Produit> listeProduitByCat = new ArrayList<Produit>();
		
		try {
			String requete = "SELECT * FROM produit WHERE categorie = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setString(1, categorie);

			ResultSet rs = pstatement.executeQuery();

			while (rs.next()) {
				
				produit = new Produit();
				produit.setId(rs.getInt("id"));
				produit.setNom(rs.getString("nom"));
				produit.setDescription(rs.getString("description"));
				produit.setRemise(rs.getInt("remise"));
				produit.setCategorie(rs.getString("categorie"));
				
				listeProduitByCat.add(produit);
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
		return listeProduitByCat;
		
	}

	@Override
	public void updateProduit(Produit produit) {

		Connection connection = null;
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "UPDATE produit SET nom = ?, description = ?, prix = ?, remise = ?, categorie = ? WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setString(1, produit.getNom());
			pstatement.setString(2, produit.getDescription());
			pstatement.setInt(3, produit.getPrix());
			pstatement.setInt(4, produit.getRemise());
			pstatement.setString(5, produit.getCategorie());
			pstatement.setInt(6, produit.getId());
			
			pstatement.executeUpdate();
			
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
		
	}
	
	@Override
	public void deleteProduit(Integer idProduit) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "DELETE FROM produit WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idProduit);

			pstatement.executeUpdate();

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
		
	}

}

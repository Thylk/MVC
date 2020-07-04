package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.CartePaiement;
import fr.doranco.eboutique.entity.Utilisateur;

public class CartePaiementDAO implements ICartePaiementDAO {

	public CartePaiementDAO() {
		
	}

	@Override
	public CartePaiement addCartePaiement(CartePaiement cartePaiement, Integer idUtilisateur) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO carte_paiement (numero, datevalidite, cryptogramme, carte_utilisateur_id) VALUES(?, ?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setInt(1, cartePaiement.getNumero());
			pstatement.setString(2, cartePaiement.getDateValidite());
			pstatement.setInt(3, cartePaiement.getCryptogramme());
			pstatement.setInt(4, idUtilisateur);

			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				cartePaiement.setId(rs.getInt(1));
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
		
		return cartePaiement;
	}

	@Override
	public CartePaiement getCartePaiement(Integer idCarte) {

		CartePaiement cartePaiement = null;
		Connection connection = null;

		try {
			String requete = "SELECT * FROM carte_paiement WHERE id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idCarte);

			ResultSet rs = pstatement.executeQuery();

			if (rs.next()) {
				cartePaiement = new CartePaiement();
				cartePaiement.setId(rs.getInt("id"));
				cartePaiement.setNumero(rs.getInt("numero"));
				cartePaiement.setDateValidite(rs.getString("datevalidite"));
				cartePaiement.setCryptogramme(rs.getInt("cryptogramme"));
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
		return cartePaiement;
		
	}

	@Override
	public List<CartePaiement> getCartesPaiement(Integer idUtilisateur) {

		Connection connection = null;
		List<CartePaiement> listeCartePaiementUtilisateur = new ArrayList<CartePaiement>();
		
		try {
			String requete = "SELECT * FROM carte_paiement WHERE carte_utilisateur_id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idUtilisateur);

			ResultSet rs = pstatement.executeQuery();

			while (rs.next()) {
				
				CartePaiement cartePaiement = new CartePaiement();
				cartePaiement.setId(rs.getInt("id"));
				cartePaiement.setNumero(rs.getInt("numero"));
				cartePaiement.setDateValidite(rs.getString("datevalidite"));
				cartePaiement.setCryptogramme(rs.getInt("cryptogramme"));
				
				listeCartePaiementUtilisateur.add(cartePaiement);
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
		return listeCartePaiementUtilisateur;
		
	}

	@Override
	public Utilisateur deleteCartePaiement(Integer idCarte) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "DELETE FROM carte_paiement WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idCarte);

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
		return null;
		
	}
	
}

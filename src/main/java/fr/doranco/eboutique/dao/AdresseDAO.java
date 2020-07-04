package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.Adresse;

public class AdresseDAO implements IAdresseDAO {

	public AdresseDAO() {
		
	}

	@Override
	public Adresse addAdresse(Adresse adresse) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO adresse (numero, rue, ville, codepostal) VALUES(?, ?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setInt(1, adresse.getNumero());
			pstatement.setString(2, adresse.getRue());
			pstatement.setString(3, adresse.getVille());
			pstatement.setInt(4, adresse.getCodePostal());


			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				adresse.setId(rs.getInt(1));
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

		return adresse;
		
	}

	@Override
	public Adresse getAdresse(Integer idAdresse) {
		
		Adresse adresse = null;
		Connection connection = null;

		try {
			String requete = "SELECT * FROM adresse WHERE id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idAdresse);

			ResultSet rs = pstatement.executeQuery();

			if (rs.next()) {
				adresse = new Adresse();
				adresse.setId(rs.getInt("id"));
				adresse.setNumero(rs.getInt("numero"));
				adresse.setRue(rs.getString("rue"));
				adresse.setVille(rs.getString("ville"));
				adresse.setCodePostal(rs.getInt("codepostal"));
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
		return adresse;
	}

	@Override
	public Adresse updateAdresse(Adresse adresse, Integer idUtilisateur) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "UPDATE adresse SET numero = ?, rue = ?, ville = ?, codepostal = ? WHERE utilisateur_id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, adresse.getNumero());
			pstatement.setString(2, adresse.getRue());
			pstatement.setString(3, adresse.getVille());
			pstatement.setInt(4, adresse.getCodePostal());
			pstatement.setInt(5, idUtilisateur);
			
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
		return adresse;
	}

	@Override
	public void deleteAdresse(Integer idUtilisateur) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "DELETE FROM adresse WHERE utilisateur_id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idUtilisateur);

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

package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.Adresse;
import fr.doranco.eboutique.entity.CartePaiement;
import fr.doranco.eboutique.entity.Utilisateur;
import fr.doranco.eboutique.metier.AdresseControl;

public class UtilisateurDAO implements IUtilisateurDAO {

	@Override
	public Utilisateur getUtilisateurById(Integer idUtilisateur) {
		
		Connection connection = null;
		Utilisateur utilisateur = null;
		
		try {
			connection = DataSource.getInstance().getConnection();
			
			String requete = "SELECT * FROM utilisateur WHERE id = ?";
			PreparedStatement ps = connection.prepareStatement(requete);
			ps.setInt(1, idUtilisateur);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setId(rs.getInt(1));
				utilisateur.setLogin(rs.getString(2));
				utilisateur.setEmail(rs.getString(3));
				utilisateur.setPassword(rs.getString(4));
				utilisateur.setNom(rs.getString(5));
				utilisateur.setPrenom(rs.getString(6));
				utilisateur.setAge(rs.getInt(7));
				utilisateur.setRole(rs.getString(8));
				utilisateur.setTelephone(rs.getString(9));
				utilisateur.setActif(rs.getBoolean(10));
				
				AdresseControl adresseControl = new AdresseControl();
				Adresse adresse = adresseControl.getAdresse(rs.getInt(11));
				utilisateur.setAdresse(adresse);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return utilisateur;
		
	}

	@Override
	public Utilisateur getUtilisateurByLogin(String login) {
		
		Connection connection = null;
		Utilisateur utilisateur = null;
		
		try {
			connection = DataSource.getInstance().getConnection();
			
			String requete = "SELECT * FROM utilisateur WHERE login = ?";
			PreparedStatement ps = connection.prepareStatement(requete);
			ps.setString(1, login);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setId(rs.getInt(1));
				utilisateur.setLogin(rs.getString(2));
				utilisateur.setEmail(rs.getString(3));
				utilisateur.setPassword(rs.getString(4));
				utilisateur.setNom(rs.getString(5));
				utilisateur.setPrenom(rs.getString(6));
				utilisateur.setAge(rs.getInt(7));
				utilisateur.setRole(rs.getString(8));
				utilisateur.setTelephone(rs.getString(9));
				utilisateur.setActif(rs.getBoolean(10));
				
				AdresseControl adresseControl = new AdresseControl();
				Adresse adresse = adresseControl.getAdresse(rs.getInt(11));
				utilisateur.setAdresse(adresse);
			}

			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return utilisateur;
		
	}

	@Override
	public Utilisateur getUtilisateurByEmail(String email) {
		
		Connection connection = null;
		Utilisateur utilisateur = null;
		
		try {
			connection = DataSource.getInstance().getConnection();
			
			String requete = "SELECT * FROM utilisateur WHERE email = ?";
			PreparedStatement ps = connection.prepareStatement(requete);
			ps.setString(1, email);
			
			ResultSet rs = ps.executeQuery();
			
			if (rs.next()) {
				utilisateur = new Utilisateur();
				utilisateur.setId(rs.getInt(1));
				utilisateur.setLogin(rs.getString(2));
				utilisateur.setEmail(rs.getString(3));
				utilisateur.setPassword(rs.getString(4));
				utilisateur.setNom(rs.getString(5));
				utilisateur.setPrenom(rs.getString(6));
				utilisateur.setAge(rs.getInt(7));
				utilisateur.setRole(rs.getString(8));
				utilisateur.setTelephone(rs.getString(9));
				utilisateur.setActif(rs.getBoolean(10));
				
				AdresseDAO adresseDAO = new AdresseDAO();
				Adresse adresse = adresseDAO.getAdresse(rs.getInt(11));
				utilisateur.setAdresse(adresse);
			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return utilisateur;
		
	}

	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {
		
		Connection connection = null;
		Utilisateur utilisateurAdded = null;
		
		try {
			connection = DataSource.getInstance().getConnection();
			
			String requete = "INSERT INTO utilisateur (login, email, password, nom, prenom, age, role, telephone, actif, adresse_id) VALUES(?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
			PreparedStatement ps = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);
			ps.setString(1, utilisateur.getLogin());
			ps.setString(2, utilisateur.getEmail());
			ps.setString(3, utilisateur.getPassword());
			ps.setString(4, utilisateur.getNom());
			ps.setString(5, utilisateur.getPrenom());
			ps.setInt(6, utilisateur.getAge());
			ps.setString(7, utilisateur.getRole());
			ps.setString(8, utilisateur.getTelephone());
			ps.setBoolean(9, utilisateur.setActif(true));
			ps.setInt(10, utilisateur.getAdresse().getId());

			ps.executeUpdate();
			
			utilisateurAdded = utilisateur;
			
			ResultSet rs = ps.getGeneratedKeys();
			
			if (rs.next()) {
				
				utilisateurAdded.setId(rs.getInt(1));
				return utilisateurAdded;
				
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (connection != null) {
				try {
					connection.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
		return utilisateurAdded;
		
	}

	@Override
	public void updateUtilisateur(Utilisateur utilisateur) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "UPDATE utilisateur SET nom = ?, prenom = ?, age = ?, role = ?, email = ?, login = ?, password = ?, telephone = ? WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setString(1, utilisateur.getNom());
			pstatement.setString(2, utilisateur.getPrenom());
			pstatement.setInt(3, utilisateur.getAge());
			pstatement.setString(4, utilisateur.getRole());
			pstatement.setString(5, utilisateur.getEmail());
			pstatement.setString(6, utilisateur.getLogin());
			pstatement.setString(7, utilisateur.getPassword());
			pstatement.setString(8, utilisateur.getTelephone());
			pstatement.setInt(9, utilisateur.getId());
			
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
	public void seConnecter(String login, String password) {
		
		String databasePassword = null;
		Connection connection = null;

		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "SELECT password FROM utilisateur WHERE login = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setString(1, login);

			ResultSet rs = pstatement.executeQuery();
		
			if (rs.next()) {
		        databasePassword = rs.getString("password");
		    } 	
			
			if (password.equals(databasePassword)) {
				System.out.println("Successful Login!\n----");
		    } else {
		    	System.out.println("Incorrect Password\n----");
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
		
	}

	@Override
	public void seDesinscrire(Utilisateur utilisateur) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "UPDATE utilisateur SET actif = ? WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setBoolean(1, utilisateur.setActif(false));
			pstatement.setInt(2, utilisateur.getId());

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
	public void seDeconnecter(Integer id) {
		
		System.out.println("Successfully disconnected !");
		
	}
	
	
}

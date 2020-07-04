package fr.doranco.eboutique.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import fr.doranco.eboutique.datasource.DataSource;
import fr.doranco.eboutique.entity.Article;

public class ArticleDAO implements IArticleDAO {

	@Override
	public Article addArticle(Article article) {
		
		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "INSERT INTO article (produit_id, quantite, utilisateur_id) VALUES(?, ?, ?)";
			PreparedStatement pstatement = connection.prepareStatement(requete, Statement.RETURN_GENERATED_KEYS);

			pstatement.setInt(1, article.getProduitId());
			pstatement.setInt(2, article.getQuantite());
			pstatement.setInt(3, article.getUtilisateurId());

			pstatement.executeUpdate();

			ResultSet rs = pstatement.getGeneratedKeys();
			
			if (rs.next()) {
				article.setId(rs.getInt(1));
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
		
		return article;
	}

	@Override
	public List<Article> getArticles(Integer idUtilisateur) {

		Article article = null;
		Connection connection = null;
		List<Article> listeArticleUtilisateur = new ArrayList<Article>();
		
		try {
			String requete = "SELECT * FROM article WHERE utilisateur_id = ?";

			connection = DataSource.getInstance().getConnection();

			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idUtilisateur);

			ResultSet rs = pstatement.executeQuery();

			while (rs.next()) {
				
				article = new Article();
				article.setId(rs.getInt("id"));
				article.setProduitId(rs.getInt("produit_id"));
				article.setQuantite(rs.getInt("quantite"));
				article.setUtilisateurId(idUtilisateur);
				
				listeArticleUtilisateur.add(article);
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
		return listeArticleUtilisateur;
	}

	@Override
	public void removeArticle(Integer idArticle) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "DELETE FROM article WHERE id = ?";
			PreparedStatement pstatement = connection.prepareStatement(requete);
			pstatement.setInt(1, idArticle);

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
	public void clear(Integer idUtilisateur) {

		Connection connection = null;
		
		try {
			connection = DataSource.getInstance().getConnection();

			String requete = "DELETE FROM article WHERE utilisateur_id = ?";
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

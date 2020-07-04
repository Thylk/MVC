package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.dao.ArticleDAO;
import fr.doranco.eboutique.entity.Article;

public class ArticleControl implements IArticleControl {

	@Override
	public Article addArticle(Article article) {
		
		ArticleDAO articleDAO = new ArticleDAO();
		Article articleAdded = articleDAO.addArticle(article);
		
		return articleAdded;
	}

	@Override
	public List<Article> getArticles(Integer idUtilisateur) {
		
		ArticleDAO articleDAO = new ArticleDAO();
		List<Article> articleAdded = articleDAO.getArticles(idUtilisateur);
		
		return articleAdded;
	}

	@Override
	public void removeArticle(Integer idArticle) {

		ArticleDAO articleDAO = new ArticleDAO();
		articleDAO.removeArticle(idArticle);
		
	}

	@Override
	public void clear(Integer idUtilisateur) {

		ArticleDAO articleDAO = new ArticleDAO();
		articleDAO.clear(idUtilisateur);
		
	}

}

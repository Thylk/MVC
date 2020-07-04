package fr.doranco.eboutique.dao;

import java.util.List;

import fr.doranco.eboutique.entity.Article;

public interface IArticleDAO {

	Article addArticle(Article article);
	List<Article> getArticles(Integer idUtilisateur);
	void removeArticle(Integer idArticle);
	void clear(Integer idUtilisateur);
	
}

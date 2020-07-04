package fr.doranco.eboutique.mains;

import java.util.List;

import fr.doranco.eboutique.entity.Article;
import fr.doranco.eboutique.metier.ArticleControl;

public class MainArticleTest {

	public static void main(String[] args) {
		
		/*/ ADD NEW ARTICLE
		ArticleControl articleControl = new ArticleControl();
		
		Article article = new Article(1, 3, 35);
		
		Article produitAdded = articleControl.addArticle(article);
		System.out.println("Article ajouté : " + produitAdded.toString());
		/*/

		/*/ GET LIST<ARTICLE>
		ArticleControl articleControl = new ArticleControl();
		
		int idUtilisateur = 35;
		List<Article> listArticle = articleControl.getArticles(idUtilisateur);
		System.out.println("Liste d'article recuperée : " + listArticle);
		/*/
	}

}

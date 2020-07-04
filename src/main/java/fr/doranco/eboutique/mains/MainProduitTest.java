package fr.doranco.eboutique.mains;

import java.util.List;

import fr.doranco.eboutique.entity.Produit;
import fr.doranco.eboutique.metier.ProduitControl;

public class MainProduitTest {

	public static void main(String[] args) {
		
		/*/ ADD NEW PRODUIT
		ProduitControl produitControl = new ProduitControl();
		
		Produit produit = new Produit("I-Phone XS", "Trop pas cher le tel", 129, 30, "Telephone");
		
		Produit produitAdded = produitControl.addProduit(produit);
		System.out.println("Produit ajouté : " + produitAdded.toString());
		/*/

		/*/ GET PRODUIT BY ID
		ProduitControl produitControl = new ProduitControl();
		int idProduit = 1;
		Produit produitGet = produitControl.getProduit(idProduit);
		System.out.println("Produit recuperé : " + produitGet);
		/*/
		
		/*/ UPDATE PRODUIT
		ProduitControl produitControl = new ProduitControl();
		
		Produit newProduit = new Produit(1, "Galaxy 9", "Trop bien", 745, 59, "Telephone");
		
		produitControl.updateProduit(newProduit);
		/*/
		
		/*/ DELETE PRODUIT
		ProduitControl produitControl = new ProduitControl();
		int idProdToDelete = 1;
		produitControl.deleteProduit(idProdToDelete);
		/*/
		
		/*/ GET LIST<PRODUIT>
		ProduitControl produitControl = new ProduitControl();
		
		String categorie = "Telephone"; 
		List<Produit> listProduit = produitControl.getProduitsByCategorie(categorie);
		System.out.println("Liste de produit recupérée : " + listProduit);
		/*/
	}

}

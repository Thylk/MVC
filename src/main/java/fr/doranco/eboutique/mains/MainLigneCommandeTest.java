package fr.doranco.eboutique.mains;

import java.util.List;

import fr.doranco.eboutique.entity.LigneCommande;
import fr.doranco.eboutique.entity.Produit;
import fr.doranco.eboutique.metier.LigneCommandeControl;

public class MainLigneCommandeTest {

	public static void main(String[] args) {
		
		/*/ ADD LIGNECOMMANDE WITH USER ID AND PRODUCT ID
		LigneCommandeControl ligneCommandeControl = new LigneCommandeControl();
		
		Produit produit = new Produit(1, "Sweat", "Trop cool", 59, 20, "Sweat à capuche");
		Integer quantite = 2;
		LigneCommande ligneCommande = new LigneCommande(produit, quantite);
		
		int idUtilisateur = 35;
		LigneCommande ligneCommandeAdded = ligneCommandeControl.addLigneCommande(ligneCommande, idUtilisateur);
		System.out.println("LigneCommande ajoutée : " + ligneCommandeAdded.toString());
		/*/

		/*/ GET LIGNECOMMANDE
		LigneCommandeControl ligneCommandeControl = new LigneCommandeControl();
		
		Integer idProduit = 1;
		Integer idUtilisateur = 34;
		LigneCommande ligneCommande = ligneCommandeControl.getLigneCommande(idUtilisateur, idProduit);
		
		System.out.println("LigneCommande recupérée : " + ligneCommande.toString());
		/*/
		
		// GET LIST<COMMANDE> GETCOMMANDES(INTEGER IDUTILISATEUR)
		LigneCommandeControl articleControl = new LigneCommandeControl();
		
		Produit produit = new Produit(1, "Sweat", "Trop cool", 59, 20, "Sweat à capuche");
		int idCommande = 35;
		List<LigneCommande> listCommande = articleControl.getLigneCommande(idCommande, produit);
		System.out.println("Liste de commandes recuperée : " + listCommande.toString());
		//
	}

}

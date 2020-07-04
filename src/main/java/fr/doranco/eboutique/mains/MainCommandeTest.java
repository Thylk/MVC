package fr.doranco.eboutique.mains;

import java.util.List;

import fr.doranco.eboutique.entity.Commande;
import fr.doranco.eboutique.metier.CommandeControl;

public class MainCommandeTest {

	public static void main(String[] args) {

		/*/ ADD COMMANDE
		CommandeControl commandeControl = new CommandeControl();
		
		float prixtotal = 400;
		Commande commande = new Commande("18/06/1992", "20/12/2039", prixtotal);
		
		int idUtilisateur = 35;
		
		Commande commandeAdded = commandeControl.addCommande(commande, idUtilisateur);
		System.out.println("Commande ajoutée : " + commandeAdded.toString());
		/*/
		
		/*/ GET COMMANDE BY COMMANDE_ID
		CommandeControl commandeControl = new CommandeControl();
		Integer idCommande = 2;
		Commande cartePaiementGet = commandeControl.getCommande(idCommande);
		System.out.println("Commande recuperée : " + cartePaiementGet);
		/*/

		// GET LIST
		CommandeControl commandeControl = new CommandeControl();
		
		int idUtilisateur = 35;
		List<Commande> listCommande = commandeControl.getCommandes(idUtilisateur);
		System.out.println("Liste de commande de l'utilisateur : " + listCommande);
		//
	}

}

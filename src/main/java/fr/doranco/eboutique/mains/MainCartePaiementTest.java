package fr.doranco.eboutique.mains;

import java.util.List;

import fr.doranco.eboutique.entity.CartePaiement;
import fr.doranco.eboutique.metier.CartePaiementControl;
import fr.doranco.eboutique.metier.UtilisateurControl;

public class MainCartePaiementTest {

	public static void main(String[] args) {

		/*/ ADD CARTE PAIEMENT
		CartePaiementControl cartePaiementControl = new CartePaiementControl();
		
		CartePaiement cartePaiement = new CartePaiement(3644, "20/12/2039", 789);
		
		int idUtilisateur = 35;
		
		CartePaiement cartePaiementAdded = cartePaiementControl.addCartePaiement(cartePaiement, idUtilisateur);
		System.out.println("Carte ajoutée : " + cartePaiementAdded.toString());
		/*/
		
		/*/ GET CARTE BY ID
		CartePaiementControl cartePaiementControl = new CartePaiementControl();
		Integer idCarte = 2;
		CartePaiement cartePaiementGet = cartePaiementControl.getCartePaiement(idCarte);
		System.out.println("Carte recuperée : " + cartePaiementGet.toString());
		/*/
		
		/*/ GET LIST<CARTEPAIEMENT>
		CartePaiementControl cartePaiementControl = new CartePaiementControl();
		
		int idUtilisateur = 35;
		List<CartePaiement> listeCartePaiementUtilisateur = cartePaiementControl.getCartesPaiement(idUtilisateur);
		System.out.println("Liste de cartes de l'utilisateur : " + listeCartePaiementUtilisateur);
		/*/

	}

}

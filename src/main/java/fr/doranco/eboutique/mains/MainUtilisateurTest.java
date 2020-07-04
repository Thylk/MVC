package fr.doranco.eboutique.mains;

import fr.doranco.eboutique.entity.Adresse;
import fr.doranco.eboutique.entity.Utilisateur;
import fr.doranco.eboutique.metier.AdresseControl;
import fr.doranco.eboutique.metier.UtilisateurControl;

public class MainUtilisateurTest {

	public static void main(String[] args) {
		
		// ADD USER AVEC ADRESSE + GET
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		AdresseControl adresseControl = new AdresseControl();
		
		Adresse adresse = new Adresse(18, "Rue Gabriel Péri", "Paris", 75000);
		adresseControl.addAdresse(adresse);
		
		Utilisateur utilisateur = new Utilisateur("Dupont", "Jean", 25, false, "Client", adresse, "email6@gmail.com", "login6", "1234", "0147335598");
		
		Utilisateur utilisateurAdded = utilisateurControl.addUtilisateur(utilisateur);
		System.out.println("Utilisateur ajouté : " + utilisateurAdded.toString());
		
		Utilisateur utilisateurFinal = utilisateurControl.getUtilisateurById(utilisateur.getId());
		System.out.println("Utilisateur récuperé : " + utilisateurFinal.toString());
		//
		
		
		/*/ UPDATE USER
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		
		Utilisateur utilisateur = new Utilisateur(35, "Hollandit", "Tom", 25, "Admin", "email@gmail.com", "login1", "1234", "0147335598");
		Utilisateur utilisateurUpdated = utilisateurControl.updateUtilisateur(utilisateur);
		System.out.println("Utilisateur modifié : " + utilisateurUpdated.toString());
		
		Utilisateur utilisateurFinal = utilisateurControl.getUtilisateurById(utilisateur.getId());
		System.out.println("Utilisateur final : " + utilisateurFinal.toString());
		/*/
		
		
		/*/ DESINSCRIPTION
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		Utilisateur utilisateur = new Utilisateur(40);
		utilisateurControl.seDesinscrire(utilisateur);
		//*/
		
		/*/ AUTHENTICATION LOGIN
		String loginRenseigne = "login1";
		String passwordRenseigne = "1234";
		
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		utilisateurControl.seConnecter(loginRenseigne, passwordRenseigne);
		/*/
		
		/*/ LOGOUT
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		utilisateurControl.seDeconnecter(id);
		/*/
		
	}

}

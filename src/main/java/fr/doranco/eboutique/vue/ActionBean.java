package fr.doranco.eboutique.vue;

import java.awt.Component;

import javax.swing.JOptionPane;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import fr.doranco.eboutique.entity.Adresse;
import fr.doranco.eboutique.entity.Utilisateur;
import fr.doranco.eboutique.metier.AdresseControl;
import fr.doranco.eboutique.metier.UtilisateurControl;

public abstract class ActionBean {
	
	private final static Logger LOGGER = LogManager.getLogger(ActionBean.class);

	public static boolean seConnecter(String login, String password) {
		
		LOGGER.trace("Connexion en cours...");
		LOGGER.warn("Attention...");
		LOGGER.info("Connexion en cours...");
		LOGGER.error("Echec connexion.");
		System.out.println("action 'se connecter' a été activée.");
		
		return false;
	}

	public static boolean creerCompte(String nom, String prenom, String age, String role,String telephone, String login, String email, String password,
									String numero, String rue, String ville, String codePostal) {
		
		UtilisateurControl utilisateurControl = new UtilisateurControl();
		//System.out.println("action 'créer compte' a été activée.");
		boolean checkCompte = true;
		
		boolean isExistEmail = utilisateurControl.getUtilisateurByEmail(email) != null;
		if (isExistEmail) {
			JOptionPane.showMessageDialog(null, "Cet email est déjà utilisé !");
			return checkCompte = false;
		}
		
		boolean isExistLogin = utilisateurControl.getUtilisateurByLogin(login) != null;
		if (isExistLogin) {
			JOptionPane.showMessageDialog(null, "Ce login est déjà utilisé !");
			return checkCompte = false;
		}
		
		if (checkCompte == true) {
			
			int numeroInt = Integer.valueOf(numero);
			int codepostalInt = Integer.valueOf(codePostal);
			AdresseControl adresseControl = new AdresseControl();
			Adresse adresse = new Adresse(numeroInt, rue, ville, codepostalInt);
			adresseControl.addAdresse(adresse);
			
			boolean actif = true;
			int ageInt = Integer.valueOf(age);
			Utilisateur utilisateur = new Utilisateur(nom, prenom, ageInt, actif, role, adresse, email, login, password, telephone);
			utilisateurControl.addUtilisateur(utilisateur);
		}
		
		return checkCompte;

	}


}

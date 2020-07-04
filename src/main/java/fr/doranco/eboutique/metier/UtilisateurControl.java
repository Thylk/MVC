package fr.doranco.eboutique.metier;

import fr.doranco.eboutique.dao.UtilisateurDAO;
import fr.doranco.eboutique.entity.Adresse;
import fr.doranco.eboutique.entity.Utilisateur;

public class UtilisateurControl implements IUtilisateurControl{

	@Override
	public Utilisateur getUtilisateurById(Integer id) {
		
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		Utilisateur utilisateur = utilisateurDAO.getUtilisateurById(id);
		
		return utilisateur;
	}

	@Override
	public Utilisateur getUtilisateurByLogin(String login) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		Utilisateur utilisateur = utilisateurDAO.getUtilisateurByLogin(login);
		
		return utilisateur;
		
	}

	@Override
	public Utilisateur getUtilisateurByEmail(String email) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		Utilisateur utilisateur = utilisateurDAO.getUtilisateurByEmail(email);
		
		return utilisateur;
		
	}

	@Override
	public Utilisateur addUtilisateur(Utilisateur utilisateur) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateurDAO.addUtilisateur(utilisateur);
		
		return utilisateur;
	}

	@Override
	public Utilisateur updateUtilisateur(Utilisateur utilisateur) {
		
		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateurDAO.updateUtilisateur(utilisateur);
		
		return utilisateur;
		
	}

	@Override
	public void seConnecter(String login, String password) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateurDAO.seConnecter(login, password);
		
	}

	@Override
	public void seDeconnecter(Integer id) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateurDAO.seDeconnecter(id);
		
	}

	@Override
	public void seDesinscrire(Utilisateur utilisateur) {

		UtilisateurDAO utilisateurDAO = new UtilisateurDAO();
		utilisateurDAO.seDesinscrire(utilisateur);
		
	}


}

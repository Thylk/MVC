package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.dao.CartePaiementDAO;
import fr.doranco.eboutique.entity.CartePaiement;
import fr.doranco.eboutique.entity.Utilisateur;

public class CartePaiementControl implements ICartePaiementControl {

	@Override
	public CartePaiement addCartePaiement(CartePaiement cartePaiement, Integer idUtilisateur) {

		CartePaiementDAO cartePaiementDAO = new CartePaiementDAO();
		cartePaiementDAO.addCartePaiement(cartePaiement, idUtilisateur);
		
		return cartePaiement;
		
	}

	@Override
	public CartePaiement getCartePaiement(Integer idUtilisateur) {
		
		CartePaiementDAO cartePaiementDAO = new CartePaiementDAO();
		CartePaiement cartePaiement = cartePaiementDAO.getCartePaiement(idUtilisateur);
		
		return cartePaiement;
		
	}
	
	@Override
	public List<CartePaiement> getCartesPaiement(Integer idUtilisateur) {
		
		CartePaiementDAO cartePaiementDAO = new CartePaiementDAO();
		List<CartePaiement> listeCartePaiementUtilisateur = cartePaiementDAO.getCartesPaiement(idUtilisateur);
		
		return listeCartePaiementUtilisateur;
	}

	@Override
	public Utilisateur deleteCartePaiement(Integer idCarte) {

		CartePaiementDAO cartePaiementDAO = new CartePaiementDAO();
		cartePaiementDAO.deleteCartePaiement(idCarte);
		
		return null;
	}


}

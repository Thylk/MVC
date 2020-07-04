package fr.doranco.eboutique.dao;

import java.util.List;

import fr.doranco.eboutique.entity.CartePaiement;
import fr.doranco.eboutique.entity.Utilisateur;

public interface ICartePaiementDAO {

	CartePaiement addCartePaiement(CartePaiement cartePaiement, Integer idUtilisateur);
	CartePaiement getCartePaiement(Integer idCarte);
	List<CartePaiement> getCartesPaiement(Integer idUtilisateur);
	Utilisateur deleteCartePaiement(Integer idCarte);
	
}

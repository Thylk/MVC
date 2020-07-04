package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.dao.CommandeDAO;
import fr.doranco.eboutique.entity.Commande;

public class CommandeControl implements ICommandeControl {

	@Override
	public Commande addCommande(Commande commande, Integer idUtilisateur) {

		CommandeDAO commandeDAO = new CommandeDAO();
		commandeDAO.addCommande(commande, idUtilisateur);
		
		return null;
	}
	
	@Override
	public Commande getCommande(Integer idCommande) {

		CommandeDAO commandeDAO = new CommandeDAO();
		Commande commande = commandeDAO.getCommande(idCommande);
		
		return commande;
	}

	@Override
	public List<Commande> getCommandes(Integer idUtilisateur) {

		CommandeDAO commandeDAO = new CommandeDAO();
		List<Commande> listCommande = commandeDAO.getCommandes(idUtilisateur);
		
		return listCommande;
	}

}

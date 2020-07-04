package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.entity.Commande;

public interface ICommandeControl {

	Commande addCommande(Commande commande, Integer idUtilisateur);
	Commande getCommande(Integer idCommande);
	List<Commande> getCommandes(Integer idUtilisateur);
	
}

package fr.doranco.eboutique.dao;

import java.util.List;

import fr.doranco.eboutique.entity.Commande;

public interface ICommandeDAO {

	Commande addCommande(Commande commande, Integer idUtilisateur);
	Commande getCommande(Integer idCommande);
	List<Commande> getCommandes(Integer idUtilisateur);
	
}

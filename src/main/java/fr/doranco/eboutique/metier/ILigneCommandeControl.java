package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.entity.LigneCommande;
import fr.doranco.eboutique.entity.Produit;

public interface ILigneCommandeControl {

	LigneCommande addLigneCommande(LigneCommande ligneCommande, Integer idCommande);
	List<LigneCommande> getLigneCommande(Integer idCommande, Produit produit);
	
}

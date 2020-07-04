package fr.doranco.eboutique.dao;

import java.util.List;

import fr.doranco.eboutique.entity.LigneCommande;
import fr.doranco.eboutique.entity.Produit;

public interface ILigneCommandeDAO {

	LigneCommande addLigneCommande(LigneCommande ligneCommande, Integer idCommande);
	List<LigneCommande> getLigneCommande(Integer idCommande, Produit produit);
	
}

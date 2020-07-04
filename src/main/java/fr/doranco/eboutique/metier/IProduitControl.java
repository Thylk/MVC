package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.entity.Produit;

public interface IProduitControl {

	Produit addProduit(Produit produit);
	Produit getProduit(Integer idProduit);
	List<Produit> getProduitsByCategorie(String categorie);
	void updateProduit(Produit produit);
	void deleteProduit(Integer idProduit);
	
}

package fr.doranco.eboutique.dao;

import java.util.List;

import fr.doranco.eboutique.entity.Produit;

public interface IProduitDAO {

	Produit addProduit(Produit produit);
	Produit getProduit(Integer idProduit);
	List<Produit> getProduitsByCategorie(String categorie);
	void updateProduit(Produit produit);
	void deleteProduit(Integer idProduit);
	
}

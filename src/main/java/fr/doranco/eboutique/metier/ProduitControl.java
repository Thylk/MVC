package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.dao.ProduitDAO;
import fr.doranco.eboutique.entity.Produit;

public class ProduitControl implements IProduitControl {

	@Override
	public Produit addProduit(Produit produit) {
		
		ProduitDAO produitDAO = new ProduitDAO();
		produitDAO.addProduit(produit);
		
		return produit;
	}

	@Override
	public Produit getProduit(Integer idProduit) {

		ProduitDAO produitDAO = new ProduitDAO();
		Produit produit = produitDAO.getProduit(idProduit);
		
		return produit;
	}

	@Override
	public List<Produit> getProduitsByCategorie(String categorie) {
		
		ProduitDAO produitDAO = new ProduitDAO();
		List<Produit> produitAdded = produitDAO.getProduitsByCategorie(categorie);
		
		return produitAdded;
	}

	@Override
	public void updateProduit(Produit produit) {
		
		ProduitDAO produitDAO = new ProduitDAO();
		produitDAO.updateProduit(produit);
		
	}

	@Override
	public void deleteProduit(Integer idProduit) {
		
		ProduitDAO produitDAO = new ProduitDAO();
		produitDAO.deleteProduit(idProduit);
		
	}


}

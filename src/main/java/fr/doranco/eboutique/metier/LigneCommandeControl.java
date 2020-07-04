package fr.doranco.eboutique.metier;

import java.util.List;

import fr.doranco.eboutique.dao.LigneCommandeDAO;
import fr.doranco.eboutique.entity.LigneCommande;
import fr.doranco.eboutique.entity.Produit;

public class LigneCommandeControl implements ILigneCommandeControl {

	@Override
	public LigneCommande addLigneCommande(LigneCommande ligneCommande, Integer idCommande) {

		LigneCommandeDAO ligneCommandeDAO = new LigneCommandeDAO();
		LigneCommande ligneCommandeAdded = ligneCommandeDAO.addLigneCommande(ligneCommande, idCommande);
		
		return ligneCommandeAdded;
	}

	@Override
	public List<LigneCommande> getLigneCommande(Integer idCommande, Produit produit) {
		
		LigneCommandeDAO ligneCommandeDAO = new LigneCommandeDAO();
		List<LigneCommande> listLigneCommande = ligneCommandeDAO.getLigneCommande(idCommande, produit);
		
		return listLigneCommande;
	}

}

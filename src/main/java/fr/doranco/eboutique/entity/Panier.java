package fr.doranco.eboutique.entity;

import java.util.HashMap;
import java.util.Map;

public class Panier {

	// VARIABLES
	private int id;
	//private Integer quantite = LigneCommande.getQuantite();
	private Map<Produit, Integer> mapProduit = new HashMap<Produit, Integer>();
	
	
	// CONSTRUCTORS
	public Panier() {
		
	}

	public Panier(int id, Map<Produit, Integer> mapProduit) {
		super();
		this.id = id;
		this.mapProduit = mapProduit;
	}

	
	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Map<Produit, Integer> getMapProduit() {
		return mapProduit;
	}

	public void setMapProduit(Map<Produit, Integer> mapProduit) {
		this.mapProduit = mapProduit;
	}
	
	
}

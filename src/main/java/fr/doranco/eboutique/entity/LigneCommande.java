package fr.doranco.eboutique.entity;

public class LigneCommande {

	// VARIABLES
	private int id;
	private Produit produit;
	private Integer quantite;
	
	
	// CONSTRUCTORS
	public LigneCommande() {
		
	}

	public LigneCommande(int id, Produit produit, Integer quantite) {
		this.id = id;
		this.produit = produit;
		this.quantite = quantite;
	}
	
	public LigneCommande(Produit produit, Integer quantite) {
		this.produit = produit;
		this.quantite = quantite;
	}
	

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Produit getProduit() {
		return produit;
	}

	public void setProduit(Produit produit) {
		this.produit = produit;
	}

	public Integer getQuantite() {
		return quantite;
	}

	public void setQuantite(Integer quantite) {
		this.quantite = quantite;
	}

	@Override
	public String toString() {
		return "LigneCommande [id=" + id + ", produit=" + produit + ", quantite=" + quantite + "]";
	}

	public void setProduit(int int1) {
		int1 = this.produit.getId();
		
	}
	
	
}

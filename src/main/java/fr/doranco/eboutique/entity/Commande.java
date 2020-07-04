package fr.doranco.eboutique.entity;

import java.util.List;

public class Commande {

	// VARIABLES
	private int id;
	private String dateCreation;
	private String dateLivraison;
	private Float prixTotal;
	private List<LigneCommande> listeLignesCommande;
	
	
	// CONSTRUCTORS
	public Commande() {
		
	}

	public Commande(int id, String dateCreation, String dateLivraison, Float prixTotal, List<LigneCommande> listeLignesCommande) {
		super();
		this.id = id;
		this.dateCreation = dateCreation;
		this.dateLivraison = dateLivraison;
		this.prixTotal = prixTotal;
		this.listeLignesCommande = listeLignesCommande;
	}

	public Commande(String dateCreation, String dateLivraison, Float prixTotal) {
		super();
		this.dateCreation = dateCreation;
		this.dateLivraison = dateLivraison;
		this.prixTotal = prixTotal;
	}

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDateCreation() {
		return dateCreation;
	}

	public void setDateCreation(String dateCreation) {
		this.dateCreation = dateCreation;
	}

	public String getDateLivraison() {
		return dateLivraison;
	}

	public void setDateLivraison(String dateLivraison) {
		this.dateLivraison = dateLivraison;
	}

	public List<LigneCommande> getListeLignesCommande() {
		return listeLignesCommande;
	}

	public void setListeLignesCommande(List<LigneCommande> listeLignesCommande) {
		this.listeLignesCommande = listeLignesCommande;
	}

	public Float getPrixTotal() {
		return prixTotal;
	}

	public void setPrixTotal(Float prixTotal) {
		this.prixTotal = prixTotal;
	}

	@Override
	public String toString() {
		return "Commande [id=" + id + ", dateCreation=" + dateCreation + ", dateLivraison=" + dateLivraison
				+ ", prixTotal=" + prixTotal + "]";
	}

	
}

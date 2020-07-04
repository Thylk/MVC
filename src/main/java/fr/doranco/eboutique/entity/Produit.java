package fr.doranco.eboutique.entity;

import java.io.Serializable;

public class Produit implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	// VARIABLES
	private int id;
	private String nom;
	private String description;
	private int prix;
	private int remise;
	private String categorie;
	
	
	// CONSTRUCTORS
	public Produit() {
		
	}

	public Produit(int id, String nom, String description, int prix, int remise, String categorie) {
		super();
		this.id = id;
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.remise = remise;
		this.categorie = categorie;
	}
	
	public Produit(String nom, String description, int prix, int remise, String categorie) {
		super();
		this.nom = nom;
		this.description = description;
		this.prix = prix;
		this.remise = remise;
		this.categorie = categorie;
	}


	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getPrix() {
		return prix;
	}

	public void setPrix(int prix) {
		this.prix = prix;
	}

	public int getRemise() {
		return remise;
	}

	public void setRemise(int remise) {
		this.remise = remise;
	}

	public String getCategorie() {
		return categorie;
	}

	public void setCategorie(String categorie) {
		this.categorie = categorie;
	}

	@Override
	public String toString() {
		return "Produit [id=" + id + ", nom=" + nom + ", description=" + description + ", prix=" + prix + ", remise="
				+ remise + ", categorie=" + categorie + "]";
	}
	
	
}

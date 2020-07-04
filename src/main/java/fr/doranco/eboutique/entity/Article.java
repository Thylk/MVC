package fr.doranco.eboutique.entity;

public class Article {

	private int id;
	private int produitId;
	private int quantite;
	private int utilisateurId;
	
	public Article() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Article(int id, int produitId, int quantite, int utilisateurId) {
		super();
		this.id = id;
		this.produitId = produitId;
		this.quantite = quantite;
		this.utilisateurId = utilisateurId;
	}
	
	public Article(int produitId, int quantite, int utilisateurId) {
		super();
		this.produitId = produitId;
		this.quantite = quantite;
		this.utilisateurId = utilisateurId;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getProduitId() {
		return produitId;
	}

	public void setProduitId(int produitId) {
		this.produitId = produitId;
	}

	public int getQuantite() {
		return quantite;
	}

	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}

	public int getUtilisateurId() {
		return utilisateurId;
	}

	public void setUtilisateurId(int utilisateurId) {
		this.utilisateurId = utilisateurId;
	}

	@Override
	public String toString() {
		return "Article [id=" + id + ", produitId=" + produitId + ", quantite=" + quantite + ", utilisateurId="
				+ utilisateurId + "]";
	}
	
	
}

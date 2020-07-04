package fr.doranco.eboutique.entity;

public enum Categorie {

	ELECTRONIQUE ("Electronique"),
	TELEPHONIE ("Téléphonie"),
	DECORATIONS ("Décorations");
	
	private String categorie;

	Categorie(String categorie) {
		this.categorie = categorie;
	}
	
	public String getCategorie() {
		return categorie;
	}
	
}

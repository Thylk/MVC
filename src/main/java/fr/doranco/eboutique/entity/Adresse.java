package fr.doranco.eboutique.entity;

public class Adresse {
	
	// VARIABLES
	private int id;
	private int numero;
	private String rue;
	private String ville;
	private int codePostal;
	
	
	// CONSTRUCTORS
	public Adresse() {

	}

	public Adresse(int id, int numero, String rue, String ville, int codePostal) {
		this.id = id;
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	
	public Adresse(int numero, String rue, String ville, int codePostal) {
		this.numero = numero;
		this.rue = rue;
		this.ville = ville;
		this.codePostal = codePostal;
	}
	

	// GETTERS & SETTERS
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getRue() {
		return rue;
	}

	public void setRue(String rue) {
		this.rue = rue;
	}

	public String getVille() {
		return ville;
	}

	public void setVille(String ville) {
		this.ville = ville;
	}

	public int getCodePostal() {
		return codePostal;
	}

	public void setCodePostal(int codePostal) {
		this.codePostal = codePostal;
	}

	@Override
	public String toString() {
		return "Adresse [id=" + id + ", numero=" + numero + ", rue=" + rue + ", ville=" + ville + ", codePostal="
				+ codePostal + "]";
	}

	
}

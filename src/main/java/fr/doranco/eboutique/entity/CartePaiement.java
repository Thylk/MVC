package fr.doranco.eboutique.entity;

public class CartePaiement {

	// VARIABLES
	private int id;
	private int numero;
	private String dateValidite;
	private int cryptogramme;
	
	
	// CONSTRUCTORS
	public CartePaiement() {
		
	}
	
	// Add carte paiement
	public CartePaiement(int numero, String dateValidite, int cryptogramme) {
		super();
		this.numero = numero;
		this.dateValidite = dateValidite;
		this.cryptogramme = cryptogramme;
	}

	public CartePaiement(int id, int numero, String dateValidite, int cryptogramme) {
		super();
		this.id = id;
		this.numero = numero;
		this.dateValidite = dateValidite;
		this.cryptogramme = cryptogramme;
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

	public String getDateValidite() {
		return dateValidite;
	}

	public void setDateValidite(String dateValidite) {
		this.dateValidite = dateValidite;
	}

	public int getCryptogramme() {
		return cryptogramme;
	}

	public void setCryptogramme(int cryptogramme) {
		this.cryptogramme = cryptogramme;
	}

	@Override
	public String toString() {
		return "CartePaiement [id=" + id + ", numero=" + numero + ", dateValidite=" + dateValidite + ", cryptogramme="
				+ cryptogramme + "]";
	}
	
	
}

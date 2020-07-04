package fr.doranco.eboutique.entity;

import java.util.List;

public class Utilisateur {

	// VARIABLES
	private int id;
	private String nom;
	private String prenom;
	private int age;
	private boolean actif;
	private String role;
	private Adresse adresse;
	private String email;
	private String login;
	private String password;
	private String telephone;
	private List<Commande> listeCommandes;
	private List<CartePaiement> listeCartesPaiement;
	private Panier panier;
	
	
	// CONSTRUCTORS
	public Utilisateur() {
		
	}
	
	public Utilisateur(int id) {
		this.id = id;
	}
	
	// Update user
	public Utilisateur(int id, String nom, String prenom, int age, String role, 
			String email, String login, String password, String telephone) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.role = role;
		this.email = email;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
	}
	
	public Utilisateur(String nom, String prenom, int age, boolean actif, String role, Adresse adresse,
			String email, String login, String password, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.actif = actif;
		this.role = role;
		this.adresse = adresse;
		this.email = email;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
	}

	public Utilisateur(int id, String nom, String prenom, int age, boolean actif, String role, Adresse adresse,
			String email, String login, String password, String telephone, List<Commande> listeCommandes,
			List<CartePaiement> listeCartesPaiement, Panier panier) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.actif = actif;
		this.role = role;
		this.adresse = adresse;
		this.email = email;
		this.login = login;
		this.telephone = telephone;
		this.listeCommandes = listeCommandes;
		this.listeCartesPaiement = listeCartesPaiement;
		this.panier = panier;
	}
	
	public Utilisateur(String nom, String prenom, int age, boolean actif, String role, Adresse adresse,
			String email, String login, String password, String telephone, List<Commande> listeCommandes,
			List<CartePaiement> listeCartesPaiement, Panier panier) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.actif = actif;
		this.role = role;
		this.adresse = adresse;
		this.email = email;
		this.login = login;
		this.telephone = telephone;
		this.listeCommandes = listeCommandes;
		this.listeCartesPaiement = listeCartesPaiement;
		this.panier = panier;
	}
	
	public Utilisateur(String nom, String prenom, int age, boolean actif, String role, 
			String email, String login, String password, String telephone) {
		super();
		this.nom = nom;
		this.prenom = prenom;
		this.age = age;
		this.actif = actif;
		this.role = role;
		this.email = email;
		this.login = login;
		this.password = password;
		this.telephone = telephone;
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

	public String getPrenom() {
		return prenom;
	}

	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public boolean isActif() {
		return actif;
	}

	public boolean setActif(boolean actif) {
		return this.actif = actif;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public Adresse getAdresse() {
		return adresse;
	}

	public void setAdresse(Adresse adresse) {
		this.adresse = adresse;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public List<Commande> getListeCommandes() {
		return listeCommandes;
	}

	public void setListeCommandes(List<Commande> listeCommandes) {
		this.listeCommandes = listeCommandes;
	}

	public List<CartePaiement> getListeCartesPaiement() {
		return listeCartesPaiement;
	}

	public void setListeCartesPaiement(List<CartePaiement> listeCartesPaiement) {
		this.listeCartesPaiement = listeCartesPaiement;
	}

	public Panier getPanier() {
		return panier;
	}

	public void setPanier(Panier panier) {
		this.panier = panier;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "Utilisateur [id=" + id + ", nom=" + nom + ", prenom=" + prenom + ", age=" + age + ", actif=" + actif
				+ ", role=" + role + ", adresse=" + adresse + ", email=" + email + ", login=" + login + ", password="
				+ password + ", telephone=" + telephone + ", listeCommandes=" + listeCommandes
				+ ", listeCartesPaiement=" + listeCartesPaiement + ", panier=" + panier + "]";
	}

	
	
}

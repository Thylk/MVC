package fr.doranco.eboutique.entity;

public enum Role {
	
	CLIENT ("Client"),
	MAGASINIER ("Magasinier"),
	ADMIN ("Admin");
	
	private String role;

	Role(String role) {
		this.role = role;
	}
	
	public String getRole() {
		return role;
	}
	
}

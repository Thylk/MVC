package fr.doranco.eboutique.metier;

import fr.doranco.eboutique.dao.AdresseDAO;
import fr.doranco.eboutique.entity.Adresse;

public class AdresseControl implements IAdresseControl {

	@Override
	public Adresse addAdresse(Adresse adresse) {

		AdresseDAO adresseDAO = new AdresseDAO();
		adresseDAO.addAdresse(adresse);
		
		return adresse;
		
	}

	@Override
	public Adresse getAdresse(Integer idUtilisateur) {

		AdresseDAO adresseDAO = new AdresseDAO();
		Adresse adresse = adresseDAO.getAdresse(idUtilisateur);
		
		return adresse;
		
	}

	@Override
	public Adresse updateAdresse(Adresse adresse, Integer idUtilisateur) {
		
		AdresseDAO adresseDAO = new AdresseDAO();
		adresseDAO.updateAdresse(adresse, idUtilisateur);
		
		return adresse;

	}

	@Override
	public void deleteAdresse(Integer idUtilisateur) {
		
		AdresseDAO adresseDAO = new AdresseDAO();
		adresseDAO.deleteAdresse(idUtilisateur);
		
	}

}

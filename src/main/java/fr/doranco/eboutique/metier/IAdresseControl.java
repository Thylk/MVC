package fr.doranco.eboutique.metier;

import fr.doranco.eboutique.entity.Adresse;

public interface IAdresseControl {
	
	Adresse addAdresse(Adresse adresse);
	Adresse getAdresse(Integer idUtilisateur);
	Adresse updateAdresse(Adresse adresse, Integer idUtilisateur);
	void deleteAdresse(Integer idUtilisateur);
	
}

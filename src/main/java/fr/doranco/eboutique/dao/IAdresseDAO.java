package fr.doranco.eboutique.dao;

import fr.doranco.eboutique.entity.Adresse;

public interface IAdresseDAO {
	
	Adresse addAdresse(Adresse adresse);
	Adresse getAdresse(Integer idUtilisateur);
	Adresse updateAdresse(Adresse adresse, Integer idUtilisateur);
	void deleteAdresse(Integer idUtilisateur);
	
}

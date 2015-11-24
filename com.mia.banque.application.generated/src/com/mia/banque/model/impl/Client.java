package com.mia.banque.model.impl;
import java.util.List;
import java.util.ArrayList;
import com.mia.banque.model.IClient;

public class Client implements IClient{
	private String Nom;
private String Prenom;
private String Adresse;

	private List<com.mia.banque.model.ICompte> listCompte;
		public String getNom(){
		return this.Nom;
	}
	
	public void setNom(String newValue){
		this.Nom = newValue;
	}
		public String getPrenom(){
		return this.Prenom;
	}
	
	public void setPrenom(String newValue){
		this.Prenom = newValue;
	}
		public String getAdresse(){
		return this.Adresse;
	}
	
	public void setAdresse(String newValue){
		this.Adresse = newValue;
	}
	
	
public List<com.mia.banque.model.ICompte> getCompte(){
	if (this.listCompte == null) {
			this.listCompte = new ArrayList<com.mia.banque.model.ICompte>();
		}
		return this.listCompte;
}
public void setCompte(List<com.mia.banque.model.ICompte> newValue){
	this.listCompte = newValue;
}
	
}
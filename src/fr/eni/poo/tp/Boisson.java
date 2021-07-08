package fr.eni.poo.tp;

public class Boisson {
	protected String nom;

 	public Boisson() {
 		
 	}	
 	public Boisson(String nom) {
 		this.nom=nom;
 	}
 	
 	public void afficher(){
 		System.out.format("%s \n",nom);
 	}
	public String getNom() {
		return this.nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
 	
}

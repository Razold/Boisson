package fr.eni.poo.tp;

public class BoissonAlcoolisee extends Boisson {
	
	public float tauxAlcool;//taux Alcool est un reel
	public int millesime;
	
 	public BoissonAlcoolisee(float tauxAlcool,int millesime) {
 		this.tauxAlcool=tauxAlcool;
 		this.millesime=millesime;
 	}	 
 	public BoissonAlcoolisee(String nom,float tauxAlcool,int millesime) {
 		super(nom);
 		this.tauxAlcool=tauxAlcool;
 		this.millesime=millesime;
 	}
 	
	 public int getMillesime() {
		return millesime;
	}

	public void setMillesime(int millesime) {
		this.millesime = millesime;
	}

	public float getTauxAlcool() {
		return tauxAlcool;
	}

	public void setTauxAlcool(float tauxAlcool) {
		this.tauxAlcool = tauxAlcool;
	}
	
 	public void afficher(){
 		System.out.printf("Nom: "+this.nom+" Taux d'alcool : "+this.tauxAlcool+" Millesime : "+this.millesime+"\n");
 	}
}

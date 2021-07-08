package fr.eni.poo.tp.Test;

import fr.eni.poo.tp.Boisson;
import fr.eni.poo.tp.BoissonAlcoolisee;
import fr.eni.poo.tp.Soft;

public class TestBoissons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BoissonAlcoolisee vin= new BoissonAlcoolisee("vin",15,1995); 
		vin.afficher();
		Soft pomme= new Soft();
		pomme.setNom("Jus de pomme");
		pomme.afficher();
		Soft orange= new Soft();
		Boisson coca = new Soft();// transtypage implicite (upcast) à l'inverse Soft coca = new Boisson(); ne marchera pas
								  //A différencier du transtypage explicite (downcast) polymorphisme
		orange.setNom("Jus d'orange");
		orange.afficher();
		coca.setNom("cola");
		System.out.println("coca est il une boisson? -->"+(coca instanceof BoissonAlcoolisee));
		coca.afficher();
	}

}

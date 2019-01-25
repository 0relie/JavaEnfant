package fr.adaming.vehicule;

import fr.adaming.MonPremierProjet.ch3.animalFamilier;

public class appellerVehicule {

	public static void main(String[] args) {
		
		classVehicule twingo = new classVehicule();
	
		String reponseVoiture;				
		reponseVoiture = twingo.roule();			
		System.out.println(reponseVoiture);
		 
	}

}


package fr.adaming.MonPremierProjet.ch4;

public class Poisson4 extends animalFamilier4 {
	
int profondeurCourante = 0;

	public int plonger(int profondeur) {
		profondeurCourante = profondeurCourante +profondeur;
		System.out.println("Plong�e de " + profondeur + " m�tres");
		System.out.println("Je suis � " + profondeurCourante + " m�tres sous le niveau de la mer");
		return profondeur; 
	}

	public String dire(String unMot) {
		 return "Les poissons ne parlent pas"; 
	 }

}



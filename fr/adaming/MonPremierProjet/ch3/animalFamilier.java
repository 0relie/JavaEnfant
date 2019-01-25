package fr.adaming.MonPremierProjet.ch3;

public class animalFamilier {
		// TODO Auto-generated method stub
	/* Définition des attributs de l'animal familier :
	Quatre types de données pour les valeurs entières - byte, short, int et long.
	Deux types de données pour les valeurs décimales - float et double.
	Un type de données qui permet de stocker un caractère isolé - char.
	Un type de données logique nommé boolean qui autorise seulement deux valeurs : true (vrai) ou false (faux).*/
		
	int age;	
	float taille;	
	float poids;
	String couleur;
	
	/* Définition des méthodes de l'animal familier :
	 dormir, manger, dire */
	
	 public void dormir() {
		 System.out.println("Bonne nuit, à demain");
	 }
			 
	 public void manger() {
		 System.out.println("J'ai si faim... Donne-moi un biscuit !");
	 }
			 
	 public String dire(String unMot) {
		 String réponseAnimal = "OK !! OK !! " + unMot;
		 return réponseAnimal; 
	 }
			
}

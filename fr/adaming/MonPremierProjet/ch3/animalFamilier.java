package fr.adaming.MonPremierProjet.ch3;

public class animalFamilier {
		// TODO Auto-generated method stub
	/* D�finition des attributs de l'animal familier :
	Quatre types de donn�es pour les valeurs enti�res - byte, short, int et long.
	Deux types de donn�es pour les valeurs d�cimales - float et double.
	Un type de donn�es qui permet de stocker un caract�re isol� - char.
	Un type de donn�es logique nomm� boolean qui autorise seulement deux valeurs : true (vrai) ou false (faux).*/
		
	int age;	
	float taille;	
	float poids;
	String couleur;
	
	/* D�finition des m�thodes de l'animal familier :
	 dormir, manger, dire */
	
	 public void dormir() {
		 System.out.println("Bonne nuit, � demain");
	 }
			 
	 public void manger() {
		 System.out.println("J'ai si faim... Donne-moi un biscuit !");
	 }
			 
	 public String dire(String unMot) {
		 String r�ponseAnimal = "OK !! OK !! " + unMot;
		 return r�ponseAnimal; 
	 }
			
}

package fr.adaming.MonPremierProjet.ch3;

public class MaitreAnimal {

	  public static void main(String[] args) {

	    String réactionAnimal;	

	    /*Déclaration de la variable monAnimal*/
	    animalFamilier monAnimal = new animalFamilier();

	    monAnimal.manger();
	    réactionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(réactionAnimal);
	  
	    monAnimal.dormir();
		 
	    Poisson Nemo = new Poisson();	
	    Nemo.plonger(10);
	    Nemo.plonger(2);
	    
	    String réactionPoisson;
	    réactionPoisson = Nemo.dire("Salut");
	    System.out.println(réactionPoisson);
	    
	  }
}
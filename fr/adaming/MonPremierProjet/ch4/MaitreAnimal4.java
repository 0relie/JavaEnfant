package fr.adaming.MonPremierProjet.ch4;

public class MaitreAnimal4 {

	  public static void main(String[] args) {

	    String réactionAnimal;	

	    /*Déclaration de la variable monAnimal*/
	    animalFamilier4 monAnimal = new animalFamilier4();

	    monAnimal.manger();
	    réactionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(réactionAnimal);
	  
	    monAnimal.dormir();
		 
	    Poisson4 Nemo = new Poisson4();	
	    Nemo.plonger(10);
	    Nemo.plonger(2);
	    
	    String réactionPoisson;
	    réactionPoisson = Nemo.dire("Salut");
	    System.out.println(réactionPoisson);
	    
	  }
}
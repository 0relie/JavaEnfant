package fr.adaming.MonPremierProjet.ch3;

public class MaitreAnimal {

	  public static void main(String[] args) {

	    String r�actionAnimal;	

	    /*D�claration de la variable monAnimal*/
	    animalFamilier monAnimal = new animalFamilier();

	    monAnimal.manger();
	    r�actionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(r�actionAnimal);
	  
	    monAnimal.dormir();
		 
	    Poisson Nemo = new Poisson();	
	    Nemo.plonger(10);
	    Nemo.plonger(2);
	    
	    String r�actionPoisson;
	    r�actionPoisson = Nemo.dire("Salut");
	    System.out.println(r�actionPoisson);
	    
	  }
}
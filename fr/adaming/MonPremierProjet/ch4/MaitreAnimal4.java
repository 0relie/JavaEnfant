package fr.adaming.MonPremierProjet.ch4;

public class MaitreAnimal4 {

	  public static void main(String[] args) {

	    String r�actionAnimal;	

	    /*D�claration de la variable monAnimal*/
	    animalFamilier4 monAnimal = new animalFamilier4();

	    monAnimal.manger();
	    r�actionAnimal = monAnimal.dire("Cui !! Cui !!");
	    System.out.println(r�actionAnimal);
	  
	    monAnimal.dormir();
		 
	    Poisson4 Nemo = new Poisson4();	
	    Nemo.plonger(10);
	    Nemo.plonger(2);
	    
	    String r�actionPoisson;
	    r�actionPoisson = Nemo.dire("Salut");
	    System.out.println(r�actionPoisson);
	    
	  }
}
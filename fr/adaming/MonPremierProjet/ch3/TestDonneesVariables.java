package fr.adaming.MonPremierProjet.ch3;

public class TestDonneesVariables {

	  public static void main(String[] args) {
		  int x;
		  int y;
		  x = 2;
		  y = 2; 
		 System.out.println("y :"+y);
		  int zx=x++; /*affichage de x avant incr�mentation*/
		  int zy=++y; /*affichage de y apr�s incr�mentation*/
		 System.out.println("y :"+y);
		 System.out.println("x :"+x);
		 System.out.println("zy :"+zy);
		 System.out.println("zx :"+zx);
	  }

	}
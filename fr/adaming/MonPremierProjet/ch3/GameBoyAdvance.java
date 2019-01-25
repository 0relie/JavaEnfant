package fr.adaming.MonPremierProjet.ch3;

public class GameBoyAdvance {
	String typeCartouche;
	int largeurEcran;

	public static void main(String[] args) {
		int x;
		int y;
		x = 5;
		y = x+2;
		y++;
		int monScore = 5;
		monScore = monScore + 1;
		
		System.out.println("x : "+x);
		System.out.println("y : "+y);
		System.out.println("Mon score est " + monScore);
		/*monScore += 2
		System.out.println("Mon score X2 " + monScore);*/
		
		char niveau = 'E';
		int chaises = 12;                            
		boolean sonActif = false;         
		double revenuNational = 23863494965745.78; 
		float prixJeu = 12.50f;      
		long totalVoitures = 4637283648392l; 
		
		System.out.println("niveau de type char :"+niveau);
		System.out.println("chaise de type int :"+chaises);
		System.out.println("boolean de type :"+sonActif);
		System.out.println("revenuNational de type double :"+revenuNational);
		System.out.println("prixJeu de type float :"+prixJeu);
		System.out.println("totalVoitures de type long :"+totalVoitures);
	
		final String CAPITALE_ETAT = "Washington";
		
	}
	
	void démarrerJeu() {
	}
	void arrêterJeu() {
	}
	
	
}

package fr.adaming.MonPremierProjet.ch2;

public class BonjourMonde {

	public static void main(String[] args) {
		System.out.println("BonjourMonde");
		// TODO Auto-generated method stub
		afficherAdresse(25 , "rue Hegel" , 59160, "Lomme");
	}
	public static void afficherAdresse(int numRue , String rue, int code , String ville) {
		System.out.print("J'habite au " );
		System.out.print(numRue + " " + rue + " ");
		System.out.println(code + " " + ville);
	}

}

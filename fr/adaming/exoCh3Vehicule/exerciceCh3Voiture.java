package fr.adaming.exoCh3Vehicule;

public class exerciceCh3Voiture {
	public void demarrer() {
		System.out.println("La Voiture Roule");
	};
	
	public void arreter() {
		System.out.println("La Voiture S'arrête");
	};
	
	public int rouler(int duree) {
		int distance = duree*60;
		System.out.println("Elle roule pendant :"+duree+" minutes");
		return distance;
	};

}
  
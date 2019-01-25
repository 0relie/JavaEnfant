package fr.adaming.exoCh3Vehicule;

class VoitureJamesBond extends exoCh3ProprietaireVoiture {
	public void demarrer() {
		System.out.println("La Voiture de James Bond Roule");
	};
	
	public void arreter() {
		System.out.println("La Voiture de James Bond S'arrête");
	};	
	
	public int rouler(int duree) {
			int distance = duree*180;
			System.out.println("La Voiture de James Bond roule pendant :"+duree+" minutes");
			return distance;
		}
}
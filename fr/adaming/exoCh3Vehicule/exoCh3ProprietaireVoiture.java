package fr.adaming.exoCh3Vehicule;

public class exoCh3ProprietaireVoiture {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		exerciceCh3Voiture twingo = new exerciceCh3Voiture();
		
		twingo.demarrer();
		
		System.out.println("Elle parcourre :"+twingo.rouler(30)+" Km");
		
		twingo.arreter();

		VoitureJamesBond fastCar = new VoitureJamesBond();	
		
		fastCar.demarrer();
		System.out.println("La voiture de James Bond parcourre :"+fastCar.rouler(30)+" Km");
		fastCar.arreter();

	}
}
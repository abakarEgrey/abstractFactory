package creationalPattern.abstractFactory;

public class FabriqueVehiculeElectricite implements FabriqueVehicule {

	@Override
	public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace) {

		return new AutomobileElectricite(modele, couleur, puissance, espace);
	}

	@Override
	public Scooter creeScooter(String modele, String couleur, int puissance) {
		
		return new ScooterElectricite(modele, couleur, puissance);
	}

}

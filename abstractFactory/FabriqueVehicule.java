package creationalPattern.abstractFactory;

public interface FabriqueVehicule {

	public Automobile creerAutomobile(String modele, String couleur, int puissance, double espace);
	public Scooter creeScooter(String modele, String couleur, int puissance);
	
}

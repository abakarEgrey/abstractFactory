package creationalPattern.abstractFactory;

public class AutomobileElectricite extends Automobile{

	public AutomobileElectricite(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
		
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println(
				"Automobile electrique de modele :" + modele +
				" de couleur : "+ couleur + " de puissance : " +
						puissance + " d'espace : "+espace);
		
	}

}

package creationalPattern.abstractFactory;

public class AutomobileEssence extends Automobile{

	public AutomobileEssence(String modele, String couleur, int puissance, double espace) {
		super(modele, couleur, puissance, espace);
	}

	@Override
	public void afficheCaracteristiques() {
		System.out.println(
				"Automobile a Essence de modele :" + modele +
				" de couleur : "+ couleur + " de puissance : " +
						puissance + " d'espace : "+espace);
		
	}

}

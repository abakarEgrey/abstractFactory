package creationalPattern.builder;

public abstract class ConstructeurLiasseVehicule {

	protected Liasse liasse;
	
	public abstract void construitBonDeCommande(String nomClient);
	
	public abstract void construitDemandeImmatriculation(String nonmDemandeur);
	
	public Liasse resultat(){
		return this.liasse;
	}
}

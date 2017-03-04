package creationalPattern.builder;

public class Vendeur {

	protected ConstructeurLiasseVehicule constructeur;

	public Vendeur(ConstructeurLiasseVehicule constructeur) {
		super();
		this.constructeur = constructeur;
	}

	public Liasse construit(String nomClient){
		constructeur.construitBonDeCommande(nomClient);
		constructeur.construitDemandeImmatriculation(nomClient);
		Liasse liasse = constructeur.resultat();
		
		return liasse;
	}
}

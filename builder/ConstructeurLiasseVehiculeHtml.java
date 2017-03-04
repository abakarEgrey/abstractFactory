package creationalPattern.builder;

public class ConstructeurLiasseVehiculeHtml extends ConstructeurLiasseVehicule{

	
	public ConstructeurLiasseVehiculeHtml() {
		this.liasse = new LiasseHtml();
	}

	@Override
	public void construitBonDeCommande(String nomClient) {
		String document;
		document = "<HTML>Bon de commande Client : " + nomClient + "<HTML>";
		this.liasse.ajouteDocument(document);
		
	}

	@Override
	public void construitDemandeImmatriculation(String nonmDemandeur) {
		String document;
		document = "<HTML>Demande d'immatriculation Demandeur : " + nonmDemandeur + "<HTML>";
		this.liasse.ajouteDocument(document);
		
	}

}

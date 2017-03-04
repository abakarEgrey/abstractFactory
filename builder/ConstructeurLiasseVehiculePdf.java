package creationalPattern.builder;

public class ConstructeurLiasseVehiculePdf extends ConstructeurLiasseVehicule{

	
	public ConstructeurLiasseVehiculePdf() {
		this.liasse = new LiassePdf();
	}

	@Override
	public void construitBonDeCommande(String nomClient) {
		String document;
		document = "<PDF>Bon de commande Client : " + nomClient + "<PDF>";
		this.liasse.ajouteDocument(document);
		
	}

	@Override
	public void construitDemandeImmatriculation(String nonmDemandeur) {
		String document;
		document = "<PDF>Demande d'immatriculation Demandeur : " + nonmDemandeur + "<PDF>";
		this.liasse.ajouteDocument(document);
		
	}

}

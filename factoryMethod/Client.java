package creationalPattern.factoryMethod;

import java.util.ArrayList;
import java.util.List;

public abstract class Client {
	
	protected List<Commande> commandes = new ArrayList<>();
	
	public void nouvelleCommande(double montant){
		Commande commande = this.creeCommande(montant);
		if (commande.valide()){
			commande.paye();
			this.commandes.add(commande);
		}
		
	}
	
	protected abstract Commande creeCommande(double montant);

}

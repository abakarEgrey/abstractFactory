package creationalPattern.factoryMethod;

public class CommandeCredit extends Commande{

	public CommandeCredit(double montant) {
		super(montant);
	}

	@Override
	public void paye() {
		System.out.println("Le paiement de la commande au cr�dit de : " + montant + " est effectu�.");
		
	}

	@Override
	public boolean valide() {
		return (this.montant >= 1000.0 && this.montant <= 5000.0);
	}

}

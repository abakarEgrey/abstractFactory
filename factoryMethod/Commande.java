package creationalPattern.factoryMethod;

public abstract class Commande {

	protected double montant;

	public Commande(double montant) {
		super();
		this.montant = montant;
	}

	
	public abstract void paye();

	public abstract boolean valide();

}

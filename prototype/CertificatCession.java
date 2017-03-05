package creationalPattern.prototype;

public class CertificatCession extends Document{

	@Override
	public void imprime() {
		System.out.println("Imprime le certificat de session : " + contenu);
	}

	@Override
	public void affiche() {
		System.out.println("Affiche le certificat de session : " + contenu);
	}

}

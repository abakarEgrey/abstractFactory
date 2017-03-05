package creationalPattern.prototype;

import java.util.ArrayList;
import java.util.List;

public class LiasseClient extends Liasse {

	public LiasseClient(String informations) {
		documents = new ArrayList<>();
		LiasseVierge laLiasseVierge = LiasseVierge.instance();
		List<Document> documentsVierge = laLiasseVierge.getDocuments();

		for (Document document : documentsVierge) {
			Document copieDocument = document.duplique();
			copieDocument.remplit(informations);
			documents.add(copieDocument);
		}
	}

	public void affiche() {
		for (Document document : documents) {
			document.affiche();
		}
	}

	public void imprime() {
		for (Document document : documents) {
			document.imprime();
		}
	}
}

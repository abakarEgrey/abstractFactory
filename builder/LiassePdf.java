package creationalPattern.builder;

public class LiassePdf extends Liasse{

	@Override
	public void ajouteDocument(String document) {
		if (document.startsWith("<PDF>")){
			this.contenu.add(document);
		}
		
	}

	@Override
	public void imprime() {
		System.out.println("Liasse PDF");
		for (String s : this.contenu){
			System.out.println(s);
		}
		
	}

	
}

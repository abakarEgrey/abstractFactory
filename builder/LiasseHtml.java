package creationalPattern.builder;

public class LiasseHtml extends Liasse{

	@Override
	public void ajouteDocument(String document) {
		if (document.startsWith("<HTML>")){
			this.contenu.add(document);
		}
		
	}

	@Override
	public void imprime() {
		System.out.println("Liasse HTML");
		for (String s : this.contenu){
			System.out.println(s);
		}
		
	}

	

}

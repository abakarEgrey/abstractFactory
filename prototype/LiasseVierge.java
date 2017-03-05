package creationalPattern.prototype;

import java.util.ArrayList;

public class LiasseVierge extends Liasse {

	private static LiasseVierge _instance = null;

	private LiasseVierge() {
		documents = new ArrayList<>();
	}

	public static LiasseVierge instance(){
		if(_instance == null){
			_instance = new LiasseVierge();
			return _instance;
		}
		
		return _instance;
	}
	
	public void ajoute(Document doc){
		documents.add(doc);
	}
	
	public void retire(Document doc){
		documents.remove(doc);
	}
}

package atelier1;

import java.util.HashMap;

public class collections_HashMap {

	public static void main(String[] args) {
		HashMap<String, String> mois = new HashMap<String, String>();
		mois.put("premier", "janvier");
		mois.put("deuxi�me", "f�vrier");
		mois.put("troisi�me", "mars");
		mois.put("quatri�me", "avril");
		
		// exercice 20
		System.out.println(mois.size());
		
		// exercice 21
		HashMap<String, String> mois2 = new HashMap<String, String>();
		mois2.putAll(mois);
		System.out.println(mois2);
		
		// exercice 22
		mois2.clear();
		System.out.println(mois2);
	}
}

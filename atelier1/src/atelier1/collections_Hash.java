package atelier1;

import java.util.HashSet;

public class collections_Hash {
	public static void main(String[] args) {
		
		HashSet<String> mois = new HashSet<String>();
		mois.add("janvier");
		mois.add("f�vrier");
		mois.add("mars");
		mois.add("avril");
		mois.add("mai");
		mois.add("juin");
		mois.add("juillet");
		mois.add("ao�t");
		mois.add("septembre");
		mois.add("octobre");
		mois.add("novembre");
		mois.add("d�cembre");
		// exercice 15
		System.out.println(mois);
		//exercice 16
		System.out.println(mois.size());
		//exercice 17
		mois.clear();
		//exercice 18
		System.out.println(mois.size());
		
		
	}
}

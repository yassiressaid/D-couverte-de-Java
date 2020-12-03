package atelier1;

import java.util.Arrays;

public class collections {
	public static void main(String[] args) {
	String[] mois = {"janvier", "février", "mars", "avril", "mai", "juin", "juillet", "aout", "septembre", "octobre", "novembre ", "décembre"};
		  //exercice 1
	      System.out.println(Arrays.toString(mois));
		  //exercice 2
		  System.out.println(mois [2]);
		  //exercice 3
		  System.out.println(mois [5]);
		  //exercice 4
		  for (int i = 0; i < mois.length; i++)  {
			  System.out.println(mois [i]);
		  }
			  //exercice 5
			  String modif = "août";
			  mois[7] = modif;
			  System.out.println(Arrays.toString(mois));
			  //exercice 6
			  int position = 0;
				String newElement = "Année";
				
				for(int i=mois.length-1; i > position; i--){
				    mois[i] = mois[i-1];
				   }
				   mois[position] = newElement;
				   System.out.println(Arrays.toString(mois));
				   
			//exercice 7
				   int position1 = 2;
					int i;
					for(i=position1; i < mois.length-1; i++){
					    mois[i] = mois[i+1];
					   }
					   System.out.println(Arrays.toString(mois));
			//exercice 8
					   for(int e=0; e < mois.length-1; e++){
						    if(mois[e] == "avril") {
						    	System.out.println("A trouvé element à l'index " + e);
						    }
						   }
			//exercice 9
					   Arrays.sort(mois);
						System.out.println(Arrays.toString(mois));
			//exercice 10
						String newMois[] = new String[mois.length]; 
						  
						System.arraycopy(mois, 0, newMois, 0, mois.length);
				           System.out.println(Arrays.toString(newMois));
		    //exercice 11
				           String newMois1[] = mois.clone(); 
				           System.out.println(Arrays.toString(newMois1));
	}
}
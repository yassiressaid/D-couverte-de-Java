package atelier1;

import java.util.Scanner;

public class CalcTVA {
	public static void main(String[] args) {
		System.out.println("Saisir un montant");
		Scanner prix  = new Scanner(System.in);
		int montant = prix.nextInt();
		int TVA = (int) (montant * 0.2);
		System.out.println("Voulez-vous une remise?");
		Scanner demandeRemise  = new Scanner(System.in);
		String answer = demandeRemise.nextLine();
		answer.toUpperCase();
		if (answer.equalsIgnoreCase("OUI") || answer.equalsIgnoreCase("YES")){
			System.out.println("Combien de remise?");
			Scanner remise  = new Scanner(System.in);
			Double remise1 = remise.nextDouble();
			if (remise1>1) {
			System.out.println("le pourcentage de remise: " + remise1 + "%");
			int montantApresRemise = (int) (montant - (montant / remise1));
			System.out.println("le montant aprés la remise: " + montantApresRemise);
			System.out.println("le montant TTC final: " + (montantApresRemise + TVA));
			} else {
				int montantApresRemise = (int) (montant - (montant * remise1));
				System.out.println("le pourcentage de remise: " + (remise1 * 100) + "%");
				System.out.println("le montant aprés la remise: " + montantApresRemise);
				System.out.println("le montant TTC final: " + (montantApresRemise + TVA));
			}
			
		} else if (answer.equalsIgnoreCase("NON") || answer.equalsIgnoreCase("NO")) {
			System.out.println("Aucune remise n'a été appliquée");
			System.out.println("le montant TTC final: " + (montant + TVA));
			
		}	
 }
}

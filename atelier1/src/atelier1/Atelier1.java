package atelier1;

import java.util.Scanner;

public class Atelier1 {
	public static void main(String[] args) {
		System.out.println("Quel est votre pr�nom ?");
		
		Scanner scanner  = new Scanner(System.in);
		String pr�nom = scanner.nextLine();
		
		System.out.println("Bonjour " + pr�nom + "!");
	}
}
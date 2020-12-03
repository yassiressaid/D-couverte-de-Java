package atelier1;

import java.util.Scanner;

public class Atelier1 {
	public static void main(String[] args) {
		System.out.println("Quel est votre prénom ?");
		
		Scanner scanner  = new Scanner(System.in);
		String prénom = scanner.nextLine();
		
		System.out.println("Bonjour " + prénom + "!");
	}
}
import java.util.Scanner;

public class Prob {
	public static void main(String[] args) {
		System.out.println("chèque de paie ?");
		
		Scanner chéque  = new Scanner(System.in);
		int Check = chéque.nextInt();
		
		System.out.println("Après avoir déduit les fournitures scolaires, il reste  "
				+ (Check % (Check / 4 * 3)) + " MAD.");
		int reste = (Check % (Check / 4 * 3)) - 28;

		System.out.println("Et après déduction des achats personnels, il reste "
				+ reste + " MAD.");
		if (reste >= 10) {
			System.out.println("Vous avez l'argent pour acheter un bouquet de roses");
		} else {
			System.out.println("Vous n'avez pas l'argent pour acheter un bouquet de roses");
		}
	}
}

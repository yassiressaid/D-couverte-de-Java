import java.util.Scanner;

public class Prob {
	public static void main(String[] args) {
		System.out.println("ch�que de paie ?");
		
		Scanner ch�que  = new Scanner(System.in);
		int Check = ch�que.nextInt();
		
		System.out.println("Apr�s avoir d�duit les fournitures scolaires, il reste  "
				+ (Check % (Check / 4 * 3)) + " MAD.");
		int reste = (Check % (Check / 4 * 3)) - 28;

		System.out.println("Et apr�s d�duction des achats personnels, il reste "
				+ reste + " MAD.");
		if (reste >= 10) {
			System.out.println("Vous avez l'argent pour acheter un bouquet de roses");
		} else {
			System.out.println("Vous n'avez pas l'argent pour acheter un bouquet de roses");
		}
	}
}

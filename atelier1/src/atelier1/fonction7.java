package atelier1;

public class fonction7 {
	static void check(int x , String genre) {
	    if (x >= 18) {
	      System.out.println("Vous �tes " + genre + " et vous �tes majeur"); 
	    } else {
	    System.out.println("Vous �tes " + genre + " et vous �tes mineur"); }
	  }
	  public static void main(String[] args) { 
	    check(19,"un homme");
	  } 
}

package atelier1;

public class fonction7 {
	static void check(int x , String genre) {
	    if (x >= 18) {
	      System.out.println("Vous êtes " + genre + " et vous êtes majeur"); 
	    } else {
	    System.out.println("Vous êtes " + genre + " et vous êtes mineur"); }
	  }
	  public static void main(String[] args) { 
	    check(19,"un homme");
	  } 
}

package atelier1;

public class fonction4 {
	static void check(int x , int y) {
	    if (x > y) {
	      System.out.println("Le premier nombre est plus grand");
	    } else if (x < y) {
	      System.out.println("Le premier nombre est plus petit"); 
	    } else {
	    System.out.println("Les deux nombres sont identiques"); }
	  }
	  public static void main(String[] args) { 
	    check(5,5);
	  } 
}

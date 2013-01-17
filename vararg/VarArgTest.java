 package vararg;

public class VarArgTest {

	
	   public static void main(String args[]) {
	       myMethod("Hello");

	       System.out.println();

	       myMethod("Hello", "again", "world!");
	       
	       System.out.println();
	       
	       myMethod("This","is","a","few","more","arguments");
	   }

	   public static void myMethod(String... x) {
	     System.out.println("You have passed in " + x.length + " arguments ");
	     for (Object o : x) {
	       System.out.println(o);
	     }
	   }
	

	}



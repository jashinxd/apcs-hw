public class Driver {
    public static void main (String[] args) {
	StringStuff s1 = new StringStuff();
    
	System.out.println(s1.nonStart ("Hello", "There"));
	System.out.println(s1.nonStart ("java", "code"));
	System.out.println(s1.makeAbba ("Hi", "Bye"));
	System.out.println(s1.makeAbba ("Yo", "Alice"));
	System.out.println(s1.diff21 (23));
	System.out.println(s1.diff21 (11));

    }
}

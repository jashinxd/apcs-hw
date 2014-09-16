import java.io.*;
import java.util.*;

//added a comment

public class Greeter {
    /* Attributes go here
       We call them instance variables
    */

    public void greet() {
	String s = new String("Hello World");
	System.out.println(s);
    }
    
    public void ungreet() {
	System.out.println("I'm out");
    }
}

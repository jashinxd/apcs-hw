import java.io.*;
import java.util.*;

//added a comment

public class Greeter {
    public void greet() {
	System.out.println("Hello World!");
	ungreet();
    }
    
    private void ungreet() {
	System.out.println("I'm out");
    }
}

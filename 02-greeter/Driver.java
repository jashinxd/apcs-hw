import java.io.*;
import java.util.*;

public class Driver {
    public static void main(String[] args) {

	Greeter g1 = new Greeter();
	// The above line is the same as
	// Greeter = g2;
	// g2 = new Greeter();
	
	Greeter g2,g3;
	g2 = new Greeter();

	g3 = g1;

	System.out.println("BEFORE");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g1 = new Greeter();

	System.out.println("AFTER");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);
	
	g2 = new Greeter();

	System.out.println("REALLY AFTER");
	System.out.println("g1: "+g1);
	System.out.println("g2: "+g2);
	System.out.println("g3: "+g3);

	g1.greet();

    }

}

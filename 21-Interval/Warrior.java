import java.io.*;
import java.util.*;

// Must extend before implementing
// The Comparable interface is inherited when extending
public class Warrior extends basechar {    
    
    public Warrior(String name){
        super.setarmor(20);
        super.setname(name);
        super.setcrit(20);
    }
    
    // Generates randomly named Warrior (4 Letters)
    public Warrior() {
	String name = "";
	int rand;
        String letters = "abcdefghijklmnopqrstuvwxyz";
	Random rnd = new Random();
	for (int i = 0; i < 4; i++) {
	    rand = rnd.nextInt(letters.length());
	    name += letters.substring(rand, rand+1);
	}
	super.setarmor(20);
	super.setname(name);
	super.setcrit(20);
    }
    
    public String toString() {
	return getname();
    }

    public int getattack(){
        return super.getattack();
    }

    public int getarmor(){
        return super.getarmor();
    }

    public String getname(){
        return super.getname();
    }
 
    /* -- You do not need this, method extended from basechar
    public int compareTo(Object other) {
	Warrior o = (Warrior) other;
	return getname().compareTo(o.getname());
    }
    */
    
    public static void main(String[] args) {
	Warrior w1 = new Warrior("Jason");
	Warrior w2 = new Warrior("Shin");
	System.out.println("w1 = Jason, w2 = Shin");
	System.out.println("Testing w1.compareTo(w2): " + w1.compareTo(w2));
	Warrior[] wa = new Warrior[10];
	for (int i = 0; i < wa.length; i++) {
	    wa[i] = new Warrior();
	}
	System.out.println("Testing Sorting Array of Warriors: ");
	System.out.println("Original Array: " + Arrays.toString(wa));
	Arrays.sort(wa);
	System.out.println("After Sorting: " + Arrays.toString(wa));
	
    }
	
}

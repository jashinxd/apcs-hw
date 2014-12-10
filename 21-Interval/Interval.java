import java.util.*;
import java.io.*;

public class Interval implements Comparable {

    private int low,high;
    private static Random rnd = new Random();
    private static int numIntervals = 0;
    
    public Interval(int l, int h) {
	low = l;
	high = h;
	numIntervals = numIntervals + 1;
    }
    
    public Interval() {
	low = rnd.nextInt(10);
        high = low + 1 + rnd.nextInt(10);
	numIntervals = numIntervals + 1;
    }

    /*
    public int getLow() {
	return low;
    }
    
    public int getHigh() {
	return high;
    }
    */

    /* Returns positive value when Interval is greater, negative when Interval
       is smaller. (Basically Interval - other interval)
       Compares low value first.If low values are the same, compares high value.
    */
    public int compareTo(Object other) {
	/* Cast other to the appropriate type and store in a
	   local variable for convenience.
	*/
	Interval o = (Interval) other;
    	int dif = 0;
	if (this.low == o.low) {
	    dif = this.high - o.high;
	} else {
	    dif = this.low - o.low;
	}
	return dif;
    }

    public String toString() {
	return "[" + low + "," + high + "]";
    }

    public static void main(String[] args) {
	// --Array of Intervals--
	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println("Array of Intervals:");
	System.out.println(Arrays.toString(a));
	
	// --compareTo Testing--
	System.out.println("\ncompareTo Testing:");
	Interval i1 = new Interval(5,3);
	Interval i2 = new Interval(8,2);
	System.out.println("i1 = [5,3], i2 = [8,2]");
	System.out.println("i1.compareTo(i2): " + i1.compareTo(i2));
	i1 = new Interval(5,7);
	i2 = new Interval(5,1);
	System.out.println("i1 = [5,7], i2 = [5,1]");
	System.out.println("i1.compareTp(i2): " + i1.compareTo(i2));

	// --Sortring with Interface Comparable
	Arrays.sort(a);
	System.out.println("\nAfter Sorting Intervals");
	System.out.println(Arrays.toString(a));
    }
}

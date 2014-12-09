import java.util.*;
import java.io.*;

public class Interval {

    private int low,high;
    private Random rnd = new Random();
    
    public Interval(int l, int h) {
	low = l;
	high = h;
    }
    
    public Interval() {
	low = rnd.nextInt(10);
        high = low + 1 + rnd.nextInt(10);
    }

    public String toString() {
	return "[" + low + "," + high + "]";
    }

    public static void main(String[] args) {
	Interval interval = new Interval();
	//System.out.println(interval);
	Interval[] a = new Interval[10];
	for (int i = 0; i < a.length; i++) {
	    a[i] = new Interval();
	}
	System.out.println(Arrays.toString(a));
    }
}

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 20; i++) {
	    al.add(r.nextInt(6));
	}
	System.out.println("Before removing duplicates:\n" + al);
	int i = 0;
	while (i < al.size() - 1) {
	    if (al.get(i) == al.get(i + 1)) {
		al.remove(i + 1);
	    } else {
		i++;
	    }
	}
	System.out.println("After removing duplicates:\n" + al);
    }
}
	    

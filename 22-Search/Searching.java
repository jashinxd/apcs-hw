import java.util.*;
import java.io.*;

public class Searching {

    private Comparable[] ca;
    private int nextBlank;

    public Searching(int i) {
	ca = new Comparable[i];
	nextBlank = 0;
    }

    public String toString() {
	String fin = "[";
	for (int i = 0; i < ca.length; i++) {
	    fin = fin + ca[i] + ", ";
	}
	fin = fin.substring(0, fin.length() - 2) + "]";
	return fin;
    }

    public void add1index() {
	Comparable[] ca2 = new Comparable[ca.length + 1];
	for (int index = 0; index < ca.length; index++) {
	    ca2[index] = ca[index];
	}
	ca = ca2;
    }

    public boolean add(Comparable item) {
	if (ca[ca.length - 1] != null){
	    add1index();
	}
	while (ca[nextBlank] != null) {
	    nextBlank++;
	}
	ca[nextBlank] = item;
	nextBlank++;
	return true;
    }

    public void addItem(int index, Comparable item) {
	//Add at index, shifts everything else down
	if (index > ca.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	if (ca[ca.length - 1] != null){
	    add1index();
	}
	for (int x = ca.length - 1; x > index; x = x - 1) {
	    ca[x] = ca[x - 1];
	}
	ca[index] = item;
    }

    public void sort() {
	Arrays.sort(ca);
    }

    public int size() {
	return ca.length;
    }

    public Comparable lsearch(Comparable c) {
	for (int i = 0; i < ca.length; i++) {
	    if (ca[i].equals(c)) {
		return c;
	    }
	}
	return null;
    }

    public Comparable bsearch(Comparable c) {
	int low = 0;
	int high = ca.length - 1;
	while (low <= high) {
	    int mid = (low + high) / 2;
	    if (ca[mid].equals(c)) {
		return c;
	    } else {
		if (c.compareTo(ca[mid]) > 0) {
		    low = mid + 1;
		} else {
		    high = mid - 1;
		}
	    }
	}
	return null;
    }

    public Comparable rbsearch(Comparable c, int low, int high) {
	int mid = (low + high) / 2;
	if (low <= high) {
	    if (ca[mid].equals(c)) {
		return c;
	    } else {
		if (c.compareTo(ca[mid]) > 0) {
		    return rbsearch(c, mid + 1, high);
		} else {
		    return rbsearch(c, low, mid - 1);
		}
	    }
	} else {
	    return null;
	}
    }

    public Comparable rbsearch(Comparable c) {
	return rbsearch(c, 0, ca.length - 1);
    }

    public static void main(String[] args) {
	Searching s = new Searching(11);
	Random rnd = new Random(); 
	for (int i = 0; i < s.size(); i++) {
	    s.add(rnd.nextInt(10));
	}
	/*
	s.add("hi");
	s.add("bye");
	s.add("yo");
	s.add("wassup");
	s.add("nice");
	s.add("hey");
	s.add("seeya");
	s.add("peace");
	s.add("chill");
	s.add("go");
	*/
	s.sort();
	System.out.println("Original Array: " + s);
	System.out.println(s.lsearch(5));
	System.out.println(s.bsearch(5));
	System.out.println(s.rbsearch(5));
	//System.out.println(s.lsearch(20));
	//System.out.println(s.bsearch(20));
	//System.out.println(s.rbsearch(20));
    }
}

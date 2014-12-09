import java.io.*;
import java.util.*;

class Sorts {
    int[] data;
    int[] copy;
    Random r;
    public Sorts(int n){
	r = new Random();
	data = new int[n];
	copy = new int[n];
	fill();
	
    }
    
    public Sorts() {
	this(100000);
    }
    
    public void fill(){
	for (int i = 0; i < data.length; i++) {
	    data[i]=r.nextInt(100);
	}
    }
    
    public void backup() {
	for (int i = 0; i < data.length; i++) {
	    copy[i] = data[i];
	}
    }
    public void restore() {
	for (int i = 0; i < data.length; i++) {
	    data[i] = copy[i];
	}
    }
    
    
    public void isort() {
	int i,j;
	int counta = 0;
	int countl = 0;
	for (i = 1; i < data.length; i++) {
	    int tmp=data[i];
	    counta++;
	    for (j=i-1 ; j >= 0 && tmp < data[j];j--) {
		data[j+1]=data[j];
		countl = countl + 1;
		counta = counta + 1;
	    }
	    data[j+1]=tmp;
	    counta++;
	    countl++;
	}
	System.out.println("Number of assignments: " + counta);
	System.out.println("Number of loops: " + countl);
    }
    
    
    public void ssort() {
	int i,j;
	int mi;
	int counta = 0;
	int countl = 0;
	for (i = 0; i < data.length-1; i++) {
	    mi = i;
	    counta++;
	    for (j=i+1;j<data.length;j++) {
		if (data[j]<data[mi]){
		    mi=j;
		    counta++;
		}
		countl++;
	    }
	    int tmp=data[mi];
	    data[mi]=data[i];
	    data[i]=tmp;
	    counta = counta + 3;
	    countl++;
	}
	System.out.println("Number of assignments: " + counta);
	System.out.println("Number of loops: " + countl);
    }

    public void bsort() {
	int again = 0;
	int counta = 0;
	int countl = 0;
	while (again < data.length) {
	    for (int i = 0; i < data.length - 1; i++) {
		int first = data[i];
		int second = data[i+1];
		if (data[i] > data[i+1]) {
		    data[i+1] = first;
		    data[i] = second;
		    again = 0;
		    counta = counta + 3;
		} else {
		    again++;
		    counta++;
		}
		countl++;
		counta = counta + 2;
	    }
	    countl++;
	}
	System.out.println("Number of assignments: " + counta);
	System.out.println("Number of loops: " + countl);
    }
    
    public void builtin() {
	/* this sorts the whole array, if you want to sort only some of it
	   you would write Arrays.sort(data,0,n) where n is the index beyond the 
	   stopping point */
	
	Arrays.sort(data);
	
	/* for an ArrayList, you would use Collections.sort(list) */
    }
    public String toString() {
	String s = "";
	for (int i = 0; i < data.length; i++) {
	    s = s+data[i]+" ";
	}
	return s;
    }
    public static void main(String[] args) {
	Sorts s = new Sorts();
	s.backup();
	//System.out.println("Original Array: " + s);
	//s.builtin();
	/*
	System.out.println("isort:");
	s.isort();
	//System.out.println("isort sorting: " + s);
	s.restore();
	//System.out.println("\nOriginal Array: " + s);
	System.out.println("ssort:");
	s.ssort();
	//System.out.println("ssort sorting: " + s);
	s.restore();
	*/
	//System.out.println("\nOriginal Array: " + s);
	System.out.println("bsort:");
	s.bsort();
	//System.out.println("bsort sorting: " + s);
    }
}

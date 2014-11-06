import java.io.*;
import java.util.*;

public class Mode {

    /*------------ Instance Variables -------------*/
    int[] a;
    Random r;
    
    /*------------ Constructors -------------*/
    public Mode() {
	this(20,100);
    }
    
    public Mode(int n) {
	this(n,100);
    }
    
    
    /* 
       n - size of the array
       m - max value for each entry
    */
    public Mode(int n,int m){
	r = new Random();
	a = new int[n];
	for (int i=0;i<n;i++){
	    a[i] = r.nextInt(m);
	}
    }
    
    /*------------  methods -------------*/
    
    public String toString() {
	String s = "";
	for (int i=0;i<a.length;i++)
	    s = s  + a[i]+", ";
	return s;
    }
    
    public int maxVal() {
	int largest = a[0];
	for (int i = 0; i < a.length; i++) {
	    if (a[i] > largest) {
		largest = a[i];
	    }
	}
	return largest;
    }

    public int maxI(int[] nums) {
	int largest = nums[0];
	for (int n = 0; n < nums.length; n++){
	    if (nums[n] > largest){
		largest = nums[n];
	    }
	}
	return largest;
    }
    
    public int freq(int n) {
	int count = 0;
	for (int i=0;i<a.length;i++){
	    if (a[i]==n)
		count = count + 1;
	}
	return count;
    }


    /*
    public int mode(){
	int count = 0;
	int modeIndex = 0;
	for (int i=0;i<a.length;i++){
	    if (freq(a[i]) > count){
		count = freq(a[i]);
		modeIndex = i;
	    }
	}
	System.out.println("modeval = "+a[modeIndex]);
	return count;
    }
    */

    public int fastMode(){
	int max = maxVal();
	int[] numCount = new int[max + 1];
	int modeIndex = 0;
	for (int i = 0; i < a.length; i++){
	    numCount[a[i]] += 1;
	}
	// return maxI(numCount);
	int largest = numCount[0];
	for (int n = 0; n < numCount.length; n++){
	    if (numCount[n] > largest){
		largest = numCount[n];
		modeIndex = n;
	    }
	}
	System.out.println("modeval = " + modeIndex);
	return largest;
    }
    
    /*------------  main -------------*/
    
    public static void main(String[] args) {
	int n=20,
	    maxval=20;
	
	if (args.length > 0){
	    n = Integer.parseInt(args[0]);
	}
	if (args.length > 1){
	    maxval = Integer.parseInt(args[1]);
	}
	
	Mode m = new Mode(n,maxval);
	// System.out.println(m);
	// System.out.println("modecount = "+m.mode());
	System.out.println("fastMode count = "+m.fastMode());
    }
    
}

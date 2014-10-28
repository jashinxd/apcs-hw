import java.util.*;

public class Arraystuff {
    /*-------------------- Instance Variables --------------------*/

    private int[] a;
    private Random rnd;
    /* by making a variable final we can't change
       the value after the initial asssignment 
    */
    public final int final_example = 123;

    /*-------------------- Constructors --------------------*/
    
    public Arraystuff(int n){
	rnd = new Random();
	a = new int[n];
	for (int i=0;i<a.length;i++){
	    a[i] = 75+rnd.nextInt(76);
	}
    }
    
    public Arraystuff() {
	this(100);
    }

    /*-------------------- Methods --------------------*/
    public String toString(){
	String s="";
	for (int i=0;i<a.length;i++){
	    s=s+a[i]+", ";
	}
	return s;
    }

    public int find(int n) {
	int result = -1;
	for (int i = 0; i < a.length && result == -1; i++){
	    if (a[i] == n){
		result = i;
	    }    
	}
	return result;
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

    public int sum67(int[] nums) {
	int sum = 0;
	int subtract = 0;
	int num1 = 0;
	for (int i = 0; i < nums.length; i++){
	    if (nums[i] != 6 && num1 != 6){
		sum = sum + nums[i];
	    }
	    else if (nums[i] = 6){
		num1 = 6;
	    }
    else if (nums[i] = 7){
	num1 = 0;
    }  
	}

    public static void main(String[] args) {
	Arraystuff as = new Arraystuff();
	System.out.println(as);
	System.out.println("Index of first appearance of 105: " + as.find(105));
	System.out.println("Largest value in the array is " + as.maxVal()); 	
    }
}

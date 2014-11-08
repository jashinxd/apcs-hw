import java.util.*;

public class sarray {

    //Instance Variables
    private int[] data;
    private int nextBlank;
    private Random rnd;

    //Constructor
    public sarray(int i) {
	//Start array at size 10
	data = new int[i];
	rnd = new Random();
	for (int index = 0; index < data.length; index++) {
	    data[index] = 1 + rnd.nextInt(9);
	} 
	nextBlank = 0;
    }

    //Helper Methods
    public String printArray(int[] intArray) {
	String s = "{";
	for (int i = 0; i < intArray.length; i++){
	    s = s + intArray[i] + ", ";
	}
	return s.substring(0,s.length() - 2) + "}";
    }

    public void add1index() {
	int[] data2 = new int[data.length + 1];
	for (int index = 0; index < data.length; index++) {
	    data2[index] = data[index];
	}
	data = data2;
    }

    //Main Methods
    public boolean add(int i) {
	//Add int to the end, grow if needed
	if (data[data.length - 1] != 0){
	    add1index();
	}
	while (data[nextBlank] != 0) {
	    nextBlank++;
	}
	data[nextBlank] = i;
	nextBlank++;
	return true;
    }

    public void add(int index, int i) {
	//Add at index, shifts everything else down
	int[] data2 = new int[data.length + 1];
	if (data[data.length - 1] != 0){
	    add1index();
	}
	for (int x = data.length - 1; x > index; x = x - 1) {
	    data[x] = data[x - 1];
	}
	data[index] = i;
    }

    public int get(int index) {
	//returns int at index 
        return data[index];
    }

    public int set(int index, int i) {
	//Set item at index to int t
	//returns old value
	int oldVal = get(index);
	data[index] = i;
	return oldVal;
    }

    public int size() {
        return data.length;
    }

    public int remove(int index) {
	int oldVal = data[index];
	int[] data2 = new int[data.length - 1];
	for (int i = index; i < data.length - 1; i++) {
	    data[i] = data[i + 1];
	}
	for (int i = 0; i < data2.length; i++){
	    data2[i] = data[i];
	}
	data = data2;
        return oldVal;
    }
    
    public static void main(String[] args){
	sarray s = new sarray(10);
	System.out.println("Original Array: " + s.printArray(s.data));
	System.out.println("s.add(4): " + s.add(4));
	System.out.println("After s.add(4): " + s.printArray(s.data));
	s.add(7, 5);
	System.out.println("After s.add(7,5): " + s.printArray(s.data));
	System.out.println("s.set(7,1): " + s.set(7,1));
	System.out.println("After s.set(7,1): " + s.printArray(s.data));
	System.out.println("Size of data array: " + s.size());
	System.out.println("s.remove(7): " + s.remove(7));
	System.out.println("After s.remove(7): " + s.printArray(s.data));	
    }
}


import java.util.*;

public class Sarray {

    //Instance Variables
    private String[] data;
    private int nextBlank;
    private Random rnd;

    //Constructor
    public Sarray(int i) {
	//Start array at size 10
	data = new String[2];
	/*
	rnd = new Random();
	for (int index = 0; index < data.length; index++) {
	    data[index] = 1 + rnd.nextInt(9);
	}
	*/
	nextBlank = 0;
    }
    
    public Sarray() {
	this(10);
    }

    //Helper Methods
    public String printArray(String[] StringArray) {
	String s = "{";
	for (int i = 0; i < StringArray.length; i++){
	    s = s + StringArray[i] + ", ";
	}
	if (!(s.equals("{"))) {
	    s = s.substring(0,s.length() - 2) + "}";
	} else {
	    s = s + "}";
	}
	return s;
    }

    public void add1index() {
	String[] data2 = new String[data.length + 1];
	if (data.length != 0) {
	    for (int index = 0; index < data.length; index++) {
		data2[index] = data[index];
	    }
	}
	data = data2;
    }

    //Main Methods
    
    public boolean add(String s) {
	//Add int to the end, grow if needed
	/*if (i != (int)i){
	    throw new ArrayStoreException();
	}*/
	if (data.length == 0){
	    add1index();
	} 
	if (data[data.length - 1] != null){
	    add1index();
	}
	while (data[nextBlank] != null) {
	    nextBlank++;
	}
	data[nextBlank] = s;
	nextBlank++;
	return true;
    }

    
    public void add(int index, String i) {
	//Add at index, shifts everything else down
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	String[] data2 = new String[data.length + 1];
	if (data[data.length - 1] != null){
	    add1index();
	}
	for (int x = data.length - 1; x > index; x = x - 1) {
	    data[x] = data[x - 1];
	}
	data[index] = i;
    }
    

    public String get(int index) {
	//returns String at index 
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
        return data[index];
    }

    public String set(int index, String s) {
	//Set item at index to String s
	//returns old value
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	} 
	String oldVal = get(index);
	data[index] = s;
	return oldVal;
    }
    
    public int size() {
        return data.length;
    }
  
    public String remove(int index) {
	if (index > data.length - 1 || index < 0) {
	    throw new ArrayIndexOutOfBoundsException();
	}
	String oldVal = data[index];
	String[] data2 = new String[data.length - 1];
	for (int i = index; i < data.length - 1; i++) {
	    data[i] = data[i + 1];
	}
	for (int i = 0; i < data2.length; i++){
	    data2[i] = data[i];
	}
	data = data2;
        return oldVal;
    }

    public String[] getData(){
	return data;
    }

    public void isort() {
	for (int n = 1; n < data.length; n++) {
	    int i;
	    String s = data[n];
	    for (i = n; i > 0 && s.compareTo(data[i-1]) < 0; i--) {
		data[i] = data[i-1];
	    }
	    data[i] = s;
	}
    }

    public void ssort() {
	for (int i = 0; i < data.length; i++) {
	    String min = data[i];
	    int n = i;
	    for (int ind = i; ind < data.length; ind++) {
		if (data[ind].compareTo(min) < 0) {
		    min = data[ind];
		    n = ind;
		}
	    }
	    data[n] = data[i];
	    data[i] = min;
	}
    }

    public void bsort() {
	int again = 0;
	while (again < data.length) {
	    for (int i = 0; i < data.length - 1; i++) {
		String first = data[i];
		String second = data[i+1];
		if (data[i].compareTo(data[i+1]) > 0) {
		    data[i+1] = first;
		    data[i] = second;
		    again = 0;
		} else {
		    again++;
		}
	    }
	}
    }

    /*
     public static void main(String[] args){
	Sarray s = new Sarray(10);
	System.out.println("Original Array: " + s.printArray(s.data));
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
	System.out.println("After adding: " + s.printArray(s.data));
	System.out.println("Element at index 3: " + s.get(3));
	s.set(3, "hello");
	System.out.println("After s.set(3, hello): " + s.printArray(s.data));
	s.remove(4);
	System.out.println("After s.remove(4): " + s.printArray(s.data));
	/*
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
*/
}

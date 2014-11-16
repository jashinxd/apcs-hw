import java.io.*;
import java.util.*;

public class Driver2 {
    //printArray Method
    public static String printArray(int[] intArray) {
	String s = "[";
	for (int i = 0; i < intArray.length; i++){
	    s = s + intArray[i] + ", ";
	}
	return s.substring(0,s.length() - 2) + "]";
    }

    //Main Method
    public static void main(String[] args) {
	Random r = new Random();
	int length = 10;
	int[] alRandom = new int[length];
	for (int i = 0; i < length; i++) {
	    alRandom[i] = -1;
	}
	for (int i = 0; i < length; i++) {
	    int index = r.nextInt(length);
	    if (alRandom[index] == -1){
		alRandom[index] = i;
	    } else {
		i--;
	    }
	}
	System.out.println(printArray(alRandom));
    }
}
	

import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	//ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> alRandom = new ArrayList<Integer>();
	Random r = new Random();
	int length = 10;
	/*
	for (int i = 0; i < 10; i++) {
	    al.add(i);
	}
	*/

	/* 
	--SLOW METHOD--
	for (int i = 0; i < 1000000; i++) {
	    int randomIndex = r.nextInt(al.size());
	    alRandom.add(al.get(randomIndex));
	    al.remove(randomIndex);
	}
	System.out.println(alRandom);
    }
	*/
	for (int i = 0; i < length; i++) {
	    alRandom.add(-1);
	}

	for (int i = 0; i < length; i++) {
	    int index = r.nextInt(length);
	    if (alRandom.get(index) == -1) {
		alRandom.set(index, i);
	    } else {
		i--;
	    }
	}
	System.out.println(alRandom);
    }
}

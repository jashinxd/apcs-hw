import java.io.*;
import java.util.*;

public class Driver{
    public static void main(String[] args){
	ArrayList<Integer> al = new ArrayList<Integer>();
	ArrayList<Integer> alRandom = new ArrayList<Integer>();
	Random r = new Random();
	for (int i = 0; i < 6; i++) {
	    al.add(i);
	}
	for (int i = 0; i < 6; i++) {
	    int randomIndex = r.nextInt(al.size());
	    alRandom.add(al.get(randomIndex));
	    al.remove(randomIndex);
	}
	System.out.println(alRandom);
    }
}

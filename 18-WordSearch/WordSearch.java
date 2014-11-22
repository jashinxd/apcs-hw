/**
 * Creates a word search puzzle
 *
 */
import java.io.*;
import java.util.*;

public class WordSearch{
    
    private char[][] board;
    
    public WordSearch(int r, int c){
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearch(){
	this(20,30);
    }
    
    public String toString(){
	String s = "";
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		s = s + board[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }
    
    public boolean addWordHTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i = 0; i < w.length(); i++) {
		if (board[r][c] != '.' && board[r][c] != w.charAt(i)) {
		    shouldAdd = false;
		    break;
		}
		if (direction == 'l') {
		    c--;
		}
		if (direction == 'r') {
		    c++;
		}
	    }
	}
	catch (Exception e) {
	    shouldAdd = false;
	}
	return shouldAdd;
    }
	    
    
    public void addWordH(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
	boolean add = true;
	int lastIndex = w.length() - 1;
	if (addWordHTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
		board[r][c] = w.charAt(i);
		if (direction == 'l') {
		    c--;
		}
		if (direction == 'r') {
		    c++;
		}
	    }
	} 
    }
    
    public boolean addWordVTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i = 0; i < w.length(); i++) {
		if (board[r][c] != '.' && board[r][c] != w.charAt(i)) {
		    shouldAdd = false;
		    break;
		}
		if (direction == 'u') {
		    r--;
		}
		if (direction == 'd') {
		    r++;
		}    
	    }
	}
	catch (Exception e) {
	    shouldAdd = false;
	}
	return shouldAdd;
    }

    public void addWordV(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
	boolean add = true;
	int lastIndex = w.length() - 1;
	if (addWordVTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
		board[r][c] = w.charAt(i);
		if (direction == 'u') {
		    r--;
		}
		if (direction == 'd') {
		    r++;
		}
	    }
	} 
    }

    public boolean addWordDTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	try {
	    for (int i = 0; i < w.length(); i++) {
		if (board[r][c] != '.' && board[r][c] != w.charAt(i)) {
		    shouldAdd = false;
		    break;
		}
		if (direction == 'c') {
		    c++;
		    r++;
		}
		if (direction == 'b') {
		    c++;
		    r--;
		}
		if (direction == 'd') {
		    c--;
		    r++;
		}
		if (direction == 'a') {
		    c--;
		    r--;
		}
	    }
	} catch (Exception e) {
	    shouldAdd = false;
	}
	return shouldAdd;
    }		

    public void addWordD(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
	boolean add = true;
	int lastIndex = w.length() - 1;
	if (addWordDTest(w, r, c, direction) == true) {
	    for (int i = 0; i < w.length(); i++) {
		board[r][c] = w.charAt(i);
		if (direction == 'c') {
		    c++;
		    r++;
		}
		if (direction == 'b') {
		    c++;
		    r--;
		}
		if (direction == 'd') {
		    c--;
		    r++;
		}
		if (direction == 'a') {
		    c--;
		    r--;
		}
	    }
	}  
    }

    public void addWordRand(String word) {
	Random rnd = new Random();
	int r, c, type, randDir;
	char d = '.';
	for (int i = 0; i < 20; i++) {
	    r = rnd.nextInt(board.length);
	    c = rnd.nextInt(board[1].length);
	    type = rnd.nextInt(3);
	    if (type == 0) {
		randDir = rnd.nextInt(2);
		if (randDir == 0) {
		    d = 'l';
		} else {
		    d = 'r';
		}
		if (addWordHTest(word, r, c, d)) {
		    addWordH(word, r, c, d);
		    break;
		}	
	    } else if (type == 1) {
		randDir = rnd.nextInt(2);
		if (randDir == 0) {
		    d = 'u';
		} else {
		    d = 'd';
		}
		if (addWordVTest(word, r, c, d)) {
		    addWordV(word, r, c, d);
		    break;
		}
	    } else if (type == 2) {
		randDir = rnd.nextInt(4);
		if (randDir == 0) {
		    d = 'a';
		} else if (randDir == 1) {
		    d = 'b';
		} else if (randDir == 2) {
		    d = 'c';
		} else {
		    d = 'd';
		}
		if (addWordDTest(word, r, c, d)) {
		    addWordD(word, r, c, d);
		    break;
		}
	    }
	}
    }

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println("Blank Board: ");
	System.out.println(w);
	/*
	w.addWordH("hello",3,12,'r');
	w.addWordH("look",3,15,'r');
	w.addWordH("bike",3,5,'r');
	w.addWordH("keylhpe",3,7,'r');
	w.addWordH("lemur",5,10,'r');
	w.addWordH("triangle",5,4,'r');
	w.addWordH("apple",7,7,'l');
	w.addWordH("pear",8,9,'l');
	w.addWordV("lion",7,4,'d');
	w.addWordV("hike",0,13,'d');
	w.addWordV("back",6,18,'u');
	w.addWordD("triangle",18,12,'d');
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	*/

	w.addWordRand("hello");
	w.addWordRand("look");
	w.addWordRand("bike");
	w.addWordRand("keyhole");
	w.addWordRand("lemur");
	w.addWordRand("triangle");
	w.addWordRand("apple");
	w.addWordRand("pear");
	w.addWordRand("lion");
	w.addWordRand("hike");
	w.addWordRand("back");
	w.addWordRand("triangle");

	System.out.println("After Adding: ");
	System.out.println(w);
    }
}

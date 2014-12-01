import java.util.*;
import java.io.*;

/**
 * Creates a word search puzzle
 *
 */
public class WordSearchExtra{

    private char[][] board,key;
    private ArrayList<String> words;
    private ArrayList<String> wordsInPuzzle;
    private Random rnd;
    private int rowAdded;
    private int columnAdded;
    private char dirAdded;
    
    public WordSearchExtra(int r, int c){
	rnd = new Random();
	words = new ArrayList<String>();
	
	Scanner sc = null;
	
	try {
	    sc = new Scanner(new File("words.txt"));
	} catch (Exception e) {
	    System.out.println("Can't open wordlist");
	    System.exit(0);
	}
	
	while (sc.hasNext()){
	    words.add(sc.next());
	}
	
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearchExtra(){
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
		if (direction == 'n') {
		    r--;
		}
		if (direction == 's') {
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
		if (direction == 'n') {
		    r--;
		}
		if (direction == 's') {
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

    public boolean addWord(String word) {
	Random rnd = new Random();
	int r, c, type, randDir;
	char d = '.';
	boolean canAdd = false;
	for (int i = 0; i < 100; i++) {
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
		    rowAdded = r;
		    columnAdded = c;
		    dirAdded = d;
		    canAdd = true;
		    break;
		}	
	    } else if (type == 1) {
		randDir = rnd.nextInt(2);
		if (randDir == 0) {
		    d = 'n';
		} else {
		    d = 's';
		}
		if (addWordVTest(word, r, c, d)) {
		    addWordV(word, r, c, d);
		    rowAdded = r;
		    columnAdded = c;
		    dirAdded = d;
		    canAdd = true;
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
		    rowAdded = r;
		    columnAdded = c;
		    dirAdded = d;
		    canAdd = true;
		    break;
		}
	    }
	}
	return canAdd;
    }

    /**
     * copy a board with words in it to key which will be the answer key
     *
     */
    private void makeKey(){
	key = new char[board.length][board[0].length];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		key[i][j] = board[i][j];
	    }
	}
    }

    public void buildPuzzle(int numwords){
	
	/*
	  loop 
	  take a random word out of the word list
	  try to add it to the puzzle
	  
	*/
	wordsInPuzzle = new ArrayList<String>();
	int count = 0;
	while (numwords > 0) {
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (addWord(word) && count == 0) {
		numwords--;
		words.remove(wordIndex);
		wordsInPuzzle.add(word);
		count++;
	    }
	    if (count != 0 && wordsInPuzzle.size() > 0) {
		String lastWord = wordsInPuzzle.get(wordsInPuzzle.size() - 1);
		int randomInd = rnd.nextInt(lastWord.length());
		String intChar = lastWord.substring(randomInd, randomInd + 1);
		if (word.indexOf(intChar) > 0) {
		    int ind = word.indexOf(intChar);
		    int r = rowAdded;
		    int c = columnAdded;
		    char d = dirAdded;
		}
	    }
	}
	makeKey();
	/* fill the rest of the board */
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[0].length; j++) {
		if (board[i][j]=='.'){
		    /* method 2 */
		    String letters = "abcdefghijklmnopqrstuvwxyz";
		    char letter = letters.charAt(rnd.nextInt(letters.length()));
		    board[i][j]=letter;
		    
		    /* method 1
		       int offset = rnd.nextInt(26);
		       board[i][j]=(char)((int)'a'+offset);
		    */
		}
	    }
	}
    }

    public String getWIP() {
	return wordsInPuzzle.toString();
    }
    
    public String getKey() {
	String s = "";
	
	for (int i = 0; i < key.length; i++) {
	    for (int j = 0; j < key[i].length; j++) {
		s = s + key[i][j] + " ";
	    }
	    s = s + "\n";
	}
	return s;
    }

    public static void main(String[] args) {
	WordSearchExtra w = new WordSearchExtra(30,30);

	/* --Add words at specific places--
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
	
	/* --Add words randomly--
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
	*/

	w.buildPuzzle(10);

	System.out.println("Words imported from file: ");
	System.out.println(w.getWIP() + "\n");

	System.out.println("After Adding: ");
	System.out.println(w.getKey() + "\n");

	System.out.println("Filling out rest of letters: ");
	System.out.println(w);
    }
}

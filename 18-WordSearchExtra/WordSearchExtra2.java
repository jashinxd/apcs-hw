import java.util.*;
import java.io.*;

/**
 * Creates a word search puzzle that creates as many intersecting words
   as possible.
 *
 */
public class WordSearchExtra2{

    private char[][] board,key;
    private ArrayList<String> words;
    private ArrayList<String> words2;
    private ArrayList<String> wordsInPuzzle;
    private Random rnd;
    private int rowAdded;
    private int colAdded;
    private int dRow;
    private int dCol;
    
    public WordSearchExtra2(int r, int c){
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
	words2 = words;
	
	board = new char[r][c];
	for (int i = 0; i < board.length; i++) {
	    for (int j = 0; j < board[i].length; j++) {
		board[i][j]='.';
	    }
	}
	
    }
    public WordSearchExtra2(){
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
    
 public boolean addWordHelper(String w,int row, int col,int deltaRow, int deltaCol){
	int r = row, c = col;
	
	for (int i=0;i<w.length();i++){
	    try {
		if (board[r][c]!='.' && board[r][c]!=w.charAt(i)){
		    return false;
		}
	    } catch ( Exception e){
		return false;
	    }
	    r = r + deltaRow;
	    c = c + deltaCol;
	}

	r = row;
	c = col;
	
	dRow = deltaRow;
	dCol = deltaCol;
	rowAdded = r;
	colAdded = c;
	
	for (int i=0;i<w.length();i++){
	    board[r][c] = w.charAt(i);
	    r = r + deltaRow;
	    c=c+deltaCol;
	}
	return true;
    }

    
    public boolean addWord(String w) {
	int row = rnd.nextInt(board.length);
	int col = rnd.nextInt(board[0].length);
	int deltaRow = -1 + rnd.nextInt(3);
	int deltaCol = -1 + rnd.nextInt(3);
	if (deltaCol == deltaRow && deltaCol == 0) {
	    return false;
	} else {
	    dRow = deltaRow;
	    dCol = deltaCol;
	    rowAdded = row;
	    colAdded = col;
	}
	return addWordHelper(w,row,col,deltaRow,deltaCol);
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

    /*
    private int trySet() {
	int wordIndex = -1;
	while (wordIndex == -1)
	try {
	    int wordIndex = rnd.nextInt(words.size());
	} catch (Exception e) {
	    words = words2;
	    trySet();
	}
	return wordIndex
    }
    */

    public void buildPuzzle(int numwords){
	
	/*
	  loop 
	  take a random word out of the word list
	  try to add it to the puzzle
	  
	*/
	wordsInPuzzle = new ArrayList<String>();
	while (numwords > 0) {
	    //System.out.println(words.size());
	    int wordIndex = rnd.nextInt(words.size());
	    String word = words.get(wordIndex);
	    if (wordsInPuzzle.size() == 0) {
		if (addWord(word)) {
		    System.out.println(word);
		    numwords--;
		    wordsInPuzzle.add(word);
		}
	    }
	    if (wordsInPuzzle.size() > 0) {
	        //System.out.println(word);
		String lastWord = wordsInPuzzle.get(wordsInPuzzle.size() - 1);
		int randomInd = rnd.nextInt(lastWord.length());
		String intChar = lastWord.substring(randomInd, randomInd + 1);
		if (word.indexOf(intChar) > 0) {
		    int ind = word.indexOf(intChar);
		    int r = rowAdded;
		    int c = colAdded;
		    //System.out.println("r: " + r + " c: " + c + " ind: " + ind);
		    if (dRow == -1) {
			r = r - ind;
		    }
		    if (dRow == 1) {
			r = r + ind;
		    }
		    if (dCol == -1) {
			c = c - ind;
		    }
		    if (dCol == 1) {
			c = c + ind;
		    }
		    //System.out.println("r: " + r + " c: " + c);
		    int deltaRow = -1 + rnd.nextInt(3);
		    int deltaCol = -1 + rnd.nextInt(3);
		    if (!(deltaCol == deltaRow && deltaCol == 0)) {
			if (deltaRow == 1) {
			    r = r - ind;
			}
			if (deltaRow == -1) {
			    r = r + ind;
			}
			if (deltaCol == 1) {
			    c = c - ind;
			}
			if (deltaCol == -1) {
			    c = c + ind;
			}
			if (addWordHelper(word, r, c, deltaRow, deltaCol)) {
			    numwords--;
			    wordsInPuzzle.add(word);
			}
		    }
		}
	    }
	    words.remove(wordIndex);
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
	WordSearchExtra2 w = new WordSearchExtra2(30,30);

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

	w.buildPuzzle(20);

	System.out.println("Words imported from file: ");
	System.out.println(w.getWIP() + "\n");

	System.out.println("After Adding: ");
	System.out.println(w.getKey() + "\n");

	System.out.println("Filling out rest of letters: ");
	System.out.println(w);
    }
}

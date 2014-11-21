/**
 * Creates a word search puzzle
 *
 */
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

    public String reverseString(String s) {
	String news = "";
	for (int i = s.length() - 1; i >= 0; i--) {
	    news += s.substring(i,i+1);
	}
	return s;
    }
    
    public boolean addWordHTest(String word, int row, int col, char direction) {
	int r = row, c = col;
	String w = word;
	int lastIndex = w.length() - 1;
	boolean shouldAdd = true;
	if (r > board.length || c > board[1].length) {
	    shouldAdd = false;
	} else if (direction == 'l') {
	    if (c - lastIndex < 0) {
		shouldAdd = false;
	    }
	} else if (direction == 'r') {
	    if (board[r].length - c < w.length()) {
		shouldAdd = false;
	    }
	}
	if (shouldAdd = true){
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
	} else {
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
	if (r > board.length || c > board[1].length) {
	    shouldAdd = false;
	} else if (direction == 'u') {
	    if (r - lastIndex < 0) {
		shouldAdd = false;
	    }
	} else if (direction == 'd') {
	    if (board.length - r < w.length()) {
		shouldAdd = false;
	    }
	}
	if (shouldAdd = true) {
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
	} else {
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
	boolean testRight = board[r].length - c < w.length();
	boolean testUp = r - lastIndex < 0;
	boolean testLeft = c - lastIndex < 0;
	boolean testDown = board.length - r < w.length(); 
	if (r > board.length || c > board[1].length) {
	    shouldAdd = false;
	} else if (direction == 'b') {
	    System.out.println(board[r].length - c);
	    System.out.println(w.length());
	    System.out.println(r - lastIndex);
	    if (board[r].length - c < w.length() || r - lastIndex < 0) {
		shouldAdd = false;
	    }
	} else if (direction == 'c') {
	    if (testRight || testDown) {
		shouldAdd = false;
	    }
	} else if (direction == 'a') {
	    if (testLeft || testUp) {
		shouldAdd = false;
	    }
	} else if (direction == 'd') {
	    if (testLeft || testDown) {
		shouldAdd = false;
	    }
	}
	if (shouldAdd = true) {
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
	} else {
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

    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println("Blank Board: ");
	System.out.println(w);
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
	w.addWordD("triangle",18,27,'b');
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	System.out.println("After Adding: ");
	System.out.println(w);
    }
}

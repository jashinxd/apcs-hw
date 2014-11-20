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
		s = s + board[i][j];
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
    
    public void addWordH(String word,int row, int col, char direction){
	int r = row, c = col;
	String w = word;
	boolean add = true;
	if (direction == 'b') {
            c = c - (w.length() - 1);
	    if (c >= 0) {
		w = reverseString(w);
	    } else {
		System.out.println("Your word will not fit in that space!");
		add = false;
	    }
	}
	if (add) {
	    if (row > board.length || c > board[1].length) {
		System.out.println("Your indexes are out of range!");
	    } else if (board[1].length - c < w.length()) {
		System.out.println("Your word will not fit in that space!");
	    } else {
		int lastIndex = w.length() - 1;
		boolean matchEnd = true;
		for (int i = 0; i < w.length(); i++) {
		    if (board[r][c+i] != '.' && board[r][c+i] != w.charAt(i)) {
			matchEnd = false;
			System.out.println("You will overwrite a word!");
			break;
		    }
		}
		if (matchEnd){
		    for (int i = 0; i < w.length(); i++) {
			board[r][c] = w.charAt(i);
			c++;
		    }
		} 
	    }
	}
    }
    
    public static void main(String[] args) {
	WordSearch w = new WordSearch();
	System.out.println("Blank Board: ");
	System.out.println(w);
	w.addWordH("hello",3,12,'f');
	w.addWordH("look",3,15,'f');
	w.addWordH("bike",3,5,'f');
	w.addWordH("keylhpe",3,7,'f');
	w.addWordH("lemur",5,10,'f');
	w.addWordH("triangle",5,4,'f');
	w.addWordH("apple",7,7,'b');
	w.addWordH("pear",8,2,'b');
	//w.addWordH("hello",100,5);
	//w.addWordH("hello",30,555);
	System.out.println("After Adding: ");
	System.out.println(w);
    }
}

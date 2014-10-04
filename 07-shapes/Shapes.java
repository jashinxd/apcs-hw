
public class Shapes {

    public String line(String c, int repeats){
	String s = "";
	for (int count = 0; count < repeats; count = count + 1){
	    s = s + c;
	}
	return s;
    }

    public String box(int r, int c){
	String s= "";
	int row = 0;
	int col;
	while (row<r){
	    col = c;
	    while (col>0){
		s = s + "*";
		col=col-1;
	    }
	    s=s+"\n";
	    row=row+1;
	}
	return s;
    }

    public String tri1(int h) {
	String fin = "";
	int row = 0;
	int count = 0;
	while (row < h) {
	    while (count <= row) {
		fin = fin + "*";
		count = count + 1;
	    }
	    row = row + 1;
	    count = 0;
	    fin = fin + "\n";
	}
	return fin;
    }
    
    public String tri2(int h) {
	String fin = "";
	int row = 1;
	int count = h;
	while (row < h + 1) {
	    while (count > row) {
		fin = fin + " ";
		count = count - 1;
	    }
	    while (count > 0) {
		fin = fin + "*";
		count = count - 1;
	    }
	    fin = fin + "\n";
	    count = h;
	    row = row + 1;
	}
	return fin;
    }
    
    public String tri3(int h) {
	int stars = 1;
	int count = 0;
	int row = 0;
	int spaces = h - (row + 1);
	String fin = "";
	while (row < h) {
	    while (spaces > 0) {
		fin = fin + " ";
		spaces = spaces - 1;
	    }
	    while (count < stars) {
		fin = fin + "*";
		count = count + 1;
	    }
	    count = 0;
	    stars = stars + 2;
	    row = row + 1;
	    spaces = h - (row + 1);
	    fin = fin + "\n";
	}
	return fin;
    }
    
    public String diamond(int h) {
	int stars = 1;
	int count = 0;
	int row = 0;
	int rowCount = 0;
	int spaces = rowCount + (h / 2);
	String fin = "";
	while (row < h) {
	    while (spaces > 0) {
		fin = fin + " ";
		spaces = spaces - 1;
	    }
	    while (count < stars) {
		fin = fin + "*";
		count = count + 1;
	    }
	    if (row < (h / 2)) {
		stars = stars + 2;
		rowCount = rowCount + 1;
	    } else {
		stars = stars - 2;
		rowCount = rowCount - 1;
	    }
	    count = 0;
	    row = row + 1;
	    spaces = h - (rowCount + ((h / 2) + 1));
	    fin = fin + "\n";
	}
	return fin;
    }

    public String tri4(int h) {
	String fin = "";
        int row = 0;
	int spaces = 0;
	int stars = 0;
	while (row < h) {
	    while (spaces < row) {
		fin = fin + " ";
		spaces = spaces + 1;
	    }
	    while (stars < (h - row)) { 
		fin = fin + "*";
	        stars = stars + 1;
	    }
	    fin = fin + "\n";
	    spaces = 0;
	    stars = 0;
	    row = row + 1;
	}
	return fin;
    }
		
    public String frame(int col, int row) {
	String fin = line("*", row) + "\n";
	for (int count = 2; count < col; count = count + 1) {
	    fin = fin + "*" + line(" ", row - 2) + "*\n";
	}
        fin = fin + line("*", row);
	return fin;
    }
}
   

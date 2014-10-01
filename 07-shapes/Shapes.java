
public class Shapes {

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
}

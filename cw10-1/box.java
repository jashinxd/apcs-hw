public class box {
    public String boxPrint(int r, int c) {
	int countRow = r;
	int countColumn = c;
	String fin = "";
	while (countRow > 0) {
	    while (countColumn > 0) {
		fin = fin + "*";
		countColumn = countColumn - 1;
	    }
	    countColumn = c;
	    if (countRow != 1) {
		fin = fin + "\n";
	    }
	    countRow = countRow - 1;
	}
	return fin;
    }
}
		

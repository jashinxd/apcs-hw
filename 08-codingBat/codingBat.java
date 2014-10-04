public class codingBat {
    public String stringSplosion(String str) {
	String fin = "";
	for (int index = 0; index <= str.length(); index = index + 1) {
	    fin = fin + str.substring(0,index);
	}
	return fin;
    }
    
    public String stringX(String str) {
	String fin = "";
	for (int index = 0; index < str.length(); index = index + 1) {
	    if (!(index != 0 && index != str.length() - 1 && str.substring(index, index + 1).equals("x"))) {
		fin = fin + str.substring(index, index + 1);
	    }
	    
	}
	return fin;
    }
}

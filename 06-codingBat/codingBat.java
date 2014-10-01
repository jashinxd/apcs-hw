public class codingBat {
    
    //frontTimes - 10 Mins
    public String frontTimes(String str, int n) {
	if (n == 0) {
	    return "";
	}
	if (str.length() < 4) {
	    String shorter = str;
	    while (n > 1) {
		str = shorter + str;
		n = n - 1;
	    }
	    return str;
	}
	String longer = str.substring(0,3);
	while (n > 1) {
	    longer = longer + str.substring(0,3);
	    n = n - 1;
	}
	return longer;
    }
    
    //stringBits - 5 mins
    public String stringBits(String str) {
	int index = 0;
	String fin = "";
	while (index < str.length()) {
	    fin = fin + str.substring(index, index + 1);
	    index = index + 2;
	}
	return fin;
    }
    //stringYak - 25 mins
    public String stringYak(String str) {
	int index = 0;
	lengthString = str.length
	String fin = "";
	while (index < str.length() - 2) {
	    if (index.substring(index.equals("y")) && index.substring(index.equals("k"))) {
		fin = fin.substring(0, index) + fin.substring(index + 3);
		len = fin.length();
	    }
	    index = index + 1;
	}
	return fin;
    }
}


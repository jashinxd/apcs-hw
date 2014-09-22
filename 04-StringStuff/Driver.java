//mixStart
public boolean mixStart(String str) {
    int length = str.length();
    if (length < 3)
	return false;
    String sub = str.substring(1,3);
    return sub.equals("ix"); 
}

//makeOutWord
public String makeOutWord(String out, String word) {
    String firstTwo = out.substring(0,2);
    String lastTwo = out.substring(2,4);
    return firstTwo + word + lastTwo;
}

//firstHalf
public String firstHalf(String str) {
    return str.substring(0, (str.length()/2));
}

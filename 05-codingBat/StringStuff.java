public class StringStuff {

    // nonStart
    public String nonStart(String a, String b) {
	String shorta = a.substring(1);
	String shortb = b.substring(1);
	return shorta + shortb;
    }

    // makeAbba
    public String makeAbba(String a, String b) {
	return a + b + b + a;
    }

    // diff21
    public int diff21(int n) {
	int diff = 21 - n;
	if (diff < 0) {
	    return (diff * -2);
	} else {
	    return diff;
	} 
    }
}

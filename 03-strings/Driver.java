public class Driver {
    public static void main(String[] args) {
	String s = "jason shin";
	int space = s.indexOf(" ");
	String firstLower = s.substring( 0, space );
	String lastLower = s.substring( space + 1, s.length() );
	String firstLetterA = firstLower.substring(0,1);
	String firstLetterB = lastLower.substring(0,1);
	String upperFirst = firstLetterA.toUpperCase();
	String lowerFirst = firstLetterB.toUpperCase();
 	String first = firstLower.replaceFirst( firstLetterA, upperFirst );
	String last = lastLower.replaceFirst( firstLetterB, lowerFirst );

	System.out.println(first);
	System.out.println(last);
    }
}

public class OrderedSuperArray extends Sarray{
    
    public OrderedSuperArray(int i){
	super(i);
	String[] d = getData();
	System.out.println(getData());
    }

    /*
    public boolean add(String s) {
	if (d[d.length - 1] != null) {
	    add1index();
	}
	for (int i = 0; i < d.length; i++) {
	    if (s.compareTo(d[i]) > 0) {
		for (int ind = d.length - 1; ind > i; ind--) {
		    set(d[ind + 1], ind);
		}
		set(s, i);
	    }
	}
	return true;
    }
    */

    public static void main(String[] args) {
	OrderedSuperArray s = new OrderedSuperArray(10);
	System.out.println(s.getData());
    }
}
    

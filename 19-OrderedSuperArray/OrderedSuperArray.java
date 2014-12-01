public class OrderedSuperArray extends Sarray{
    
    public OrderedSuperArray(int i){
	super(i);
	String[] d = super.getData();
	System.out.println(super.getData());
    }

    /*
    public boolean add(String s) {
	if (d[d.length - 1] != null) {
	    super.add1index();
	}
	for (int i = 0; i < d.length; i++) {
	    if (s.compareTo(d[i]) > 0) {
		for (int ind = d.length - 1; ind > i; ind--) {
		    super.set(d[ind + 1], ind);
		}
		super.set(s, i);
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
    

public class OrderedSuperArray extends Sarray {

    private String[] d = new String[0];

    public boolean add(String s) {
	if (d.length == 0) {
	    super.add(s);
	}
	else if (d[d.length - 1] != null) {
	    super.add1index();
	}
	for (int i = 0; i < d.length; i++) {
	    if (s.compareTo(d[i]) > 0) {
		super.add(i,s);
		break;
	    }
	}
	return true;
    }

    public static void main(String[] args) {
	OrderedSuperArray s = new OrderedSuperArray();
	s.add("hi");
	System.out.println(s.printArray
    }
}
    

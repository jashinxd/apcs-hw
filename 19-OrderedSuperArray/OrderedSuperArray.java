public class OrderedSuperArray extends Sarray {

    public boolean add(String s) {
	if (size() == 0) {
	    super.add(s);
	    return true;
	}
	else if (get(size() - 1) != null) {
	    add1index();
	}
	for (int i = 0; i < size() + 1; i++) {
	    if (get(i) == null) {
		super.add(i,s);
		break;
	    } else if (s.compareTo(get(i)) < 0) {
		super.add(i,s);
		break;   
	    }
	}
	return true;
    }

    public String set(String word, int i) {
	String result = get(i);
	remove(i);
	add(word);
	return result;
    }

    public static void main(String[] args) {
	OrderedSuperArray s = new OrderedSuperArray();
	s.add("hi");
	s.add("bye");
	s.add("yo");
	s.add("wassup");
	s.add("nice");
	s.add("hey");
	s.add("seeya");
	s.add("peace");
	s.add("chill");
	s.add("go");
	s.add("stay");
	s.add("dang");
	s.set("zany", 0);
	System.out.println(s.printArray(s.getData()));
    }
}
    

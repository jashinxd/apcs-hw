public class Driver{

    public static void main(String[] args) { 
	Sarray s = new Sarray();
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
	//s.isort();
	s.ssort();
	System.out.println(s.printArray(s.getData()));
    }
}

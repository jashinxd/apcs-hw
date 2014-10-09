public class Driver {

    public static void main(String[] args){
	Basechar c = new Basechar("Hello"),c2;
	//Warrior w = new Warrior("Groo"),w2;
	Mage mdef = new Mage();
	Mage mnam = new Mage("Mr. Sage"),m2;
	Mage mboth = new Mage("Mr. Page", 300);

	//w.setName("Groo");
	//m.setName("Mr. Sage");

	//w.attack(m);
	//m.attack(w);
	//w.attack(w);

	//System.out.println(w.toString());
	//System.out.println(w);
	
	//System.out.println(m.getName());
	System.out.println(mboth.getManna());
	System.out.println(mboth.getName());

    }


}

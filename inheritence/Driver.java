public class Driver {

    public static void main(String[] args){
	Basechar b1,b2;
	Warrior w1,w2;
	Mage m1,m2;
	
	b1 = new Basechar();
	w1 = new Warrior();
	m1 = new Mage();
	
	m2 = m1;
	//m2 = b1; //Superclass cannot call methods in subclass
	//m2 = w1; //Subclass cannot call methods in fellow subclas 
	
	//b2 = m1;
	b2 = m2;
	//b2 = new Warrior();
	
	//System.out.println(m2.getHealth());
	System.out.println(b2.getHealth());
    }


}

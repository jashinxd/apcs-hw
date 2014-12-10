public class Warrior extends basechar implements Comparable{
    public Warrior(String name){
        super.setarmor(20);
        super.setname(name);
        super.setcrit(20);
    }

    public int getattack(){
        return super.getattack();
    }

    public int getarmor(){
        return super.getarmor();
    }

    public String getname(){
        return super.getname();
    }
    
    public int compareTo(Object other) {
	Warrior o = (Warrior) other;
	return getname().compareTo(o.getname());
    }
    
    public static void main(String[] args) {
	Warrior w1 = new Warrior("Jason");
	Warrior w2 = new Warrior("Shin");
	System.out.println(w1.compareTo(w2));
	
    }
	
}

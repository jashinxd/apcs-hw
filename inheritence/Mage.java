
public class Mage extends Basechar{
    private int manna = 200;

    public Mage (){
    }

    public Mage(String n){
	setName(n);
    }

    public Mage(String n, int m){
	setName(n);
	setManna(m);
    }

    public int getManna(){
	return manna;
    }

    public void setManna(int m){
	manna = m;
    }
}

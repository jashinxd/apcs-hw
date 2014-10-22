public class basechar{
    private int health = 200;
    private  int attack = 30;
    private  int armor = 10;
    private int mana = 50;
    private  String name = "";
    private int luck = 0;
    
    //Constructors
    
    //Methods
    public int gethealth(){
	return health;
    }
    
    public int getattack(){
        return this.attack;
    }
    public int getarmor(){
        return this.armor;
    }
    public int getmana(){
        return this.mana;
    }
    public String getname(){
        return this.name;
    }
    
    public void sethealth(int value){
        health = value;
    }
    
    public void setattack(int value){
        attack = value;
    }
    
    public void setarmor(int value){
        armor = value;
    }
    
    public void setmana(int value) {
        mana = value;
    }
    
    public void setname(String value){
        name = value;
    }
    public void setcrit(int value){
        luck = value;
    }
    public int getcrit(){
        return this.luck;
    }
}

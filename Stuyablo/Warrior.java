public class Warrior extends basechar{
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
}

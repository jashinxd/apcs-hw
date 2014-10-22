import java.util.*;
import java.io.*;

public class Monster extends basechar{
    private Random number = new Random();
    int rng = number.nextInt(100);
    
    public Monster(){
        
        if (rng == 0) {
            super.setname("Bunny");
            super.sethealth(100);
            super.setattack(0);
            super.setarmor(0);
            super.setmana(0);
        }
        
        else if (rng == 99){
            super.setname("Demon King");
            super.sethealth(9001);
            super.setattack(9001);
            super.setarmor(9001);
            super.setmana(9001);
            super.setcrit(99);
        }
    
        else if (rng > 60){
            super.setname("Ogre");
            super.sethealth(500);
            super.setattack(40);
            super.setarmor(0);
            super.setmana(0);
            super.setcrit(5);
        }
    
        else {
            super.setname("Slime");
            super.sethealth(300);
            super.setattack(25);
            super.setarmor(5);
            super.setmana(0);
            super.setcrit(5);
        }
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

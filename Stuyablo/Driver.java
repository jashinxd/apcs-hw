import java.util.*;
import java.io.*;
public class Driver{
    public static void main(String[] args){
        Random number = new Random();
        Scanner sc = new Scanner(System.in);
        String Player = "";
        String name = "";
        String namec = "Computer";
        int attack1 = 0;
        int attack2 = 0;
        int armor1 = 0;
        int armor2 = 0;
        int health1 = 0;
        int health2 = 0;
        int maxhealth1 = 0;
        int maxhealth2 = 0;
        int mana1 = 0;
        int mana2 = 0;
        int crit1 = 0;
        int crit2 = 0;
        int rng = number.nextInt(100);
        while (Player.equals("")){
            System.out.print("Choose a Class!\nMage or Warrior: ");
            String input = sc.nextLine();
            if (input.equals("Mage") || input.equals("Warrior")){
                Player = input;
                System.out.println("Your Class is " + Player);
            } else {
                System.out.println("Try Again");
                Player = "";
            }
        }
        while (name.equals("")){
            if(Player.equals("Mage")){
                System.out.print("What is your name, adventurer? ");
                name = sc.nextLine();
                Mage Player1 = new Mage(name);
                attack1 = Player1.getattack();
                armor1 = Player1.getarmor();
                health1 = Player1.gethealth();
                maxhealth1 = Player1.gethealth();
                mana1 = Player1.getmana();
                crit1 = Player1.getcrit();
                System.out.println("Welcome to this game, " + name);
                System.out.print("Having heard rumors of a hidden treasure deep in a haunted cave,");
                System.out.print("you are a mage seeking to gather the riches, give it to the ");
                System.out.print("king, and therefore gain his favor in order to have a seat in his court.");
                 try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.print("However, along with the whispers of endless gold and jewels, there are voices ");
                System.out.print("that speak of the witch ");
                System.out.print("that lurks deep within the cave.");
                System.out.print("She creates monsters on a whim - with a flick of her crooked wand,"); 
                System.out.print("she can produce a disgusting, ");
                System.out.print("slippery slime creature. Ogres are her warrior guards and bunnies are her pets.");
                System.out.println("The legendary Demon King is also said to inhabit the cave.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.print("\n");
                System.out.println("Many bravehearts have attempted to plunder the cave but all have failed, defeated by one of the countless monsters slinking along the deep, dark passageways. \n");
                System.out.println("But you are no ordinary Mage\n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                System.out.println("You know of the witch's legendary power. You have experienced her ruthless black magic firsthand - as, of course, she was once your mentor. The goldlust drove her crazy and now she stands to defend her gold and jewels until the very end.\n");
                System.out.println("You Have " + Player1.gethealth() + " Health");
                System.out.println("You Have " + Player1.getattack() + " Attack Power");
                System.out.println("You Have " + Player1.getarmor() + " Armor");
                System.out.println("You Have " + Player1.getmana() + " Mana");
                System.out.println("You Have " + Player1.getcrit() + "% chance of a critical hit!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println("Good Luck " + Player1.getname() + "!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
            
            if(Player.equals("Warrior")){
                System.out.print("What is your name, adventurer? ");
                name = sc.nextLine();
                Warrior Player1 = new Warrior(name);
                attack1 = Player1.getattack();
                armor1 = Player1.getarmor();
                health1 = Player1.gethealth();
                maxhealth1 = Player1.gethealth();
                mana1 = Player1.getmana();
                crit1 = Player1.getcrit();
                System.out.println("Welcome to this game, " + name);
                System.out.print("Having heard rumors of a hidden treasure deep in a haunted cave,");
                System.out.print("you are a Warrior seeking to gather the riches, give it to the ");
                System.out.print("king, and therefore gain his favor in order to have a seat in his court.");
                 try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.print("However, along with the whispers of endless gold and jewels, there are voices ");
                System.out.print("that speak of the witch ");
                System.out.print("that lurks deep within the cave.");
                System.out.print("She creates monsters on a whim - with a flick of her crooked wand,"); 
                System.out.print("she can produce a disgusting, ");
                System.out.print("slippery slime creature. Ogres are her warrior guards and bunnies are her pets.");
                System.out.println("The legendary Demon King is also said to inhabit the cave.");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.print("\n");
                System.out.println("Many bravehearts have attempted to plunder the cave but all have failed, defeated by one of the countless monsters slinking along the deep, dark passageways. \n");
                System.out.println("But you are no ordinary Warrior\n");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {}
                System.out.println("Coming from a different land, you wish to gain the king's favor in order to benefit your people\n");
                System.out.println("You Have " + Player1.gethealth() + " Health");
                System.out.println("You Have " + Player1.getattack() + " Attack Power");
                System.out.println("You Have " + Player1.getarmor() + " Armor");
                System.out.println("You Have " + Player1.getmana() + " Mana");
                System.out.println("You Have " + Player1.getcrit() + "% chance of a critical hit!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
                System.out.println("Good Luck " + Player1.getname() + "!");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
        }
        
        Monster Player2 = new Monster();
        attack2 = Player2.getattack();
        armor2 = Player2.getarmor();
        health2 = Player2.gethealth();
        mana2 = Player2.getmana();
        crit2 = Player2.getcrit();
        namec = Player2.getname();
        if (namec.equals("Bunny")) {
            System.out.println("An innocent bunny has crossed your path!");
        }
        if (namec.equals("Slime")) {
            System.out.println("A Slime is jiggling his way towards you!");
        }
        if (namec.equals("Ogre")) {
            System.out.println("A wild Ogre is about to rip your guts out!");
        }
        if (namec.equals("Demon King")) {
            System.out.println("...You better run. The Demon King has arrived.");
        }
        //System.out.println("Computer has " + Player2.gethealth() + " Health");
        //System.out.println("Computer has " + Player2.getattack() + " Attack Power");
        //System.out.println("Computer has " + Player2.getarmor() + " Armor");
   
        
        while (health1 > 0 && health2 > 0){
            //int strike1 = number.nextInt(attack1) - armor2;
            //int strike2 = number.nextInt(attack2) - armor1;
            int strike1;
            int strike2;
            
            //Player's turn
            System.out.print("Attack, Flee, or Heal: ");
            String turn = sc.nextLine();
            
            //Attack Method
            if(turn.equals("Attack")) {
                //Determines Crit Chance
                int critchanceplayer = number.nextInt(100);
                if (critchanceplayer > 99 - crit1){
                    strike1 = number.nextInt(attack1) * 2 - armor2;
                    System.out.println(name + " has performed a critical strike!");
                }
                else{
                    strike1 = number.nextInt(attack1) - armor2;
                }
                if(strike1 > 0){
                    health2 = (health2 - strike1);
                    System.out.println(namec + " took " + strike1 + " damage");}
                else{
                    if (number.nextInt(2) == 0) {
                        System.out.println(namec + " blocked the attack!");
                    } else {
                        System.out.println(namec + " dodged the attack!");
                    }
                } 
                try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
            
            //Healing Method
            else if(turn.equals("Heal")){
                if(mana1 >= 25 && health1 <= maxhealth1 - 25) {
                    health1 = (health1 + 25);
                    mana1 = (mana1 - 25);
                    System.out.println("You recovered 25 HP");
                }
                else if(mana1 >= 25 && health1 < maxhealth1) {
                    mana1 = (mana1 - 25);
                    System.out.println("You recovered " + (maxhealth1 - health1) + " HP");
                    health1 = (health1 + (maxhealth1 - health1));
                }
                else {
                    System.out.println("You cannot heal anymore!");
                }
                try {
                Thread.sleep(1000);
                } catch (InterruptedException e) {}
            }
            
            //Fleeing Method
            else if (turn.equals("Flee")) {
                System.out.println("Defeat. You fled.");
                break;
            }
            else {
                System.out.println("You have made the wrong move");
            }
            
            //Computer's turn
            int critchancecomputer = number.nextInt(100);
            if(critchancecomputer > 99 - crit2){
                strike2 = number.nextInt(attack2) * 2 - armor1;
                System.out.println(namec + " has performed a critical strike!");
            }
            else{
                strike2 = number.nextInt(attack2) - armor1;
            }
            if(strike2 > 0){
                health1 = (health1 - strike2);
                System.out.println(name + " took " + strike2 + " damage");
            }
            if (strike2 <= 0){
                if (number.nextInt(2) == 0) {
                    System.out.println("You blocked the attack!");
                } else {
                    System.out.println("You dodged the attack!");
                }
            }
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {}
            
            if (health1 <= 0){
                if (namec.equals("Bunny")) {
                    System.out.println("IMPOSSIBRUUUUU");
                    System.out.println("You Lose :(");
                    break;
                }   
                if (namec.equals("Ogre")) {
                    System.out.println("The Ogre rips your intestines into pieces!");
                    System.out.println("You Lose! :(");
                    break;
                }
                if (namec.equals("Slime")) {
                    System.out.println("The Slime engulfs you into its body!");
                    System.out.println("You Lose! :(");
                    break;
                }
                if (namec.equals("Demon King")) {
                    System.out.println("The Demon King burns you into crisps!");
                    System.out.println("You Lose! :(");
                    break;
                }
            }
            if (health2 <= 0){
                if (Player.equals("Mage")) {
                    System.out.println(name + " kills " +  namec+  " with fireballs!");
                    System.out.println("You Win :)");
                    break;
                }
                if (Player.equals("Warrior")) {
                    System.out.println(name + " kills " +  namec+  " with a swing to the head!");
                    System.out.println("You Win :)");
                    break;  
                }

            }
            System.out.println("Your Health: " + health1);
            System.out.println("Your Mana: " + mana1);
            System.out.println("Computer Health: " + health2);
        }
        
    }
}
    

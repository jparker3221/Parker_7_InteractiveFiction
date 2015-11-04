

package parker_7_guessinggame;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author jparker3221
 */


public class Parker_7_GuessingGame {
    static String alias;
    static int yourguess;
    static int magicnumber;
    static int counter=0;
    static boolean playagain = true;
    static Random random = new Random();
    static String difficulty;
    static int counterstart=15;
    
    public static void main(String[] args) {
        
        magicnumber=random.nextInt(1000);
        System.out.println("PLAY THE GAME!!!");
        System.out.println("Whats your alias, wizard?");
        Scanner userinputname = new Scanner(System.in);
        alias = userinputname.nextLine();
        System.out.println("Choose your difficulty");
        Scanner userinputdifficulty = new Scanner(System.in);
        difficulty = userinputdifficulty.nextLine();
        System.out.println("Welcome "+alias+", brace yourself");
        
        if(alias.contains("JOHN CENA")){
            System.out.println(alias+" instantly plays his trap card and unleashes his dank memes upon the darkness, slaying it instantly.");
            playagain=false;
        }
        
        while (playagain==true){
            
            playthegame();
        }    
    }
    static void playthegame(){
        
        Scanner userinputnumber = new Scanner(System.in);
        System.out.println("Pick an amount of magic to slay the Darkness safely");
        yourguess = userinputnumber.nextInt();
        
        
        if(magicnumber == yourguess){
            System.out.println("Victory! "+alias+" will go down in history!");
            playagain = false;
        }else if (69 == yourguess){
            System.out.println("hehehe...");
        }else if (420 == yourguess){
            System.out.println("BLAZE IT");
        }else if (21 == yourguess){
            System.out.println("Whats nine plus ten?");
        }else if (magicnumber<yourguess){
            System.out.println(yourguess+" is too much, less magic is needed. "+(counterstart-counter)+" revives remain");
        }else if (magicnumber>yourguess){
            System.out.println(yourguess+" is too little magic, more magic now. "+(counterstart-counter)+" revives remain");
        }
        if(difficulty.equals("easy")){
            easy();
        }
        if(difficulty.equals("medium")){
            
            medium();
        }
        if(difficulty.equals("hard")){
            
            hard();
        }
        if(difficulty.equals("insane")){
            
            insane();
        }
         if(difficulty.equals("insane")){
            
            insane();
        }
        
    }
    static void easy(){
        if(magicnumber!=yourguess){
                counter=counter+1;
        }
        if(counter > 15){
            System.out.println(alias+" is defeated. The Darkness prevails");
            playagain = false;
        }
    }
     static void medium(){
        if(magicnumber!=yourguess){
                counter=counter+1;
        }
        if(counter > 12){
            System.out.println(alias+" is defeated. The Darkness prevails");
            playagain = false;
        }
    }
     static void hard(){
        if(magicnumber!=yourguess){
                counter=counter+1;
        }
        if(counter > 10){
            System.out.println(alias+" is defeated. The Darkness prevails");
            playagain = false;
        }
     }
     static void insane(){
        if(magicnumber!=yourguess){
                counter=counter+1;
        }
        if(counter > 8){
            System.out.println(alias+" is defeated. The Darkness prevails");
            playagain = false;
        }
     }
     static void godlike(){
         if(magicnumber!=yourguess){
                counter=counter+1;
        }
        if(counter > 5){
            System.out.println(alias+" is defeated. The Darkness prevails");
            playagain = false;
        }
}
}

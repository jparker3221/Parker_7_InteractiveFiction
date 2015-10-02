/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parker_7_challenge0;

/**
 *
 * @author jparker3221
 */
public class Parker_7_Challenge0 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       for(int i = 0; i < 502; i++){
       if(divisibleby2(i)){
           if(divisibleby11(i)){
               System.out.println("NINJA");
       }else{
               if(divisibleby3(i)){
                   if(divisibleby5(i)){
                       System.out.println("Team Building");
                   }else{
                       System.out.println("Chisme");
                   }                   
               }else{
                   System.out.println("Davis");
               }       
       }
    }else{
           if(divisibleby5(i)){
               if(divisibleby11(i)){
                   System.out.println("Animate This!");
               }else{
                   if(divisibleby3(i)){
                   System.out.println("Old School");
               }else{
                     System.out.println("Vidal");  
                   }
               }
           }else{                         
                  if(divisibleby3(i)){
                      if(divisibleby11(i)){
                          System.out.println("Herr Direktor");
                      }else{
                          System.out.println("Claughton");
                      }
                  } 
                 }
               
           
       }
       
       
    }
       
    //METHODS
    }
    static boolean divisibleby2 (int somenumber){
      return (somenumber%2==0);
    }
    static boolean divisibleby3 (int somenumber){
      return (somenumber%3==0);
    }
    static boolean divisibleby5 (int somenumber){
      return (somenumber%5==0);
    }
    static boolean divisibleby11 (int somenumber){
      return (somenumber%11==0);
    }
}

/*Programming Challenges
1.
Create a program that:
a. Uses a method to return the value(s) “Davis”, “Vidal”, and “Claughton”
b. If the number is divisible by 2 the program should print “Davis”, if it is divisible by 22 then “ninja”
c. If the number is divisible by 3 the program should print “Claughton”, if it is divisible by 33 then “Herr Direktor”
d. If the number is divisible by 5 the program should print “Vidal”, if it is divisible by 55 then “Animate this!”
e. If the number is divisible by 2 and 3 the program should print “chismé”
---
i.e. IT SHOULD NOT PRINT DAVIS AND VIDAL
f. If the number is divisible by 3 and 5 the program should print “Old School”
---
i.e. IT SHOULD NOT PRINT CLAUGHTON AND VIDAL
g. If the number is divisible by 2, 3,and 5 the program should print “Team Building”
---
i.e. 
IT SHOULD NOT PRINT DAVIS, VIDAL, AND CLAUGHTON
The program should use 3 methods to check for divisibility by 2, 3, or 5!
Title the methods: isDivisiblebytwo(),isDivisiblebythree(),and isDivisiblebyfive()
The methods should return “true”or “false”
as to whether the number is divisible.
A for loop counting to 500+ should use the methods to check for divisibility e.g. passing 
“i”to the method */
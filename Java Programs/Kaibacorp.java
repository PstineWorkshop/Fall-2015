/*CS200----------------------------------------------------------------------
Semester:fall
Year:2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # (insert assignment # here)
Due: wensday september 23/ 2015
File name: Kaibacorp---------------------------------------------------------------------------------*/
import java.util.Scanner; // import scanner

public class Kaibacorp {


   public static void main (String[] args){
 
 System.out.println("Hello wlecome to Kaiba corp your home for all your gaming needs");
 
 System.out.println("Please real all options and choose one");
 
 Scanner keyboard = new Scanner (System.in);
 
   int department;
         System.out.println("press 1 or 0 to speak to the next available operator"
         +"Press 2 for card devlopment team\n"
         +"Press 3 for information on kaiba corp\n"
         +"press 4 to talk to a human resource representitive\n"
         +"press 5 to talk to Seto Kaiba\n"
         +"press 6 to file a complaint\n"
         +"press 7 to hear about future tournaments\n");
         
         
         
      department = keyboard.nextInt();
      departmentresponse(department);
      
   }//cllosing class


public static void departmentresponse(int a)
{

   
    if ( a <0 ||  a >7){
      System.out.print("sorry but your input was valid please reread the directions and try again");
   }
   
   else if ( a == 2){
      System.out.println("Thank you for contactinging the devlopment team\n"
      +"We are unable to come to the phone right now, sorry for the inconvience\n");
   }
   
   else if ( a == 3) {
   
      System.out.println("Kaiba corp is gaming company that was founded by its current ceo Seto Kaiba\n"
      +"Kaiba took control of the company away from his step father Gozaburo Kaiba\n"
      +"Kaiba has transformed his step father's company from a military arms producer to a gamiing company\n"
      +"Kaiba corp is a trading card company that specilizes in holographic technology: end of messgae\n");
    }
    
   else if ( a == 4) {
      System.out.println("This Mokuba Kaiba head of human resources speaking");
    }
   else if ( a == 5) {
      System.out.println("Haha you actually thought you could talk to the Seto Kaiba this easily!\n"
       +"Well too bad because he has more important things to do than talking to you\n");
    }
   else if ( a == 6) {
      System.out.println("Please wait until after the beep to file your complaint\n"
      +"Please leave name, number, the department where your complaintt is being addressed and your complaint\n"          
      +"And we will get back to you as soon as possible\n");
    }
   else if ( a == 7) {
       System.out.println("Thank you for calling the tournament department\n"
       +"Our next tournament will be on tuesday october 13 in Chicago IL\n"
       +"Registration has already started so if you want to register\n" 
       +"go to kaibacorp.com/tournamnets to begin\n");
    }
   else {
      System.out.println("please hold for the next available operator");
      }



}

}// closing header 
  
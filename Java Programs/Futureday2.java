/*
	Write a Java program that prompts the user for current day in number form and days eslapsed.
	The program will display what the current day is. It will also display what the day will be after the days elasped.
	The current day must be between 0 and 6 and the program must check this.
*/
import java.util.Scanner;

public class Futureday2 {//start of class
  public static void main(String[] args) {//start of main mwethod
    Scanner keyboard = new Scanner(System.in);
    
    int cd;//current days
 	int de;//days elasped
    int fd;//future days
    boolean valid=true;
    System.out.print(" enter an integer value that is between 0 to 6 for todays date ");
    cd = keyboard.nextInt();
    System.out.print(" enter the number of days elasped since today ");
    de = keyboard.nextInt();
    System.out.print(" the current day is: ");
    valid =currentday(cd);
    
    if(valid==true){
     
     fd=(cd+de)%7;
     System.out.print(" the future day is: ");
     currentday(fd); 
    }
      
     //futureday(cd,de); //futureday(cd,de);
    
   }// end of main methpod
  public static boolean currentday(int a){
	boolean acceptable = true;
	if (a>6 || a<0){
     System.out.println("not available ");
     acceptable=false;
    }
    else if (a == 0){
     System.out.print(" sunday ");
     System.out.println();
     }
    else if (a == 1){
     System.out.print("monday ");
     System.out.println();
     }
    else if (a == 2) {
     System.out.print(" tuesday ");
     System.out.println();
     }
    else if (a == 3){
     System.out.print(" wensday ");
     System.out.println();
     }
    else if (a == 4){
     System.out.print(" thursday ");
     System.out.println();
     }
    else if (a == 5){
     System.out.print(" friday ");
     System.out.println();
     }
    else{
     System.out.print(" saturday ");
     System.out.println();
     }

   return acceptable;

  }


}//end of class

/*     enter an integer value that is between 0 to 6 for todays date 7
  enter the number of days elasped since today 8
  the current day is: not available 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Futureday2
 
  enter an integer value that is between 0 to 6 for todays date 5
  enter the number of days elasped since today 85
  the current day is:  friday 
  the future day is:  saturday 
 
  ----jGRASP: operation complete.
 */

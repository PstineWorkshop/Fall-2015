import java.util.Scanner;

public class Exercise03_12 {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    
    int cd;//current days
    
    int de;//days elasped
    
    int fd;//future days
    
    System.out.println("enter an integer value that is between 0 to 6 for todays date");
    
    cd = keyboard.nextInt();
    
    System.out.println("enter the number of days elasped since today");
    
    de = keyboard.nextInt();
    
    if (cd>6 || cd<0){
    
    System.out.println("invalid entry");
    }
    else if (cd == 0){
     System.out.println("The current day is sunday");
     }
    else if (cd == 1){
     System.out.println("The current day is monday");
     }
    else if (cd == 2) {
     System.out.println("the current day is tuesday");
     }
    else if (cd == 3){
     System.out.println("the current day is wensday");
     }
    else if (cd == 4){
     System.out.println("the current day is thursday");
     }
    else if (cd == 5){
     System.out.println("the current day is friday");
     }
    else
     System.out.println("the current day is saturday");
     }
     fd = (cd+de)%7;
     
    
    }
}

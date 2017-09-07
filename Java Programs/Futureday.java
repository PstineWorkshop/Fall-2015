/*CS200----------------------------------------------------------------------
Semester: Fall
Year: 2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # 3.18 Book Problem
Due: 10/7/2015
File name: Futureday.java
---------------------------------------------------------------------------------*/


import java.util.Scanner;

public class Futureday {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    int cd;//current days
    
    int de;//days elasped
    
    int fd;//future days
    
    System.out.println("enter an integer value that is between 0 to 6 for todays date");
    
    System.out.println("enter the number of days elasped since today");

    cd = keyboard.nextInt();
    
    de = keyboard.nextInt();
    
    if (cd>6 || cd<0){
    
    System.out.println("invalid entry");
    }
    else if (cd == 0){
     System.out.print("The current day is sunday ");
     }
    else if (cd == 1){
     System.out.print("The current day is monday ");
     }
    else if (cd == 2) {
     System.out.print("the current day is tuesday ");
     }
    else if (cd == 3){
     System.out.print("the current day is wensday ");
     }
    else if (cd == 4){
     System.out.print("the current day is thursday ");
     }
    else if (cd == 5){
     System.out.print("the current day is friday ");
     }
    else{
     System.out.print("the current day is saturday ");
     }
    fd = (cd+de)%7;
    if (fd == 0){
     System.out.print("and The future day is sunday");
     }
    else if (fd == 1){
     System.out.print("and The future day is monday");
     }
    else if (fd == 2) {
     System.out.print("and the future day is tuesday");
     }
    else if (fd == 3){
     System.out.print("and the future day is wensday");
     }
    else if (fd == 4){
     System.out.print("and the future day is thursday");
     }
    else if (fd == 5){
     System.out.print("and the future day is friday");
     }
    else{
     System.out.print("and the future day is saturday");
     }

    
    }
}

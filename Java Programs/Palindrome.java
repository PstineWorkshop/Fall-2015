
/*CS200----------------------------------------------------------------------
Semester: Fall
Year: 2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # 3.18 Book Problem
Due: 10/7/2015
File name: Palindrome.java
---------------------------------------------------------------------------------*/
import java.util.Scanner;

public class Palindrome {
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
    
    int val;
    System.out.print("Enter a three-digit integer: ");
    
    val = keyboard.nextInt();

    if (val > 999 || val < 100){
    System.out.println("invalid entry");
    }
    
    else if (val / 100 == val % 10){
      System.out.println(val + " is a palindrome");
    }
    else {
      System.out.println(val + " is not a palindrome");
  }// end of else
  }
  }//clsoing statement


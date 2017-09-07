/*CS200----------------------------------------------------------------------
Semester: Fall
Year: 2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # 3.8 Book Problem
Write a program that prompts the user to enter three integers and display the integers in non-decreasing order
---------------------------------------------------------------------------------*/

public class Exercise03_08 {
  public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

    // Enter three numbers
    System.out.print("Enter three integers: ");
    int number1 = keyboard.nextInt();
    int number2 = keyboard.nextInt();
    int number3 = keyboard.nextInt();

    if (number1 > number2) {
      int temp = number1;//helps you swap the numbers
      number1 = number2;// you do this so you can switch the values if one is bigger than the other
      number2 = temp;
      
      System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
    }

    else if (number2 > number3) {
      int temp = number2;
      number2 = number3;
      number3 = temp;
     
      System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
    }
    else {
      int temp = number1;
      number1 = number2;
      number2 = temp;
     
      System.out.println("The sorted numbers are "
      + number1 + " " + number2 + " " + number3);
    }

      }
   }

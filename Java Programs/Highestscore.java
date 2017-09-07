import java.util.Scanner;

public class Highestresult {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);

    // Prompt the user to enter the number of students
    int i;
    
    String name1;
    
    double result1;
    
    int number;
    
    String name;
    
    double result;
    
    System.out.println(" enter the number of student ");
    
    number = keyboard.nextInt();
    
    System.out.println(" enter the students name ");
    
    name1 = keyboard.next();
    
    System.out.println(" enter a result for the student ");
    
    result1 = keyboard.nextInt();
    
    for (i=0; i < number-1; i++){//starts the for loop
    
    System.out.println(" enter the name of the student ");
    
    name = keyboard.next();
    
    System.out.println(" enter the result for the student ");
    
    result = keyboard.nextDouble();
    
    }//ends the for loop
    
    
    if (result > result1)
    {//starts if statement
    
    name1 = name;
    
    result1 = result;
    
    System.out.println(" the top student is " + name1 + " his result is " + result1);
    }
    
    }
    }
    
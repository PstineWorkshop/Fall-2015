/*CS200----------------------------------------------------------------------
Semester: Fall
Year: 2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # 3.18 Book Problem
Due: 10/7/2015
File name: ShippingCost.java
non method version
---------------------------------------------------------------------------------*/
import java.util.Scanner;

public class calcshippingcost {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    
    double w;//weight
    
    double C;//cost
    
    System.out.println("enter a value for weight that is between 1 and 20");
    
    w = keyboard.nextInt();
    
    if (w<0 || w>20){
    System.out.println("This package cannot be shipped");
    }
    
    else if (w <= 1 || w >0){
    C = w*3.5;
    System.out.println("Cost to ship  is " + C + " dollars");
    } 
   
    else if ( w <= 3 || w> 1){
    C = w*5.5;
    System.out.println("Cost to ship is " + C + " dollars");
    }
    
    else if  (w <= 10 || w >3){
    C = w*8.5;
    System.out.println("Cost to ship is " + C + " dollars");
    }
    
    else{
    C = w*10.5;
    System.out.println("Cost to ship is " + C + " dollars");
    }
         }
      
    }
   

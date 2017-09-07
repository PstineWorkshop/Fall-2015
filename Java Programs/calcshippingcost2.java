/*CS200----------------------------------------------------------------------
Semester: Fall
Year: 2015
Instructor: F.Porps
Your Name: Philip Stine
Assignment # 3.18 Book Problem
Due: 10/7/2015
File name: ShippingCost.java
method version
---------------------------------------------------------------------------------*/
import java.util.Scanner;

public class calcshippingcost2 {//start of calss
  public static void main(String[] args) {//start of main method
    Scanner keyboard = new Scanner(System.in);
    
    double w;//weight
    
    boolean ww =false;//wieght works
    
    double c;//cost
    
    System.out.println("enter a value for weight that is between 1 and 20");
    
    w = keyboard.nextInt();
    
    ww=properweight(w);
    
    if(ww==true)
    {
      c=cost(w);
      System.out.println(" the cost is: " + c);
    }
    else
    {
      System.out.println(" the weight you enter does not works ");
    }
    

    
    
    }//end of main method
   
   
   
   public static boolean properweight(double m)
   {//end of mthod 
     boolean c=false;
     
     if (m<=0 || m>20){

    c=false;
    //return c;
    }
    
    else     
    {
   c=true;
   
  
    }
   

    return c;
   }//end of method
  public static double cost (double weight)
  {//start of method
    
    double cost2=0;
    if (weight <= 1 || weight >0)
    {
    cost2 = weight*3.5;
    //return cost;
    } 
   
    else if ( weight <= 3 || weight> 1)
    {
    cost2 = weight*5.5;
    //return cost;
    }
    
    else if  (weight <= 10 || weight >3)
    {
    cost2 = weight*8.5;
    //return cost;
    }
    
    else
    {
    cost2 = weight*10.5;
    //return cost;
    }
    return cost2;
}//end of emthod  
    
    }//end of class
    
    
    
    
    /*   
  ----jGRASP exec: java calcshippingcost2
 
 enter a value for weight that is between 1 and 20
 -1
  the weight you enter does not works 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java calcshippingcost2
 
 enter a value for weight that is between 1 and 20
 21
  the weight you enter does not works 
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java calcshippingcost2
 
 enter a value for weight that is between 1 and 20
 18
  the cost is: 63.0
 
  ----jGRASP: operation complete.
 */
   

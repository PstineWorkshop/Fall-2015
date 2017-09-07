import java.util.Scanner; 

public class payroll2
{  

     
public static void main(String args[ ]) 
        {
         int hours=0;
         
       
         
         double grosspay=0;
         
       
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print(" enter your hours worked ");
        
        hours=keyboard.nextInt();
        
        
        
        grosspay=totalpay(hours);
        
        System.out.println(" your gross pay is; " + grosspay);
        
        
        
      } //closing main method
public static double totalpay (int a)
{
     double d;
     
     double payrate=0;

      Scanner keyboard = new Scanner(System.in);

      System.out.print(" enter your pay rate ");
        
        payrate=keyboard.nextInt();
        
       d=payrate*(double)a;
       
       return d;
      
   

}




} //closing class header
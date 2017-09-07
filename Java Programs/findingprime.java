import java.util.Scanner;// I am importing the scanner class

public class findingprime{

public static void main(String args[]){

  Scanner keyboard = new Scanner (System.in);
  
  String end;
  
  int x;
  
  int divide;
  
  boolean prime;
  
  int sum = 0;
  
  int fail =0;
  
  divide = 2;
  
  prime = true;

    

  
  do//start a do loop
  {
   // write an if statement that removes the other char
   
   prime = true;
   System.out.print(" enter a integer greater than zero or press Q to quit: ");
  
   end = keyboard.next();
  
   if (end.charAt(0) != 'Q')
    x = Integer.parseInt(end);//if statement
   else
   x = 0;
   sum= sum + x; 
    
   if (x<=0)
   {
   fail++; 
   if (fail<4 && end.charAt(0) != 'Q')
      System.out.println(" you entered a value less than or equal to zero\n enter a value greater than 0 you have three chances ");
   }
   
  
   if (x==1){
      
      System.out.println(x + " is not a prime number");
      fail=0;
      }
         
  else if(x>0){
      fail=0;
   for (divide = 2; divide < x; divide++)
      {//openning for for loop
      
           
      if (x % divide == 0){//condiiton for the for loop
      
      prime = false;
      }
       }//end of for loop
     
      if (prime==false){
      System.out.println(x + " is not a prime number");
      }  
      else{ 
      System.out.println( x + " is a prime number");
      
     
      }
   
  }
   
  
  }while (end.charAt(0) != 'Q' && fail<4);//end the do loop
  
  
  prime = true;
  
  for (divide = 2; divide < sum; divide++){//openning for for loop 
   if (sum % divide == 0 ){//condiiton for the for loop
      
      prime = false;
      }
       
   }
   if (sum > 1){    
   if (prime == false){
      System.out.println(" your total sum is " + sum + " and it is not a prime number");
      }  
    else{ 
    System.out.println(" your total sum is " + sum + " and it is a prime number");

    }
   }
   
  
  }
 
  }
  
  

  
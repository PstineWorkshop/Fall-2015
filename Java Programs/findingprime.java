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
  
 /*
 ----jGRASP exec: java findingprime

 enter a integer greater than zero or press Q to quit: 2
2 is a prime number
 enter a integer greater than zero or press Q to quit: 4
4 is not a prime number
 enter a integer greater than zero or press Q to quit: 7
7 is a prime number
 enter a integer greater than zero or press Q to quit: 9
9 is not a prime number
 enter a integer greater than zero or press Q to quit: 11
11 is a prime number
 enter a integer greater than zero or press Q to quit: 13
13 is a prime number
 enter a integer greater than zero or press Q to quit: 50
50 is not a prime number
 enter a integer greater than zero or press Q to quit: 562
562 is not a prime number
 enter a integer greater than zero or press Q to quit: 31
31 is a prime number
 enter a integer greater than zero or press Q to quit: 16
16 is not a prime number
 enter a integer greater than zero or press Q to quit: 34
34 is not a prime number
 enter a integer greater than zero or press Q to quit: 29
29 is a prime number
 enter a integer greater than zero or press Q to quit: 79
79 is a prime number
 enter a integer greater than zero or press Q to quit: 17
17 is a prime number
 enter a integer greater than zero or press Q to quit: 169
169 is not a prime number
 enter a integer greater than zero or press Q to quit: Q
 your total sum is 1033 and it is a prime number

 ----jGRASP: operation complete.

 ----jGRASP exec: java findingprime

 enter a integer greater than zero or press Q to quit: -1
 you entered a value less than or equal to zero
 enter a value greater than 0 you have three chances 
 enter a integer greater than zero or press Q to quit: -15
 you entered a value less than or equal to zero
 enter a value greater than 0 you have three chances 
 enter a integer greater than zero or press Q to quit: 0
 you entered a value less than or equal to zero
 enter a value greater than 0 you have three chances 
 enter a integer greater than zero or press Q to quit: -7

 ----jGRASP: operation complete.


 ----jGRASP exec: java findingprime

 enter a integer greater than zero or press Q to quit: -1
 you entered a value less than or equal to zero
 enter a value greater than 0 you have three chances 
 enter a integer greater than zero or press Q to quit: 0
 you entered a value less than or equal to zero
 enter a value greater than 0 you have three chances 
 enter a integer greater than zero or press Q to quit: 23
23 is a prime number
 enter a integer greater than zero or press Q to quit: 42
42 is not a prime number
 enter a integer greater than zero or press Q to quit: Q
 your total sum is 64 and it is not a prime number

 ----jGRASP: operation complete.


*/ 

  

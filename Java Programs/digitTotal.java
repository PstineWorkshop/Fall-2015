import java.util.Scanner;


public class digitTotal
{//start of class
 
public static void main(String[] args) 
{//start of method

Scanner input = new Scanner(System.in);

int q=0;

int sum=0;

int n;

System.out.println(" enter n");
n=input.nextInt();
if(n>9)
{
      if(n>q)
      {
         q=n/10;
    
         while(q != 0)
         {
            sum=sum+(n%10);
            q=n/10;
            n=q;
         }
        }
      
      
      System.out.println(sum);
     
      do
      {  
         if(sum>9)
         {
         n=sum%10;
       
         sum=sum/10;
       
         sum=sum+n;
         
         System.out.println(sum);
         }
 }while(sum>9);
}

          
  




}//end of method
}//end of class

/* 
  ----jGRASP: process ended by user.
 
  ----jGRASP exec: java digitTotal
 
  enter n
 2147483647
 46
 10
 1
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java digitTotal
 
  enter n
 404
 8
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java digitTotal
 
  enter n
 9
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java digitTotal
 
  enter n
 1093273
 25
 7
 
  ----jGRASP: operation complete.
 */
import java.util.Scanner;


public class Pennies
{//start of class
 
public static void main(String[] args) 
{//start of method

Scanner input = new Scanner(System.in);

int i=0;
int days;
double sum=0;
double penny=.01;
do
{
System.out.print(" How many days have you worked ");
days=input.nextInt();
}while(days<1);

System.out.println(" Salary - ");

for(i=0;i<days;i++)
{
   if(i==0)
   {
   penny=penny*(i+1);
   }
   else
   penny=penny*2;
   
   System.out.print("day " +(i+1)+":");
   System.out.print(" " +penny);
   System.out.println();
   
   sum=sum+penny;

}
System.out.println(" Your total salary for " + days + " days work is: $ " + sum);
}
}
/*     How many days have you worked 3
  Salary - 
 day 1: 0.01
 day 2: 0.02
 day 3: 0.04
  Your total salary for 3 days work is: $ 0.07
 
  ----jGRASP: operation complete.
 */
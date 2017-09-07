import java.util.Scanner;
import java.util.Random;

public class beanMachine
{//start of class
 
public static void main(String[] args) 
{//start of method

Scanner input = new Scanner(System.in);

int []slots;

int size;

int balls;

int i=0;

int j=0;

int random;

int pos;

int count=0;

String path="";

System.out.print(" enter number of balls: ");

balls=input.nextInt();

System.out.print(" enter number of slots: ");


size=input.nextInt();

slots=new int[size];

for(i=0;i<balls;i++)
{
      pos = (slots.length/2);
   
     
   
  
  path="";
   
   
   for(j=0;j<size;j++)
   {
   
      random=(int)(Math.random() * 2);
      
      if (random==1)
      {
         path=path+"R";
         
         pos++;
         
      }
      
      else
      {//start of else
      path=path+"L";
      
      if (count>0)
         {
            pos--;
         }
      }
      count++;
    }
    System.out.println(path);
    System.out.println(pos);
      slots[pos-1]++;
      
     
}   
   for(i=0;i<slots.length;i++)
   {
   
      System.out.print(slots[i]+ ", ");
   
   }
}// end of main method
}// end of class


/*   
  ----jGRASP exec: java beanMachine
 
  enter number of balls: 5
  enter number of slots: 8
 RLLLLLLR
 0
 RLLLRRRL
 4
 RRLLLRLR
 4
 RRRRLLLR
 6
 RRLRLLLL
 2
 
  ----jGRASP: operation complete.
 */

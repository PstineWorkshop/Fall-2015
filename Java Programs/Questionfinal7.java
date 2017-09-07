import java.util.Scanner;


public class Questionfinal7
{//start of class
 
public static void main(String[] args) 
{//start of method

Scanner input = new Scanner(System.in);

int nbr;
int score[];
int i=0;
int sum=0;
float average;

System.out.print(" How many scores? ");

nbr=input.nextInt();
System.out.println();

System.out.print(" Enter " + nbr + " scores: ");

score = new int[nbr];

   for(i=0;i<nbr;i++)
   {
      score[i]=input.nextInt();
      sum=sum+score[i];

   }
   average=(float)sum/nbr;
   
   System.out.println(" the average is " +  average  );
   for(i=0;i<nbr;i++)
   {
      if((float)score[i]==average)
      {
      
          System.out.println(" score #" + (i+1) + " is " + average);
      }
   
   }
   
   
   }
  }
  
 /*     ----jGRASP exec: java Questionfinal7
 
  How many scores? 2
 
  Enter 2 scores: 90
 90
  the average is 90.0
  score #1 is 90.0
  score #2 is 90.0
 
  ----jGRASP: operation complete.
 */
 
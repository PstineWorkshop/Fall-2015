import java.util.Scanner;


public class pairMax
{//start of class
 
public static void main(String[] args) 
{//start of main method

Scanner input = new Scanner(System.in);



int [] test;

int leng;

int k=0;

int quiz;

System.out.print(" enter a length for the array: ");

leng=input.nextInt();

test=new int[leng];
for(k=0;k<leng;k++)
{
   System.out.println(" enter a value for the array");
   test[k]=input.nextInt();

}
quiz=maxPair(test);

System.out.println();

System.out.println(quiz);
}
public static int  maxPair (int []in)
{// start of method
   int pair=0;
   
   int count=0;
   
   int i=0;
   
   int j=0;
   
   for(i=0;i<in.length;i++)
   {  count=0;

      for(j=0;j<in.length;j++)
      {
         if(in[i]==in[j])
         {
            count++;
         }
      }
   
      if(count==2 && pair<in[i])
      {
         pair=in[i];
               
      }
   }
   return pair; 
   }

}

/*   
  ----jGRASP exec: java pairMax
 
  enter a length for the array: 5
  enter a value for the array
 1
  enter a value for the array
 2
  enter a value for the array
 1
  enter a value for the array
 5
  enter a value for the array
 4
 
 1
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java pairMax
 
  enter a length for the array: 3
  enter a value for the array
 1
  enter a value for the array
 1
  enter a value for the array
 1
 
 0
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java pairMax
 
  enter a length for the array: 5
  enter a value for the array
 3
  enter a value for the array
 3
  enter a value for the array
 3
  enter a value for the array
 2
  enter a value for the array
 2
 
 2
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java pairMax
 
  enter a length for the array: 8
  enter a value for the array
 4
  enter a value for the array
 5
  enter a value for the array
 4
  enter a value for the array
 3
  enter a value for the array
 2
  enter a value for the array
 2
  enter a value for the array
 4
  enter a value for the array
 1
 
 2
 
  ----jGRASP: operation complete.
 */
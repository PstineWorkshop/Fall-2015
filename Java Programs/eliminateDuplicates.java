import java.util.Scanner;

public class eliminateDuplicates
{//start of class
 
public static void main(String[] args) 
{//start of method

Scanner input = new Scanner(System.in);

int[] x;

int []y;

int j;

x=new int[10];

for ( j = 0; j < x.length; j++)
{

System.out.println("Enter values: ");

x[j] = input.nextInt();
}

y=eliminateDuplicates(x);

}



public static int[] eliminateDuplicates(int[] list)
{

   int i;
   
   int[]b =new int[];
   
  
   for(i=0;i<list.length;i++)
   {
   
      if(list[i]==list[i+1])
      {
         
      
      }
   
   
   }

      System.out.println(b);
}
}
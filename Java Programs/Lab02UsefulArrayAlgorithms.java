import java.util.Scanner;
import java.io.*;

public class Lab02UsefulArrayAlgorithms
{  

public static void main(String args[ ])  throws IOException

        {   
            
            
            int j;
            int [] properSort;
            int bigsum=0;
            int sequence; 
            int min=0;
            int max=0;
            float bigavg=0;
            float avg=0;
            int sum=0;
		  		boolean same=false;
            final int MAX_SIZE = 5;
		  		int [ ]a = {-1,1,3,5,7};
				int [ ]b = new int[MAX_SIZE];
				int [ ]c = new int[MAX_SIZE];
				
				int x=MAX_SIZE -1;
				//fill array b with the values in array a in reverse order
				for(int i = 0 ; i < MAX_SIZE; i++) //this i is local to this loop
				{
				
				
					b[i] = a[x];

					System.out.println("a["+x+"]=  " + a[x] +"  b["+i+"]=  "  +b[i]);
						x--;

				}
				//fill array c with odd ints starting at -1
				int fillVal=-1;			
				for(int i = 0 ; i < MAX_SIZE; i++) //again, i is local to this loop only
				{
					c[i] = fillVal;
					fillVal+=2;
					System.out.println("c["+i+"]=  " + c[i]);
										
				}
				
/*-----------------------------------------
compare 2 arrays: a and b, then a and c
x==y //error won't work
loop & compare each element x[?] == y[?]
display array names & true if arrays are identical in order, 
otherwise display array names and false
Insert code below:........................*/
same=comparetwo(a,b);
System.out.println(" a and b are the same +" + same);

same=comparetwo(a,c);
System.out.println(" a and c are the same +" + same);

/*-----------------------------------------
sum array values: a, then b, then c
declare a sum variable for each of the arrays
of the same data type as array
and accumulate the values in the array
display the individual sum of each of the arrays: a, b, and c
and a total sum of all 3 arrays
Insert code below:........................*/
sum=sumarray(a);
System.out.println(" the sum of a is: " + sum);

sum=sumarray(b);
System.out.println(" the sum of b is: " + sum);

sum=sumarray(c);
System.out.println(" the sum of c is: " + sum);

bigsum=sumall(sumarray(a),sumarray(b),sumarray(c));
System.out.println(" the sum of array a,b and c are "+ bigsum);


/*-----------------------------------------
find the average value of an array
use the sums from the above code, to determine
the EXACT average of array a, 
and the average of all three arrays were they to be combined
Insert code below:........................*/
avg=findmean(sumarray(a), a. length);
System.out.println(" the average of a sum a :" + avg);

avg=findmean(sumarray(b), b. length);
System.out.println(" the average of a sum b :" + avg);

avg=findmean(sumarray(c), c. length);
System.out.println(" the average of a sum c :" + avg);

bigavg=findmean1(sumarray(a),sumarray(b), sumarray(c),a.length, b.length, c.length);
System.out.println(" the average of a,b,c combined: " + bigavg);

/*-----------------------------------------
finding the min value in array a and array b
set min to first element in array 
then compare all others in a loop, assigning min a new value if a lower value is found
display min value upon completion of the loop
Insert code below:........................*/

min=findmin(a);
System.out.println(" the min value in a is: " + min);
min=findmin(b);
System.out.println(" the min value in b is: " + min);

/*-----------------------------------------
finding the max value in array a and array b
set max to first element in array 
then compare all others in a loop, assigning max a new value if a higher value is found
display max value upon completion of the loop
Insert code below:........................*/
max=findmax(a);	
System.out.println(" the max of a: " + max);
max=findmax(b);
System.out.println(" the max of b: " + max);  
/*-----------------------------------------
sequential search
copy and modify the code you wrote to compare two arrays
to determine if a value 'match' is within an array
display index of 1st instance of matched value 
else display -1
Use array d and match as listed below.
Insert code below:........................*/



int []d = {2,18,4,4,6,8,10};
int match =4;
sequence=comparetwoparts(d,match);
if(sequence!=-1)
{
if(match==d[sequence])
System.out.println(" the match if found at " + sequence);
}
else
{
System.out.println(sequence);
}

/*-----------------------------------------
sequential search
copy and reuse the code you wrote to compare two arrays
(above) to determine if the value 'match' is within an array
display index of 1st instance of matched value 
else display -1
Use array d again, and match as listed below.
Insert code below:........................*/

match= 12;
sequence=comparetwoparts(d,match);
if(sequence!=-1)
{
if(match==d[sequence])
System.out.println(" the match if found at " + sequence);
}
else
{
System.out.println(sequence);
}


/*-----------------------------------------
sort array from max value to min value (use array d)
loop through all elements comparing 2 at a time, & swap elements if [n] < [n+1]
with each entrance to inner loop decrement iterations by 1
repeat (outer loop) n element times
swapping:
temp = one;
one = two; //one contains two
two = temp; //two now contains one
display array after it has been sorted
Insert code below:........................*/

properSort=bubbleSort(d);

for(j=0;j<properSort.length;j++)
{

System.out.print(properSort[j]+ " ");
}



         } //closing main method

public static boolean comparetwo(int[]x,int[]y)
{
   boolean matching=true;
   
   int i=0;
   
   for(i=0;i<x.length;i++)
   {
      if(x[i]==y[i])
      {
      matching=true;
      }
     
      else
      {
      matching=false;
      i=x.length;
      }
    
    
    
    }
   return matching;

}//end of compare two

public static int sumarray(int[] z)
{
   int total=0;
   
   int i=0;
   
   for(i=0;i<z.length;i++)
   {
      total=total + z[i];
   }

   return total;
}//end of method

public static int sumall(int a,int b,int c)
{
   int total1=0;
   
   total1=a+b+c;

   return total1;
}//end of method

public static float findmean (int totalofarray, int numberofvalues)
{
   float average;
   average=(float)totalofarray/numberofvalues;
   
   return average;
}
public static float findmean1 (int totala, int totalb, int totalc, int numbera,int numberb, int numberc )
{
   float average;
   average=(float)(totala+totalb+totalc)/(numbera+numberb+numberc);
   
   return average;
}//end method

public static int findmin(int []y)
{
   int i=0;
   int small;
   small=y[0];
   for(i=0;i<y.length;++i)
   {
      if(y[0]>y[i])
      {
         small=y[i];
      }
   }
   return small;
}
public static int findmax(int []x)
{
   int i=0;
   int large;
   large=x[0];
   for(i=0;i<x.length;i++)
   {
      if(x[0]<x[i])
      {
      large=x[i];
      }
   }
   return large;
}//end of emthod

public static int comparetwoparts(int[]a,int m)
{//start of method
   boolean whereitmatches=false;
   
   int i=0;
   int output=0;
   
   for(i=0;i<a.length;i++)
   {
      if(a[i]==m)
      {
       whereitmatches=true;
      }
     
   }
   if(whereitmatches)
   {
   //System.out.println(" found at position ");
   for(i=0;i<a.length;i++)
      {
        if(a[i]==m)
        {
         output =(i);
        i=a.length;
        } 
      }
      
    }
    else
    {
    output=-1;
    }
   
   return output;
   
   
   
}//end of compare two

public static int[] bubbleSort (int[] m)
   {//start of method
   
   int i=0;
   
   int n;
   
   int j=0;
   
   int temp;
   
   int sorted [];
   
   n=m.length;
   
   sorted = new int[n];
   
     for(i=n - 1; i > 0;i--)   
   {
   
     for(j=0;j<i;j++)
     {
         if(m[j]>m[j+1])
      {
         temp= m[j];
     
         //temp1 =name[j];
     
         m[j]=m[j+1];
     
         //name[j]=name[j+1];
     
         m[j+1]=temp; 
     
         //name[j+1]=temp1;     
   
      }
     
     } 
   
   }


   
   for(i=0;i<n;i++)
   {
   
   sorted[i]=m[i];
   
   }
   
   return sorted;
   
   }//end of method



} //closing class header
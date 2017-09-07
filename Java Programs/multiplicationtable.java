import java.util.Scanner;
public class multiplicationtable
{//start of class
    public static void main(String[] args)
{
    
  //  int[] A = {2, 4, 6, 8, 10, 12, 14, 16, 18, 20};
  //  System.out.println("Average of the array: "+average(A));
  int a;
 Scanner kbd =new Scanner (System.in);
 
  System.out.print("enter  a ");
  a=kbd.nextInt();
  for(int i=0;i<a;i++)
  {
    System.out.println("enter something: " + i);
  }
    
    
    
     /* int j;
      int i;
      int sum=0;
      Scanner kbd = new Scanner(System.in);
      int count=0;
  Scanner input = new Scanner(System.in);
System.out.print("Enter a year: ");
int year = input.nextInt();

// Check if the year is a leap year
 boolean isLeapYear =
(year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);

// Display the result
System.out.println(year + " is a leap year? " + isLeapYear);
  
  
  
  /* System.out.print("Enter how many: ");
   i = kbd.nextInt();
   
   System.out.println();
   
   for(j=0;j<i;j++)
   {
      System.out.print("Enter a num: ");
      count=kbd.nextInt();
      sum+=count;
   
   }
   System.out.println("sum equals " + sum);
    /*  for( i = 1; i <=12;i++)
   {
                System.out.println();
         //System.out.print(i * 1 + " ");
            for(j=1; j<=12;j++)
            {
              System.out.printf( "%4d", (j * i));
           //   count++;
            }
            
              
            
        /*   if (count == 12)
            {
          System.out.println();
           count=0;
           }*/
   
   /*
   }
   public static double average (int[] A) {
       return averageCheck(A, 0, A.length - 1) / A.length;
}

public static double averageCheck(int[] A, int l, int r) {

if (l > r)
    return 0;

if (l==r) {
    return A[l];
}
// Base Case: if there's just a single element it is the average of the array itself

int mid = (l+r)/2;
double avLeft = 0;
double avRight = 0;

avLeft = averageCheck(A, l, mid);
avRight = averageCheck(A, mid+1, r);

double average = avLeft + avRight;

return average;

  
  */
  
  }
 }
/*    
  ----jGRASP exec: java multiplicationtable
 
    1   2   3   4   5   6   7   8   9  10  11  12
    2   4   6   8  10  12  14  16  18  20  22  24
    3   6   9  12  15  18  21  24  27  30  33  36
    4   8  12  16  20  24  28  32  36  40  44  48
    5  10  15  20  25  30  35  40  45  50  55  60
    6  12  18  24  30  36  42  48  54  60  66  72
    7  14  21  28  35  42  49  56  63  70  77  84
    8  16  24  32  40  48  56  64  72  80  88  96
    9  18  27  36  45  54  63  72  81  90  99 108
   10  20  30  40  50  60  70  80  90 100 110 120
   11  22  33  44  55  66  77  88  99 110 121 132
   12  24  36  48  60  72  84  96 108 120 132 144
 
  ----jGRASP: operation complete.
 */
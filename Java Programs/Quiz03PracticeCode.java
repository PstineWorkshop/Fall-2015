import java.util.Scanner;
public class Quiz03PracticeCode
{
public static void main(String args[ ])
 {
 Scanner keyboard = new Scanner(System.in);
int sumofallthreevalues;

double differenceofallthreevalues;

int val1;
int val2;   
int val3;   
   
   System.out.print("enter a value for val1:");
   val1 = keyboard.nextInt();

   System.out.print("enter a value for val2:");
   val2 = keyboard.nextInt();

   System.out.print("enter a value for val3:");
   val3 = keyboard.nextInt();
 
  
 sumofallthreevalues= val1 + val2 + val3;
 
 differenceofallthreevalues = ((val1 + val2 + val3)/3);
 
 if (val1 % 2) == 0)
 {
 System.out.print("even:");
 System.out.print(sumofallthreevalues);
 }
 if (val2 % 2 == 0){
 System.out.println(val2);
 }
 if (val1 % 2 == 0){
 System.out.println(val1);
 }
 if (val3 % 2 == 0){
 System.out.println(val3);
 }
 
 else {
 System.out.print("odd:");
 System.out.print(differenceofallthreevalues);
 
 
 
 
   }//closing heading
  }// clossing class
}// clossing if statment
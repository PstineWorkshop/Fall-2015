
import java.util.Scanner;


public class Phonemapping 
{  

      
public static void main(String args[ ]) 
        {
           String symbol;
           
           Scanner keyboard = new Scanner(System.in);
           
           int i;
           
           int e;
           
           do
           {
            System.out.println(" enter a letter to find where it would be on a phone ");
            
            symbol = keyboard.next();
            
            char s =symbol.charAt(0);
            
            if (s =='a' || s =='A' || s == 'b' || s == 'B' || s == 'c' || s =='C')
            {
               System.out.println(" the corresponind number is two ");
            }
            else if(s == 'd' || s=='D' || s=='e' || s=='E' || s== 'f' || s=='F')
            {
               System.out.println(" the corresponind number is 3 ");
            }
            else if(s == 'g' || s =='G' || s =='h' || s =='H' || s =='i' || s =='I')
            {
               System.out.println(" the corresponind number is 4 ");
            }
            else if(s=='j' || s=='J' || s=='K' || s=='k' || s=='l' || s=='L')
            {
               System.out.println(" the corresponind number is 5 ");
            }
            else if(s=='m' || s=='n' || s=='o' || s=='M' || s=='N' || s=='O')
            {
               System.out.println(" the corresponind number is 6 ");

            }
            else if(s=='p' || s=='q' || s=='r' || s=='s' || s=='P' || s=='Q' || s =='R' || s =='S')
            {
               System.out.println(" the corresponind number is 7 ");

            }
            else if(s=='t' || s=='u' || s=='v' || s=='T' || s=='U' || s=='V')
            {
               System.out.println(" the corresponind number is 8 ");
            }
            else if(s=='w' || s=='x' || s=='y' || s=='z' || s=='W' || s=='X' || s =='Y' || s =='Z')
            {
               System.out.println(" the corresponind number is 9 ");


            }

            
            
           
           
           }while ((symbol.charAt(0) >='a' && symbol.charAt(0) <='z') || (symbol.charAt(0)>= 'A' && symbol.charAt(0) <= 'Z')); //ends do loop				  
				




         
         
         
         
         
         
         
         } //closing main method
   } //closing class header
  
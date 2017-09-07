import java.util.Scanner;

public class Phonemapping2
{//start header
   public static void main (String args[ ]) 
   {  
      Scanner keyboard = new Scanner(System.in);
      
      char y;
      int i;
      
      String number;
      
      String results="";
      
      System.out.println( " please enter what is your number ");
      
      number = keyboard.nextLine();
      
      for ( i=0; i< number.length();i++){
          y = number.charAt(i);
         if(Character.isDigit(y))
         {
         results += y;
         }
         
         else if (Character.isLetter(y))
         results = results + getNumber(number.charAt(i));
         else
         results = results + number.charAt(i);
      }
      
      System.out.println(results);
      
      
      
      
   
   }
   
   public static int getNumber(char upperCaseLetter){
            
           char x; 
            
            if (upperCaseLetter =='a' || upperCaseLetter =='A' || upperCaseLetter == 'b' || upperCaseLetter == 'B' || upperCaseLetter == 'c' || upperCaseLetter =='C')
            {
               x =  2;
            }
            else if(upperCaseLetter == 'd' || upperCaseLetter=='D' || upperCaseLetter=='e' || upperCaseLetter=='E' || upperCaseLetter== 'f' || upperCaseLetter=='F')
            {
               x=  3;
            }
            else if(upperCaseLetter == 'g' || upperCaseLetter =='G' || upperCaseLetter =='h' || upperCaseLetter =='H' || upperCaseLetter =='i' || upperCaseLetter =='I')
            {
               x=  4;
            }
            else if(upperCaseLetter=='j' || upperCaseLetter=='J' || upperCaseLetter=='K' || upperCaseLetter=='k' || upperCaseLetter=='l' || upperCaseLetter=='L')
            {
                x=  5;
            }
            else if(upperCaseLetter=='m' || upperCaseLetter=='n' || upperCaseLetter=='o' || upperCaseLetter=='M' || upperCaseLetter=='N' || upperCaseLetter=='O')
            {
              x=  6;

            }
            else if(upperCaseLetter=='p' || upperCaseLetter=='q' || upperCaseLetter=='r' || upperCaseLetter=='s' || upperCaseLetter=='P' || upperCaseLetter=='Q' || upperCaseLetter =='R' || upperCaseLetter =='S')
            {
                x= 7;

            }
            else if(upperCaseLetter=='t' || upperCaseLetter=='u' || upperCaseLetter=='v' || upperCaseLetter=='T' || upperCaseLetter=='U' || upperCaseLetter=='V')
            {
                x=  8;
            }
            else if(upperCaseLetter=='w' || upperCaseLetter=='x' || upperCaseLetter=='y' || upperCaseLetter=='z' || upperCaseLetter=='W' || upperCaseLetter=='X' || upperCaseLetter =='Y' || upperCaseLetter =='Z')
            {
                x =  9;
            }
            else{
           x =  upperCaseLetter;
           
           }
            return x; 
           
   
   }
}// ends class

/*    
  ----jGRASP exec: java Phonemapping2
 
  please enter whats is your number 
 1800flowers
 18003569377
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Phonemapping2
 
  please enter whats is your number 
 1-800-Flowers
 1-800-3569377
 
  ----jGRASP: operation complete.*/

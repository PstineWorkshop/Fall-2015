import java.util.Scanner;

public class ischarcaptialorlowercase {
  
  public static void main(String[] args) {
    
    Scanner keyboard = new Scanner(System.in);
   
  
   
   String letter;
   
   
   
    
   do{  
         System.out.println(" enter a string letter ");
      
         letter = keyboard.next(); 
 
          char l = letter.charAt(0);
      
         if(l>= 'A' && l<= 'Z')
         {
         System.out.println(l +" is an uppercase letter ");
         }
         
         else if(l>='a' && l<='z')
         {
         System.out.println(l +" word is a lowercase letter ");
         }
         
         else          
         {
         System.out.println(l + " is not an alpha character ");
         
         }
         
       
   
   }while (letter.charAt(0)>= 'A' && letter.charAt(0)<='Z' || letter.charAt(0)>='a' && letter.charAt(0)<='z');
   
   
   
   
   
   
   
   }
  }

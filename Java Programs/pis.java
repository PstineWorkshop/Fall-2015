import java.util.Scanner;

public class pis
{//start class 
public static void main(String args[ ]) 
        {//start method
  
  Scanner keyboard = new Scanner(System.in);
 
  String pis;
  
  boolean length;
  
  boolean u;
  
  boolean lo;
  
  boolean NS;
  
  boolean d;
  
   boolean flag =false; 
   
   System.out.println(" this program asks the user to enter a pis or personal identification Sring ");
   System.out.println(" here are the rules: it must be exactly four characters in length");
   System.out.println(" it must contain 1 uppercase letter\n it must contain a lowercase 1 lowercase\n it must contain a digit\n no spaces ");
  do
  {
   System.out.println(" enter your pis ");
   
   pis=keyboard.nextLine();
   
   length=slength(pis);
   
   u=checkupper(pis);
   
   lo=checklower(pis);
   
   NS=checkspace(pis);
   
   d=checkdigit(pis);
   
   if(length==true && u==true && lo==true && NS == false && d==true)
   {
      System.out.println(" pis is accepted ");
      flag=true;
   }
   else
   {
      System.out.println(" pis is invalid ");
   }
  }while (flag==false); 

   

  
  }//end method
   
     
   
   public static boolean slength(String inputl)
   {
      
      boolean valid=false;
      
      if(inputl.length()==4){
      valid =true;
      }
      return valid;
   }
   
   public static boolean checkupper(String inputu)
   {
      int i;
      
      boolean validu=false;
      
      for (i=0; i<inputu.length();i++)
      {
       if (inputu.charAt(i) >='A' && inputu.charAt(i) <='Z')
       {
         validu=true;
       }
      
      }
   
   
      return validu;
   }
   public static boolean checklower(String inputlo)
   {
      int j;
      
      boolean validlo=false;
      
      for (j=0; j<inputlo.length();j++)
      {
       if (inputlo.charAt(j) >='a' && inputlo.charAt(j) <='z')
       {
         validlo=true;
       }
      
      }
   
   
      return validlo;
   }
   
   public static boolean checkdigit(String inputd)
   {
      int k;
      
      boolean validd=false;
      
      for (k=0; k<inputd.length();k++)
      {
       if (inputd.charAt(k) >='0' && inputd.charAt(k) <='9')
       {
         validd=true;
       }
      
      }
   
   
      return validd;
   }
   
   public static boolean checkspace(String inputns)
   {
      int m;
      
      boolean validns=false;
      
      for (m=0; m<inputns.length();m++)
      {
       if (inputns.charAt(m)==' ') 
       {
         validns=true;
       }
      
      }
   
   
      return validns;
   }


   
   }//end class
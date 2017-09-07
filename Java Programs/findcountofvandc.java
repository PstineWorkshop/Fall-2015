import java.util.Scanner;


public class findcountofvandc
{
    public static void main(String[] args)
{
      Scanner keyboard = new Scanner(System.in);
    

         int i;
      
         int ccount=0;
      
         int vcount=0;
      
         String sen;
         
         System.out.println(" enter a string sentence ");
            
            sen = keyboard.nextLine();
            
            
            for(i=0; i<sen.length(); i++)
            {
               char c = sen.charAt(i);
               if(( c>='A' && c<='Z')||(c>='a' && c<='z'))
               {
                  if(c=='a' || c=='A' || c == 'e' || c=='E' || c=='I' || c=='i' || c=='o' || c=='O' || c=='U' || c=='u')
                  {
                     vcount++;
                  }
                  else
                     ccount++;      
               
               }

             
             }
             
             System.out.println(" constant count is " + ccount);
             
             System.out.println(" vowel count is " + vcount);



}
}


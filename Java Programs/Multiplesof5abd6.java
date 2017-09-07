public class Multiplesof5abd6
{
    public static void main(String[] args)
{
      int i;
      
      int count = 0;
      
      for(i = 100; i <=200;i++)
      {
         if (i%5==0)
         {
         System.out.print(i + " ");
         count++;
         }
         else if( i%6==0)
         {
         System.out.print(i + " ");
         count++;
         }
         if(count == 10)
         {
            System.out.println();
            count=0;
         }
      }
      
   
}


}
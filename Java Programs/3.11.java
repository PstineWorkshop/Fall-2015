public class Assigmentmultiples
{
    public static void main(String[] args)
{
   int i=0;
   
   int count;
   
   for( int i = 100; i <=200;i++)
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
   

}
   if(count ==10)
   {
   System.out.println();
   count=0;
   }
   
}


}
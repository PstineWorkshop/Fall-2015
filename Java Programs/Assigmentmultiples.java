public class Assigmentmultiples
{
    public static void main(String[] args)
{
   int i=0;
   
   int count=0;
   
   for(i = 100; i <=200;i++)
{
      if (i%5==0 && i%6!=0)
      {
      System.out.print(i + " ");
      count++;
      }
      else if( i%6==0 && i%5 !=0)
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
/*------------------------------------------------------------------------
 
  ----jGRASP exec: java Assigmentmultiples
 
 100 102 105 108 110 114 115 125 126 130 
 132 135 138 140 144 145 155 156 160 162 
 165 168 170 174 175 185 186 190 192 195 
 198 200 
  ----jGRASP: operation complete.
 -------------------------------------------------*/
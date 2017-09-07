import java.util.Scanner;

public class eliminateDuplicates1

{//start class
 
  public static void main(String []args)
  
  {//start main method
        
        Scanner keyboard = new Scanner(System.in);

         int i=1;
         
         int r;
        
        int []x;
        
        int size;
        
        int[] arraywithoutdup; 
        
        System.out.print(" enter a size of the array ");
        
        size=keyboard.nextInt();
        
        x= new int [size];
        
        for ( r = 0; r < size; r++)
        {

      System.out.print(" Enter values: ");

         x[r] = keyboard.nextInt();

         }
     
        
       arraywithoutdup= removeDuplicates(x);
        
        for( i=0;i<arraywithoutdup.length;i++){
            System.out.print(arraywithoutdup[i]);
        }
    }//end of main method

    
    public static int[] removeDuplicates(int[] list)
    {
    String y="";
    
    int distinct=0;
    
    boolean duplicate=false; 
    
    boolean repeat=false;
    int i=0;
    
    int j=0;
    
    int k=0;
    
    int [] output;
    
    for(i=0;i<list.length;i++)
    
      {
         duplicate=false;
         
         
         for(j=0;j<=i;j++)
         
         {
         
            if(list[i] == list[j] && i!=j)
            
            {
               duplicate=true;
            
            }
         
         }
    
         if(duplicate==false)
         {
         
               distinct++;
         
         
         }
         
      
        }     
        
        output = new int [distinct];
        int m =0;
        for(k=0;k<list.length;k++)
        
        {
            if(i==0)
            {
               output[k]=list[k];
            }
        
            else
            {
               for(j=0;j<output.length;j++)
               
                  {
                     if(list[k]==output[j])
                     
                     repeat=true;
                     
                  }
                  if(repeat==false)
                  {
                     output[m]=list[k];
                     m++;
                  
                  }
            
                  repeat=false;
            
            }
        }
      
   
    return output;
   
   }
   
  }
  
  /*     enter a size of the array 10
  Enter values: 1
  Enter values: 2
  Enter values: 3
  Enter values: 2
  Enter values: 1
  Enter values: 6
  Enter values: 3
  Enter values: 4
  Enter values: 5
  Enter values: 2
 123645
  ----jGRASP: operation complete.
 */

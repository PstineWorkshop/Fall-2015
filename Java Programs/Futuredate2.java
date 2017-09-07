import java.util.Scanner;

public class Futuredate2 
{//start of class
 
public static void main(String[] args) 
{//start of main method

 
Scanner keyboard = new Scanner(System.in);

final int cm =10;//current month this will need to be hardcoded if this is not it

final int cd = 30;//current day this will need to be hardcoded again if this is not it

final int cy=2015;//current year this will need to be hardcoded if this is not it

int im;

int id;

int iy;

boolean valid=false;

int isfuturedate;

boolean validentry;


System.out.println(" enter a date that will be evaluated if it is a date in the future here are the conditions ");
System.out.println();

System.out.println(" 1: the day must be between 1 and 31\n 2: the month must be between 1 and 12\n 3: and the year must equal the current year or be highyer");

System.out.println();

System.out.print(" enter the future month: ");

im=keyboard.nextInt();


System.out.print(" enter the future day: ");

id=keyboard.nextInt();

System.out.print(" enter the future year: ");

iy=keyboard.nextInt();


     
 validentry=realdate(iy,id,im);
      
  if(validentry==true)
  {
      valid=dateexist(iy,im,id);
   
  

    
   if(valid==true)
   {
      
      whatyourdateis(iy,im,id,cy,cm,cd);
  
   }  
  
   else
   {
   System.out.println(" the day you put in does not match with your month ");       //}
   }
  }
  else
  {
  System.out.println(" invalid entry ");
  }    
      
     
      
      }//end of method
 
 
      public static boolean isleap(int m)
      {

      boolean leap =false; 

      leap= (m % 4 == 0 && m % 100 != 0) || (m % 400 == 0);
   
      return leap;
}
      public static boolean realdate (int a, int b, int c)
   {//start method
 
     boolean date=true;
     
     if(a<2015 || a>9999 )
     {
       date=false;
     }
     

     if(b>31 || b<1)
     {
      date=false;

     }
     
     if(c>12 || c<1)
     {//month valid if
     date=false;
     //entry=false; 
    
     }  

     return date;
  }//end of method
 
   public static boolean dateexist (int d, int e, int f)
   {//start of method
      
      boolean entry=false;
      
      boolean lf=false;
      
      if(d>=2015 &&d<=9999 && e>=1&& e<=12 && f>=1 && f<=31)
      {   
     //else if(entry==false){
      lf=isleap(d);
      
      if((e==4 || e==6 || e==9 || e==11) && (f>=1 && f<=30))
         entry =true;
   
      else if((e==1 || e==3 || e==5 || e==7 || e==8 || e==10 || e==12) && (f>=1 && f<=31))   
      entry =true;
      
      else if(((e==2 && lf)&&(f>=1 && f<=29))||((e==2 && !lf)&&(f>=1 && f<=28)))
      entry =true;
      }
      else
      {
        entry=false;
      }
     
     return entry;

   }//end method
   
   public static void whatyourdateis (int g, int h, int i, int j, int k, int x)
   {
      
    
      if((g * 10000 + h * 100 + i)>(j*10000 + k*100 +x))
      {
         System.out.println(" the date: " + h +","+i+","+g + " is a date in the future ");
      }
      else if((g * 10000 + h * 100 + i)==(j*10000 + k*100 +x))   
      {
         System.out.println(" the date: " + h +","+i+","+g + " is todays date ");

      }
       else
      {
         System.out.println(" the date: " + h +","+i+","+g + " is not a date in the future ");
      }
    
   }//end of method
   
   }//end of class
 
 
 
 



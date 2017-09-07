import java.util.Scanner;

public class Futuredate 
{//start of class
 
public static void main(String[] args) 
{//start of method

 
Scanner keyboard = new Scanner(System.in);

final int cm =10;//current month this will need to be hardcoded if this is not it

final int cd = 30;//current day this will need to be hardcoded again if this is not it

final int cy=2015;//current year this will need to be hardcoded if this is not it

int im;

int id;

int iy;

boolean entry=false;

boolean lf=false;

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


     if(iy<2015 || iy>9999 )
     {
       System.out.println(" invalid entry for year");
     }
     

     if(id>31 || id<1)
     {
      System.out.println(" invalid entry for day");

     }
     
     if(im>12 || im<1)
     {//month valid if
     System.out.println(" invalid entry for month");
     //entry=false; 
    
     }  
  if(iy>=2015 &&iy<=9999 && im>=1&& im<=12 && id>=1 && id<=31){   
     //else if(entry==false){
      lf=isleap(iy);
      
      if((im==4 || im==6 || im==9 || im==11) && (id>=1 && id<=30))
         entry =true;
   
      else if((im==1 || im==3 || im==5 || im==7 || im==8 || im==10 || im==12) && (id>=1 && id<=31))   
      entry =true;
      
      else if(((im==2 && lf)&&(id>=1 && id<=29))||((im==2 && !lf)&&(id>=1 && id<=28)))
      entry =true;
      
      else if(entry==false)
      System.out.println(" the day you put in does not match with your month ");
      }
      //}
      
      if (entry==true)
   {  
      if((iy * 10000 + im * 100 + id)>(cy*10000 + cm*100 +cd))
      {
         System.out.println(" the date: " + im +","+id+","+iy + " is a date in the future ");
      }
      else if((iy * 10000 + im * 100 + id)==(cy*10000 + cm*100 +cd))   
      {
         System.out.println(" the date: " + im +","+id+","+iy + " is todays date ");

      }
       else
      {
         System.out.println(" the date: " + im +","+id+","+iy + " is not a date in the future ");
      }
   }  
   }//end of method
 
 
      public static boolean isleap(int m){

      boolean leap =false; 

      leap= (m % 4 == 0 && m % 100 != 0) || (m % 400 == 0);
   
      return leap;
}
 }



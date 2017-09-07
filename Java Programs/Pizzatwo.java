///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
//Empty Java File Template
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////
/*CS200----------------------------------------------------------------------
Semester:
Year:
Instructor: F.Porps
Your Name: (insert your name here)
Assignment # (insert assignment # here)
Due: (insert due date here) 
File name: (insert Filename here).java
---------------------------------------------------------------------------------*/
//import API's needed here:



public class Pizzatwo
{  

        public static void main(String args[ ]) 
        {
                  
				double radius_7;
            
            double radius_14;
            
            double area_7;
            
            double area_14;
            
            radius_7 =(7.0/2.0);
            
            radius_14=(14.0/2.0);
            
            final double PI=3.14;
            
            area_7=PI*Math.pow(radius_7,2);
            
            area_14=PI*Math.pow(radius_14,2);
            
            System.out.println(" the sq inch of 27 inch pizza equals " + area_7*2);
            
            System.out.println(" the sq inch of a 14 inch pizza equals  " + area_14);
            
            System.out.println(" Difference between 14 inches and 7 inches eqauls " + (area_14 - area_7));
            
            System.out.println(" THe amount of pizza you get to eat with six friends in sq inches equals " + area_14/6);            
             
         } //closing main method
} //closing class header


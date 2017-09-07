/*----------------------------------------------------------------------------------------
Finish the Super Calculator
1. Allow user to run/repeat this application as often as they want.
Hint: need a repetition structure in main method

2. Complete the getValue method below, then replace the appropriate current code 
with a call to the geValue method instead
Hint: Can you copy & paste anything to get this one done quick & easy?

3. Create the methods: 
“uFaD” Output a user friendly application description. What does this program do?
"3 - Easy Subtract: valA - valB\n" 
+"4 - Easy multiply: valA * valB\n"
+"5 - Area of a rectangle: length * width\n");
and call them in the main method per the menu method listing
Hint: Can you re-use any of these methods? i.e. one method calls another Try it!

4. Add at least 5, but no more than 7 menu option additional features to your 
very own personal Super Calculator! Create the methods & modify the main method as needed.
Go Ahead - get creative & have some fun! (but don't borrow ideas from your neighbor)
Note: These methods must be flowcharted FIRST & approved before they can be implemented.

Note: All output results should be to the "Run I/O" frame, but user prompts should be dialog boxes 
-----------------------------------------------------------------------------------------*/
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Asst07SuperCalculator
{ 
public static void main(String args[ ]) 
        {
          	
            Scanner keyboard = new Scanner(System.in);
				double value;
				int choice;
				String inputMain;
				double val1;
				double val2;
				double results;
            double x;
            double y;
            
            do{
				uFaD(); //User Friendly Application Description
				choice = menu();
				switch(choice)
				{
				case 1:
				val1 = getValue();
               
              val2 = getValue();
               
					results = easyAdd(val1,val2);
					System.out.println(val1 + " + " + val2+ " = " + results);
					break;
				
				
				case 2:
					bigAdd();
					break;
				
				case 3:
				 	val1  = getValue();
               
               val2 = getValue();
					results = easySub(val1,val2);
					System.out.println(val1 + " - " + val2 + " = " + results);

               //easySub(double x, double y);					
               break;
					
				case 4:
               inputMain = JOptionPane.showInputDialog("Enter Value 1:");
					val1=Double.parseDouble(inputMain);
					inputMain = JOptionPane.showInputDialog("Enter Value 2:");
					val2=Double.parseDouble(inputMain);
					results = easymult(val1,val2);
					System.out.println(val1 + " * " + val2 + " = " + results);
               break;
				
				case 5:
					inputMain = JOptionPane.showInputDialog("Enter length 1:");
					val1=Double.parseDouble(inputMain);
					inputMain = JOptionPane.showInputDialog("Enter width 2:");
					val2=Double.parseDouble(inputMain);
					results = easyArea(val1,val2);
					System.out.println(val1 + " * " + val2 + " = " + results);
					break;
            case 6:
               easyPrime();					break;
            case 7:
               inputMain = JOptionPane.showInputDialog("Enter value 1:");
					val1=Double.parseDouble(inputMain);
					inputMain = JOptionPane.showInputDialog("Enter value 2:");
					val2=Double.parseDouble(inputMain);
					results = easyRemainder(val1,val2);
					System.out.println(val1 + " / " + val2 + " = " + results);
					break;

					

				
				}//end of switch
			      }while (choice >=1 && choice<=7);
			           } //closing main method

public static void uFaD()
{
}
						  
public static int menu()
{
	String input;
	int option;
	boolean inRange = false;
	int minInput=1;
	int maxInput=7;
	do
	{
		input = JOptionPane.showInputDialog("Choose a task for the Super Calculator:\n"
				+"1 - Easy Add: valA + valB\n"
				+"2 - Big Add: n values summed\n"
				+"3 - Easy Subtract: valA - valB\n"
				+"4 - Easy multiply: valA * valB\n"
				+"5 - Area of a rectangle: length * width\n"
            +"6 - Find prime\n"
            +"7 - Find the remainder of the values\5");
				
	option = Integer.parseInt(input);
	inRange = rangeCheck(option,minInput,maxInput);
	if (inRange != true)
		JOptionPane.showMessageDialog(null, "Error! Please enter a value between "+ minInput + " - " + maxInput);
	}while(inRange != true);
	 			
	return option;
}//end of menu

public static boolean rangeCheck(int x, int min, int max)
{
	boolean valid = false;
	
	if(x>=min && x<=max)
		valid = true;
		
	return valid;
		
}//end of rangeCheck

public static double  easyRemainder(double a, double b)
{
double resultsED = a%b;
return resultsED;
} 

public static double easyArea(double length, double width)
{
double resultsEA = length*width;
return resultsEA;
}


public static double easymult(double a, double b)
{
double resultsEM = a*b;
return resultsEM;
}

public static double easySub(double a, double b)
{
double resultsEB = a-b;
return resultsEB;
}

public static double easyAdd(double a, double b)
{
double resultsEA = a+b;
return resultsEA;
}//end of easyAdd

public static void easyPrime()
{
String inputEP;
double resultsEP=0;
boolean notPrime = true;
int i;
double c;

               c = getValue();
       
              
              for (i = 2; i < c; i++) {
           
                if (c % i == 0) {
                notPrime = false ;
                }
            }//end of for
            
                if(notPrime==true){
                System.out.println(c + " is prime");
                }
              
              else{
               System.out.println(c + " is not  prime");
               }
           

}//end of easy prime

    
public static void bigAdd()
{
double resultsBA=0;
String inputBA;
double x;
inputBA = JOptionPane.showInputDialog("Please enter 1st value: ");
	x =getValue();
	System.out.print(x);
	resultsBA = easyAdd(resultsBA,x);

do
{
	inputBA = JOptionPane.showInputDialog("Please enter another value: ");
	x =getValue();
	System.out.print(" + " + x);
	resultsBA = easyAdd(resultsBA,x);
	inputBA = JOptionPane.showInputDialog("Do you have another value? Y or N: ");
}while(inputBA.charAt(0)=='y' || inputBA.charAt(0) =='Y');
	System.out.print(" = " + resultsBA);
}//end of big add


public static double getValue()
{
String inputGV;
double x;


inputGV = JOptionPane.showInputDialog("Please enter value: ");
	x=Double.parseDouble(inputGV);
   

   
return(x);

}

					  
} //closing class header


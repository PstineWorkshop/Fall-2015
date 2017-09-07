

  public static void highestResult() {
   

    int i;
    String name1HR;
    double result1HR;
    int x;
    int y;
    int z;
    String inputHR;
    double resultHR;
    String nameHR;
    int numberHR: 
            
            inputHR = JOptionPane.showInputDialog(" enter the number of student ");
	         x =Double.parseDouble(inputHR);
	         System.out.print(x);
	         numberHR = easyAdd(number,x);
            
            inputHR = JOptionPane.showInputDialog(" enter the students name ");
	         x =Double.parseDouble(inputHR);
	         System.out.print(x);
	         name1HR = easyAdd(name1HR,x);
            
            inputHR = JOptionPane.showInputDialog(" enter the students score ");
	         x =Double.parseDouble(inputHR);
	         System.out.print(x);
	         results1HR = highestScore(results1HR,x);

    for (i=0; i < numberHR-1; i++)
    {//starts the for loop
    
            System.out.println(" enter the name of the student ");
            name = keyboard.next();
            System.out.println(" enter the result for the student ");
            result = keyboard.nextDouble();
    if (result > result1)
      {//starts if statement
    
         name1 = name;
    
         result1 = result;
      }
    }//ends the for loop
    System.out.println(" the top student is " + name1 + " his result is " + result1);
    
    
    }
    }
    /*------------------------------------------------------------------------------
       
  ----jGRASP exec: java Highestresult
 
  enter the number of student 
 3
  enter the students name 
 joe
  enter a result for the student 
 -20
  enter the name of the student 
 john
  enter the result for the student 
 -10
  enter the name of the student 
 jason
  enter the result for the student 
 -5
  the top student is jason his result is -5.0
 
  ----jGRASP: operation complete.
 ------------------------------------------------*/
    
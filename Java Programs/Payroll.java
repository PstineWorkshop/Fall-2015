/*
Class: CS 200-6
Name: Mahboobunnisa Begum
Instructor: Freddy Porps
Assignment #3
Date: 09/16/2015
*/

import java.text.DecimalFormat;
import java.util.Scanner; // importing Scanner Class

public class Payroll
{
public static void main(String[]args)
{
double hours;                                               // initializing
double grosspay ,payRate;                               // initializing

DecimalFormat formatter1 = new DecimalFormat("#.00");

Scanner kbinput=new Scanner(System.in);                //Creating Scanner object to accept input from keyboard

System.out.print("Please enter number of hours worked ");  // prompting user for input

hours=kbinput.nextDouble();                               // taking hours as input 

System.out.print("please enter the payrate value ");  //Prompting user for Payrate

payRate=kbinput.nextDouble();                         // taking payRate as an input 

grosspay=hours*payRate;                              // Calculating gross pay

System.out.printf("Your pay was  $%s \n", grosspay);

System.out.println("Your pay was $" + formatter1.format(grosspay));     // displaying the result
}
}

import java.util.Random;
public class Catsmouse
{  
public static void main(String[] args) {
    java.util.Scanner keyboard = new java.util.Scanner(System.in);

int maze [][][];

maze=new int [10][10][10];

int userpage;

int userrow;

int usercolumn;

int i;

int j;

int k;

int kc;

int kr;

int kp;

int cc;
int cr;
int cp;

cc=(int)(Math.random()*10);
cr=(int)(Math.random()*10);
cp=(int)(Math.random()*10);

maze[cp][cr][cc]=1;


for(i=0;i<500;i++)
{

   kc=(int)(Math.random()*10);
   kr=(int)(Math.random()*10);
   kp=(int)(Math.random()*10);
   if(maze[kp][kr][kc] != 1)
   maze[kp][kr][kc]  =2;
   else
   i--;
   
}
do{
   System.out.println(" enter numbers for the page, row, column");
   userpage=keyboard.nextInt();
   
   userrow=keyboard.nextInt();
   
   usercolumn=keyboard.nextInt();
   
   if(maze[userpage][userrow][usercolumn]==2)
      System.out.println(" a cat ate you");
   else if (userpage!=cp || userrow!=cr || usercolumn !=cc)
   {
      if(Math.abs(userpage-cp)!=0)
      
         System.out.println("You are " + Math.abs(userpage-cp) + " pages away from cheese.");
      
      else
      
         System.out.println("You are in the same page");
       
       if(Math.abs(userrow-cr)!=0)
        
         System.out.println("You are " + Math.abs(userrow-cr) + " rows away from cheese.");
      
      else 
      
         System.out.println("You are in the same row");
       
       if(Math.abs(usercolumn-cc)!=0)
         
            System.out.println("You are " + Math.abs(usercolumn-cc) + " columns away from cheese.");
      
      else 
         System.out.println("You are in the same column");

   }
   else{
      System.out.println(" you found the cheese ");
   }
   


}while((userpage!=cp || userrow!=cr || usercolumn !=cc) && maze[userpage][userrow][usercolumn]!=2);


      }
     }
    /*    ----jGRASP exec: java Catsmouse
 
  enter numbers for the page, row, column
 0 0 0
  a cat ate you
 
  ----jGRASP: operation complete.
 
  ----jGRASP exec: java Catsmouse
 
  enter numbers for the page, row, column
 0 0 0
 You are 8 pages away from cheese.
 You are 6 rows away from cheese.
 You are in the same column
  enter numbers for the page, row, column
 8 6 0
  you found the cheese 
 
  ----jGRASP: operation complete.
 */
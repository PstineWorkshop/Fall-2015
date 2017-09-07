import java.util.Scanner;
import java.util.Random;
public class Asst10MouseCheeseAndCat 
{  

        public static void main(String args[ ]) 
        {
        final int MAX_SIZE = 10;
        int col = 0, row = 0, page = 0;
        int i = 0, j = 0, k = 0, m = 0;
       
        int [][][] maze = new int [MAX_SIZE][MAX_SIZE][MAX_SIZE];
        
        for (page = 0; page < MAX_SIZE; page++)
            
        for (row = 0; row < MAX_SIZE; row++)

        for (col = 0; col < MAX_SIZE; col++)
            maze [i][j][k] = 0;
            
        i = (int)(Math.random() * 10);
        j = (int)(Math.random() * 10);
        k = (int)(Math.random() * 10);
        maze [i][j][k] = 1;
        
        for (m = 0; m < Math.pow(MAX_SIZE, 3) / 2; m++){ 
            i = (int)(Math.random() * 10);
            j = (int)(Math.random() * 10);
            k = (int)(Math.random() * 10);
            if(maze[i][j][k]==1){   
              m--; 
            }
            else
            maze [i][j][k] = 2;
            
            }
            
            System.out.println(maze[0][0][0]);
            
                       
				  
				  
         } //closing main method
} //closing class header


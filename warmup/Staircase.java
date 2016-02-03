/*

Your teacher has given you the task of drawing a staircase structure. Being an expert programmer, you decided to make a program to draw it for you instead. Given the required height, can you print a staircase as shown in the example?

Input 
You are given an integer N depicting the height of the staircase.

Output 
Print a staircase of height N that consists of # symbols and spaces. For example for N=6, here's a staircase of that height:

     #
    ##
   ###
  ####
 #####
######
Note: The last line has 0 spaces before it.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);

        int height = in.nextInt();
        for( int i=1;i<=height;i++){
            StringBuilder sb = new StringBuilder();
            int j=height;
            while(j > i){
                j--;
                sb.append(" ");
            }
            while(j>0){
                j--;
                sb.append("#");
            }
             System.out.println(sb.toString());
            
        }
        
    }
}

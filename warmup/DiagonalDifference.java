/*

Given a square matrix of size N×N, calculate the absolute difference between the sums of its diagonals.

Input Format

The first line contains a single integer, N. The next N lines denote the matrix's rows, with each line containing N space-separated integers describing the columns.

Output Format

Print the absolute difference between the two sums of the matrix's diagonals as a single integer.

Sample Input

3
11 2 4
4 5 6
10 8 -12
Sample Output

15
Explanation

The primary diagonal is: 
11
      5
            -12

Sum across the primary diagonal: 11 + 5 - 12 = 4

The secondary diagonal is:
            4
      5
10
Sum across the secondary diagonal: 4 + 5 + 10 = 19 
Difference: |4 - 19| = 15

*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class DiagonalDifference {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int mlen = in.nextInt();
        /*int[][] matrix = new int[mlen][mlen];
        int count = mlen*mlen;
        int row = 0;
        int column=0;
        while(count > 0){
            if( column == mlen){
                column = 0;
                row++;
            }
            matrix[row][column] = in.nextInt();
            count--;
            column++;
        }*/
        int diagonalLeft = 0;
        int diagonalRight = 0;
        int refLeft = 1;
        int refRight = mlen ;
        
        int elemCount = mlen*mlen;
        for( int i=1;i <= elemCount; i++ ){
            int val = in.nextInt();
            if( i == refLeft){
                diagonalLeft += val;
                refLeft = refLeft+ mlen + 1;
            }
            if( i == refRight){
                diagonalRight += val;
                if(i < (elemCount - (mlen - 1)) )
                    refRight = refRight +  mlen - 1;
                //System.out.println("refRight["+refRight+"]");
            }
        }
        //System.out.println("diagonalLeft["+diagonalLeft+"]diagonalRight["+diagonalRight+"]");
        int diff = diagonalRight >= diagonalLeft ? diagonalRight-diagonalLeft : diagonalLeft-diagonalRight;
         System.out.println(diff);
    }
}

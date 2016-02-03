/*
You are given a square map of size n×n. Each cell of the map has a value denoting its depth. We will call a cell of the map a cavity if and only if this cell is not on the border of the map and each cell adjacent to it has strictly smaller depth. Two cells are adjacent if they have a common side (edge).

You need to find all the cavities on the map and depict them with the uppercase character X.

Input Format

The first line contains an integer, n, denoting the size of the map. Each of the following n lines contains n positive digits without spaces. Each digit (1-9) denotes the depth of the appropriate area.

Constraints 
1≤n≤100
Output Format

Output n lines, denoting the resulting map. Each cavity should be replaced with character X.

Sample Input

4
1112
1912
1892
1234
Sample Output

1112
1X12
18X2
1234
Explanation

The two cells with the depth of 9 fulfill all the conditions of the Cavity definition and have been replaced by X.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CavityMap {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */                   Scanner in = new Scanner(System.in);
        int len = Integer.parseInt(in.nextLine());
        int[][] arr = new int[len][len];
        boolean[][] isCavity = new boolean[len][len];
        for( int i=0; i<len ; i++){
            String row = in.nextLine();
            for(int j=0;j< row.length(); j++){
                arr[i][j] = Integer.parseInt(""+row.charAt(j));
            }
        }
        
        // Reset  the cavity
        for(int i=0; i< len;i++){
            for(int j=0;j<len;j++){
                if(i==0 || j == 0|| i == len-1 || j == len-1){
                    continue;
                } 
                int num = arr[i][j];
                int adjTop = arr[i-1][j];
                int adjBottom = arr[i+1][j];
                int adjLeft = arr[i][j-1];
                int adjRight = arr[i][j+1];
                if( num > adjTop && num > adjBottom && num > adjLeft && num > adjRight){
                   isCavity[i][j] = true;
                }
            }
        }
         //printArr(arr);
        printArrCavity(arr,isCavity);
    }
    public static void printArrCavity(int[][] arr, boolean[][] isCavity){
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(isCavity[i][j] ? "X" : arr[i][j]); 
            }
            System.out.println("");
        }
    }
    public static void printArr(int[][] arr){
        for(int i=0; i< arr.length;i++){
            for(int j=0;j<arr.length;j++){
                System.out.print(arr[i][j]); 
            }
            System.out.println("");
        }
    }
}

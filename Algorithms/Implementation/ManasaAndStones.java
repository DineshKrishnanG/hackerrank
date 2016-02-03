/*
Manasa is out on a hike with friends. She finds a trail of stones with numbers on them. She starts following the trail and notices that two consecutive stones have a difference of either a or b. Legend has it that there is a treasure trove at the end of the trail and if Manasa can guess the value of the last stone, the treasure would be hers. Given that the number on the first stone was 0, find all the possible values for the number on the last stone.

Note: The numbers on the stones are in increasing order.

Input Format 
The first line contains an integer T, i.e. the number of test cases. T test cases follow; each has 3 lines. The first line contains n (the number of stones). The second line contains a, and the third line contains b.

Output Format 
Space-separated list of numbers which are the possible values of the last stone in increasing order.

Constraints 
1≤T≤10 
1≤n,a,b≤103

Sample Input

2
3 
1
2
4
10
100
Sample Output

2 3 4 
30 120 210 300 
Explanation

All possible series for the first test case are given below:

0,1,2
0,1,3
0,2,3
0,2,4
Hence the answer 2 3 4.

Series with different number of final steps for second test case are the following:

0, 10, 20, 30
0, 10, 20, 120
0, 10, 110, 120
0, 10, 110, 210
0, 100, 110, 120
0, 100, 110, 210
0, 100, 200, 210
0, 100, 200, 300
Hence the answer 30 120 210 300.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ManasaAndStones {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc > 0){
            tc --;
            int noOfSteps = in.nextInt();
            
            int a = in.nextInt();
            int b = in.nextInt();
            //System.out.println("noOfSteps["+noOfSteps+"]a["+a+"]b["+b+"]"); 
            if(noOfSteps==0){
                System.out.println("0"); 
            }else if(noOfSteps==1){
                 System.out.println(a+" "+b); 
            }else{
                noOfSteps -= 1;//starts with zero
                int start = a > b ? b*noOfSteps : a*noOfSteps;
                int end = a > b ? a*noOfSteps :b*noOfSteps  ;
                int diff = a > b ? a-b : b-a;
                //System.out.println("start["+start+"]end["+end+"]diff["+diff+"]");
                if(diff > 0){
                    StringBuilder sb = new StringBuilder();
                    for(int x=start; x<=end ;x+=diff){
                        sb.append(x).append(" ");
                       //System.out.print(x+ " ");
                    }
                    System.out.println(sb.toString());
                }else{
                    System.out.println(start);
                }
            }
        }
    }
}

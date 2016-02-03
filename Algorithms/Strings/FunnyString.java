/*
Suppose you have some string S having length N that is indexed from 0 to N−1. You also have some string R that is the reverse of string S. S is funny if the condition | S[j]−S[j−1] |=| R[j]−R[j−1] | is true for every j from 1 to N−1.

Note: For some string S, S[j] denotes the ASCII value of the jth zero-indexed character in S. The absolute value of some integer x is written as | x |.

Input Format

The first line contains an integer, T (the number of test cases). 
The T subsequent lines each contain a string, where the ith line is string Si.

Constraints 
1≤T≤10 
0≤i≤T−1 
2≤length of Si≤10000

Output Format

For each Si, print Funny or Not Funny on a new line.

Sample Input

2
acxz
bcxz
Sample Output

Funny
Not Funny
Explanation

Test Case 0: S0= "acxz" 
|c−a|=2=|x−z| 
|x−c|=21=|c−x| 
|z−x|=2=|a−c| 
We print Funny.

Test Case 1: S1= "bcxz" 
|c−b|=1, but |x−z|=2 
We stop evaluating the string (as |c−b|≠|x−z|), and print Not Funny.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class FunnyString {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc> 0){
            tc--;
            char[] c = in.next().toCharArray();
            int len = c.length;
            String result = "Funny";
            for(int i=0; i<len-1;i++){
                int pre = c[i] - c[i+1];
                int suf = c[len-i-1] - c[len-i-2];
                if(!( pre == suf || pre+suf == 0) ){
                    result = "Not Funny";
                }
            }
            System.out.println(result);
        }
    }
}

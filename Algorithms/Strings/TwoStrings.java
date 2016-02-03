/*
You are given two strings, A and B. Find if there is a substring that appears in both A and B.

Input Format

Several test cases will be given to you in a single file. The first line of the input will contain a single integer T, the number of test cases.

Then there will be T descriptions of the test cases. Each description contains two lines. The first line contains the string A and the second line contains the string B.

Output Format

For each test case, display YES (in a newline), if there is a common substring. Otherwise, display NO.

Constraints

All the strings contain only lowercase Latin letters.
1<=T<=10
1<=|A|,|B|<=105
Sample Input

2
hello
world
hi
world
Sample Output

YES
NO
Explanation

For the 1st test case, the letter o is common between both strings, hence the answer YES. (Furthermore, the letter l is also common, but you only need to find one common substring.) 
For the 2nd test case, hi and world do not have a common substring, hence the answer NO.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TwoStrings {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc > 0){
            tc--;
            String result = "NO";
            char[] c1 = in.next().toCharArray();
            char[] c2 = in.next().toCharArray();
            boolean[] boolC1 = new boolean[26];
            boolean[] boolC2 = new boolean[26];
            for(int i=0; i < c1.length; i++){
                boolC1[c1[i] - 'a'] = true;
            }
            for(int i=0; i < c2.length; i++){
                int x = c2[i] - 'a';
                boolC2[x] = true;
                if( boolC2[x] &&  boolC1[x]){
                    result = "YES";
                    break;
                }
            }
            System.out.println(result);
        }
    }
}

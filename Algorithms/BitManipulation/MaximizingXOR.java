/*
Given two integers, L and R, find the maximal value of A xor B, where A and B satisfy the following condition:

L≤A≤B≤R
Input Format

The input contains two lines; L is present in the first line and R in the second line.

Constraints 
1≤L≤R≤103

Output Format

The maximal value as mentioned in the problem statement.

Sample Input

10
15
Sample Output

7
Explanation

The input tells us that L=10 and R=15. All the pairs which comply to above condition are the following: 
10⊕10=0 
10⊕11=1 
10⊕12=6 
10⊕13=7 
10⊕14=4 
10⊕15=5 
11⊕11=0 
11⊕12=7 
11⊕13=6 
11⊕14=5 
11⊕15=4 
12⊕12=0 
12⊕13=1 
12⊕14=2 
12⊕15=3 
13⊕13=0 
13⊕14=3 
13⊕15=2 
14⊕14=0 
14⊕15=1 
15⊕15=0 
Here two pairs (10, 13) and (11, 12) have maximum xor value 7, and this is the answer
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MaximizingXOR {
/*
 * Complete the function below.
 */

    static int maxXor(int lower, int upper) {
        int maxXor = 0;
        for( int num = lower ; num <= upper ; num++){
            int sec_num=num;
            while( sec_num <= upper){
                int _xor = (int) num ^ sec_num;
                if( _xor > maxXor){
                    maxXor = _xor;
                }
                sec_num++;
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res;
        int _l;
        _l = Integer.parseInt(in.nextLine());
        
        int _r;
        _r = Integer.parseInt(in.nextLine());
        
        res = maxXor(_l, _r);
        System.out.println(res);
        
    }
}

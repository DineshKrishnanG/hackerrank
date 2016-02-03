/*
You are given an integer N. Print the factorial of this number.

N!=N×(N−1)×(N−2)×⋯×3×2×1
Input 
Input consists of a single integer N, where 1≤N≤100.

Output 
Print the factorial of N.

Example 
For an input of 25, you would print 15511210043330985984000000.

Note: Factorials of N>20 can't be stored even in a 64−bit long long variable. Big integers must be used for such calculations. Languages like Java, Python, Ruby etc. can handle big integers, but we need to write additional code in C/C++ to handle huge values.

We recommend solving this challenge using BigIntegers.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        BigInteger fact = in.nextBigInteger();
        System.out.print(getFact(fact) );
        
    }
    public static BigInteger getFact(BigInteger n){
        if( n == BigInteger.ZERO){
            return BigInteger.ONE;
        }else{
            return n.multiply(getFact(n.subtract(BigInteger.ONE)));
        }
    }
    
}

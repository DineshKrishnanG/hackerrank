/*
A modified Kaprekar number is a positive whole number n with d digits, such that when we split its square into two pieces - a right hand piece r with d digits and a left hand piece l that contains the remaining d or d−1 digits, the sum of the pieces is equal to the original number (i.e. l + r = n).

Note: r may have leading zeros.

Here's an explanation from Wikipedia about the ORIGINAL Kaprekar Number (spot the difference!): In mathematics, a Kaprekar number for a given base is a non-negative integer, the representation of whose square in that base can be split into two parts that add up to the original number again. For instance, 45 is a Kaprekar number, because 45² = 2025 and 20+25 = 45.

The Task 
You are given the two positive integers p and q, where p is lower than q. Write a program to determine how many Kaprekar numbers are there in the range between p and q (both inclusive) and display them all.

Input Format

There will be two lines of input: p, lowest value q, highest value

Constraints: 
0<p<q<100000
Output Format

Output each Kaprekar number in the given range, space-separated on a single line. If no Kaprekar numbers exist in the given range, print INVALID RANGE.

Sample Input

1
100
Sample Output

1 9 45 55 99

Explanation

1, 9, 45, 55, and 99 are the Kaprekar Numbers in the given range.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ModifiedKaprekarNumbers {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        long lower = in.nextInt();
        long upper = in.nextInt();
        StringBuilder sb = new StringBuilder();
        for(long num=lower; num<= upper; num++){
            long sqr = num*num;
            long num_len = String.valueOf(num).length();
            long sqr_len = String.valueOf(sqr).length();
            
            long d = sqr_len/2;
            long pow=0;
            if( sqr_len % 2 == 0){
                pow = d;
            }else{
                pow = d+1;
            }
            long deno = (long) Math.pow(10,pow);
            long left = sqr/deno;
            long right = sqr%deno;
           // System.out.println("num["+num+"]sqr["+sqr+"]num_len["+num_len+"]sqr["+sqr+"] ");
           //    System.out.print(" ||pow["+pow+"] sqr_len["+sqr_len+"]deno["+deno+"]left["+left+"]right["+right+"]");
            if( num == (left+right)){
                sb.append(num).append(" ");
            }
                
            
        }
        if(sb.toString().isEmpty()){
            sb.append("INVALID RANGE");
        }
        System.out.println(sb.toString());
    }
}

/*
#NEEDS_REVISIT: 2 testcases are failing\
--------------------------------------

Given the time in numerals we may convert it into words, as shown below:

5:005:015:105:305:405:455:475:28→ five o' clock→ one minute past five→ ten minutes past five→ half past five→ twenty minutes to six→ quarter to six→ thirteen minutes to six→ twenty eight minutes past five
Write a program which prints the time in words for the input given in the format mentioned above.

Input Format

There will be two lines of input:
H, representing the hours
M, representing the minutes

Constraints
1≤H<12
0≤M<60
Output Format

Display the time in words.

Sample Input

5  
47  
Sample Output

thirteen minutes to six
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
        int hr = in.nextInt();
        int min = in.nextInt();
        String[] tens = {"","ten","twenty","thirty","fourty","fifty"};
        String[] ones = { 
                        "",
                        "one",
                        "two",
                        "three",
                        "four",
                        "five",
                        "six",
                        "seven",
                        "eight",
                        "nine",
                        "ten",
                        "eleven",
                        "twelve",
                        "thirteen",
                        "fourteen",
                        "fifteen",
                        "sixteen",
                        "seventeen",
                        "eighteen",
                        "nineteen",
                        "twenty",
                      };
        StringBuilder timeStr = new StringBuilder();
        
        //min
        String minstr = "";
        String suff = " past ";
        if( min > 30){
            min = 60 - min;
            hr = hr +1;
            suff = " to ";
        }
        
        String hrstr = "";
        if(hr < 20 ){
            hrstr = ones[hr];
        }else{
            hrstr = ones[hr/10] + ones[hr%10];
        }
        
        
        if(min < 20 ){
            minstr = ones[min];
        }else{
            minstr = ones[min/10] + ones[min%10];
        }
        if( min == 0){
            timeStr.append(hrstr).append(" o' clock");
        }else if( min == 15){
            timeStr.append("quarter").append(suff).append(hrstr);
        }else if( min == 30){
            timeStr.append("half past ").append(hrstr);
        }else {
            if( min == 1){
                timeStr.append(minstr).append(" minute").append(suff).append(hrstr);
            }else{
                timeStr.append(minstr).append(" minutes").append(suff).append(hrstr);
            }
        }
        System.out.println(timeStr.toString());
    }
}

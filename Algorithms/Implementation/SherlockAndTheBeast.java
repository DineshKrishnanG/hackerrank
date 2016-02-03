/*
Sherlock Holmes suspects his archenemy, Professor Moriarty, is once again plotting something diabolical. Sherlock's companion, Dr. Watson, suggests Moriarty may be responsible for MI6's recent issues with their supercomputer, The Beast.

Shortly after resolving to investigate, Sherlock receives a note from Moriarty boasting about infecting The Beast with a virus; however, he also gives him a clue—a number, N. Sherlock determines the key to removing the virus is to find the largest Decent Number having N digits.

A Decent Number has the following properties:

Its digits can only be 3's and/or 5's.
The number of 3's it contains is divisible by 5.
The number of 5's it contains is divisible by 3.
If there are more than one such number, we pick the largest one.
Moriarty's virus shows a clock counting down to The Beast's destruction, and time is running out fast. Your task is to help Sherlock find the key before The Beast is destroyed!

Constraints
1≤T≤20
1≤N≤100000


Input Format

The first line is an integer, T, denoting the number of test cases.

The T subsequent lines each contain an integer, N, detailing the number of digits in the number.

Output Format

Print the largest Decent Number having N digits; if no such number exists, tell Sherlock by printing -1.

Sample Input

4
1
3
5
11
Sample Output

-1
555
33333
55555533333
Explanation

For N=1, there is no decent number having 1 digit (so we print −1).
For N=3, 555 is the only possible number.
For N=5, 33333 is the only possible number.
For N=11, 55555533333 and all permutations of these digits are valid numbers; among them, the given number is the largest one
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SherlockAndTheBeast {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
         int tcCount  = in.nextInt(); 
        while(tcCount> 0){
            tcCount--;
            int num  = in.nextInt();
            //System.out.println(printOutput(num));
            System.out.println(printOutput2(num));
        }
       
           
    }
    public static String printOutput2(int num){
        StringBuilder sb = new StringBuilder();
        int divThreeRem =  num % 3;
        int noOfFives = num - divThreeRem;
        int noOfThrees = 0;
        if(num - noOfFives == 1){
            noOfFives -= 9;
            noOfThrees += 10;
        }else if(num - noOfFives == 2){
            noOfFives -= 3;
            noOfThrees += 5;
        }
        if(noOfFives >=0){
            sb.append(repeat("5",noOfFives));
            if(noOfThrees > 0){
                sb.append(repeat("3",noOfThrees));
            }
        }else{
            sb.append("-1");
        }
        return sb.toString();
    }
    //old
    public static String printOutput(int num){
         
            String output = "-1";
            if( num % 3 ==0){
                output = repeat("5",num);
            }else{
                int div3 = num/3;
                for(int i=0; i<= div3; i++){
                    int rem = num - (i*3);

                    if(rem % 5 == 0){
                        int div5 = rem / 5;
                            if(i > 0){
                               //output = String.format("%"+(i*3)+"s %"+(div5*5)+"s","5","3");
                                output = repeat("5",i*3) + repeat("3",div5*5);
                            }else{
                                output = repeat("3",div5*5);
                            }
                        break;
                    }
                }
            }
        return output;
            
    }
    public static String repeat(String c,int i)
         {
         StringBuilder sb = new StringBuilder();
         for(int j = 0; j < i; j++)
             {
             sb.append(c);
         }
         return sb.toString();
     }
}

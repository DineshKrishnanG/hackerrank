/*
Sid is obsessed with reading short stories. Being a CS student, he is doing some interesting frequency analysis with the books. He chooses strings S1 and S2 in such a way that |len(S1)−len(S2)|≤1.

Your task is to help him find the minimum number of characters of the first string he needs to change to enable him to make it an anagram of the second string.

Note: A word x is an anagram of another word y if we can produce y by rearranging the letters of x.

Input Format 
The first line will contain an integer, T, representing the number of test cases. Each test case will contain a string having length len(S1)+len(S2), which will be concatenation of both the strings described above in the problem.The given string will contain only characters from a to z.

Output Format 
An integer corresponding to each test case is printed in a different line, i.e. the number of changes required for each test case. Print −1 if it is not possible.

Constraints

1≤T≤100 
1≤len(S1)+len(S2)≤104
Sample Input

6
aaabbb
ab
abc
mnop
xyyx
xaxbbbxx
Sample Output

3
1
-1
2
0
1
Explanation 
Test Case #01: We have to replace all three characters from the first string to make both of strings anagram. Here, S1 = "aaa" and S2 = "bbb". So the solution is to replace all character 'a' in string a with character 'b'. 

Test Case #02: You have to replace 'a' with 'b', which will generate "bb". 

Test Case #03: It is not possible for two strings of unequal length to be anagram for each other. 

Test Case #04: We have to replace both the characters of first string ("mn") to make it anagram of other one. 

Test Case #05: S1 and S2 are already anagram to each other. 

Test Case #06: Here S1 = "xaxb" and S2 = "bbxx". He had to replace 'a' from S1 with 'b' so that S1 = "xbxb" and we can rearrange its letter to "bbxx" in order to get S2.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Anagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int tc = in.nextInt();
        while(tc > 0){
            tc--;
            String str = in.next();
            int len = str.length();
            if( len % 2 != 0){
                System.out.println(-1);
                continue;
            }
            int[] cnt = new int[26];
            int[] cnt2 = new int[26];
            char[] chars = str.toCharArray();
            for( int i=0; i< len; i++){
                char c = chars[i];
                if(i < len/2){
                    cnt[c-'a']++;
                }else{
                    cnt2[c-'a']++;
                }
            }
            int result = 0;
            for( int i=0; i< cnt2.length; i++){
               // System.out.print("\ni["+i+"]cnt["+cnt[i]+"]cnt2["+cnt2[i]+"]");
               result += Math.abs(cnt2[i] - cnt[i]);
            }
            System.out.println(result/2);
        }
    }
}

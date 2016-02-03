/*
Dothraki are planning an attack to usurp King Robert's throne. King Robert learns of this conspiracy from Raven and plans to lock the single door through which the enemy can enter his kingdom.

door

But, to lock the door he needs a key that is an anagram of a certain palindrome string.

The king has a string composed of lowercase English letters. Help him figure out whether any anagram of the string can be a palindrome or not.

Input Format 
A single line which contains the input string.

Constraints 
1≤ length of string ≤105 
Each character of the string is a lowercase English letter.

Output Format 
A single line which contains YES or NO in uppercase.

Sample Input : 01

aaabbbb
Sample Output : 01

YES
Explanation 
A palindrome permutation of the given string is bbaaabb. 

Sample Input : 02

cdefghmnopqrstuvw
Sample Output : 02

NO
Explanation 
You can verify that the given string has no palindrome permutation. 

Sample Input : 03

cdcdcdcdeeeef
Sample Output : 03

YES
Explanation 
A palindrome permutation of the given string is ddcceefeeccdd.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class GameOfThrones1 {

    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        String inputString = myScan.nextLine();
       
        String ans = hasPalindrome(inputString);
        // Assign ans a value of YES or NO, depending on whether or not inputString satisfies the required condition
        System.out.println(ans);
        myScan.close();
    }
    private static String hasPalindrome(String anagram){
        int[] presenceCnt = new int[26];
        char[] chars = anagram.toCharArray();
        int len = chars.length;
        int base ='a';
        for(int i=0;i<len;i++){
            presenceCnt[chars[i]-base]++;
        }
        // check
        int oddCnt = len%2 == 0 ? 0 : 1;
        
        int cnt=0;
        for(int i=0; i<presenceCnt.length;i++){
            if(presenceCnt[i] %2 != 0){
                cnt++;
            }
            if( cnt > oddCnt){
                return "NO";
            }
        }
        return "YES";
    }
}

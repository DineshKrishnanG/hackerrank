/*
Roy wanted to increase his typing speed for programming contests. So, his friend advised him to type the sentence "The quick brown fox jumps over the lazy dog" repeatedly, because it is a pangram. (Pangrams are sentences constructed by using every letter of the alphabet at least once.)

After typing the sentence several times, Roy became bored with it. So he started to look for other pangrams.

Given a sentence s, tell Roy if it is a pangram or not.

Input Format

Input consists of a string s.

Constraints 
Length of s can be at most 103 (1≤|s|≤103) and it may contain spaces, lower case and upper case letters. Lower-case and upper-case instances of a letter are considered the same.

Output Format

Output a line containing pangram if s is a pangram, otherwise output not pangram.

Sample Input

Input #1

We promptly judged antique ivory buckles for the next prize    
Input #2

We promptly judged antique ivory buckles for the prize    
Sample Output

Output #1

pangram
Output #2

not pangram
Explanation

In the first test case, the answer is pangram because the sentence contains all the letters of the English alphabet.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Panagrams {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        char[] carr = in.nextLine().toCharArray();
        boolean[] isPresent = new boolean[26];
        int uniqCnt = 0;
        for(int i=0;i<carr.length; i++){
            char c = carr[i];
            int base = 'A';
            if( c >= 'a'){
                base = 'a';
            } 
            int idx =(int) c-base;
            //System.out.println("c["+c+"]base["+base+"]idx["+idx+"]");
            if(idx >= 0 && idx <26){
                if(! isPresent[idx]){
                    isPresent[idx] = true;
                    uniqCnt ++;
                    //System.out.println("incrementing for char["+c+"]");
                }
            }
            if( uniqCnt == 26){
                break;
            }
            
        }
        //System.out.println(uniqCnt);
        System.out.println(uniqCnt == 26? "pangram" : "not pangram");
    }
}

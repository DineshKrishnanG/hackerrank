/*
Alice recently started learning about cryptography and found that anagrams are very useful. Two strings are anagrams of each other if they have same character set (and frequency of characters) and same length. For example strings "bacdc" and "dcbac" are anagrams, while strings "bacdc" and "dcbad" are not.

Alice decides on an encryption scheme involving 2 large strings where encryption is dependent on the minimum number of character deletions required to make the two strings anagrams. She need your help in finding out this number.

Given two strings (they can be of same or different length) help her in finding out the minimum number of character deletions required to make two strings anagrams. Any characters can be deleted from any of the strings.

Input Format 
Two lines each containing a string.

Constraints 
1 <= Length of A,B <= 10000 
A and B will only consist of lowercase latin letter.

Output Format 
A single integer which is the number of character deletions.

Sample Input #00:

cde
abc
Sample Output #00:

4
Explanation #00: 
We need to delete 4 characters to make both strings anagram i.e. 'd' and 'e' from first string and 'b' and 'a' from second string.

*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class MakeItAnagram {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        char[] charX = in.nextLine().toCharArray();
        char[] charY = in.nextLine().toCharArray();
        int[] posX = new int[26];
        int[] posY = new int[26];
        for( char x : charX){
            posX[x-'a']++;
        }
        for( char y : charY){
            posY[y-'a']++;
        }
        
        int cnt=0;
        for(int i=0; i<26;i++){
            int diff = posY[i] - posX[i];
           // System.out.println("i["+i+"] x:["+posX[i]+"] y:["+posY[i]+"] diff["+diff+"]" );
            if( diff < 0){
               cnt = cnt - diff; 
            }else{
                cnt += diff;
            }
            
        }
        System.out.println(cnt);
    }
}

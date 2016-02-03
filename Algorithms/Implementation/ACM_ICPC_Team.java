/*
You are given a list of N people who are attending ACM-ICPC World Finals. Each of them are either well versed in a topic or they are not. Find out the maximum number of topics a 2-person team can know. And also find out how many teams can know that maximum number of topics.

Note Suppose a, b, and c are three different people, then (a,b) and (b,c) are counted as two different teams.

Input Format

The first line contains two integers, N and M, separated by a single space, where N represents the number of people, and M represents the number of topics. N lines follow.
Each line contains a binary string of length M. If the ith line's jth character is 1, then the ith person knows the jth topic; otherwise, he doesn't know the topic.

Constraints 
2≤N≤500 
1≤M≤500

Output Format

On the first line, print the maximum number of topics a 2-person team can know. 
On the second line, print the number of 2-person teams that can know the maximum number of topics.

Sample Input

4 5
10101
11100
11010
00101
Sample Output

5
2
Explanation

(1, 3) and (3, 4) know all the 5 topics. So the maximal topics a 2-person team knows is 5, and only 2 teams can achieve this.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ACM_ICPC_Team {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int persons = in.nextInt();
        int subjects = in.nextInt();
        String[] flags = new String[persons];
        for(int i=0; i< persons;i++){
            flags[i] = in.next();
        }
        int maxSubjects = 0;
        int maxTeams = 0;
        for( int i=0; i< persons-1; i++){
            char[] x = flags[i].toCharArray();
            for( int j=i+1;j < persons;j++){
               char[] y = flags[j].toCharArray();
                
                int cnt = andCompare(x,y);
                //System.out.println("i["+i+"]j["+j+"]cnt["+cnt+"]");
                if(cnt > maxSubjects){
                    maxSubjects=cnt;
                    maxTeams=1;
                }else if(cnt == maxSubjects){
                    maxTeams++;
                }
                
            }
        }
        System.out.println(maxSubjects);
        System.out.println(maxTeams);
    }
    
    public static int  andCompare(char[] x,char[] y){
        int common = 0;
        int len = x.length;
        for( int i=0;i<len;i++){
            if(x[i] == '1' || y[i] == '1'){
                common++;
            }
        }
        return common;
    }
}

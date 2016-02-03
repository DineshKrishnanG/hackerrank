/*
Let's start simple. 
Can you complete the function solveMeFirst to return the sum of two integers passed as input parameters? 
You can pick your favorite programming language.
*/

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class SolveMeFirst {


    static int solveMeFirst(int a, int b) {
        return a+b;
   }

   
 public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int _a;
        _a = in.nextInt();
        int _b;
        _b = in.nextInt();
        int sum;
        sum = solveMeFirst(_a, _b);
        System.out.println(sum);
   }
}

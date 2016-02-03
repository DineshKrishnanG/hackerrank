/*
Given a time in AM/PM format, convert it to military (24-hour) time.

Note: Midnight is 12:00:00AM on a 12-hour clock and 00:00:00 on a 24-hour clock. Noon is 12:00:00PM on a 12-hour clock and 12:00:00 on a 24-hour clock.

Input Format

A time in 12-hour clock format (i.e.: hh:mm:ssAM or hh:mm:ssPM), where 01≤hh≤12.

Output Format

Convert and print the given time in 24-hour format, where 00≤hh≤23.

Sample Input

07:05:45PM
Sample Output

19:05:45
Explanation

7 PM is after noon, so you need to add 12 hours to it during conversion. 12 + 7 = 19. Minutes and seconds do not change in 12-24 hour time conversions, so the answer is 19:05:45.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class TimeConversion {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
       String inTime = in.nextLine();
        //String inTime = "12:12:12AM";
        
        String format = inTime.substring(inTime.length()-2,inTime.length());
        String newFormat = inTime.substring(0,inTime.length()-2);
        //System.out.println("Format: "+ format);
        //System.out.println("newFormat: "+ newFormat);
        int hr = Integer.parseInt(newFormat.split(":")[0]);
        if(format.equals("PM") && hr < 12){
            hr += 12;
        }
        if(format.equals("AM") && hr == 12){
            hr -= 12;
        }
        String prefix ="";
        if(hr<10){
            prefix = "0";
        }
        newFormat = prefix+hr+ newFormat.substring(2,newFormat.length());
        System.out.println(newFormat);
    }
}

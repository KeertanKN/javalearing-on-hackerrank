import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        String dn = s.substring(8);
        String hr = s.substring(0,2);
        int hri = Integer.parseInt(hr);
        String min = s.substring(3,5);
        int mini = Integer.parseInt(min);
        String sec = s.substring(6,8);
        int seci = Integer.parseInt(sec);
        if(dn.equals("AM")){
            
             if(12==hri) {
                return String.format("%02d:%02d:%02d", 0, mini, seci);
            } else {
                return String.format("%02d:%02d:%02d", hri, mini, seci);
            }
        } else{
            if(hri<12 && hri>0){
                hri +=12;
                return String.format("%02d:%02d:%02d", hri, mini, seci);
            } else {
                return String.format("12:%02d:%02d", mini, seci);
            }
        }
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}

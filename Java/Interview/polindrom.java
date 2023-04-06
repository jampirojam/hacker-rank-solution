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
     * Complete the 'breakPalindrome' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING palindromeStr as parameter.
     */
     
    public static String breakPalindrome(String palindromeStr) {
    // Write your code here
        char[] charArray = palindromeStr.toCharArray();
        for (int i = 0; i < charArray.length/2; i++) {
            if (charArray[i] != 'a') {
                charArray[i] = 'a';
                return String.valueOf(charArray);
            }
        }
        charArray[charArray.length-1] = 'a';
        if (charArray[0] == 'a' && charArray[charArray.length-1] == 'a') {
            return "IMPOSSIBLE";
        }
        return String.valueOf(charArray);
    }
}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));
        String palindromeStr = bufferedReader.readLine();
        String result = Result.breakPalindrome(palindromeStr);
        bufferedWriter.write(result);
        bufferedWriter.newLine();
        bufferedReader.close();
        bufferedWriter.close();
    }
}

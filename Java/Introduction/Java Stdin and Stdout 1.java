// In this challenge, you must read 3 integers from stdin and then print them to stdout. Each integer must be printed on a new line. To make the problem a little easier, a portion of the code is provided for you in the editor below.

import java.util.*;

public class Solution {

    public static void main(String[] args) {
        int a = 0;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i < 4; i++) {
            a = scan.nextInt();
            System.out.println(a);
        }
    }
    
}

/*
Jumlahkan semua bilangan berurutan yang ada pada nilai inputan; bilangan tersebut kelipatan 3 dan 5.

Contoh Input:
10
Bilangan kelipatan 3, 5, 6, 9
Jumlah 23.

Maka outpunya adalah 23.
*/
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t;
        while (in.hasNext()) {
            t = in.nextInt();
            int jmlh = 0;
            for (int a = 1; a < t; a++) {
                if (a % 3 == 0 || a % 5 == 0) {
                    jmlh += a;
                }
            }
            if (jmlh != 0) {
                System.out.println(jmlh);
            } else {

            }
        }
    }
}

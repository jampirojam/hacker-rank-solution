/*
Sample Input

java 100
cpp 65
python 50

Sample Output

================================
java           100 
cpp            065 
python         050 
================================

Explanation

Each String is left-justified with trailing whitespace through the first 15 characters. The leading digit of the integer is the 16th character, and each integer that was less than 3 digits now has leading zeroes.
*/
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            // Penggunaan printf untuk mencetak formatting
            // %-15s untuk memberikan spasi 15 karakter (rata kiri-sama rata) setelah String (s1)
            // %03d untuk memastikan jumlah tetap digit desimal, apabila kurang dari digit yang ditetapkan akan ditambahkan 0 di awal
            System.out.printf("%-15s%03d\n", s1, x);
        }
        System.out.println("================================");

    }
}

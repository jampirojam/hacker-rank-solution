import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

abstract class Calculator {

    abstract int add(int a, int b);
}

class Adder extends Calculator {

    @Override
    int add(int a, int b) {
        return a + b;
    }
}

public class TheAdder {

    public static void main(String[] args) {
        int a, b;
        try (Scanner scan = new Scanner(System.in)) {
            a = scan.nextInt();
            b = scan.nextInt();
        }

        Calculator adderObject = new Adder();
        System.out.println("Jumlahnya: " + adderObject.add(a, b));
    }

}

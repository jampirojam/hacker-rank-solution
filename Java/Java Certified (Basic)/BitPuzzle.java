import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class BitPuzzle {
    public static void main(String[] args) {
        try {
            Float f = new Float("3.0");
            int x = f.intValue();
            byte b = f.byteValue();
            double d = f.doubleValue();
            System.out.println(x + b + d);
        } catch (NumberFormatException exception) {
            System.out.println("BitPuzzle Salah");
        }
    }
}

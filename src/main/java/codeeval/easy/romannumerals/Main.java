package codeeval.easy.romannumerals;

import java.io.File;
import java.nio.charset.Charset;
import java.util.Scanner;

public class Main {

    public static void main(final String[] args) throws Exception {

        final Scanner scanner = new Scanner(new File(args[0]), Charset.defaultCharset().name());

        while (scanner.hasNext()) {
            final String token = scanner.next();
            int number = Integer.parseInt(token);
            while (number >= 1000) {
                number -= 1000;
                System.out.print("M");
            }

            if (number >= 900) {
                number -= 900;
                System.out.print("C");
                System.out.print("M");
            }
            if (number >= 500) {
                number -= 500;
                System.out.print("D");
            }
            if (number >= 400) {
                number -= 400;
                System.out.print("C");
                System.out.print("D");
            }
            while (number >= 100) {
                number -= 100;
                System.out.print("C");
            }

            if (number >= 90) {
                number -= 90;
                System.out.print("X");
                System.out.print("C");
            }
            if (number >= 50) {
                number -= 50;
                System.out.print("L");
            }
            if (number >= 40) {
                number -= 40;
                System.out.print("X");
                System.out.print("L");
            }
            while (number >= 10) {
                number -= 10;
                System.out.print("X");
            }

            if (number >= 9) {
                number -= 9;
                System.out.print("I");
                System.out.print("X");
            }
            if (number >= 5) {
                number -= 5;
                System.out.print("V");
            }
            if (number >= 4) {
                number -= 4;
                System.out.print("I");
                System.out.print("V");
            }
            while (number > 0) {
                number--;
                System.out.print("I");
            }

            System.out.println("");
        }
    }
}

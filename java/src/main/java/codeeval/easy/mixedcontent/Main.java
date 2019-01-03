package codeeval.easy.mixedcontent;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

public final class Main {
    public static void main(String[] args) throws Exception {
        File inputFile = new File(args[0]);
        InputStream fileStream = new FileInputStream(inputFile);
        Reader inputReader = new InputStreamReader(fileStream, Charset.defaultCharset());
        BufferedReader buffer = new BufferedReader(inputReader);

        String line;
        while ((line = buffer.readLine()) != null) {
            String[] strings = line.trim().split(",", -1);
            StringBuilder numbers = new StringBuilder();
            StringBuilder fruits = new StringBuilder();
            boolean printFruit = false;
            boolean printNumbers = false;
            for (String string : strings) {
                if (Character.isDigit(string.toCharArray()[0])) {
                    numbers.append(string).append(",");
                    printFruit = true;
                } else {
                    fruits.append(string).append(",");
                    printNumbers = true;
                }
            }

            if (printFruit) {
                System.out.print(fruits.substring(0, fruits.length() - 1));
            }

            if (printFruit && printNumbers) {
                System.out.print("|");
            }

            if (printNumbers) {
                System.out.print(numbers.substring(0, numbers.length() - 1));
            }

            System.out.println();
        }
    }
}

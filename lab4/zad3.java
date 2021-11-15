package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(countWordsFromFile("ściezka do pliku", "lorem"));
    }

    public static int countWordsFromFile(String filePath, String word) throws FileNotFoundException {
        int a = 0;
        Scanner sc = new Scanner(new File(filePath));
        while(sc.hasNext()){
            String compare = sc.next();
            if (compare.equalsIgnoreCase(word))
                counter++;
        }

        return a;
    }
}

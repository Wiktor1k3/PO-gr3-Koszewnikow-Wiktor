package com.company;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        System.out.println(countFromFile("ścieżka do pliku", 'd'));
    }

    public static int countFromFile(String filePath, char c) throws FileNotFoundException {
        int counter = 0;
        Scanner sc = new Scanner(new File(filePath));
        while(sc.hasNext()){
            String str = sc.next();
            for (int i = 0; i<=str.length()-1; i++){
                if(str.charAt(i) == c)
                    counter++;
            }
        }
        return counter;
    }
}

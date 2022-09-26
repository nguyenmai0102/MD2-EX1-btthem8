package btthem8;

import javafx.scene.transform.Scale;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int tram, chuc, donvi;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap 3 số bất kì\n");
        int number = scanner.nextInt();
        tram = number/100;
        chuc = (number%100)/10;
        donvi = (number%100)%10;
        System.out.printf ("%d donvi %d chuc %d tram", donvi, chuc, tram);


    }
}


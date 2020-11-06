package Midtask;

import java.util.Scanner;

public class Random {
    java.util.Random random = new java.util.Random();
    Scanner sc = new Scanner(System.in);
    int min,max;
    int number = random. nextInt(max - min) + min;

    public void RandomOut() {
        int number = random. nextInt(-5 - (-10)) + (-10);
        System.out.println(number);
    }
}

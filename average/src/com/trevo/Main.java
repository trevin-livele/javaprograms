package com.trevo;
import java.util.Scanner;
import static java.lang.Float.sum;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int n,count = 1;
        float x,averagey,sumz = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter value of n");
        n=sc.nextInt();
        while (count <=n)
        {
            System.out.println("enter the " +count+"number?");
            x = sc.nextInt();
            sumz += x;
            ++count;
        }
        averagey = sumz/n;
        System.out.println("the average is " + averagey);
    }
}

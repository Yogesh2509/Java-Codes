package ooopppssss;

import java.util.Scanner;

public class bankAccount {
    int acc;
    String name;
    static double roi = 10.5;
    int principal;
    int years;
    double total;

    public void setdata() {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        String n = sc.nextLine();

        acc = x;
        principal = y;
        years = z;
        name = n;
        total = principal * roi * years / 100;

    }

    public void showdata() {
        System.out.println("Account Number is : " + acc);
        System.out.println("Pricipal is : " + principal);
        System.out.println("Time duration is : " + years);
        System.out.println("Account holder name : " + name);
        System.out.println("Interest is : " + total);
    }
}

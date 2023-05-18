// package ooopppssss;

// public class constructor {
//     int a;
//     int b;

//     constructor(int x, int y) {
//         a = x;
//         b = y;
//     }

//     void display() {
//         System.out.println("Value of a is " + a + " Value of b is " + b);
//     }

//     public static void main(String[] args) {
//         constructor c1 = new constructor(1, 2);
//         constructor c2 = new constructor(4, 5);
//         c1.display();
//         c2.display();
//     }
// }

//program to print the total and percentage of 3 students,,,,,,,,,
package ooopppssss;

import java.util.Scanner;

public class constructor {
    int sub1;
    int sub2;
    int sub3;
    int total = 0;
    double per;

    constructor(int x, int y, int z) {
        sub1 = x;
        sub2 = y;
        sub3 = z;
    }

    void display() {
        System.out.println("Marks in sub1 : " + sub1);
        System.out.println("Marks in sub2 : " + sub2);
        System.out.println("Marks in sub3 : " + sub3);
        total = sub1 + sub2 + sub3;
        System.out.println("Total marks are : " + total);
        per = (float) total / 3;
        System.out.println("Percentage is : " + per);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the marks of sub1 : ");
        int x = sc.nextInt();
        System.out.print("Enter the marks of sub2 : ");
        int y = sc.nextInt();
        System.out.print("Enter the marks of sub3 : ");
        int z = sc.nextInt();
        constructor c1 = new constructor(x, y, z);
        c1.display();
    }
}

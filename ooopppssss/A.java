// package ooopppssss;

// import java.util.Scanner;

// public class A {
//     int a, b;

//     void input() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter the value of a : ");
//         a = sc.nextInt();
//         System.out.println("Enter the value of b : ");
//         b = sc.nextInt();
//     }
// }

// class B extends A {
//     void add() {
//         System.out.println("Sum is " + (a + b));
//     }
// }

// class C extends A {
//     void data() {
//         System.out.println("Difference is " + (a - b));
//     }
// }

// class demo {
//     public static void main(String[] args) {
//         B bb = new B();
//         C cc = new C();
//         bb.input();
//         cc.input();
//         bb.add();
//         cc.data();
//     }
// }

package ooopppssss;

import java.util.Scanner;

public class A {
    int a = 10;

    void wish() {
        System.out.println("Good");
    }
}

class B extends A {
    void wish() {
        System.out.println("Bad");
    }
}

class demo {
    public static void main(String[] args) {
        B bb = new B();
        bb.wish();
    }
}
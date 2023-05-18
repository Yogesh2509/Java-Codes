// //for each loop
// class Class14 {

//     public static void main(String args[]) {
//         int arr[] = { 5, 6, 7, 8, 9 };
//         for (int i : arr) {
//             System.out.println("Value is " + i);
//         }

//     }

// }

//Switch case

import java.util.Scanner;

class Class14 {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the value : ");
        int value = scan.nextInt();
        switch (value) {

            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thrusday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;

        }

    }
}

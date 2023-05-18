// //there is a need to break out from both the loop when sum of i and j is greater than 8
// class Class13 {

//     public static void main(String args[]) {
//         int i, j;
//         first: for (i = 1; i < 10; i++) {
//             for (j = 1; j <= 5; j++) {
//                 if (i + j > 8) {
//                     break first;
//                 }
//                 System.out.println(i + j);
//             }
//         }

//     }
// }

//there is a need to break out from both the loop when sum of i and j is greater than 8
class Class13 {

    public static void main(String args[]) {
        int i, j;
        for (i = 1; i <= 5; i++) {
            for (j = 1; j <= 5; j++) {
                if (j > i) {
                    System.out.print("*");
                    continue;
                }
                System.out.println();
            }
        }

    }
}

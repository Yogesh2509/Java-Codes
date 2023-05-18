class Class10 {

    public static void main(String args[]) {

        // do while loop

        // int i=1;
        // do{
        // System.out.println("Yogesh");
        // i++; }
        // while(i<=5);{
        // i++;

        // for loop

        // int i = 1;
        // for (i = 10; i >= 1; i--) {
        // System.out.println(i);
        // }
        //
        // Table of anything
        // int i;
        // for (i = 1; i <= 10; i++) {

        // System.out.println(12 + "*" + i + "=" + 12 * i);
        // }
        // prime numbers
        int count = 0;
        int i;
        for (i = 1; i <= 7; i++) {
            if (7 % i == 0) {
                count++;
            }
        }
        if (count == 2) {
            System.out.println("Prime NUmber");
        } else {
            System.out.println("Composite number");
        }
    }
}

//program for armstorm number
class Class12 {

    public static void main(String args[]) {
        int i, sum, r, temp;
        for (i = 1; i <= 500; i++) {
            sum = 0;
            temp = i;
            while (temp != 0) {
                r = temp % 10;
                sum += r * r * r;
                temp = temp / 10;
            }
            if (i == sum) {
                System.out.println(i);
            }
        }

    }
}

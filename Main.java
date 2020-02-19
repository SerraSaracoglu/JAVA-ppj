import java.util.Scanner;
/* In this question we should see the real picture our "i"  will be rows our "j" will be our columns
* |                  Here when we find our maximum number with comparing other two number we can see our finishing
* |                  point for this question.
* |                  then when you add number to index i if it is less then our max number we want it to
* |                  print space if it is equal or bigger print star !!dont forget about last sout!!!
* |
* |----------*/


public class Main {
    public static void main(String[] args) {
        int max;
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter three numbers");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        if (a >= b && a >= c) {
            max = a;
        } else if (b >= a && b >= c) {
            max = b;
        } else {
            max = c;
        }
        for (int i = 1; i <= max; i++) {
            for (int j = 0; j < 3; j++) {
                switch (j) {
                    case 0:
                        if (a + i <= max) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                            break;

                    case 1:
                        if (b + i <= max) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                            break;

                    case 2:
                        if (c + i <= max) {
                            System.out.print(" ");
                        } else {
                            System.out.print("*");
                        }
                        break;
                }
            }
            System.out.println();
        }
    }
}
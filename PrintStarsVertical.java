import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int max = 0;
        System.out.print("Input the 1st number: ");
        int a = in.nextInt();

        System.out.print("Input the 2nd number: ");
        int b = in.nextInt();

        System.out.print("Input the 3rd number: ");
        int c = in.nextInt();

        if (a > b && a > c) {

            max = a;
        } else if (b > a && b > c) {

            max = b;
        } else if (c>a&&c>b){

            max = c;
        }
        for(int i =max;i>0;i--){
            if(i<=a){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            if(i<=b){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }if(i<=c){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }
            System.out.println();

        }


    }
}

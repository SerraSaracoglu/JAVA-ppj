import java.util.Scanner;

/*
Write a program which reads an odd natural number n and writes on the console a symmetric ‘kite’ consisting of asterisks: in the first line n stars, in the second line n − 2 stars, ... , in n-th – one star. For example, for n = 7 the output should look like this:
 *******
  *****
   ***
    *
 */
public class Task03 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Please enter the number of rows you want to see");
        int size=scan.nextInt();
        if(size%2==1){

        for(int i=size;i>=0;i--){
            for(int j=size;j>i;j--){
                System.out.print(" ");
            }for(int k=size;k<=i*2-1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
        }else {
            System.out.println("Please enter only odd numbers!");
        }





    }
}
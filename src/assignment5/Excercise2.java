package assignment5;

import java.util.Scanner;

public class Excercise2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first element of the Fibonacci sequence: ");
        int n = scanner.nextInt();
        if(n <= 0){
            System.out.println("Enter a positive integer.");
        }else{
            int first = 0;
            int second = 1;
            System.out.println("Number series: ");
            for(int i = 0; i < n; i++){
                System.out.print(" " +first);
                int nextnumber = first + second;
                first = second;
                second = nextnumber;
            }
        }
        scanner.close();
    }
}

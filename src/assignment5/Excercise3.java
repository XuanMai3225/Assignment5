package assignment5;

import java.util.Scanner;

public class Excercise3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number to print multiplication table: ");
        int number = scanner.nextInt();
        if(number < 1 || number > 10){
            System.out.println("Enter a number from 1 -10.");
        }else{
            System.out.println("Multiplication table: " +number);
            for(int i = 1; i <= 10; i++){
                System.out.println(number + " x " + i + " = " +(number * i));
            }
        }
        scanner.close();
    }
}

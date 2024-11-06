package assignment5;

import java.util.Random;
import java.util.Scanner;

public class Excercise1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int randomnumber = random.nextInt(50) + 1;    //Tạo số ngẫu nhiên
        int guess = 0;      //Số người dùng đoán
        System.out.println("Number guessing game");
        while(guess != randomnumber){
            System.out.print("Enter number: ");
            guess = scanner.nextInt();
            //Kiểm tra kết quả, và đưa ra gợi ý
            if(guess < randomnumber){
                System.out.println("Your number is lower");
            }else if(guess > randomnumber){
                System.out.println("Your number is higher");
            }else{
                System.out.println("You guessed it right." +randomnumber);
            }
        }
        scanner.close();
    }
}

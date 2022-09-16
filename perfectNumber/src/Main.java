import java.util.Scanner;

public class Main{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int total = 0;
        System.out.println("Please enter a number: ");
        int number = scanner.nextInt();
        for (int i = 1; i < number; i++){
            if (number % i == 0){
                total += i;
            }
        }
        if(total == number){
            System.out.println(number + " is a perfect number.");
        }else {
            System.out.println(number + " is not a perfect number.");
        }
    }
}
import java.util.Scanner;

public class InputOutput{
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int y = scanner.nextInt();
        int x= scanner.nextInt();
        System.out.println("the value of x is :"+x+ " The value of y"+y);
        scanner.close();
    }
}
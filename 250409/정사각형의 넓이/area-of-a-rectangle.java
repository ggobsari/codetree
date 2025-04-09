import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = n * n;

        System.out.println(result);

        if (n < 5){
            System.out.println("tiny");
        }
    }
}
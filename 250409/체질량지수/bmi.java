import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int h = sc.nextInt();
        int w = sc.nextInt();

        int b = w / ((h / 100) * (h / 100))

        System.out.println(b)

        if (b >= 25){
            System.out.println("Obesity");
        }
    }
}
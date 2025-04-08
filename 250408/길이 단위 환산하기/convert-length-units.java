import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        double ft = sc.nextDouble();

        double result = ft * 30.48;

        System.out.printf("%.1f", result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int sum = 0;

        for (int i = 0; i < n; i++){
            int num = sc.nextInt();

            sum += num;
        }

        double avg = (double) sum / n;

        System.out.printf("%d %.1f", sum, avg);

    }
}
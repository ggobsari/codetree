import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int cnt = 0;

        for (int i = a; i <= b; i++){
            if (i % 5 == 0 || i % 7 == 0){
                sum += i;
                cnt++;
            }
        }

        double avg = (double) sum / cnt;

        System.out.printf("%d %.1f", sum, avg);
    }
}
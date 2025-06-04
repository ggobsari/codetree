import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int evenSum = 0;

        int threeMultipleSum = 0;

        int cnt = 0;

        for (int i = 1; i <= 10; i++){
            int n = sc.nextInt();

            if (i % 2 == 0){
                evenSum += n;
            }

            if (i % 3 == 0){
                threeMultipleSum += n;
                cnt++;
            }
        }

        double avg = (double) threeMultipleSum / cnt;

        System.out.printf("%d %.1f", evenSum, avg);
    }
}
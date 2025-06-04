import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int oddSum = 0;
        int evenSum = 0;

        for (int i = 1; i <= 10; i++){
            int n = sc.nextInt();

            if (i % 2 == 1){
                oddSum += n;
            } else {
                evenSum += n;
            }
        }

        System.out.print(oddSum - evenSum >= 0 ? oddSum - evenSum : evenSum - oddSum);
        
    }
}
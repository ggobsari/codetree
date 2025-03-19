import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++){
            int sum = 1;
            for (int j = 1; j <= i; j++){
                System.out.print(sum);
                sum++;
            }
            System.out.println();
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        for (int i = 1; i <= n; i++){
            if (i % 2 == 0 || i % 3 == 0 || i % 5 == 0){
                result++;
            }
        }

        System.out.print(n - result);
    }
}
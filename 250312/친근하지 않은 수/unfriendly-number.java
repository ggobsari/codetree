import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;

        for (int i = 1; i <= n; i++){
            if (n % 2 == 0 || n % 3 == 0 || n % 5 == 0){
                result++;
            }
        }

        System.out.print(result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();

        int result = 0;
        int cnt = 0;

        for (int i = start; i <= end; i++){
            for (int j = 1; j <= i; j++){
                if (i % j == 0){
                    cnt++;
                }
            }
            if (cnt == 3){
                result++;
            }
            cnt = 0;
        }

        System.out.print(result);
    }
}
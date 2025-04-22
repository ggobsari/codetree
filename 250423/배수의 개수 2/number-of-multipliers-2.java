import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt = 0;

        for (int i = 0; i < n; i++){
            int n = sc.nextInt();

            if (n % 2 == 1){
                cnt++;
            }
        }

        System.out.print(cnt);


    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            int cnt = i + 1;
            for (int j = 0; j < cnt; j++){
                System.out.print("*");
                cnt += 2;
            }
            System.out.println();
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int cnt3 = 0;
        int cnt5 = 0;

        for (int i = 0; i < 10; i++){
            int n = sc.nextInt();

            if (n % 3 == 0){
                cnt3++;
            }

            if (n % 5 == 0){
                cnt5++;
            }
        }

        System.out.print(cnt3 + " " + cnt5);


    }
}
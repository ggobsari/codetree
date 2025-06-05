import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        
        int cnt = 1;

        int fiveMulti = 0;

        while (true){
            if (fiveMulti == 2){
                break;
            }

            n *= cnt;
            cnt++;

            System.out.print(n + " ");

            if (n % 5 == 0){
                fiveMulti++;
            }

        }
    }
}
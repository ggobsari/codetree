import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        
        // Please write your code here.
        System.out.println(N);
        while (N != 0){
            if (N / M == 0){
                break;
            }
            N /= M;
            System.out.println(N);
        }
    }
}

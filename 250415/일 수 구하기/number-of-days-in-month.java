import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int result = 0;
        
        if (n % 2 == 1 && n <= 7){
            result = 31;
        } else if (n % 2 == 0 && n <= 7){
            result = 30;
            if (n == 2){
                result = 28;
            }
        } else if (n % 2 == 0 && n > 7){
            result = 31
        } else if (n % 2 == 1 && n > 7){
            result = 30;
        }

        System.out.print(result);
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = a;

        System.out.print(result + " ");

        while(true){
            if (result > b){
                break;
            }

            if (result % 2 == 1){
                result *= 2;
            } else if (result % 2 == 0){
                result += 3;
            }

            System.out.print(result + " ");
        }
    }
}
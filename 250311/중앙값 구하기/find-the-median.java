import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        if (a < b && b < c){
            System.out.print(b);
        } else if (a > b && a < c){
            System.out.print(a);
        } else if (c > a && c < b){
            System.out.print(c);
        }

    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.prinln(a + b + c);
        System.out.prinln((a + b + c) / 3);
        System.out.prinln((a + b + c) - (a+b+c)/3);
    }
}
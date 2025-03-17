import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int result = 0;

        System.out.print(a + " ");
        for (int i = a; i <= b;) {
            if (i % 2 == 0)
                i += 3;
            else
                i *= 2;
            
            if (i <= b)
                System.out.print(i + " ");
        }
    }
}
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        String[] str = c.split(":");

        System.out.print(((int)str[0] + 1) + ":" + str[1]);
    }
}
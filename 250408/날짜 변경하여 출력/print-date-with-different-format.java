import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String c = sc.next();

        String[] str = c.split(".");

        System.out.print(str[1] + "-" + str[2] + "-" + str[0]);
    }
}
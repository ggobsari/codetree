import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        int minus = 100 - a + 1;

        for (int i = 0; i < minus; i++){
            if (a >= 90){
                System.out.print("A" + " ");
                a++;
            } else if (a >= 80){
                System.out.print("B" + " ");
                a++;
            } else if (a >= 70){
                System.out.print("C" + " ");
                a++;
            } else if (a >= 60){
                System.out.print("D" + " ");
                a++;
            } else if (a < 60){
                System.out.print("F" + " ");
                a++;
            }
        }
    }
}
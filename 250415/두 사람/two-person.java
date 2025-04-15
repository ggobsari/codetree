import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int aAge = sc.nextInt();
        int aGender = sc.nextInt();
        int bAge = sc.nextInt();
        int bGender = sc.nextInt();

        if (aAge >= 19 && aGender.equal("M")){
            System.out.print(1);
        } else if (bAge >= 19 && bGender.equal("M")){
            System.out.print(1);
        } else {
            System.out.print(0);
        }
    }
}
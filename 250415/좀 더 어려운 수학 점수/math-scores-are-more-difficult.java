import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int aEnglish = sc.nextInt();
        int aMath = sc.nextInt();
        int bEnglish = sc.nextInt();
        int bMath = sc.nextInt();

        if (aMath > bMath){
            System.out.print("A");
        } else if (bMath > aMath){
            System.out.print("B");
        } else if (aMath == bMath && aEnglish > bEnglish){
            System.out.print("A");
        } else if (aMath == bMath && aEnglish < bEnglish){
            System.out.print("B");
        }
    }
}
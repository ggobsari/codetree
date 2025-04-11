import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        String n = sc.next();
        
        if (n == 'S'){
            System.out.print("Superior");
        } else if (n == 'A'){
            System.out.print("Excellent");
        } else if (n == 'B'){
            System.out.print("Good");
        } else if (n == 'C') {
            System.out.print("Usually");
        } else if (n == 'D') {
            System.out.print("Effort");
        } else {
            System.out.print("Failure");
        }
    }
}
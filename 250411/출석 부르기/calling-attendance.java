import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        
        if (a == 1){
            System.out.print("John");
        } else if (a == 2){
            System.out.print("Tom");
        } else {
            System.out.print("Paul");
        }
    }
}
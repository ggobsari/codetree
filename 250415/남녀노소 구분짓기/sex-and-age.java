import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Please write your code here.

        Scanner sc = new Scanner(System.in);

        int gender = sc.nextInt();
        int age = sc.nextInt();

        String result = "";

        if (gender == 0){
            if (age >= 19){
                result = "MAN";
            } else {
                result = "BOY";
            }
        } else {
            if (age >= 19){
                result = "WOMAN";
            } else {
                result = "GIRL";
            }
        }
        System.out.print(result);
    }
}
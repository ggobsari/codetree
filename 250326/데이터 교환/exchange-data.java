public class Main {
    public static void main(String[] args) {
        // Please write your code here.
        int a = 5;
        int b = 6;
        int c = 7;
        
        int temp1 = a;
        int temp2 = b;
        a = c;
        b = temp1;
        c = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
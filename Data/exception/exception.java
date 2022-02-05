package Data.exception;
import java.util.Scanner;       
public class exception  {
    
    
    public static void main(String[] args) {
    try (Scanner sc = new Scanner(System.in)) {
        while (true) {
                System.out.println("Enter two numbers");
                int n1 = sc.nextInt();
                int n2 = sc.nextInt();
                try {
                        int s = div(n1, n2);
                        System.out.println("The result is: "+s);
                        break;
                } catch (ArithmeticException e) {
                        System.out.println(e.getMessage());
                        System.out.println("Try again");
                }
        }
    }
}

public static int div(int n1, int n2) throws ArithmeticException {
    return n1 / n2;
}

}
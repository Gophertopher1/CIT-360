import java.util.Scanner;

public class Data {
        public static void main(String[] args) {
                try (Scanner sc = new Scanner(System.in)) {
                    int n1, n2;
                    while (true) {
                            System.out.println("Enter two numbers");
                            n1 = sc.nextInt();
                            n2 = sc.nextInt();
                            if (n2 != 0)
                                    break;
                            else
                                    System.out.println("Invalid..Try again");
                    } 
                    int s = div(n1, n2);
                    System.out.println("The result is: " + s);
                } catch (ArithmeticException e) {
                    
                    e.printStackTrace();
                }
        }

        public static int div(int n1, int n2) throws ArithmeticException {
                return n1 / n2;
        }
}
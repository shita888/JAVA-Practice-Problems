import java.util.Scanner;

public class SquareDescendingRowI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

    public static void run(Scanner sc) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--) {
            for (int j = n; j >= 1; j--) {
                System.out.print(i + " ");
            }
            System.out.println();
        }
    }
}

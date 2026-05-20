import java.util.Scanner;

public class DiagonalNumberSquare {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

    public static void run(Scanner sc) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == j) {
                    System.out.print(i + " ");
                } else {
                    System.out.print("1 ");
                }
            }
            System.out.println();
        }
    }
}

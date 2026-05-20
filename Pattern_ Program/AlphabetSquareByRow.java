import java.util.Scanner;

public class AlphabetSquareByRow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

    public static void run(Scanner sc) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int endChar = 64 + n;
        for (int i = 65; i <= endChar; i++) {
            for (int j = 65; j <= endChar; j++) {
                System.out.print((char) i + " ");
            }
            System.out.println();
        }
    }
}

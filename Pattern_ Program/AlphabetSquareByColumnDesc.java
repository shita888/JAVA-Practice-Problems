import java.util.Scanner;

public class AlphabetSquareByColumnDesc {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        run(sc);
        sc.close();
    }

    public static void run(Scanner sc) {
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int endChar = 64 + n;
        for (int i = endChar; i >= 65; i--) {
            for (int j = endChar; j >= 65; j--) {
                System.out.print((char) j + " ");
            }
            System.out.println();
        }
    }
}

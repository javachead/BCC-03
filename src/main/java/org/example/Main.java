import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean validOperation = false;

        while (!validOperation) {

            System.out.print("携帯電話番号を入力してください: ");
            String phoneNumber = scanner.nextLine();

            if (phoneNumber.matches("(050|070|080|090)-?\\d{4}-?\\d{4}$")) {
                System.out.println(phoneNumber + " は有効な電話番号です。\n");
                validOperation = true;
            } else {
                System.out.println(phoneNumber + " は無効な電話番号です。");
            }
        }

        scanner.close();
    }
}

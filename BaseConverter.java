import java.util.Scanner;

public class BaseConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Entrez le nombre à convertir : ");
        String number = scanner.nextLine();

        System.out.print("Entrez la base actuelle du nombre : ");
        int base_b1 = scanner.nextInt();

        System.out.print("Entrez la base dans laquelle vous voulez convertir le nombre : ");
        int base_b2 = scanner.nextInt();

        String result = convertBase(number, base_b1, base_b2);
        System.out.println("Le nombre " + number + " en base " + base_b1 + " est équivalent à " + result + " en base "
                + base_b2 + ".");

        scanner.close();
    }

    public static String convertBase(String number, int b1, int b2) {
        int decimalNum = Integer.parseInt(number, b1);

        // StringBuilder convertedNum = new StringBuilder();
        String convertedNum = "";

        while (decimalNum > 0) {
            int remainder = decimalNum % b2;
            convertedNum = remainder + String.valueOf(decimalNum);
            decimalNum /= b2;
        }

        return convertedNum.toString();
    }
}

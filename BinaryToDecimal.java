import java.util.Scanner;


public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter Binary Number: (0 and 1 only)");
        long binary = input.nextLong();
        long decimal = 0;
        int length = (int) Math.log10(binary) + 1;
        int digit;

        for (int i = 0; i < length; i++) {
            //digit = (int) (binary % (Math.pow(10, length - i - 1)));
            //digit = (int) Math.round((double) binary / Math.pow(10, i + 1));
            digit = (int) Math.round(((double) binary / Math.pow(10, i)) % 10);
            decimal += digit * Math.pow(2, i);
        }
        System.out.printf("%d converted to decimal is: %d\n", binary, decimal);
    }
}
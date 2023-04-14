import java.util.Scanner;

public class sıralama {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int sayi = input.nextInt();

        for (int i = 1; i <= sayi; i++) {
            if (i % 4 == 0) {
                System.out.println(i + " = 4^" + (int) (Math.log(i) / Math.log(4)));
            }

            if (i % 5 == 0) {
                System.out.println(i + " = 5^" + (int) (Math.log(i) / Math.log(5)));
            }
        }
    }
}
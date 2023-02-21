import java.util.Scanner;
/*
Klavyeden girilen bir sayının mükemmel sayı olup/olmadığını bulan ve sayı mükemmel sayı ise ekrana “mükemmel sayıdır.” değilse “mükemmel sayı değildir.” ifadelerini ekrana yazan programı Java dilinde yazınız.

Mükemmel Sayı Nedir ?
Bir sayının kendisi hariç pozitif tam sayı çarpanları (kalansız bölen sayıların)
toplamı kendisine eşit olan sayıya mükemmel sayı denir.

Senaryolar
Bir sayı giriniz: 28
28 Mükemmel sayıdır
Bir sayı giriniz: 1
1 Mükemmel sayı değildir.
Bir sayı giriniz: 496
496 Mükemmel sayıdır
 */

public class Perfect_Number {
    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int storage = 0;
        for (int i=1; i<n; i++) {
            if (n % i == 0) {
                storage += i;

            }
        }
        if (storage == n) {
            System.out.println(n + " bir mükemmel sayıdır.");
        } else {
            System.out.println(n + " bir mükemmel sayı değildir.");
        }
    }
}

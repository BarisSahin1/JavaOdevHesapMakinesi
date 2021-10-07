package JavaOdev;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int select;

        double sayi1,sayi2;

        System.out.println("Hesaplamak istediginiz sayilari giriniz :");
        System.out.println("İlk sayiyi giriniz :");

        sayi1 = scanner.nextDouble();
        System.out.println("İkinci sayiyi giriniz :");
        sayi2 = scanner.nextDouble();

        System.out.println("Yapmak istediginiz islemi seciniz.");
        System.out.println(" 1.Toplama\n 2.Carpma \n 3.Cıkarma \n 4.bolme");
        select = scanner.nextInt();



        switch(select){

            case 1:
                System.out.println("Sayilarin toplam degeri = " + (sayi1 + sayi2) );
                break;
            case 2:
                System.out.println("Sayilarin Carpim degeri = " + (sayi1 * sayi2) );
                break;
            case 3:
                System.out.println("Sayilarin cikarma degeri = " + (sayi1 - sayi2));
                break;
            case 4:
                System.out.println("Sayilarin bolme degeri = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("Gecerli bir secenek girmediniz.");
        }

    }
}

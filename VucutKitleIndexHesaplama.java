package Giris;

import java.util.Scanner;

public class VucutKitleIndexHesaplama {
    public static void main(String[] args) {

        // Değişkenleri tanımlıyoruz.
        double boy , kilo , vucutKitleIndexi ;

        // Scanner sınıfı değişkenimizi tanımlıyoruz.
        Scanner giris = new Scanner(System.in);

        // Kullanıcıdan veri girişi işlemlerini yapıyoruz.
        System.out.print("Lütfen boyunuzu giriniz ( metre ) : ");
        boy = giris.nextDouble() ;
        System.out.print("Lütfen kilonuzu giriniz : ");
        kilo = giris.nextDouble();

        // Hesaplamaları yapıyoruz.
        vucutKitleIndexi = kilo / ( boy * boy ) ;

        // Ekrana yazdırma işlemlerini yapıyoruz.
        System.out.println("Vücut Kitle Indeksiniz : " + vucutKitleIndexi);

    }
}

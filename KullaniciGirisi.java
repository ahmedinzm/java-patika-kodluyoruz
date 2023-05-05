import java.util.Objects;
import java.util.Scanner;
public class KullaniciGirisi {
    public static void main(String[] args) {
        String sifre,kAdi,secim,yeniSifre;
        Scanner scanner = new Scanner(System.in);


        System.out.println("Kullanıcı adı giriniz: ");
        kAdi = scanner.nextLine();

        System.out.println("Şifre giriniz: ");
        sifre = scanner.nextLine();

        if (kAdi.equals("patika") && sifre.equals("java123")) {
            System.out.println("Giriş Başarılı.");
        }
        else{
            System.out.println("Girdiğiniz şifre yanlış. Şifreyi sıfırlamak istiyorsanız evet yazın");
            secim = scanner.nextLine();
            if (secim.equals("evet")){
                System.out.println("Yeni Şifre Giriniz: ");
                yeniSifre = scanner.nextLine();
                if (yeniSifre.equals(sifre) && yeniSifre.equals("")){
                    System.out.println("Girdiğiniz şifre eski şifreyle aynı olmamalı veya boş olmamalıdır.");
                }else {
                    System.out.println("Şifre değiştirildi.");
                }
            }
        }


    }
}

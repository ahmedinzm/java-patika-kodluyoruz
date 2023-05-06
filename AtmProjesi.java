import java.util.Scanner;
public class AtmProjesi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String kullaniciAdi,sifre;
        int hak = 3;
        int bakiye = 2500;
        int secim;

        while (hak >0) {
            System.out.println("Kullanıcı adınızı girin: ");
            kullaniciAdi = scanner.nextLine();
            System.out.println("Parola girin");
            sifre = scanner.nextLine();

            if (kullaniciAdi.equals("karakas") && sifre.equals("123")) {
                System.out.println("Giriş başarılı. \n Karakas bankasına hoş geldiniz");
                do {
                    System.out.println("Yapmak istediğiniz işlemi seçiniz. ");
                    System.out.println("1-Para yatırma");
                    System.out.println("2-Para çekme");
                    System.out.println("3-Bakiye sorgulama");
                    System.out.println("4-Çıkış");
                    secim = scanner.nextInt();

                    switch (secim){
                        case 1:
                            System.out.print("Yatırmak istediğiniz tutarı yazın: ");
                            int para = scanner.nextInt();
                            System.out.println("İşlem öncesi tutar: " + bakiye);
                            System.out.println("Güncel bakiye: " + (bakiye=bakiye+para));
                            System.out.println("Yatırılan tutar:" + para);
                            break;
                        case 2:
                            System.out.print("Çekmek istediğiniz tutarı yazın: ");
                            para = scanner.nextInt();

                            if (para > bakiye) {
                                System.out.println("Yetersiz bakiye !");
                                System.out.println("Bakiyeniz: " + bakiye);
                            }else {
                                System.out.println("Güncel bakiye: "+ (bakiye = bakiye-para ));
                                System.out.println("Çekilen tutar: " + para);
                            }
                            break;

                        case 3:
                            System.out.println("Bakiyeniz: " + bakiye);
                            break;
                    }
                }while (secim != 4);
                System.out.println("Sistemden Çıkış yapıldı.");
                break;
            }else {
                --hak;

            } if (hak == 0) {
                System.out.println("Hesabınız bloke olmuştur banka ile iletişime geçiniz.");
            }else {
                System.out.println("Kalan hakkınız: " + hak);
            }
        }
    }
}

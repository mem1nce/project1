import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Değişkenleri oluşturalım
        int mat, fizik, kimya, turkce, tarih, muzik;

        // Scanner sınıfımızı tanımlayalım
        Scanner inp = new Scanner(System.in);

        // Kullanıcıdan değerleri alalım
        System.out.print("Matematik notunuzu giriniz: ");
        mat = inp.nextInt();

        System.out.print("Fizik notunuzu giriniz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuzu giriniz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuzu giriniz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuzu giriniz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu giriniz: ");
        muzik = inp.nextInt();

        // Notların toplamını hesaplayalım
        int toplam = (mat + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;

        // Sonucu ekrana yazdıralım
        System.out.printf("Ortalamanız: %.2f\n", sonuc);

        // Ternary operatör ile başarı durumu
        String durum = (sonuc >= 60) ? "Sınıfı Geçtiniz" : "Sınıfta Kaldınız";
        System.out.println(durum);
    }
}

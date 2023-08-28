import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        System.out.println("Pratik - Girilen Sayıdan Küçük Dört'ün ve Beş'in Kuvvetlerini Bulan Program");
        int n,sayac=-1,sayac2=-1;
        Scanner imp=new Scanner(System.in);
        System.out.print("Sayı giriniz : ");
        n=imp.nextInt();
        System.out.println("Girilen Sayıdan Küçük Olan Dört'ün Kuvetleri");
        for (int i = 1; i <= n; i *= 4) {
            sayac++;
            System.out.println(sayac+".Kuvveti : "+i);

        }System.out.println("Girilen Sayıdan Küçük Olan Beş'in Kuvetleri");
        for (int i = 1; i <= n; i *= 5) {
            sayac2++;
            System.out.println(sayac2+".Kuvveti : "+i);
        }
    }
}
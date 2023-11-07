package homework3;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scanner = new Scanner(System.in);
        int dogruCevaplar = 0;

        String[] sorular = {
                "1. Küresel ısınma hangi faktörlerden etkilenir?\n"
                + "A) Sadece insan faaliyetleri\n"
                + "B) Yalnızca doğal faktörler\n"
                + "C) İnsan faaliyetleri ve doğal faktörler\n"
                + "D) Hiçbir faktörden etkilenmez",
                "2. Hangi gaz küresel ısınmaya en fazla katkı sağlar?\n"
                + "A) Karbondioksit (CO2)\n"
                + "B) Azot oksit (NOx)\n"
                + "C) Metan (CH4)\n"
                + "D) Hidrojen (H2",
                "3. Hangi bölge küresel ısınma nedeniyle deniz seviyelerinin yükselmesine en fazla maruz kalır?\n"
                + "A) İç bölgeler\n"
                + "B) Kutup bölgeleri\n"
                + "C) Ormanlar\n"
                + "D) Çöller",
                "4. Hangi enerji kaynağı, karbon ayak izini azaltmak için tercih edilir?\n"
                + "A) Kömür\n"
                + "B) Petrol\n"
                + "C) Güneş enerjisi\n"
                + "D) Doğalgaz",
                "5. Küresel ısınmanın etkilerinden biri aşağıdakilerden hangisi değildir?\n"
                + "A) Artan deniz seviyeleri\n"
                + "B) Sıcak hava dalgaları\n"
                + "C) Artan buzullar\n"
                + "D) Kuraklık ve su kaynaklarının azalması"
            };

        String[] cevaplar = {"C", "A", "B", "C", "C"};

        for (int i = 0; i < sorular.length; i++) {
            System.out.println(sorular[i]);
            String cevap = scanner.nextLine().toUpperCase();
            if (cevap.equals(cevaplar[i])) {
                dogruCevaplar++;
            }
        }

        if (dogruCevaplar == 5) {
            System.out.println("Mükemmel");
        } else if (dogruCevaplar == 4) {
            System.out.println("Çok iyi");
        } else {
            System.out.println("Küresel ısınma hakkındaki bilgilerinizi tazeleme zamanı");
        }

        scanner.close();
    }
}
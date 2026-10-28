package MidtermTest;

import java.util.Scanner;

public class midTermTest13 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // koefisien kalori untuk masing-masing aktivitas
        double Lari = 0.07;
        double Renang = 0.08;
        double Sepeda = 0.09;

        int ketinggianTempat;
        int beratBadan;
        double targetKaloriHarian;
        double durasiLari;
        double durasiRenang;
        double durasiSepeda;
        double kecepatanLari;
        double kecepatanRenang;
        double kecepatanSepeda;
        double kaloriLari;
        double kaloriRenang;
        double kaloriSepeda;
        double totalKalori;
        double totalDurasi;
        double rataRataKaloriPerMenit;
        double persentaseCapaian;
        char pilihan;

        System.out.print("Masukkan ketinggian tempat (dalam meter): ");
        ketinggianTempat = input.nextInt();

        System.out.print("Masukkan berat badan (dalam kg): ");
        beratBadan = input.nextInt();

        System.out.print("Masukkan target kalori harian atlet: ");
        targetKaloriHarian = input.nextDouble();

        System.out.print("Masukkan durasi lari (dalam menit): ");
        durasiLari = input.nextDouble();
        System.out.print("Masukkan kecepatan lari (dalam km/jam): ");
        kecepatanLari = input.nextDouble();

        System.out.print("Masukkan durasi renang (dalam menit): ");
        durasiRenang = input.nextDouble();
        System.out.print("Masukkan kecepatan renang (dalam km/jam): ");
        kecepatanRenang = input.nextDouble();

        System.out.print("Masukkan durasi sepeda (dalam menit): ");
        durasiSepeda = input.nextDouble();
        System.out.print("Masukkan kecepatan sepeda (dalam km/jam): ");
        kecepatanSepeda = input.nextDouble();

        kaloriLari = hitungKalori(durasiLari, Lari, beratBadan, kecepatanLari, ketinggianTempat);
        kaloriRenang = hitungKalori(durasiRenang, Renang, beratBadan, kecepatanRenang, ketinggianTempat);
        kaloriSepeda = hitungKalori(durasiSepeda, Sepeda, beratBadan, kecepatanSepeda, ketinggianTempat);

        totalDurasi = durasiLari + durasiRenang + durasiSepeda;
        totalKalori = kaloriLari + kaloriRenang + kaloriSepeda;
        rataRataKaloriPerMenit = totalDurasi > 0 ? totalKalori / totalDurasi : 0;
        persentaseCapaian = targetKaloriHarian > 0 ? (totalKalori / targetKaloriHarian) * 100 : 0;

        System.out.println("Pilih hasil yang ingin ditampilkan:");
        System.out.println("A. Kalori terbakar tiap aktifitas");
        System.out.println("B. Kalori terbakar dari semua aktifitas");
        System.out.println("C. Rata-rata kalori per menit");
        System.out.println("D. Persentase capaian terhadap target kalori harian atlet");
        System.out.print("Pilihan (A-D): ");
        pilihan = input.next().toUpperCase().charAt(0);

        System.out.println("--- Hasil Perhitungan Kalori ---");
        switch (pilihan) {
            case 'A':
                System.out.printf("Kalori terbakar lari: %.2f%n", kaloriLari);
                System.out.printf("Kalori terbakar renang: %.2f%n", kaloriRenang);
                System.out.printf("Kalori terbakar sepeda: %.2f%n", kaloriSepeda); 
                break;
            case 'B':
                System.out.printf("Total kalori terbakar dari semua aktivitas: %.2f%n", totalKalori);
                break;
            case 'C':
                System.out.printf("Rata-rata kalori terbakar tiap menit: %.2f%n", rataRataKaloriPerMenit);
                break;
            case 'D':
                System.out.printf("Persentase capaian terhadap target kalori harian atlet: %.2f%%%n", persentaseCapaian);
                break;
            default:
                System.out.println("Pilihan tidak valid. Masukkan A, B, C, atau D.");
                break;
        }

        if (persentaseCapaian >= 100) {
            System.out.println("Selamat! Atlet telah mencapai target kalori harian.");
        } else {
            System.out.println("Atlet belum mencapai target kalori harian.");
        }


        input.close();
    }

    // rumus utama perhitungan kalori: durasi × koefisien × berat badan + kecepatan × 0.5 + ketinggian × 0.1
    private static double hitungKalori(double durasi, double koefisien, int beratBadan, double kecepatan, int ketinggianTempat) {
        return (durasi * koefisien * beratBadan) + (kecepatan * 0.5) + (ketinggianTempat * 0.1);
    }

}
    
package projekpbo;

import java.util.InputMismatchException; // Import untuk menangani kesalahan input
import java.util.Scanner;
import projekpbo.BangunDatar.*; // Pastikan kelas Persegi ada di sini
// import projekpbo.BangunRuang.*; // Uncomment jika sudah ada kelas bangun ruang

public class Projekpbo {


    public static void main(String[] args) {
        // Menggunakan try-with-resources agar Scanner otomatis ditutup
        try (Scanner input = new Scanner(System.in)) {
            int pilihan;
            do {
                System.out.println("\n=== Program Perhitungan Benda Geometri ===");
                System.out.println("1. Hitung dinamis bangun datar");
                System.out.println("2. Hitung dinamis bangun ruang");
                System.out.println("3. Hitung keseluruhan bangun"); 
                System.out.println("4. Exit");
                System.out.print("Masukkan pilihan anda : ");

                try {
                    pilihan = input.nextInt();

                    switch (pilihan) {
                        case 1:
                            System.out.println("\n=== Bangun Datar ===");
                            System.out.println("1. Segitiga");
                            System.out.println("2. Jajar Genjang");
                            System.out.println("3. Belah Ketupat");
                            System.out.println("4. Persegi Panjang");
                            System.out.println("5. Layang-Layang");
                            System.out.println("6. Persegi");
                            System.out.println("7. Trapesium (Belum Implementasi)");
                            System.out.println("8. Lingkaran (Belum Implementasi)");
                            System.out.println("9. Juring Lingkaran (Belum Implementasi)");
                            System.out.println("10. Tembereng Lingkaran (Belum Implementasi)");
                            System.out.print("Masukkan pilihan bangun datar : ");
                            int pilihanBangunDatar = input.nextInt();

                            switch (pilihanBangunDatar) {
                                case 1:
                                    System.out.println("\n--- Menghitung Segitiga ---");

                                    System.out.print("Masukkan nilai alas segitiga : ");
                                    double alas = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi segitiga : ");
                                    double tinggi = input.nextDouble();

                                    Segitiga segitiga = new Segitiga(alas,tinggi);
                                    System.out.println("Luas Segitiga = " + segitiga.hitungLuas());
                                    System.out.println("Keliling Segitiga = " + segitiga.hitungKeliling());
                                    break;
                                case 2:
                                    System.out.println("\n--- Menghitung JajarGenjang ---");

                                    System.out.print("Masukkan nilai alas JajarGenjang : ");
                                    double alasJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi JajarGenjang : ");
                                    double tinggiJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A JajarGenjang : ");
                                    double sisiAJajarGenjang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B JajarGenjang : ");
                                    double sisiBJajarGenjang = input.nextDouble();

                                    JajarGenjang jajarGenjang = new JajarGenjang(alasJajarGenjang,tinggiJajarGenjang,sisiAJajarGenjang,sisiBJajarGenjang);
                                    System.out.println("Luas JajarGenjang = " + jajarGenjang.hitungLuas());
                                    System.out.println("Keliling JajarGenjang = " + jajarGenjang.hitungKeliling());
                                case 3:
                                    System.out.println("\n--- Menghitung BelahKetupat ---");

                                    System.out.print("Masukkan nilai alas BelahKetupat : ");
                                    double diagonal1BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi BelahKetupat : ");
                                    double diagonal2BelahKetupat = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi BelahKetupat : ");
                                    double sisiBelahKetupat = input.nextDouble();

                                    BelahKetupat belahKetupat = new BelahKetupat(diagonal1BelahKetupat,diagonal2BelahKetupat,sisiBelahKetupat);
                                    System.out.println("Luas BelahKetupat = " + belahKetupat.hitungLuas());
                                    System.out.println("Keliling BelahKetupat = " + belahKetupat.hitungKeliling());
                                case 4:
                                    System.out.println("\n--- Menghitung PersegiPanjang ---");

                                    System.out.print("Masukkan nilai panjang PersegiPanjang : ");
                                    double panjangPersegiPanjang = input.nextDouble();

                                    System.out.print("Masukkan nilai lebar PersegiPanjang : ");
                                    double lebarPersegiPanjang = input.nextDouble();

                                    PersegiPanjang persegiPanjang = new PersegiPanjang(panjangPersegiPanjang,lebarPersegiPanjang);
                                    System.out.println("Luas PersegiPanjang = " + persegiPanjang.hitungLuas());
                                    System.out.println("Keliling PersegiPanjang = " + persegiPanjang.hitungKeliling());
                                case 5:
                                    System.out.println("\n--- Menghitung LayangLayang ---");

                                    System.out.print("Masukkan nilai alas LayangLayang : ");
                                    double diagonal1LayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai tinggi LayangLayang : ");
                                    double diagonal2LayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi A LayangLayang : ");
                                    double sisiALayangLayang = input.nextDouble();

                                    System.out.print("Masukkan nilai sisi B LayangLayang : ");
                                    double sisiBLayangLayang = input.nextDouble();

                                    LayangLayang layangLayang = new LayangLayang(diagonal1LayangLayang,diagonal2LayangLayang,sisiALayangLayang, sisiBLayangLayang);
                                    System.out.println("Luas LayangLayang = " + layangLayang.hitungLuas());
                                    System.out.println("Keliling LayangLayang = " + layangLayang.hitungKeliling());
                                case 6:
                                    System.out.println("\n--- Menghitung Persegi ---");
                                    System.out.print("Masukkan nilai sisi persegi : ");
                                    double sisi = input.nextDouble();
                                    Persegi persegi = new Persegi(sisi);
                                    System.out.println("Luas Persegi = " + persegi.hitungLuas());
                                    System.out.println("Keliling Persegi = " + persegi.hitungKeliling());
                                    break;
                                case 7:
                                    System.out.println("\n--- Menghitung Trapesium ---");
                                    System.out.print("Masukkan nilai alas atas trapesium : ");
                                    double alasAtasTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai alas bawah trapesium : ");
                                    double alasBawahTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai sisi miring  trapesium : ");
                                    double sisiMiringTrapesium = input.nextDouble();
                                    System.out.print("Masukkan nilai tinggi trapesium : ");
                                    double tinggiTrapesium = input.nextDouble();
                                    Trapesium trapesium = new Trapesium(alasAtasTrapesium, alasBawahTrapesium, sisiMiringTrapesium, tinggiTrapesium);
                                    System.out.println("Luas Trapesium = " + trapesium.hitungLuas());
                                    System.out.println("Keliling Trapesium = " + trapesium.hitungKeliling());
                                    break;
                                case 8:
                                    System.out.println("\n--- Menghitung Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran = input.nextDouble();
                                    
                                    Lingkaran lingkaran = new Lingkaran(jariJariLingkaran);
                                    System.out.println("Luas Lingkaran = " + lingkaran.hitungLuas());
                                    System.out.println("Keliling Lingkaran = " + lingkaran.hitungKeliling());
                                    break;
                                case 9:
                                    System.out.println("\n--- Menghitung Juring Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran_juring = input.nextDouble();
                                    
                                    System.out.print("Masukkan nilai sudut Juring Lingkaran : ");
                                    double sudutJuring = input.nextDouble();
                                    
                                    JuringLingkaran juringLingkaran = new JuringLingkaran(jariJariLingkaran_juring, sudutJuring);
                                    System.out.println("Luas Juring Lingkaran = " + juringLingkaran.hitungLuas());
                                    System.out.println("Keliling Juring Lingkaran = " + juringLingkaran.hitungKeliling());
                                    break;
                                case 10:
                                    System.out.println("\n--- Menghitung Tembereng Lingkaran ---");
                                    System.out.print("Masukkan nilai jari-jari Lingkaran : ");
                                    double jariJariLingkaran_tembereng = input.nextDouble();
                                    
                                    System.out.print("Masukkan nilai sudut Tembereng Lingkaran : ");
                                    double sudutTembereng = input.nextDouble();
                                    
                                    TemberengLingkaran temberengLingkaran = new TemberengLingkaran(jariJariLingkaran_tembereng, sudutTembereng);
                                    System.out.println("Luas Tembereng Lingkaran = " + temberengLingkaran.hitungLuas());
                                    System.out.println("Keliling Tembereng Lingkaran = " + temberengLingkaran.hitungKeliling());
                                    break;
                                default:
                                    System.out.println("Pilihan bangun datar tidak valid.");
                            }
                            break; 
                        case 2:
                            System.out.println("=== Bangun Ruang ===");
                            System.out.println("Fitur bangun ruang belum diimplementasikan.");
                            // Implementasi bangun ruang
                            break;
                        case 3:
                            System.out.println("=== Hitung Keseluruhan ===");
                            System.out.println("Fitur hitung keseluruhan belum diimplementasikan.");
                            // Implementasi keseluruhan
                            break;
                        case 4:
                            System.out.println("Keluar dari program. Terima kasih!");
                            break;
                        default:
                            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Input tidak valid. Harap masukkan angka sesuai pilihan.");
                    input.nextLine(); // Membersihkan buffer scanner dari input yang salah
                    pilihan = 0; // Reset pilihan agar loop berlanjut
                }
            } while (pilihan != 4);

        } // Scanner akan otomatis ditutup di sini
        System.out.println("Program telah berakhir.");
    }
}
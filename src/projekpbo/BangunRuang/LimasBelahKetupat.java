package projekpbo.BangunRuang;

import projekpbo.BangunDatar.BelahKetupat;

public class LimasBelahKetupat extends BangunRuang {
    private BelahKetupat alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasBelahKetupat(double diagonal1, double diagonal2, double sisi, double tinggi) {
        this.alas = new BelahKetupat(diagonal1, diagonal2, sisi);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double setengahDiagonal1 = alas.getDiagonal1() / 2.0;
        double setengahDiagonal2 = alas.getDiagonal2() / 2.0;
        double tinggiSegitiga = Math.sqrt(tinggi * tinggi + setengahDiagonal1 * setengahDiagonal2);
        double luasSegitiga = 0.5 * alas.getSisi() * tinggiSegitiga;
        luasPermukaan =  luasAlas + 4 * luasSegitiga;
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        volume =  (1.0 / 3.0) * alas.hitungLuas() * tinggi;
        return volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

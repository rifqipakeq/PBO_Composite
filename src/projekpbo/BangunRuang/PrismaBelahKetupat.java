package projekpbo.BangunRuang;

import projekpbo.BangunDatar.BelahKetupat;

public class PrismaBelahKetupat extends BangunRuang {
    private BelahKetupat alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaBelahKetupat(double diagonal1, double diagonal2, double sisi, double tinggi) {
        this.alas = new BelahKetupat(diagonal1, diagonal2, sisi);
        this.tinggi = tinggi;
         this.volume = hitungVolume();
         this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  alas.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan =  2 * alas.hitungLuas() + alas.hitungKeliling() * tinggi;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

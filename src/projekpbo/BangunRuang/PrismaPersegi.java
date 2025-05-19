package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Persegi;

public class PrismaPersegi extends BangunRuang {
    private Persegi alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaPersegi(double sisi, double tinggi) {
        this.alas = new Persegi(sisi);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume  =  alas.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = 2 * alas.hitungLuas() + alas.hitungKeliling() * tinggi;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public Persegi getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
}

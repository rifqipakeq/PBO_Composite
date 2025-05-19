package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Persegi;

public class Kubus extends BangunRuang {
    private Persegi sisi;
    private double volume;
    private double luasPermukaan;

    public Kubus(Persegi sisi) {
        this.sisi = sisi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public Persegi getSisi() {
        return sisi;
    }

    public void setSisi(Persegi sisi) {
        this.sisi = sisi;
    }

    @Override
    public double hitungVolume() {
        double panjangSisi = sisi.getSisi();
        volume =  Math.pow(panjangSisi, 3);
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double panjangSisi = sisi.getSisi();
        luasPermukaan =  6 * Math.pow(panjangSisi, 2);
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

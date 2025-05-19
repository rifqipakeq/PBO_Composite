package projekpbo.BangunRuang;

import projekpbo.BangunDatar.PersegiPanjang;

public class Balok extends BangunRuang {
    private PersegiPanjang alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public Balok(PersegiPanjang alas, double tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    public PersegiPanjang getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        volume = alas.hitungLuas() * tinggi;
        return volume;  
    }

    @Override
    public double hitungLuasPermukaan() {
        double p = alas.getPanjang();
        double l = alas.getLebar();
        luasPermukaan = 2 * ((p * l) + (p * tinggi) + (l * tinggi));
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
    
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

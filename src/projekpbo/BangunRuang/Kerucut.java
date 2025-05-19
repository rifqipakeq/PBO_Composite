package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Lingkaran;

public class Kerucut extends BangunRuang {
    private Lingkaran alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public Kerucut(double jariJari, double tinggi) {
        this.alas = new Lingkaran(jariJari);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        double r = alas.getJariJari();
        volume = (1.0 / 3.0) * alas.PI * r * r * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = alas.getJariJari();
        double s = Math.sqrt(r * r + tinggi * tinggi); 
        luasPermukaan = alas.PI * r * (r + s);
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getJariJari() {
        return alas.getJariJari();
    }

    public double getTinggi() {
        return tinggi;
    }
}

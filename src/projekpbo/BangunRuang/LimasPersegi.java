package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Persegi;

public class LimasPersegi extends BangunRuang {
    private Persegi alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasPersegi(double sisi, double tinggi) {
        this.alas = new Persegi(sisi);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  (1.0 / 3.0) * alas.getLuasPersegi() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double sisi = alas.getSisi();
        double tinggiSegitiga = Math.sqrt(Math.pow((sisi / 2), 2) + Math.pow(tinggi, 2));
        double luasSegitiga = 0.5 * sisi * tinggiSegitiga;
        luasPermukaan =  alas.getLuasPersegi() + 4 * luasSegitiga;
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

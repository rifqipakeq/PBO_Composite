package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Trapesium;

public class LimasTrapesium extends BangunRuang {
    private Trapesium alas;
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasTrapesium(Trapesium alas, double tinggiLimas) {
        this.alas = alas;
        this.tinggiLimas = tinggiLimas;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume = (1.0 / 3.0) * alas.hitungLuas() * tinggiLimas;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();

        double tinggiSisiTegak = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((alas.getAlasBawah() - alas.getAlasAtas()) / 2.0, 2));

        double luasSegitigaAtas = 0.5 * alas.getAlasAtas() * tinggiSisiTegak;
        double luasSegitigaBawah = 0.5 * alas.getAlasBawah() * tinggiSisiTegak;
        double luasSegitigaMiring = 2 * (0.5 * alas.getSisiMiring() * tinggiSisiTegak); 

        luasPermukaan = luasAlas + luasSegitigaAtas + luasSegitigaBawah + luasSegitigaMiring;
        return luasPermukaan;
    }


    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

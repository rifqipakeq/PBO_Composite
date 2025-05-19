package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Segitiga;

public class LimasSegitiga extends BangunRuang {
    private Segitiga alas;
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasSegitiga(Segitiga alas, double tinggiLimas) {
        this.alas = alas;
        this.tinggiLimas = tinggiLimas;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungLuasPermukaan() {
        double s = alas.getSisi(); 
        luasPermukaan = 4 * ((Math.sqrt(3) / 4.0) * Math.pow(s, 2));
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        volume = (1.0 / 3.0) * alas.hitungLuas() * tinggiLimas;
        return volume;
    }

    public double getVolume() {
        return volume;
    }
    
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

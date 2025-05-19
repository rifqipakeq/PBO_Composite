package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Segitiga;

public class PrismaSegitiga extends BangunRuang {
    private Segitiga alas;
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaSegitiga(Segitiga alas, double tinggiPrisma) {
        this.alas = alas;
        this.tinggiPrisma = tinggiPrisma;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  alas.hitungLuas() * tinggiPrisma;
        return volume;  
    }

    @Override
    public double hitungLuasPermukaan() {
        double kelilingAlas = alas.hitungKeliling();
        double luasAlas = alas.hitungLuas();
        luasPermukaan =  (2 * luasAlas) + (kelilingAlas * tinggiPrisma);
        return luasPermukaan;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }
}

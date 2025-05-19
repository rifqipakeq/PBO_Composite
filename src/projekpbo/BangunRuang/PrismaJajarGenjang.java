package projekpbo.BangunRuang;

import projekpbo.BangunDatar.JajarGenjang;

public class PrismaJajarGenjang extends BangunRuang {
    private JajarGenjang alas;
    private double tinggiPrisma;
    private double volume;
    private double luasPermukaan;

    public PrismaJajarGenjang(double alas, double tinggiAlas, double sisiA, double sisiB, double tinggiPrisma) {
        this.alas = new JajarGenjang(alas, tinggiAlas, sisiA, sisiB);
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
        luasPermukaan = 2 * alas.hitungLuas() + alas.hitungKeliling() * tinggiPrisma;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

package projekpbo.BangunRuang;

import projekpbo.BangunDatar.PersegiPanjang;

public class PrismaPersegiPanjang extends BangunRuang {
    private PersegiPanjang alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaPersegiPanjang(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume = alas.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double kelilingAlas = alas.hitungKeliling();
        luasPermukaan =  2 * luasAlas + kelilingAlas * tinggi;
        return luasPermukaan;
    }

    public PersegiPanjang getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }

    public double getVolume() {
        return volume;
    }
    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

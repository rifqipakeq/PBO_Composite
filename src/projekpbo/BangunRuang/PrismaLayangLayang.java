package projekpbo.BangunRuang;

import projekpbo.BangunDatar.LayangLayang;

public class PrismaLayangLayang extends BangunRuang {
    private LayangLayang alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public PrismaLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        this.alas = new LayangLayang(diagonal1, diagonal2, sisiPendek, sisiPanjang);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  alas.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan =  2 * alas.hitungLuas() + alas.hitungKeliling() * tinggi;
        return luasPermukaan;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

}

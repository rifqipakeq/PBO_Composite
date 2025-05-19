package projekpbo.BangunRuang;

import projekpbo.BangunDatar.LayangLayang;

public class LimasLayangLayang extends BangunRuang {
    private LayangLayang alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasLayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang, double tinggi) {
        this.alas = new LayangLayang(diagonal1, diagonal2, sisiPendek, sisiPanjang);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungLuasPermukaan() {
        double luasAlas = alas.hitungLuas();
        double a = alas.getSisiPendek();
        double b = alas.getSisiPanjang();
        double tinggiSegitigaPendek = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(a / 2, 2));
        double tinggiSegitigaPanjang = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(b / 2, 2));
        double luasSisiTegak = 2 * (0.5 * a * tinggiSegitigaPendek) + 2 * (0.5 * b * tinggiSegitigaPanjang);
        luasPermukaan =  luasAlas + luasSisiTegak;
        return luasPermukaan;
    }

    @Override
    public double hitungVolume() {
        volume =  (1.0 / 3.0) * alas.hitungLuas() * tinggi;
        return volume;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }


}

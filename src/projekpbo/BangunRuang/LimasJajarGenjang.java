package projekpbo.BangunRuang;

import projekpbo.BangunDatar.JajarGenjang;

public class LimasJajarGenjang extends BangunRuang {
    private JajarGenjang alas;
    private double tinggiLimas;
    private double volume;
    private double luasPermukaan;

    public LimasJajarGenjang(JajarGenjang alas, double tinggiLimas) {
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
        double a = alas.getSisiA();
        double b = alas.getSisiB();
        double tinggiSegitigaA = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((b / 2), 2));
        double tinggiSegitigaB = Math.sqrt(Math.pow(tinggiLimas, 2) + Math.pow((a / 2), 2));
        double luasSisiA = a * tinggiSegitigaA / 2;
        double luasSisiB = b * tinggiSegitigaB / 2;
        luasPermukaan =  alas.hitungLuas() + 2 * (luasSisiA + luasSisiB);
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

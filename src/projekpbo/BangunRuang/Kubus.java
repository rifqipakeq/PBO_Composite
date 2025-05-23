package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Persegi;

public class Kubus extends Persegi{
    private double volume;
    private double luasPermukaan;

    public Kubus(double sisi) {
        super(sisi);
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  super.hitungLuas() * super.sisi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = super.hitungLuas() * 6;
        return luasPermukaan;
    }
}

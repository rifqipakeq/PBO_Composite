package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Lingkaran;

public class Tabung extends BangunRuang {
    private Lingkaran lingkaran; 
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public Tabung(double jariJari, double tinggi) {
        this.lingkaran  = new Lingkaran(jariJari);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  lingkaran.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan =  2 * lingkaran.hitungLuas() + lingkaran.hitungKeliling() * tinggi;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

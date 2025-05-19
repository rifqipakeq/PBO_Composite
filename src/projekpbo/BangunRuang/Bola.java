package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Lingkaran;

public class Bola extends BangunRuang {
    private Lingkaran lingkaran;
    private double volume;
    private double luasPermukaan;

    public Bola(double jariJari) {
        this.lingkaran = new Lingkaran(jariJari);
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        double r = lingkaran.getJariJari();
        volume = (4.0 / 3.0) * lingkaran.PI * r * r * r;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        luasPermukaan = 4 * lingkaran.getLuas();
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }

    public double getJariJari() {
        return lingkaran.getJariJari();
    }
}

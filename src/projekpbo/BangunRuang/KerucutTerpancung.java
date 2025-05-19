package projekpbo.BangunRuang;

import projekpbo.BangunDatar.Lingkaran;

public class KerucutTerpancung extends BangunRuang {
    private Kerucut kerucutAtas;      
    private Lingkaran alasBawah;      
    private Lingkaran alasAtas;       
    private double tinggiTerpancung;  
    private double volume;
    private double luasPermukaan;

    public KerucutTerpancung(double jariJariAtas, double jariJariBawah, double tinggiTerpancung) {
        this.alasAtas = new Lingkaran(jariJariAtas);
        this.alasBawah = new Lingkaran(jariJariBawah);
        this.kerucutAtas = new Kerucut(jariJariAtas, hitungTinggiKerucutUtuh(jariJariAtas, jariJariBawah, tinggiTerpancung));
        this.tinggiTerpancung = tinggiTerpancung;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    private double hitungTinggiKerucutUtuh(double rKecil, double rBesar, double tTerpancung) {
        double tinggi = (rBesar * tTerpancung) / (rBesar - rKecil);
        return tinggi;
    }

    @Override
    public double hitungVolume() {
        double r1 = alasBawah.getJariJari();
        double r2 = alasAtas.getJariJari();
        double t = tinggiTerpancung;

        volume = (1.0 / 3.0) * Math.PI * t * (r1 * r1 + r1 * r2 + r2 * r2);
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r1 = alasBawah.getJariJari();
        double r2 = alasAtas.getJariJari();
        double s = Math.sqrt(Math.pow(tinggiTerpancung, 2) + Math.pow(r1 - r2, 2)); 

        double selimut = Math.PI * (r1 + r2) * s;
        double alas1 = alasBawah.hitungLuas();
        double alas2 = alasAtas.hitungLuas();

        luasPermukaan = selimut + alas1 + alas2;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

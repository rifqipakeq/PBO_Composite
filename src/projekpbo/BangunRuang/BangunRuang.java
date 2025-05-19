package projekpbo.BangunRuang;

import projekpbo.BangunGeometri;

public abstract class BangunRuang implements BangunGeometri {

    // Attribute untuk menyimpan nilai volume & luas permukaan 
    private double volume;
    private double luasPermukaan;

    // Constructor default Bangun Ruang
    public BangunRuang() {}

    // Method untuk menghitung volume & luas permukaan bangun ruang
    public abstract double hitungVolume();

    public abstract double hitungLuasPermukaan();

}

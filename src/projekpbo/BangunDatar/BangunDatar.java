package projekpbo.BangunDatar;

import projekpbo.BangunGeometri;

public abstract class BangunDatar implements BangunGeometri {

    // Attribute untuk menyimpan nilai keliling & luas 
    private double keliling;
    private double luas;

    // Constructor default Bangun Datar
    public BangunDatar() {}

    // Method untuk menghitung luas & keliling bangun datar
    public abstract double hitungLuas();

    public abstract double hitungKeliling();

}

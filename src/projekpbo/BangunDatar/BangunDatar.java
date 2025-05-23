package projekpbo.BangunDatar;

import projekpbo.BangunGeometri;

public abstract class BangunDatar implements BangunGeometri {

    protected double keliling;
    protected double luas;

    public BangunDatar() {}

    public abstract double hitungLuas();
    public abstract double hitungKeliling();

    @Override
    public double hitungVolume() {return 0;}
    @Override
    public double hitungLuasPermukaan() {return 0;}

}

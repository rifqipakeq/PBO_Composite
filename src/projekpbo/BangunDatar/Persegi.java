package projekpbo.BangunDatar;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(double sisi) {
        this.sisi = sisi;
    }
 
    @Override
    public double hitungLuas() {
        this.luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  4 * sisi;   
        return keliling;
    }
}                                   

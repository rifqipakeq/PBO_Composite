package projekpbo.BangunDatar;

public class Segitiga extends BangunDatar {

    private double sisi;
    private double alas;
    private double tinggi;

    public Segitiga(double alas, double tinggi) {   
        this.alas = alas;
        this.tinggi = tinggi;
    }

    @Override
    public double hitungLuas() {
        this.luas = 0.5 * alas * tinggi; 
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  3 * alas;   
        return keliling;
    }
}

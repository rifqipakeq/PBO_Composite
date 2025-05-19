package projekpbo.BangunDatar;

public class Segitiga extends BangunDatar {

    private double sisi;
    private double alas;
    private double tinggi;
    private double luas;
    private double keliling;

    public Segitiga(double alas, double tinggi) {   
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * alas * tinggi; 
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  3 * alas;   
        return keliling;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getSisi() {
        return alas;
    }
}

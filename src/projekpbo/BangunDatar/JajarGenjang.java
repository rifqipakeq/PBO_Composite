package projekpbo.BangunDatar;

public class JajarGenjang extends BangunDatar {

    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;

    public JajarGenjang(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 2 * (sisiA + sisiB);
        return keliling;
    }

    @Override
    public double hitungLuas() {
        this.luas = alas * tinggi;
        return luas;
    } 
}
package projekpbo.BangunDatar;

public class JajarGenjang extends BangunDatar {

    private double alas;
    private double tinggi;
    private double sisiA;
    private double sisiB;
    private double keliling;
    private double luas;

    public JajarGenjang(double alas, double tinggi, double sisiA, double sisiB) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.sisiA = sisiA;
        this.sisiB = sisiB;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * (sisiA + sisiB);
        return keliling;
    }

    @Override
    public double hitungLuas() {
    luas = alas * tinggi;
    return luas;
    } 

    public double getKelilingJajarGenjang() {
    return keliling;
    }

    public double getLuasJajarGenjang() {
    return luas;
    }
    public double getSisiA() {
    return sisiA;
    }
    public double getSisiB() {
    return sisiB;
    }
}
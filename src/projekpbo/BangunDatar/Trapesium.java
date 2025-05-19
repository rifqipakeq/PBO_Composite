package projekpbo.BangunDatar;

public class Trapesium extends BangunDatar {

    private double alasAtas;
    private double alasBawah;
    private double sisiMiring;
    private double tinggi;
    private double luas;
    private double keliling;

    public Trapesium(double alasAtas,double alasBawah,double sisiMiring, double tinggi) {   
        this.alasAtas = alasAtas;
        this.alasBawah = alasBawah;
        this.sisiMiring = sisiMiring;
        this.tinggi = tinggi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * (alasAtas + alasBawah) * tinggi; 
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  alasAtas + alasBawah + 2 * sisiMiring;   
        return keliling;
    }

    public double getLuas() {
        return luas;
    }

    public double getKeliling() {
        return keliling;
    }

    public double getSisiMiring() {
        return sisiMiring;
    }

    public double getAlasAtas() {
        return alasAtas;
    }

    public double getAlasBawah() {
        return alasBawah;
    }

}

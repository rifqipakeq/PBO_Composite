package projekpbo.BangunDatar;

public class Persegi extends BangunDatar {

    private double sisi;
    private double luas;
    private double keliling;

    public Persegi(double sisi) {
        this.sisi = sisi;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = sisi * sisi;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  4 * sisi;   
        return keliling;
    }

    public double getLuasPersegi() {
        return luas;
    }

    public double getKelilingPersegi() {
        return keliling;
    }
    
    public double getSisi(){
        return sisi;
    }
}

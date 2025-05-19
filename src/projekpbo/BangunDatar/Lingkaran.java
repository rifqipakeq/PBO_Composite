package projekpbo.BangunDatar;

public class Lingkaran extends BangunDatar {
    private double jariJari;
    private double luas;
    private double keliling;
    public final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas =  PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling = 2 * PI * jariJari;
        return keliling;
    }

    public double getKelilingLingkaran(){
        return keliling;
    }

    public double getLuasLingkaran(){
        return luas;
    }

    public double getJariJari() {
        return jariJari;
    }
}

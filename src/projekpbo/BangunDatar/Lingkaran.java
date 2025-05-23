package projekpbo.BangunDatar;

public class Lingkaran extends BangunDatar {
    protected double jariJari;
    protected final double PI = 3.14;

    public Lingkaran(double jariJari) {
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        this.luas =  PI * jariJari * jariJari;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = 2 * PI * jariJari;
        return keliling;
    }
}

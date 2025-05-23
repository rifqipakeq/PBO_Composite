package projekpbo.BangunDatar;

public class JuringLingkaran extends Lingkaran {
    private double sudutJuring; 

    public JuringLingkaran(double jariJari,double sudutJuring) {
        super(jariJari);
        this.sudutJuring = sudutJuring;;
    }

    @Override
    public double hitungLuas() {
        this.luas = (sudutJuring / 360.0) * super.hitungLuas();
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = (sudutJuring / 360.0) * super.hitungKeliling() + 2 * super.jariJari;;
        return keliling;
    }
}

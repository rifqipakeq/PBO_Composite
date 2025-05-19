package projekpbo.BangunDatar;

public class TemberengLingkaran extends BangunDatar {
    private Lingkaran lingkaran;
    private double sudut; 
    private double luas;
    private double keliling;

    public TemberengLingkaran(Lingkaran lingkaran, double sudut) {
        this.lingkaran = lingkaran;
        this.sudut = sudut;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        double jariJari = lingkaran.getJariJari();
        double sudutRadian = Math.toRadians(sudut);
        double luasJuring = (sudut / 360.0) * Math.PI * jariJari * jariJari;
        double luasSegitiga = 0.5 * jariJari * jariJari * Math.sin(sudutRadian);
        luas = luasJuring - luasSegitiga;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double jariJari = lingkaran.getJariJari();
        double sudutRadian = Math.toRadians(sudut);
        double panjangBusur = sudutRadian * jariJari;
        double taliBusur = 2 * jariJari * Math.sin(sudutRadian / 2);
        keliling = panjangBusur + taliBusur;
        return keliling;
    }

    public double getLuasTembereng() {
        return luas;
    }

    public double getKelilingTembereng() {
        return keliling;
    }
}

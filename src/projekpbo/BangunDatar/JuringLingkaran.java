package projekpbo.BangunDatar;

public class JuringLingkaran extends BangunDatar {
    private Lingkaran lingkaran;
    private double sudut; 
    private double luas; 
    private double keliling; 

    public JuringLingkaran(Lingkaran lingkaran, double sudut) {
        this.lingkaran = lingkaran;
        this.sudut = sudut;
        this.keliling = hitungKeliling();
        this.luas = hitungLuas();
    }

    @Override
    public double hitungLuas() {
        luas = (sudut / 360.0) * lingkaran.hitungLuas();
        return luas;
    }

    @Override
    public double hitungKeliling() {
        double panjangBusur = (sudut / 360.0) * lingkaran.hitungKeliling();
        keliling = panjangBusur + 2 * lingkaran.getJariJari();
        return keliling;
    }

    // public Lingkaran getLingkaran() {
    //     return lingkaran;
    // }

    public double getKelilingJuring(){
        return keliling;
    }

    public double getLuasJuring(){
        return luas;
    }

    public double getSudut() {
        return sudut;
    }
}

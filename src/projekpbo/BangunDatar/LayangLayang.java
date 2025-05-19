package projekpbo.BangunDatar;

public class LayangLayang extends BangunDatar {

    private double diagonal1;
    private double diagonal2;
    private double sisiPendek;
    private double sisiPanjang;
    private double luas;
    private double keliling;

    public LayangLayang(double diagonal1, double diagonal2, double sisiPendek, double sisiPanjang) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        this.sisiPendek = sisiPendek;
        this.sisiPanjang = sisiPanjang;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = 0.5 * diagonal1 * diagonal2;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  2 * (sisiPendek + sisiPanjang);
        return keliling;
    }

    public double getLuasLayangLayang() {
        return luas;
    }

    public double getKelilingLayangLayang() {
        return keliling;
    }
    
    public double getSisiPanjang() {
        return sisiPanjang;
    }
    
    public double getSisiPendek() {
        return sisiPendek;
    }
}

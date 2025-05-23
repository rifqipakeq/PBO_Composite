package projekpbo.BangunDatar;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;

    public PersegiPanjang(double panjang, double lebar) {   
        this.panjang = panjang;
        this.lebar = lebar;
    }

    @Override
    public double hitungLuas() {
        this.luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        this.keliling =  2 * (panjang + lebar);   
        return keliling;
    }
}

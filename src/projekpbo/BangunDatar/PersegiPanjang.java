package projekpbo.BangunDatar;

public class PersegiPanjang extends BangunDatar {

    private double panjang;
    private double lebar;
    private double luas;
    private double keliling;

    public PersegiPanjang(double panjang, double lebar) {   
        this.panjang = panjang;
        this.lebar = lebar;
        this.luas = hitungLuas();
        this.keliling = hitungKeliling();
    }

    @Override
    public double hitungLuas() {
        luas = panjang * lebar;
        return luas;
    }

    @Override
    public double hitungKeliling() {
        keliling =  2 * (panjang + lebar);   
        return keliling;
    }

    public double getLuasPersegiPanjang() {
        return luas;
    }

    public double getKelilingPersegiPanjang() {
        return keliling;
    }
    
    public double getPanjang() {
        return panjang;
    }
    
    public double getLebar() {
        return lebar;
    }
}

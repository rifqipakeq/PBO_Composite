package projekpbo.BangunDatar;

public class BelahKetupat extends BangunDatar {

    private double sisi;
    private double diagonal1;
    private double diagonal2;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    @Override
    public double hitungKeliling() {
        this.keliling = (2 * diagonal1) + (2 * diagonal2);
        return keliling;
    }

    @Override
    public double hitungLuas() {
        this.luas = (diagonal1 * diagonal2) / 2;
        return luas;
    }
}
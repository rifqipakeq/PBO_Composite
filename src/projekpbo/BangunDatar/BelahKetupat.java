package projekpbo.BangunDatar;

public class BelahKetupat extends BangunDatar {

    private double sisi;
    private double diagonal1;
    private double diagonal2;
    private double kelilingBelahKetupat;
    private double luasBelahKetupat;

    public BelahKetupat(double diagonal1, double diagonal2, double sisi) {
        this.sisi = sisi;
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
        luasBelahKetupat = hitungLuas();
        kelilingBelahKetupat = hitungKeliling();
    }

    @Override
    public double hitungKeliling() {
        kelilingBelahKetupat = (2 * diagonal1) + (2 * diagonal2);
        return kelilingBelahKetupat;
    }

    @Override
    public double hitungLuas() {
        luasBelahKetupat = (diagonal1 * diagonal2) / 2;
        return luasBelahKetupat;
    }

    public double getKelilingJajarGenjang() {
        return kelilingBelahKetupat;
    }

    public double getLuasJajarGenjang() {
        return luasBelahKetupat;
    }

    public double getDiagonal1() {
        return diagonal1;
    }
    
    public double getDiagonal2() {
        return diagonal2;
    }
    
    public double getSisi() {
        return sisi;
    }
}
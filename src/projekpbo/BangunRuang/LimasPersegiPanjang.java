package projekpbo.BangunRuang;

import projekpbo.BangunDatar.PersegiPanjang;

public class LimasPersegiPanjang extends BangunRuang {
    private PersegiPanjang alas;
    private double tinggi;
    private double volume;
    private double luasPermukaan;

    public LimasPersegiPanjang(double panjang, double lebar, double tinggi) {
        this.alas = new PersegiPanjang(panjang, lebar);
        this.tinggi = tinggi;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        volume =  (1.0 / 3.0) * alas.hitungLuas() * tinggi;
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double panjang = alas.getPanjang();
        double lebar = alas.getLebar();

        double tinggiSegitigaPanjang = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(lebar / 2, 2));
        double tinggiSegitigaLebar = Math.sqrt(Math.pow(tinggi, 2) + Math.pow(panjang / 2, 2));

        double luasSisiPanjang = panjang * tinggiSegitigaPanjang;
        double luasSisiLebar = lebar * tinggiSegitigaLebar;

        luasPermukaan =  alas.hitungLuas() + 2 * (0.5 * luasSisiPanjang) + 2 * (0.5 * luasSisiLebar);
        return luasPermukaan;
    }

    public PersegiPanjang getAlas() {
        return alas;
    }

    public double getTinggi() {
        return tinggi;
    }
    
    public double getVolume(){
        return volume;
    }
    
    public double getLuasPermukaan(){
        return luasPermukaan;
    }
}

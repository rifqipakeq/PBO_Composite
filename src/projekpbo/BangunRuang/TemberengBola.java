package projekpbo.BangunRuang;

public class TemberengBola extends BangunRuang {
    private Bola bola;
    private double tinggiTembereng;
    private double volume;
    private double luasPermukaan;

    public TemberengBola(Bola bola, double tinggiTembereng) {
        this.bola = bola;
        this.tinggiTembereng = tinggiTembereng;
        this.volume = hitungVolume();
        this.luasPermukaan = hitungLuasPermukaan();
    }

    @Override
    public double hitungVolume() {
        double r = bola.getJariJari();
        double h = tinggiTembereng;
        volume = (1.0 / 6.0) * Math.PI * h * (3 * r * r + h * h);
        return volume;
    }

    @Override
    public double hitungLuasPermukaan() {
        double r = bola.getJariJari();
        double h = tinggiTembereng;
        luasPermukaan = 2 * Math.PI * r * h;
        return luasPermukaan;
    }

    public double getVolume() {
        return volume;
    }

    public double getLuasPermukaan() {
        return luasPermukaan;
    }
}

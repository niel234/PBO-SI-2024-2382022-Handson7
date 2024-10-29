package polimorfisme;

public class SegitigaSamaSisi extends BangunDatar {
    private Double sisi;
    private Double tinggi;

    public SegitigaSamaSisi(double sisi, double tinggi) {
        this.sisi = sisi;
        this.tinggi = tinggi;
    }

    @Override
    public double keliling() {
        return 0.5 * sisi * tinggi;
    }

    @Override
    public double luas() {
        return 3 * sisi;
    }
}
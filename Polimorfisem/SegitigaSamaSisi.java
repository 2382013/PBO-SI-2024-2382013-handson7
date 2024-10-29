package Polimorfisem;

public class SegitigaSamaSisi extends BangunDatar {
    private double sisi;

    public SegitigaSamaSisi(double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        double tinggi = (Math.sqrt(3) / 2) * sisi;
        return (sisi * tinggi) / 2;
    }

    @Override
    public double keliling() {
        return 3 * sisi;
    }
}
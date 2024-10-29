package Polimorfisem;

public class Persegi extends BangunDatar {
    private double sisi;

    public Persegi(final double sisi) {
        this.sisi = sisi;
    }

    @Override
    public double luas() {
        return sisi * sisi;
    }

    @Override
    public double keliling() {
        return 4 * sisi;
    }
}
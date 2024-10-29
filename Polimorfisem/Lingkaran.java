package Polimorfisem;

public class Lingkaran extends BangunDatar {
    private  double jarijari;

    public Lingkaran(double jarijari) {
        this.jarijari = jarijari;
    }

    @Override
    public double luas() {
        return 2 * Math.PI * jarijari;
    }

    @Override
    public double keliling() {
        return Math.PI * jarijari * jarijari;
    }
}
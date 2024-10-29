package Polimorfisem;

public class Main {
    public static void main(String[] args) {
        BangunDatar bangunDatar;
        bangunDatar = new Persegi(4);
        System.out.println("Luas Persegi: " + bangunDatar.luas());
        System.out.println("Keliling Persegi: " + bangunDatar.keliling());

        // Lingkaran
        bangunDatar = new Lingkaran(9);
        System.out.println("Luas Lingkaran: " + bangunDatar.luas());
        System.out.println("Keliling Lingkaran: " + bangunDatar.keliling());

        // Segitiga sama sisi
        bangunDatar = new SegitigaSamaSisi(6);
        System.out.println("Luas Segitiga Sama Sisi: " + bangunDatar.luas());
        System.out.println("Keliling Segitiga Sama Sisi: " + bangunDatar.keliling());
    }
}
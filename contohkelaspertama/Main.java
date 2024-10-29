package contohkelaspertama;

public class Main {
    public static void main(String[] args) {
        Mobil mobilHitam = new Mobil("Hitam" , "Toyota" , 180);
        mobilHitam.tampilkanInfo();

        Mobil mobilmerah = new Mobil("Merah" , "Honda" , 200);
        mobilmerah.tampilkanInfo();
    }
}
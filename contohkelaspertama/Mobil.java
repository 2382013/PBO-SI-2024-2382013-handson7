package contohkelaspertama;

public class Mobil {
    String warna;
    String merek;
    int kecepatanMaks;

    public Mobil(String warna, String merek, int kecepatanMaks) {
        this.warna = warna;
        this.merek = merek;
        this.kecepatanMaks = kecepatanMaks;
    }

    public void tampilkanInfo() {
        System.out.println("Warna : " + warna);
        System.out.println("Merek : " + merek);
        System.out.println("Kecepatan Maks : " + kecepatanMaks);
    }

    public String getWarna() {
        return warna;
    }

    public String getMerek() {
        return merek;
    }

    public int getKecepatanMaks() {
        return kecepatanMaks;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    public void setMerek(String merek) {
        this.merek = merek;
    }

    public void setKecepatanMaks(int kecepatanMaks) {
        this.kecepatanMaks = kecepatanMaks;
    }
}

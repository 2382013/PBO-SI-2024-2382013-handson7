package pewarisan;

public class Mobil extends Kendaraan{
    private int jumlahPintu;
    private String jenisBahanBakar;

    public Mobil(final String merek, final String model, final int tahunProduksi, int jumlahPintu, String jenisBahanBakar) {
        super(merek, model, tahunProduksi);
        this.jumlahPintu = jumlahPintu;
        this.jenisBahanBakar = jenisBahanBakar;
    }

    public void tampilkanInfoMobil() {
        super.tampilkanInfo();
        System.out.println("Jumlah Pintu: " + jumlahPintu);
        System.out.println("Jenis Bahan Bakar: " + jenisBahanBakar);
    }
}

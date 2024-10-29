package abstraksiV2;

public class Printer implements Cetak {
    @Override
    public void print() {
        System.out.println("Mencetak....");
    }

    @Override
    public void scan() {
        System.out.println("Memindai....");
    }
}

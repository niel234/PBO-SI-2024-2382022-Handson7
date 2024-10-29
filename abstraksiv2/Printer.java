package abstraksiv2;

import java.sql.SQLOutput;

public class Printer implements Cetak{

    @Override
    public void print() {
        System.out.println("Mencetak dokumen.....");
    }

    @Override
    public void scan() {
        System.out.println("Memindai dokumen.....");
    }
}
package contohkelaspertama;

public class Main {
    public static void main(String[] args) {
        Mobil toyota = new Mobil("Merah", "toyota", 180);
        toyota.tampilkanInfo();

        Mobil mobilMerah = new Mobil( "Merah", "Honda", 200);
        mobilMerah.tampilkanInfo();
    }
}
package Interface;

/**
 *
 * @author Ghaxre
 */
// Class untuk menguji implementasi ACBeraksi
public class ACBeraksi {
    public static void main(String[] args) {
        // Membuat objek AC
        AC ac = new AC();

        // Menggunakan metode yang diimplementasikan
        ac.hidupkanAC();
        ac.dinginkanAC();
        ac.panaskanAC();
        ac.matikanAC();
        ac.dinginkanAC();  // Mencoba mendinginkan AC ketika mati
    }
}



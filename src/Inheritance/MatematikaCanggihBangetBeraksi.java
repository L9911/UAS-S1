package Inheritance;

/**
 *
 * @author Ghaxre
 */
public class MatematikaCanggihBangetBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari class MatematikaCanggihBanget
        MatematikaCanggihBanget matematika = new MatematikaCanggihBanget();

        int a = 100;
        int b = 30;
        int c = 50;

        // Memanggil metode dari superclass Matematika
        matematika.pertambahan(a, b);
        matematika.pengurangan(a, b);
        matematika.perkalian(a, b);
        matematika.pembagian(a, b);
        matematika.modulus(a, b);
        matematika.pertambahanTiga(a, b, c);
    }
}
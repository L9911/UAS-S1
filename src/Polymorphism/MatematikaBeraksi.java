package Polymorphism;

/**
 *
 * @author Ghaxre
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek Matematika
        Matematika matematika = new Matematika();

        // Operasi dasar (pertambahan, pengurangan, perkalian, pembagian)
        System.out.println("Operasi Dasar Matematika:");
        matematika.pertambahan(10, 5);
        matematika.pertambahan(10, 5, 3);

        matematika.pengurangan(20, 10);
        matematika.pengurangan(30, 15, 5);

        matematika.perkalian(4, 3);
        matematika.perkalian(2, 3, 4);

        matematika.pembagian(20, 5);
        matematika.pembagian(100, 5, 2);

        // Membuat objek MatematikaCanggih
        MatematikaCanggih matematikaCanggih = new MatematikaCanggih();

        // Operasi modulus
        System.out.println("Operasi Modulus (Matematika Canggih):");
        matematikaCanggih.modulus(10, 3);
        matematikaCanggih.modulus(20, 6, 4);
    }
}


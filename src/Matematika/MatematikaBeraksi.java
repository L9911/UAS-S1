package Matematika;

/**
 *
 * @author Ghaxre
 */
public class MatematikaBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari kelas Matematika
        Matematika matematika = new Matematika();

        // Menampilkan hasil operasi dengan variasi tampilan 1
        System.out.println("Hasil Operasi Matematika:");
        matematika.pertambahan(800, 300); // Penjumlahan
        matematika.pengurangan(600, 550); // Pengurangan
        matematika.perkalian(50, 20);  // Perkalian
        matematika.pembagian(100, 20);   // Pembagian
    }
}

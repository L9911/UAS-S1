package Mobil;

/**
 *
 * @author Ghaxre
 */
public class MobilBeraksi {
    public static void main(String[] args) {
        // Membuat objek dari kelas Mobil
        Mobil mobil1 = new Mobil();
        
        // Mengatur atribut secara manual
        mobil1.warna = "Merah";
        mobil1.tahunProduksi = 2020;

        // Menampilkan informasi mobil1
        mobil1.info();

        // Membuat objek lain dari kelas Mobil
        Mobil mobil2 = new Mobil();
        mobil2.warna = "Hitam";
        mobil2.tahunProduksi = 2021;

        // Menampilkan informasi mobil2
        mobil2.info();
    }
}


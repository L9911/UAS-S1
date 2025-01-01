package Bank;

/**
 *
 * @author Ghaxre
 */
public class BankBeraksi {
    public static void main(String[] args) {
        // Membuat objek Bank dengan saldo awal
        Bank bk = new Bank(1000000);

        // Menampilkan saldo awal
        bk.getSaldo();

        // Menambahkan saldo
        bk.simpanUang(500000);

        // Mencoba menarik saldo lebih dari yang tersedia
        bk.ambilUang(450000);
    }
}

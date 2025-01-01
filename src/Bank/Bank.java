package Bank;

/**
 *
 * @author Ghaxre
 */
public class Bank {
    private int saldo;

    // Constructor untuk menginisialisasi saldo
    public Bank(int saldoAwal) {
        this.saldo = saldoAwal;
    }

    // Method untuk menampilkan saldo saat ini
    public void getSaldo() {
        System.out.println("Selamat datang di Bank kami!");
        System.out.printf("Saldo Anda saat ini adalah: Rp %,d%n", saldo);
    }

    // Method untuk menambahkan uang ke saldo
    public void simpanUang(int jumlah) {
        if (jumlah > 0) {
            saldo += jumlah;
            System.out.printf("Anda telah menabung sebesar: Rp %,d%n", jumlah);
            System.out.printf("Saldo terbaru Anda adalah: Rp %,d%n", saldo);
        } else {
            System.out.println("Jumlah yang ditambahkan harus lebih besar dari nol.");
        }
    }

    // Method untuk menarik uang dari saldo
    public void ambilUang(int jumlah) {
        if (jumlah > 0 && jumlah <= saldo) {
            saldo -= jumlah;
            System.out.printf("Anda telah menarik uang sebesar: Rp %,d%n", jumlah);
            System.out.printf("Saldo Anda sekarang adalah: Rp %,d%n", saldo);
        } else if (jumlah > saldo) {
            System.out.printf("Maaf, saldo Anda tidak cukup untuk menarik Rp %,d%n", jumlah);
        } else {
            System.out.println("Jumlah yang ditarik harus lebih besar dari nol.");
        }
    }
}


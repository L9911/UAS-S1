package Polymorphism;

/**
 *
 * @author Ghaxre
 */
public class Matematika {

    // Pertambahan
    void pertambahan(int a, int b) {
        System.out.println("Operasi Pertambahan (2 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " + " + b + " = " + (a + b));
        }
        System.out.println();
    }

    void pertambahan(int a, int b, int c) {
        System.out.println("Operasi Pertambahan (3 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " + " + b + " + " + c + " = " + (a + b + c));
        }
        System.out.println();
    }

    // Pengurangan
    void pengurangan(int a, int b) {
        System.out.println("Operasi Pengurangan (2 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " - " + b + " = " + (a - b));
        }
        System.out.println();
    }

    void pengurangan(int a, int b, int c) {
        System.out.println("Operasi Pengurangan (3 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " - " + b + " - " + c + " = " + (a - b - c));
        }
        System.out.println();
    }

    // Perkalian
    void perkalian(int a, int b) {
        System.out.println("Operasi Perkalian (2 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " * " + b + " = " + (a * b));
        }
        System.out.println();
    }

    void perkalian(int a, int b, int c) {
        System.out.println("Operasi Perkalian (3 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " * " + b + " * " + c + " = " + (a * b * c));
        }
        System.out.println();
    }

    // Pembagian
    void pembagian(int a, int b) {
        if (b != 0) {
            System.out.println("Operasi Pembagian (2 Bilangan):");
            for (int i = 1; i <= 4; i++) {
                System.out.println("Step " + i + ": " + a + " / " + b + " = " + (a / b));
            }
        } else {
            System.out.println("Kesalahan: Tidak dapat membagi dengan nol!");
        }
        System.out.println();
    }

    void pembagian(int a, int b, int c) {
        if (b != 0 && c != 0) {
            System.out.println("Operasi Pembagian (3 Bilangan):");
            for (int i = 1; i <= 4; i++) {
                System.out.println("Step " + i + ": " + a + " / " + b + " / " + c + " = " + (a / b / c));
            }
        } else {
            System.out.println("Kesalahan: Tidak dapat membagi dengan nol!");
        }
        System.out.println();
    }
}


package Polymorphism;

/**
 *
 * @author Ghaxre
 */
public class MatematikaCanggih extends Matematika {

    // Operasi Modulus
    void modulus(int a, int b) {
        System.out.println("Operasi Modulus (2 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": " + a + " % " + b + " = " + (a % b));
        }
        System.out.println();
    }

    void modulus(int a, int b, int c) {
        System.out.println("Operasi Modulus (3 Bilangan):");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Step " + i + ": (" + a + " % " + b + ") % " + c + " = " + ((a % b) % c));
        }
        System.out.println();
    }
}


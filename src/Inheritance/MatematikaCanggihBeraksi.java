package Inheritance;

/**
 *
 * @author Ghaxre
 */
public class MatematikaCanggihBeraksi {
    public static void main(String[] args) {
     
        MatematikaCanggih matematika = new MatematikaCanggih();

        int a = 100;
        int b = 30;

        matematika.pertambahan(a, b);
        matematika.pengurangan(a, b);
        matematika.perkalian(a, b);
        matematika.pembagian(a, b);
        matematika.modulus(a, b);
    }
}
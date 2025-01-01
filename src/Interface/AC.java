package Interface;

/**
 *
 * @author Ghaxre
 */
// AC.java
public class AC implements InterfaceAC {
    private boolean isOn = false; // Status AC (true = menyala, false = mati)
    private String mode = "Normal"; // Mode AC (Normal, Dingin, Panas)

    @Override
    public void matikanAC() {
        if (isOn) {
            isOn = false;
            System.out.println("AC dimatikan.");
        } else {
            System.out.println("AC sudah mati.");
        }
    }

    @Override
    public void hidupkanAC() {
        if (!isOn) {
            isOn = true;
            mode = "Normal";
            System.out.println("AC dihidupkan.");
        } else {
            System.out.println("AC sudah menyala.");
        }
    }

    @Override
    public void dinginkanAC() {
        if (isOn) {
            mode = "Dingin";
            System.out.println("AC sekarang dalam mode dingin.");
        } else {
            System.out.println("Hidupkan AC terlebih dahulu.");
        }
    }

    @Override
    public void panaskanAC() {
        if (isOn) {
            mode = "Panas";
            System.out.println("AC sekarang dalam mode panas.");
        } else {
            System.out.println("Hidupkan AC terlebih dahulu.");
        }
    }
}

import java.util.Scanner;

public class HiloValidacion extends Thread {
    private String contrasena;

    public HiloValidacion(String contrasena) {
        this.contrasena = contrasena;
    }

    @Override
    public void run() {
        System.out.println("Validando contraseña: " + contrasena);
        if (VContrasena.validarContrasena(contrasena)) {
            System.out.println("La contraseña es válida.");
        } else {
            System.out.println("La contraseña no cumple con los requisitos.");
        }
    }
}

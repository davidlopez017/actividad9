import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese las contraseñas que desea validar (separadas por espacios):");
        String input = sc.nextLine();

        // Dividir la entrada por espacios para obtener las contraseñas
        String[] contrasenas = input.split("\\s+");

        // Verificar si no se ha ingresado ninguna contraseña
        if (contrasenas.length == 0) {
            System.out.println("No se ha ingresado ninguna contraseña.");
            return; // Salir del programa
        }

        for (String contrasena : contrasenas) {
            Thread hilo = new HiloValidacion(contrasena);
            hilo.start();
        }

        System.out.println("\nEjemplo de contraseña válida: Abcdefg1@\n");
        sc.close();
    }
}


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        VideojuegoDAO videojuegoDAO = new VideojuegoDAO();

        System.out.println("Ingrese el nombre del videojuego:");
        String nombre = scanner.nextLine();

        System.out.println("Ingrese el año de salida:");
        int anioSalida = scanner.nextInt();
        scanner.nextLine(); // Limpiar buffer

        System.out.println("Ingrese el género:");
        String genero = scanner.nextLine();

        Videojuego videojuego = new Videojuego(nombre, anioSalida, genero);

        if (videojuegoDAO.insertarVideojuego(videojuego)) {
            System.out.println("Videojuego registrado exitosamente.");
        } else {
            System.out.println("Error al registrar el videojuego.");
        }
    }
}

import java.util.Scanner;

public class Usuario {

    public static void main(String[] args) {
        // Datos almacenados en memoria
        String storedUsername = "usuario123";
        String storedPassword = "contrasena123";

        Scanner scanner = new Scanner(System.in);
        
        while (true) {
        
            System.out.print("Ingrese su nombre de usuario: ");
            String inputUsername = scanner.nextLine();

            System.out.print("Ingrese su contraseña: ");
            String inputPassword = scanner.nextLine();

            
            if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
                System.out.println("Acceso concedido.");
                break;
            } else {
                System.out.println("Nombre de usuario o contraseña incorrectos. Por favor, intente nuevamente.");
            }
        }
        
        scanner.close();
    }
}
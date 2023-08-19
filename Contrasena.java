import java.util.Scanner;
public class Contrasena {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final String CONTRASENA = "12345";
      boolean CONTRASENACORRECTA = false;

      while(!CONTRASENACORRECTA){
        System.out.println("Por favor ingrese la contraseña");
        String entradaUsuario = scanner.nextLine();  
        if (entradaUsuario.equals(CONTRASENA)) {
            System.out.println("Contraseña correcta, Bienvenido");
          CONTRASENACORRECTA =true;
        } else {
            System.out.println("Contraseña incorrecta");
        }
      }
        scanner.close();
    }
}

 

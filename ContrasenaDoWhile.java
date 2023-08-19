import java.util.Scanner;
public class ContrasenaDoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
    
        final String CONTRASENA = "12345";
        String password;
        boolean CONTRESANAINCORRECTA =false;
    
        do{
        System.out.println("Ingresa tu contrasena");
        password = scanner.nextLine();
      } while (password.equalsIgnoreCase(CONTRASENA)==false);
        System.out.println("ingresaste exitosamente");
    }

}
  

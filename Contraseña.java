import java.util.Scanner;
public class Contraseña {
    public class static void main(String[] args){
         Scanner scanner = new Scanner(System.in);

          final String contraseña = 12345;
         String contraseña;

         do{
            System.out.println("Pon tu contraseña");
            contraseña = scanner.nextLine();

         } while (contraseña.equalsIgnoreCase("la contraseña es correcta"));

         System.out.println("Ingresaste existosamente");



    }
}

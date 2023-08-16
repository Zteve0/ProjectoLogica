import java.util.Scanner;
class App{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese operador 1");
        int operador1 = scanner.nextInt();
        System.out.println("Ingrese operador 2");
        int operador2 = scanner.nextInt();

        int suma = operador1 + operador2;
        System.out.println("El resultado de la suma es"+ suma);
        int resta = operador1 - operador2;
        System.out.println("El resltado de la resta es" + resta);
        int multiplicacion = operador1 * operador2;
        System.out.println("El resltado de la multiplicacion es" + multiplicacion);
        double division = operador1/operador2;
        System.out.println("El resultado de la Divison es" + division);
    } 
    
    
    
}

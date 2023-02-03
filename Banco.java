
import java.util.List;
import java.util.Scanner;

public class Banco {

    public static void RealizarTransferencia(Cuenta c1, Cuenta c2, double Transferencia) {

        Boolean x = c1.ValidarMonto(c1, Transferencia);
        if (x) {
            c2.AgregarNuevoSaldo(Transferencia);
        }

    }

    public static void main(String[] args) {
        // Para la primera cuenta bancaria
        System.out.println("Cuenta bancaria 1");
        // Pedimos el Titular y el Saldo de la primera cuenta bancaria
        // Lo almacenamos en un Array
        String[] datos = pedirDatosUsuario();

        // Instanciar la clase Cuenta y crear la clase Cuenta_1
        Cuenta Cuenta_1 = new Cuenta(datos[0], Double.valueOf(datos[1]));

        // Repetimos el mismo proceso para crear la Cuenta_2
        // Para la segunda cuenta bancaria
        System.out.println("\nCuenta bancaria 2");
        datos = pedirDatosUsuario();
        Cuenta Cuenta_2 = new Cuenta(datos[0], Double.valueOf(datos[1]));

        // Hacemos una transferencia desde la Cuenta_1 a la Cuenta_2
        Double importe = pedirImporteUsuario();
        RealizarTransferencia(Cuenta_1, Cuenta_2, importe);

        // Mostramos los datos de las cuentas bancarias por consola
        System.out.println("\n*******************************************");
        System.out.println("Datos de la Cuenta 1");
        List<String> datosCuenta;
        datosCuenta = Cuenta_1.getDatosCuenta();

        System.out.println("   ->      Titular: " + datosCuenta.get(0));
        System.out.println("   -> Nº de cuenta: " + datosCuenta.get(1));
        System.out.println("   ->        Saldo: " + datosCuenta.get(2));

        System.out.println("\nDatos de la Cuenta 2");
        datosCuenta = Cuenta_2.getDatosCuenta();
        System.out.println("   ->      Titular: " + datosCuenta.get(0));
        System.out.println("   -> Nº de cuenta: " + datosCuenta.get(1));
        System.out.println("   ->        Saldo: " + datosCuenta.get(2));
        
    }

    
    public static String[] pedirDatosUsuario() {
        // Pedimos los datos al usuario por consola para la primera cuenta 

        String[] arr = new String[2];
        System.out.print("Introduzca el nombre del titular: ");
        Scanner entradaEscaner = new Scanner(System.in); // Creamos un objeto Scanner
        String titular = entradaEscaner.nextLine();

        Double saldo = 0.0;
        System.out.print("Introduzca el saldo inicial: ");
        // Comprueba que sólo se introduzcan números válidos (Double)
        // while (!entradaEscaner.hasNextDouble()) {
        // System.out.print("No ha introducido un saldo correcto.\n" +
        // "Vuelva a intentarlo (sólo números y decimales): ");
        // entradaEscaner.nextLine();
        // }

        saldo = entradaEscaner.nextDouble();

        arr[0] = titular;
        arr[1] = saldo.toString();
        entradaEscaner.close();
        return arr;

    }

    // Solicita el importe a transferir entre cuentas al usuario
    public static Double pedirImporteUsuario() {
        // Pedimos el importe al usuario por consola
        System.out.print("\nIntroduzca el importe a transferir entre cuentas: ");
        Scanner entradaEscaner = new Scanner(System.in);
        double importe = entradaEscaner.nextDouble();// Creamos de un objeto Scanner

        entradaEscaner.close();

        return importe;

    }

}

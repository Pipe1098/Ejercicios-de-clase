import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

class Cuenta {
    // Propiedades de la clase Cuenta
    private double saldoDeCuenta;
    private String nombreDelTitular;
    private long numeroDeCuenta;

    // Constructor de la clase Cuenta
    public Cuenta(String nombreDelTitular, double saldoDeCuenta) {
        this.saldoDeCuenta = saldoDeCuenta;
        this.nombreDelTitular = nombreDelTitular;
        Random numAleatorioCuenta = new Random();
        this.numeroDeCuenta = Math.abs(numAleatorioCuenta.nextLong());
    }

    // Setters

    // Setter para aumentar el saldo de la cuenta bancaria (hacer un ingreso)
    public void setIngreso(double ingreso) {
        if (ingreso <= 0)
            System.out.println("El ingreso debe ser superior a cero pesos");
        else
            saldoDeCuenta = saldoDeCuenta + ingreso;
    }

    // Setter para disminuir el saldo de la cuenta bancaria (sacar dinero)
    public void setRetiro(double retiro) {
        if (retiro <= 0)
            System.out.println("El retiro debe ser superior a cero pesos");
        else
            saldoDeCuenta = saldoDeCuenta - retiro;
    }

    // Getters

    // Getter que devuelve el saldo actual de la cuenta bancaria
    public Double getSaldoCuenta() {
        return saldoDeCuenta;
    }
 
    //Getter que obtiene todos los datos de la cuenta bancaria en un List
    public List<String> getDatosCuenta ()
    {
        List<String> datosCuenta = new ArrayList<>();
        datosCuenta.add(nombreDelTitular);
        datosCuenta.add(Long.toString(numeroDeCuenta));
        // Redondeamos a dos decimales el saldo
        DecimalFormat saldoRedondeado = new DecimalFormat("###.##");
        datosCuenta.add(saldoRedondeado.format(saldoDeCuenta));

        return datosCuenta;
    }

    // Métodos
    /*
     * Métodos que incrementa el saldo de una Cuenta de destino y lo decrementa en
     * la
     * Cuenta de origen y se valida que haya dinero suficiente en la cuenta de
     * origen y que el monto de la transferencia sea valido
     */
    public void AgregarNuevoSaldo(double saldoAgregar) {
        saldoDeCuenta = saldoDeCuenta + saldoAgregar;
    }

    public Boolean ValidarMonto(Cuenta c1,double monto) {
        Boolean confirm=true;
        double rest=saldoDeCuenta-monto;
        if (rest>=0) {
            saldoDeCuenta= saldoDeCuenta - monto;
        }
        else{
            System.out.println("No tiene suficiente dinero para hacer la trasferencia");
            confirm=false;
        }
        return confirm;
        
    }

}

package Ejerciciosdeclase.EjercicioPractico2;

import java.time.LocalDate;

public class Clasica extends TarjetaCredito {

    public Clasica() {
    }

    public Clasica(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "********************\nTipo: Clásica\n********************\n" + super.toString();
    }

}

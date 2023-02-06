package Ejerciciosdeclase.EjercicioPractico2;

import java.time.LocalDate;

public class Black extends TarjetaCredito {

    public Black(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }

    public Black() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "********************\nTipo: Black \n ********************\n" + super.toString();
    }
}

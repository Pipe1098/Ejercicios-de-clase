package Ejerciciosdeclase.EjercicioPractico2;

import java.time.LocalDate;

public class Dorada extends TarjetaCredito{

    
    public Dorada(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }

    public Dorada() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "********************\nTipo: Dorada \n ********************\n"+super.toString();
    }
}

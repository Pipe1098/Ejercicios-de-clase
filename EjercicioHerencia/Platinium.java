package Ejerciciosdeclase.EjercicioPractico2;

import java.time.LocalDate;

public class Platinium extends TarjetaCredito{

    

    public Platinium(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        super(emisor, cupo, numeroTarjeta, cvv, fechaVencimiento);
    }

    public Platinium() {
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return "********************\nTipo: Platinium \n ********************\n"+super.toString();
    }
    
}
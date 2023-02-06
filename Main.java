package Ejerciciosdeclase.EjercicioPractico2;
import java.util.*;
import java.time.*;


public class Main {

    public static void main(String args[]) {

        String numeroTarjeta,emisor;
        Integer cvv;
        Long cupo;
        LocalDate date = LocalDate.now();
        Random rand = new Random();
        String []Emisores= {"Visa","American Express","Mastercard"};
		//DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd 'de' LLLL 'de' yyyy");
		
        /* La formula para obtener un número entre dos números cualquiera es (X-Y+1)+Y. donde X es limite superior, Y el inferior */
        int numero1 = (int)(Math.random()*(999999-100000+1)+100000);
        int numero2 = (int)(Math.random()*(999999-100000+1)+100000);

        numeroTarjeta= Integer.toString(numero1)+Integer.toString(numero2);
		cvv = rand.nextInt(999-100+1)+100;
        // numeroTarjeta=""+rand.nextInt(1)+rand.nextInt(1-9);
        emisor=Emisores[rand.nextInt(2-0+1)+0];
        cupo=Math.abs(rand.nextLong());

        //Creamos una tarjeta clasica y mostramos en consola
		TarjetaCredito uno=new Clasica(emisor,cupo,numeroTarjeta,cvv,date.plusYears(rand.nextInt(5)));
        uno.toString();
        System.out.println(uno.toString());


        numero1 = (int)(Math.random()*(999999-100000+1)+100000);
        numero2 = (int)(Math.random()*(999999-100000+1)+100000);

        numeroTarjeta= Integer.toString(numero1)+Integer.toString(numero2);
       
		cvv = rand.nextInt(999-100+1)+100;
        // numeroTarjeta=""+rand.nextInt(1)+rand.nextInt(1-9);
        emisor=Emisores[rand.nextInt(2-0+1)+0];
        cupo=Math.abs(rand.nextLong());

        TarjetaCredito dos=new Dorada(emisor,cupo,numeroTarjeta,cvv,date.plusYears(rand.nextInt(5)));
        System.out.println(dos.toString());

        numero1 = (int)(Math.random()*(999999-100000+1)+100000);
        numero2 = (int)(Math.random()*(999999-100000+1)+100000);

        numeroTarjeta= Integer.toString(numero1)+Integer.toString(numero2);
       
		cvv =rand.nextInt(999-100+1)+100;
        // numeroTarjeta=""+rand.nextInt(1)+rand.nextInt(1-9);
        emisor=Emisores[rand.nextInt(2-0+1)+0];
        cupo=Math.abs(rand.nextLong());

        TarjetaCredito tres=new Black(emisor, cupo, numeroTarjeta, cvv, date.plusYears(rand.nextInt(5)));
        System.out.println(tres.toString());

        numero1 = (int)(Math.random()*(999999-100000+1)+100000);
        numero2 = (int)(Math.random()*(999999-100000+1)+100000);

        numeroTarjeta= Integer.toString(numero1)+Integer.toString(numero2);
		cvv = rand.nextInt(999-100+1)+100;
        // numeroTarjeta=""+rand.nextInt(1)+rand.nextInt(1-9);
        emisor=Emisores[rand.nextInt(2-0+1)+0];
        cupo=Math.abs(rand.nextLong());

        TarjetaCredito cuatro=new Platinium(emisor, cupo, numeroTarjeta, cvv, date.plusYears(rand.nextInt(5)));
        System.out.println(cuatro.toString());
	}
    
}

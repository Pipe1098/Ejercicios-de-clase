package Ejerciciosdeclase.EjercicioPractico2;

import java.time.LocalDate;

public class TarjetaCredito {
    protected String emisor;
    protected Long cupo;
    protected String numeroTarjeta;
    protected Integer cvv;
    protected LocalDate fechaVencimiento;

    public TarjetaCredito() {
    }

    public TarjetaCredito(String emisor, Long cupo, String numeroTarjeta, Integer cvv, LocalDate fechaVencimiento) {
        this.emisor = emisor;
        this.cupo = cupo;
        this.numeroTarjeta = numeroTarjeta;
        this.cvv = cvv;
        this.fechaVencimiento = fechaVencimiento;
    }

    public String getEmisor() {
        return emisor;
    }

    public Long getCupo() {
        return cupo;
    }

    public String getNumeroTarjeta() {
        return numeroTarjeta;
    }

    public Integer getCvv() {
        return cvv;
    }

    public LocalDate getFechaVencimiento() {
        return fechaVencimiento;
    }

    public void setEmisor(String emisor) {
        this.emisor = emisor;
    }

    public void setCupo(Long cupo) {
        this.cupo = cupo;
    }

    public void setNumeroTarjeta(String numeroTarjeta) {
        this.numeroTarjeta = numeroTarjeta;
    }

    public void setCvv(Integer cvv) {
        this.cvv = cvv;
    }

    public void setFechaVencimiento(LocalDate fechaVencimiento) {
        this.fechaVencimiento = fechaVencimiento;
    }

    @Override
    public String toString() {
        return "\n\nTarjetaCredito [emisor=" + emisor + ", cupo=" + cupo + ", numeroTarjeta=" + numeroTarjeta + ", cvv="
                + cvv
                + ", fechaVencimiento=" + fechaVencimiento + "]";
    }

}

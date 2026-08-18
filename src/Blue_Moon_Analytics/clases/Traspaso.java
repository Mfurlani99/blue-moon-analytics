package Blue_Moon_Analytics.clases;

import java.time.LocalDateTime;

public class Traspaso<T> {
    private T elemento;
    private String origen;
    private String destino;
    private LocalDateTime fechaRegistro;
    private boolean completado;

    public Traspaso(T elemento, String origen, String destino) {
        if (elemento == null) {
            throw new IllegalArgumentException("El elemento a traspasar no puede ser nulo.");
        }
        this.elemento = elemento;
        this.origen = origen;
        this.destino = destino;
        this.fechaRegistro = LocalDateTime.now();
        this.completado = false;
    }

    public boolean ejecutar() {
        if (!completado) {
            this.completado = true;
            this.fechaRegistro = LocalDateTime.now();
            return true;
        }
        return false;
    }

    public T getElemento() {
        return elemento;
    }

    public void setElemento(T elemento) {
        if (completado) {
            throw new IllegalStateException("No se puede modificar un traspaso ya completado.");
        }
        this.elemento = elemento;
    }

    public String getOrigen() {
        return origen;
    }

    public String getDestino() {
        return destino;
    }

    public LocalDateTime getFechaRegistro() {
        return fechaRegistro;
    }

    public boolean isCompletado() {
        return completado;
    }

    @Override
    public String toString() {
        return "Traspaso{" +
                "tipo=" + elemento.getClass().getSimpleName() +
                ", elemento=" + elemento +
                ", origen='" + origen + '\'' +
                ", destino='" + destino + '\'' +
                ", fechaRegistro=" + fechaRegistro +
                ", completado=" + completado +
                '}';
    }
}

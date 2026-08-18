package Blue_Moon_Analytics.clases;

import java.util.Objects;

public class Jugador extends IntegrantesClub{

  private int dorsal;
  private Posicion posicion;
  private boolean lesion;
  private int valor;

    public Jugador(String nombre, int sueldo, String club, int dorsal, Posicion posicion, boolean lesion, int valor) {
        super(nombre, sueldo, club);
        this.dorsal = dorsal;
        this.posicion = posicion;
        this.lesion = lesion;
        this.valor = valor;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        // Dos jugadores son iguales solo si coinciden nombre Y dorsal
        return dorsal == jugador.dorsal && Objects.equals(nombre, jugador.nombre);
    }

    @Override
    public int hashCode() {
        // Genera el código hash combinando ambos atributos
        return Objects.hash(nombre, dorsal);
    }

    @Override
    public String toString() {
        return "#" + dorsal + " " + nombre + " (" + posicion + ") - $" + valor;
    }
    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public boolean isLesion() {
        return lesion;
    }

    public void setLesion(boolean lesion) {
        this.lesion = lesion;
    }

    public int getValor() {
        return valor;
    }

    public void setValor(int valor) {
        this.valor = valor;
    }
}

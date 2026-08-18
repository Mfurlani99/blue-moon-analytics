package Blue_Moon_Analytics.clases;

public abstract class IntegrantesClub {

    protected String nombre;
    protected int sueldo;
    protected String club;

    public IntegrantesClub(String nombre, int sueldo, String club) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.club = club;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    public String getClub() {
        return club;
    }

    public void setClub(String club) {
        this.club = club;
    }
}

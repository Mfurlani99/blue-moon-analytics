package Blue_Moon_Analytics.clases;

public class Staff extends IntegrantesClub{
    private String rol;

    public Staff(String nombre, int sueldo, String club, String rol) {
        super(nombre, sueldo, club);
        this.rol = rol;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }
}

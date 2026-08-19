package Blue_Moon_Analytics.clases;

public enum Gravedad {
    GRAVE(1),
    LEBE(2),
    MEDIA(3);
    private final int codigo;

    Gravedad(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}

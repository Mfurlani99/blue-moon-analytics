package Blue_Moon_Analytics.constantes;

public enum Gravedad {
    GRAVE(1),
    LEBE(2),
    MEDIA(3),
    NULA(4);
    private final int codigo;

    Gravedad(int codigo) {
        this.codigo = codigo;
    }

    public int getCodigo() {
        return this.codigo;
    }
}

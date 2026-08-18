// Paquete donde se ubica la clase dentro de la arquitectura del proyecto
package Blue_Moon_Analytics.clases;

// Importación del framework de colecciones de Java (Map, Set, HashMap, HashSet)
import java.util.*;

/**
 * Representa la gestión de la plantilla de un equipo de fútbol.
 * Controla el presupuesto disponible, el registro de jugadores activos y
 * la lógica de negocio para compras y ventas a través de objetos Traspaso.
 */
public class Plantilla {

    // --- ATRIBUTOS DE ESTADO ---

    // Dinero disponible del club para realizar fichajes
    private int presupuesto;

    // Mapa clave-valor: Permite búsquedas instantáneas O(1) usando el nombre como clave
    // Clave: Nombre del jugador (String) | Valor: Objeto completo (Jugador)
    private Map<String, Jugador> jugadores;

    // Conjunto que almacena los nombres registrados oficialmente; evita duplicados automáticamente
    private Set<String> nomina;

    // --- CONSTRUCTOR ---

    /**
     * Inicializa una nueva plantilla con un presupuesto base.
     * Instancia las estructuras en memoria para evitar errores de tipo NullPointerException.
     */
    public Plantilla(int presupuestoInicial) {
        this.presupuesto = presupuestoInicial;
        this.jugadores = new HashMap<>(); // Implementación concreta de Map basada en tablas hash
        this.nomina = new HashSet<>();     // Implementación concreta de Set basada en tablas hash
    }

    // --- MÉTODOS DE GESTIÓN INTERNA ---

    /**
     * Da de alta a un jugador directamente (ej. canteranos o carga inicial).
     * No requiere validación de presupuesto ni ejecución de contrato de traspaso.
     */
    public void agregarJugador(Jugador jugador) {
        // 1. Guarda el objeto en el mapa asociándolo a su nombre
        jugadores.put(jugador.getNombre(), jugador);

        // 2. Registra el nombre en el conjunto de nómina
        nomina.add(jugador.getNombre());

        System.out.println("Jugador agregado a la plantilla: " + jugador.getNombre());
    }

    // --- OPERACIONES DE MERCADO (TRANSFERENCIAS) ---

    /**
     * Flujo de Compra:
     * 1. Extrae los datos del jugador desde el objeto genérico Traspaso<Jugador>.
     * 2. Valida la solvencia económica (presupuesto suficiente).
     * 3. Ejecuta el traspaso (cambia el estado interno del objeto Traspaso a completado).
     * 4. Descuenta el dinero y registra al jugador en las colecciones.
     */
    public boolean comprarJugador(Traspaso<Jugador> traspaso) {
        // Extrae el objeto encapsulado dentro del traspaso
        Jugador jugador = traspaso.getElemento();
        int costo = jugador.getValor();

        // VALIDACIÓN 1: ¿Alcanza el dinero disponible?
        if (costo > presupuesto) {
            System.out.println("Error: Presupuesto insuficiente para comprar a " + jugador.getNombre());
            return false; // Corta la ejecución si no hay fondos
        }

        // VALIDACIÓN 2: Ejecución del traspaso
        // traspaso.ejecutar() marca la transferencia como completada y evita reutilizarla
        if (traspaso.ejecutar()) {
            // Actualización contable: Resta el valor del fichaje al presupuesto
            presupuesto -= costo;

            // Actualización deportiva: Incorpora al jugador al club
            jugadores.put(jugador.getNombre(), jugador);
            nomina.add(jugador.getNombre());

            System.out.println("Compra exitosa: " + jugador.getNombre() + " desde " + traspaso.getOrigen());
            return true;
        }

        return false; // Falla si el traspaso ya había sido completado previamente
    }

    /**
     * Flujo de Venta:
     * 1. Extrae el jugador a vender.
     * 2. Valida que el jugador efectivamente pertenezca al club.
     * 3. Ejecuta el traspaso.
     * 4. Suma el dinero acordado al presupuesto y elimina al jugador de las colecciones.
     */
    public boolean venderJugador(Traspaso<Jugador> traspaso, int precioVenta) {
        Jugador jugador = traspaso.getElemento();

        // VALIDACIÓN 1: ¿El jugador está en el equipo?
        if (!jugadores.containsKey(jugador.getNombre())) {
            System.out.println("Error: " + jugador.getNombre() + " no está en la plantilla.");
            return false; // No se puede vender un activo que no se posee
        }

        // VALIDACIÓN 2: Ejecución formal del traspaso
        if (traspaso.ejecutar()) {
            // Actualización contable: Suma el ingreso por venta al presupuesto
            presupuesto += precioVenta;

            // Actualización deportiva: Remueve al jugador de ambas estructuras
            jugadores.remove(jugador.getNombre());
            nomina.remove(jugador.getNombre());

            System.out.println("Venta exitosa: " + jugador.getNombre() + " hacia " + traspaso.getDestino() + " por $" + precioVenta);
            return true;
        }

        return false;
    }

    // --- MÉTODOS DE ACCESO (ENCAPSULAMIENTO) ---

    // Permite consultar el saldo restante sin exponer la variable a modificaciones directas
    public int getPresupuesto() {
        return presupuesto;
    }

    // Permite acceder al mapa de jugadores para consultas externas
    public Map<String, Jugador> getJugadores() {
        return jugadores;
    }
}
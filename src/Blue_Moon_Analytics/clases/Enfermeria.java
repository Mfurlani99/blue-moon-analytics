package Blue_Moon_Analytics.clases;

import java.util.Comparator;
import java.util.Map;
import java.util.PriorityQueue;

public class Enfermeria {

    // 1. DTO inmutable: almacena los datos mínimos que el triage necesita evaluar
    record Paciente(String nombre, boolean lesionado, int gravedad) {}

    // 2. Método estático: ejecutable directamente como Enfermeria.procesarJugadores(...)
    public static void procesarJugadores(Map<String, Jugador> mapa) {

        // 3. Regla de prioridad de dos niveles:
        //    - 1° Triage: lesionados primero (true antes que false con .reversed())
        //    - 2° Desempate: mayor gravedad numérica primero (orden descendente)
        Comparator<Paciente> regla = Comparator
                .comparing(Paciente::lesionado).reversed()
                .thenComparing(Paciente::gravedad, Comparator.reverseOrder());

        // 4. Montículo (Heap) que organiza los elementos en memoria según la regla anterior
        PriorityQueue<Paciente> colaTriage = new PriorityQueue<>(regla);

        // 5. Extrae los valores del Map, crea cada Paciente y los inserta en la cola
        for (Jugador j : mapa.values()) {
            colaTriage.offer(new Paciente(
                    j.getNombre(),
                    j.isLesion(),
                    j.getGravedad().getCodigo()
            )); // offer() inserta y reordena el heap en tiempo O(log n)
        }

        // 6. Vacía la cola atendiendo siempre al paciente con mayor prioridad actual
        while (!colaTriage.isEmpty()) {
            Paciente p = colaTriage.poll(); // poll() remueve y retorna el elemento superior
            System.out.println("Atendiendo a: " + p.nombre() + " | Gravedad: " + p.gravedad());
        }
    }
}
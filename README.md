# Blue Moon Analytics — MatchDay

Sistema de consola en Java para la gestión integral de un club deportivo.  
A robust console-based Java system for comprehensive sports club management.

---

## Estructura del proyecto / Project structure

```
src/
├── Blue_Moon_Analytics/          # Proyecto principal / Main project
│   ├── main.java                 # Punto de entrada / Entry point
│   └── clases/                   # Dominio del modelo / Domain model
│       ├── Jugador.java          # Jugador del club / Club player
│       ├── Staff.java            # Personal del club / Club staff
│       ├── Plantilla.java        # Registro de plantilla / Squad registry
│       ├── Posicion.java         # Posiciones tácticas (Enum) / Tactical positions (Enum)
│       ├── Traspaso.java         # Sistema de transferencias (Genérico) / Transfer system (Generic)
│       └── IntegrantesClub.java  # Interfaz de integrantes / Member interface
│
├── PracticaSet.java              # Ejercicio: HashSet / Practice: HashSet
├── Practica_EntrySet.java        # Ejercicio: Map.EntrySet / Practice: Map.EntrySet
├── PracticaPriorityQueue.java    # Ejercicio: PriorityQueue / Practice: PriorityQueue
└── PracticaIteradores.java       # Ejercicio: Iteradores / Practice: Iterators
```

## Conceptos aplicados / Concepts covered

| Concepto / Concept | Archivo / File |
|---|---|
| Enum — Posiciones tácticas | `Posicion.java` |
| Genéricos — `Traspaso<T>` | `Traspaso.java` |
| Set — Registro sin duplicados | `Plantilla.java` |
| Map & EntrySet — Dorsales | `main.java` |
| List & Iterators — Historial de partidos | `main.java` |
| Queue — Enfermería (`PriorityQueue`, `ArrayDeque`) | `main.java` |
| Excepciones checked/unchecked | `PresupuestoExcedidoException`, `DorsalOcupadoException` |
| try-with-resources | Contratos / exportación de archivos |
| try-catch-finally | Negociaciones de traspasos |

## Requisitos / Requirements

- Java 17+
- IntelliJ IDEA (u otro IDE con soporte Java)

## Cómo ejecutar / How to run

1. Abrí el proyecto en IntelliJ IDEA.  
   Open the project in IntelliJ IDEA.
2. Ejecutá `src/Blue_Moon_Analytics/main.java`.  
   Run `src/Blue_Moon_Analytics/main.java`.

## Licencia / License

Proyecto académico — sin licencia de uso comercial.  
Academic project — no commercial license.

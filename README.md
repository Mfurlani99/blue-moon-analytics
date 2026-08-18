# Blue Moon Analytics — MatchDay

Sistema de consola en Java para la gestión integral de un club deportivo.  
A robust console-based Java system for comprehensive sports club management.

---

## Features

### Gestión de plantilla / Squad management
- Alta, baja y consulta de jugadores y staff del club.
- Registro oficial con `HashSet` para evitar duplicados por nombre.
- Búsqueda instantánea O(1) de jugadores por nombre mediante `HashMap`.

### Sistema de transferencias / Transfer system
- Clase genérica `Traspaso<T>` aplicable a cualquier tipo de integrante del club.
- Flujo de compra con validación de presupuesto antes de ejecutar.
- Flujo de venta con verificación de pertenencia al plantel.
- Protección contra doble ejecución: un traspaso solo puede completarse una vez.
- Registro automático de fecha y hora de cada operación.

### Posiciones tácticas / Tactical positions
- Enum `Posicion` con las cuatro posiciones estándar: `ARQUERO`, `DEFENSA`, `MEDIOCAMPISTA`, `DELANTERO`.
- Asignación tipada en la creación de jugadores, sin posibilidad de valores inválidos.

### Control presupuestario / Budget control
- Presupuesto inicial configurable al instanciar la plantilla.
- Descuento automático en compras y acreditación en ventas.
- Validación en tiempo real de fondos disponibles antes de cada operación.

### Cálculo de rendimiento temporada / Season performance
- Historial de resultados (`G`/`E`/`P`) almacenado en `ArrayList`.
- Recorrido con `Iterator` para calcular puntos acumulados de la temporada.

### Herencia y polimorfismo / Inheritance & polymorphism
- Clase abstracta `IntegrantesClub` como base para `Jugador` y `Staff`.
- `equals()` y `hashCode()` override en `Jugador` para igualdad por nombre + dorsal.
- `toString()` formateado con dorsal, posición y valor del jugador.

---

## Ejercicios prácticos / Practice exercises

| Ejercicio / Exercise | Concepto | Descripción / Description |
|---|---|---|
| `PracticaSet` | `TreeSet` | Filtra y ordena una lista de nombres eliminando duplicados. |
| `Practica_EntrySet` | `Map.EntrySet` | Itera un mapa de productos e incrementa precios por porcentaje. |
| `PracticaPriorityQueue` | `PriorityQueue` | Consulta el siguiente elemento sin extraerlo de la cola. |
| `PracticaIteradores` | `Iterator` | Elimina números negativos de una lista de forma segura. |

---

## Estructura del proyecto / Project structure

```
src/
├── Blue_Moon_Analytics/
│   ├── main.java                 # Punto de entrada / Entry point
│   └── clases/
│       ├── IntegrantesClub.java  # Clase abstracta base / Base abstract class
│       ├── Jugador.java          # Jugador del club / Club player
│       ├── Staff.java            # Personal del club / Club staff
│       ├── Plantilla.java        # Gestión de plantilla / Squad management
│       ├── Posicion.java         # Enum de posiciones / Positions enum
│       └── Traspaso.java         # Transferencias genéricas / Generic transfers
│
├── PracticaSet.java
├── Practica_EntrySet.java
├── PracticaPriorityQueue.java
└── PracticaIteradores.java
```

---

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

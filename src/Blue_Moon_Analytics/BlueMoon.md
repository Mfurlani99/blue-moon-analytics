
### 🏢 Cliente: Blue Moon Analytics

**Proyecto:** Sistema "MatchDay" para la gestión integral del club.



Requerimos un sistema de consola robusto, sin dependencias externas, que administre nuestra plantilla y tolere fallos críticos en pleno mercado de pases.



#### 📦 Módulo de Estructura de Datos

- **`Enum`**: Define las posiciones tácticas (ej: `DELANTERO`, `DEFENSA`).



- **Genéricos**: Crea una clase `Traspaso<T>` genérica que sirva para mover tanto a un `Jugador` como a un miembro del `Staff`.



- **`Set`**: Almacena el registro oficial de la plantilla para asegurar que no haya duplicados (elige entre `HashSet`, `TreeSet` o `LinkedHashSet`).



- **`Map` & `EntrySet`**: Vincula un número de dorsal (ej: el 9) con su respectivo jugador. Imprime el listado del equipo iterando con `entrySet()`.



- **`List` & `Iterators`**: Guarda el historial de partidos jugados en una `ArrayList` o `LinkedList`. Usa un **`Iterator`** para recorrerlo y calcular los puntos de la temporada.



- **`Queue`**: Gestiona la enfermería. Usa una `PriorityQueue` para atender primero a los jugadores con lesiones graves, y un `ArrayDeque` para la fila de rotación de kinesiología regular.




#### 🛡️ Módulo de Prevención de Desastres

- **Excepciones Propias**: Crea una `PresupuestoExcedidoException` (tipo **`checked`**) y una `DorsalOcupadoException` (tipo **`unchecked`**).



- **`throw` & `throws`**: Si intentan asignar un número en uso, delega la responsabilidad con `throws` y lanza el error explícitamente con `throw`.



- **`try-with-resources`**: Simula la firma y exportación de un contrato a un archivo. Úsalo obligatoriamente para evitar fugas de recursos.



- **`try`, `catch`, `finally`**: Captura los posibles errores en las negociaciones y usa `finally` para imprimir "Operación registrada en los libros", independientemente del resultado.




A futuro, este núcleo será la base matemática que conectaremos a nuestra base de datos en la nube y a la interfaz de usuario.

 
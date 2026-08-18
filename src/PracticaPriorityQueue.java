import java.util.PriorityQueue;

public class PracticaPriorityQueue {

    public class quiu{
        public static Integer consultarSiguiente(PriorityQueue<Integer> cola){
            return cola != null ? cola.peek() : null;
        }
    }

    static void main() {
        PriorityQueue<Integer> colas = new PriorityQueue<>();
        colas.add(2);
        colas.add(20);
        System.out.println("el numero es : " +quiu.consultarSiguiente(colas));

    }

}

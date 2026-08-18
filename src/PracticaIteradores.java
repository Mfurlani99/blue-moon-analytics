import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class PracticaIteradores {

    public class herramientas{

        public static void eliminarNegativos(List<Integer> numeros){
            Iterator<Integer> it = numeros.iterator();
            while (it.hasNext()){
             if (it.next() < 0){
            it.remove();
             }
            }
            System.out.println(numeros);
        }

    }

    static void main() {
        List<Integer> lnumeros = new ArrayList<>(List.of(10, 15, 20, -25));

        herramientas.eliminarNegativos(lnumeros);
    }

}

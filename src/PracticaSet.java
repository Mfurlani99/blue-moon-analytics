import java.util.List;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class PracticaSet {

    public static class Producto{

        public Set<String> filtrarYOrdenar(List<String> listaOriginal){

            Set<String> listaOrdenado = new TreeSet<>(listaOriginal);



            return listaOrdenado;
        };

    }


    static void main() {

        try (Scanner sc = new Scanner(System.in)) {
            Producto produ = new Producto();
            List<String> listaNombres = new java.util.ArrayList<>(List.of());
            System.out.println("cuantos nombres quiere agregar : ");
            int names = sc.nextInt();

            for (int i = 0; i < names; i++) {
                System.out.println("escriba su nombre = ");
                try {
                    String number = sc.next();
                    listaNombres.add(number);

                } catch (Exception e) {
                    System.out.println("error" + e);
                }


            }
            for (String lista : produ.filtrarYOrdenar(listaNombres)) {
                System.out.println(lista + " ");
            }
            ;


        } catch (ClassCastException ec) {
            System.out.println("error" + ec);
        }

    }

}

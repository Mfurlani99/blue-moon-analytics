import java.util.HashMap;
import java.util.Map;

public class Practica_EntrySet {


    public static class Aprecio{

        private static void incrementarPrecios(Map<String, Double> productos, double porcentaje){

            for (Map.Entry<String, Double> entry : productos.entrySet()) {
                String produ = entry.getKey();
                double precio = entry.getValue()  * (1 + porcentaje / 100);
                entry.setValue(precio);
                System.out.println(produ + " nuevo precio : " + precio);
            }

        }
    }

    static void main() {
        Map<String, Double> stock = new HashMap<>();
        stock.put("Manzanas", 50.3);
        stock.put("Bananas", 30.2);
        stock.put("pera", 80.8);

        Aprecio.incrementarPrecios(stock,10.0);

    }
}

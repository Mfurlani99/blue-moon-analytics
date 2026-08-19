import Blue_Moon_Analytics.clases.*;

import java.util.ArrayList;
import java.util.List;


public class main {
    public static void main(String[] args) {
        Plantilla miClub = new Plantilla(15_000_000);

        // 1. Agregar jugador base
        Jugador canterano = new Jugador("Lucas Romero", 10000, "libre",12, Posicion.ARQUERO,true,1000000, Gravedad.LEBE);
        miClub.agregarJugador(canterano);

        Jugador canterano2 = new Jugador("Lucas baszques", 10000, "libre",23, Posicion.DEFENSA,true,1000000, Gravedad.MEDIA);
        miClub.agregarJugador(canterano2);

        /*// 2. Comprar un jugador usando Traspaso<Jugador>
        Jugador refuerzo = new Jugador("matias Romero", 10000, "libre",23, Posicion.DELANTERO,false,1000000);
        Traspaso<Jugador> compra = new Traspaso<>(refuerzo, "Club Atlético", "Mi Club");
        miClub.comprarJugador(compra);

        // 3. Vender un jugador usando Traspaso<Jugador>
        Traspaso<Jugador> venta = new Traspaso<>(canterano, "Mi Club", "Liga Extranjera");
        miClub.venderJugador(venta, 4_500_000);

        // Estado final
        System.out.println("\n--- Resumen Final ---");
        System.out.println("Presupuesto actual: $" + miClub.getPresupuesto());
        System.out.println("Jugadores en plantilla: " + miClub.getJugadores().values());*/

        ArrayList<String> temporada = new ArrayList<>(List.of("E", "G", "P","E", "G", "P","E", "P"));

        System.out.println("el club termino la temporada con "+ miClub.partidosJugados(temporada)+" putos");


    }
}



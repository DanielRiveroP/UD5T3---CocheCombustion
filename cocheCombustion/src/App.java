import java.util.Scanner;
import net.salesianos.cocheCombustion.CocheCombustion;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String color = "Rojo";
        int numPuertas = 4;
        int numRuedas = 4;
        String modelo = "Sedan";
        String matricula = "1234ABC";
        int litrosCombustible = 20;
        CocheCombustion coche = new CocheCombustion(color, numPuertas, numRuedas, modelo, matricula, litrosCombustible) {
        };

        coche.mover();

        sc.close();
    }
}

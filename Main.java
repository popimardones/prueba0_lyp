
import java.util.Scanner;

import cartas.Baraja;
import cartas.Carta;
import cartas.Numero;
import cartas.Pinta;

public class Main {

    private static Scanner scanner;

	public static void main(String[] args) {
		
		Pinta pintaSeleccionada = null;
		Numero numeroSeleccionado = null;
        // creamos una baraja
        Baraja baraja = new Baraja();
        // la barajamos (virtualmente ^_^)
        baraja.barajar();
        scanner = new Scanner(System.in);
        System.out.println("Elige una carta. Yo te diré en que posición de la baraja está.");
        System.out.println("Primero elige una pinta:");
        for(Pinta pinta: Pinta.values()) {
            System.out.println(pinta.ordinal() + ". " + pinta.name());
        }
        
        int indicePinta = scanner.nextInt();
        pintaSeleccionada = Pinta.values()[indicePinta];
        
        System.out.println("Ahora elige un número:");
        for(Numero numero: Numero.values()) {
            System.out.println(numero.ordinal() + ". " + numero.name());
        }
        
       
        int indiceNumero = scanner.nextInt();
        numeroSeleccionado = Numero.values()[indiceNumero];
        
        Carta cartaUsuario = new Carta(pintaSeleccionada, numeroSeleccionado);
        // ahora recorremos la baraja
        Integer posicion = 1;
        for(Carta carta: baraja.getCartas()) {
            System.out.println("Comparando con carta " + carta);
            if (carta.equals(cartaUsuario)) {
                System.out.println("Tu carta está en la posición " + posicion);
                break;
            }
            posicion++;
        }
    }
}

package cartas;

import java.util.Collections;
import java.util.List;

import cartas.pintas.Corazon;
import cartas.pintas.Espada;
import cartas.pintas.Rombo;
import cartas.pintas.Trebol;


import java.util.ArrayList;


public class Baraja {

    // lo que va entre <> es para decir que la lista es de Cartas :)
    protected List<Carta> cartas;

    public Baraja() {
        cartas = new ArrayList<Carta>();

            /*
                Acá deben completar el constructor de forma de
                poblar la lista de cartas con todas las cartas de
                las cuatro pintas. Las cartas se deben crear con subclases de Carta
                para cada una de las pintas, con un constructor como se muestra
                en el ejemplo.
                NO SE OLVIDEN DE AGREGAR CADA CARTA A LA LISTA
            */
              
        
        for(Numero numero: Numero.values()) {
            Carta carta1 = new Corazon(numero);
            cartas.add(carta1);
            
            Carta carta2 = new Rombo(numero);
            cartas.add(carta2);

            Carta carta3 = new Espada(numero);
            cartas.add(carta3);

            Carta carta4 = new Trebol(numero);
            cartas.add(carta4);

   
            /*
                Acá deben completar el constructor de forma de
                poblar la lista de cartas con todas las cartas de
                las cuatro pintas. Las cartas se deben crear con subclases de Carta
                para cada una de las pintas, con un constructor como se muestra
                en el ejemplo.
                NO SE OLVIDEN DE AGREGAR CADA CARTA A LA LISTA
            */
            
        }
 
        
    }

    public List<Carta> getCartas() {
		return cartas;
	}
    // acá falta un método :) Ve el método main de la clase Main

    public void barajar() {
        Collections.shuffle(this.cartas);
    }


}

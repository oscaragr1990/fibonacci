package fibonacci;


import java.util.ArrayList;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author T14927
 */
public class SerieFibonacci {

    /**
     * Obtiene el numero n-esimo de la serie de fibonacci
     * @param n n-esimo
     * @return
     */
    public int fibonacci(int n) {
        if (n > 1) {
            return fibonacci(n - 1) + fibonacci(n - 2);  //función recursiva
        } else if (n == 1) {  // caso base
            return 1;
        } else if (n == 0) {  // caso base
            return 0;
        } else { //error
            return -1;
        }
    }

    /**
     * Obtiene los n numero de la serie de fibonacci
     * @param tamano
     * @return
     */
    public List mostrarSerie(int tamano) {
        List serie = new ArrayList();
        if (tamano > 1) {
            for (int i = 0; i < tamano; i++) {
                serie.add(fibonacci(i));
            }
        }
        return serie;
    }

}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci;

import java.util.List;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author T14927
 */
@WebService(serviceName = "Fibonacci")
public class Fibonacci {

    /**
     * This is a sample web service operation
     *
     * @param nesimo
     * @return
     */
    @WebMethod(operationName = "calcularElementoFibonacci")
    public int calcularElementoFibonacci(@WebParam(name = "nesimo") int nesimo) {
        SerieFibonacci serie = new SerieFibonacci();
        return serie.fibonacci(nesimo);
    }

    /**
     * This is a sample web service operation
     *
     * @param tamano
     * @return
     */
    @WebMethod(operationName = "calcularSerieFibonacci")
    public List calcularSerieFibonacci(@WebParam(name = "tamano") int tamano) {
        SerieFibonacci serie = new SerieFibonacci();
        return serie.mostrarSerie(tamano);
    }
}

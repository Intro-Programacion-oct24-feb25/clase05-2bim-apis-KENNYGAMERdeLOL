/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete06;

import paquete03.*;
import paquete04.OperadorUno;
import paquete04.OperadorDos;
import paquete05.OperadorTres;

// import paquete04.*;
/**
 *
 * @author reroes
 */
public class imprimir {

    public static void imprimirMensaje(int a, int b, int sum, int mult){
    
        System.out.printf("La suma de %d + %d es igual a: %d\n"
                + "La multiplicacion de %d * %d es igual a: %d\n",
                a,b,
                sum,
                a, b,
                mult);
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacionybusqueda;

import static ordenacionybusqueda.Metodos.busquedaBinaria;
import static ordenacionybusqueda.Metodos.insercion;
import static ordenacionybusqueda.Metodos.quickSort;
import static ordenacionybusqueda.Metodos.seleccion;
import static ordenacionybusqueda.Metodos.shell;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public class OrdenacionYBusqueda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Object [] a = {2,3,7,1,9,4,0};
        //Insercion
        insercion(a, a.length);
        System.out.println("Insercion: 2 3 7 1 9 4 0");
        String aS = "Resultado: ";
        for (Object a1 : a) {
            aS += a1 + " ";
        }
        System.out.println(aS + "\n");
        
        Object [] b = {12,5,9,1,9,99,66};
        //Seleccion
        seleccion(b, b.length);
        System.out.println("Seleccion: 12 5 9 1 9 99 66");
        String bS = "Resultado: ";
        for (Object b1 : b) {
            bS += b1 + " ";
        }
        System.out.println(bS + "\n");
        
        Object [] c = {13,22,1989,19,6,9,28};
        shell(c, c.length);
        System.out.println("Shell: 13 22 1989 19 6 9 28");
        System.out.println(c.length);
        String cS = "Resultado: ";
        for (Object c1 : c) {
            cS += c1 + " ";
        }
        System.out.println(cS + "\n");
        
        Object [] d = {1,1,99,30,56,7,78,98,34,82,86,81};
        quickSort(d, 0, d.length-1);
        System.out.println("Quicksort: 1 1 99 30 56 7 78 98 34 82 86 81");
        String dS = "Resultado: ";
        for (Object d1 : d) {
            dS += d1 + " ";
        }
        System.out.println(dS + "\n");
        
        Object [] e = {1,2,3,4,5,6};
        System.out.println("Busqueda binaria: 1 2 3 4 5 6");
        System.out.println("Resultado: " + busquedaBinaria(e,e.length, 5));
    }
    
}

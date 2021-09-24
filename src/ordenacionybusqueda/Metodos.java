/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordenacionybusqueda;

/**
 *
 * @author Angelica Figueroa Muñiz
 */
public final class Metodos {
    
    private Metodos(){
    }
    
    public static void insercion(Object [] a, int n){//recibe el arreglo de objetos y la longitud n del arreglo
        Object aux;//auxiliar
        int k;
        for(int i = 1; i < n; i++){//mientras que i sea menor al tamaño del arreglo
            aux = a[i];//auxiliar es igual el arreglo en la posicion de i
            k = i - 1;
            while(k >= 0 && aux.hashCode() < a[k].hashCode()){//mientras que k sea mayor o igual a cero y si a[k] es menor al auxiliar osea el de la izquierda
                a[k + 1] = a[k];//el de la izquierda se cambia por a[k] porque es mayor
                k = k - 1;//se disminuye k en 1
            }
            a[k + 1] = aux;//el menor se coloca en la posicion original del mayor (izquierda)
        }
    }
    
    public static void seleccion(Object [] a, int n){//recibe el arreglo de objetos y la longitud n del arreglo
        Object menor;
        int k;
        for(int i = 0; i < n - 1; i++){//for para cada elemento de la lista
            menor = a[i];//el menor sera el primero de la lista al iniciar el for
            k = i;
            for(int j = i + 1; j < n; j++){//para j = i hasta la longitud del arreglo
                if(a[j].hashCode() < menor.hashCode()){//si a[j] es menor a menor
                    menor = a[j];//menor ahora sera a[j]
                    k = j;//k es igual a la posicion donde a[j] ya no fue menor al menor
                }
            }
            a[k] = a[i];//a[k] la posicion del valor menor se cambia a el primer elemento
            a[i] = menor;//el primer elemento ahora es el menor
        }
    }
    
    public static void shell(Object [] a, int n){
        int inter = n + 1;//intervalo es igual a la longitud del arreglo mas 1
        int band;//bandera
        int i;
        Object aux;//auxiliar
        while(inter > 1){//mientras el intervalo es mayor a 1
            inter = (int) inter / 2;//intervalo es igual a la parte entera de la mitad del intervalo
            band = 1;//bandera igual a 1
            while(band == 1){//mientras que la bandera sea igual a 1
                band = 0;//la bandera se hace 0
                i = 0;
                while(i + inter <= n - 1){//mientras que i mas el intervalo sean menor o igual a la longitud del arreglo
                    if(a[i].hashCode() > a[i + inter].hashCode()){//si a[i] es mayor a a[i + inter]
                        aux = a[i];//aux es igual al mayor (a[i])
                        a[i] = a[i + inter];//a[i] se cambia por a[i + inter] (el menor}
                        a[i + inter] = aux;//se pone el menor en la posicion de a[i + inter]
                        band = 1;//la bandera se hace 1
                    }
                    i = i + 1;//se aumenta 1
                }
            }
        }
    }
    
    public static void quickSort(Object [] a, int inicio, int fin){//arreglar quicksort
        int izquierda = inicio;
        int derecha = fin;
        int pos = inicio;
        Object aux;
        String band = "V";
        while(band.matches("V")){
            band = "F";
            while(a[pos].hashCode() <= a[derecha].hashCode() && pos != derecha){
                derecha--;
            }
            if(pos != derecha){
                aux = a[pos];
                a[pos] = a[derecha];
                a[derecha] = aux;
                pos = derecha;
                while(a[pos].hashCode() >= a[izquierda].hashCode() && pos != izquierda){
                    izquierda++;
                }
                if(pos != izquierda){
                    band = "V";
                    aux = a[pos];
                    a[pos] = a[izquierda];
                    a[izquierda] = aux;
                    pos = izquierda;
                }
            }
        }
        if(pos - 1 > inicio){
            quickSort(a, inicio, pos - 1);
        }
        if(fin > pos + 1){
            quickSort(a, pos + 1, fin);
        }
    }
    
    public static int busquedaBinaria(Object[] a, int n, Object x) {
        int izquierda = 0;
        int derecha = n;
        int b = 0;
        int centro = 0;
        while (izquierda <= derecha && b == 0) {
            centro = (int) (izquierda + derecha) / 2;
            if (x.hashCode() == a[centro].hashCode()) {
                b = 1;
            } else {
                if (x.hashCode() > a[centro].hashCode()) {
                    izquierda = centro + 1;
                } else {
                    derecha = centro - 1;
                }
            }
        }
        if (b == 1) {
            return centro;
        } else {
            return -1;
        }
    }
    
    
}

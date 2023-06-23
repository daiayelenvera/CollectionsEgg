/*
1. Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

2. Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package coleccionesjava;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;



public class ColeccionesJava {

    public static void main(String[] args) {
        ArrayList<String> razas = new ArrayList();
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        
        int opcion=0;
        while(opcion!=2){
            System.out.println("-------------"
                    + "\nIngrese una opcion:"
                    + "\n1- para ingresar una raza"
                    + "\n2- salir");
             opcion = leer.nextInt();
            
            if (opcion==1) {
                System.out.println("Escribe una raza de perro");
                String perro = leer.next();
                razas.add(perro);                
            } else if(opcion==2){
                System.out.println("Saliendo...");
                for (String raza : razas) {
                    System.out.println(raza);
                    
                }
                System.out.println("Busca una raza para eliminar"); 
                Iterator<String> it = razas.iterator();
                String buscar = leer.next();
                boolean aux = false;
                while(it.hasNext()){
                   // System.out.println("el valor de it.next(): " + it.next());
                    
                    if(buscar.equalsIgnoreCase(it.next())){
                        it.remove();
                        
                        aux = true;
                        
                    } 
                    
                }
                if(!aux){
                    System.out.println("No se encontro la raza del perro");
                }
                Collections.sort(razas);
            }
        }
        
        
        System.out.println("--------------------------");
        
        for (String raza : razas) {
            System.out.println(raza);
        }
                
    }
    
}

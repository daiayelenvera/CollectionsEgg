/*
3. Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
 */
package Iteraciones;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Servicio {

    Scanner leer = new Scanner(System.in);
    List<Alumno> alumnos = new ArrayList();
    boolean crearOtroAlumno = true;

    public Alumno CrearAlumno() {
        Alumno al1 = new Alumno();
        while (crearOtroAlumno) {

            System.out.println("Ingrese el nombre");
            al1.setNombre(leer.next());
            List<Integer> notas = new ArrayList();
            for (int i = 1; i <= 3; i++) {
                System.out.println("Ingresa la nota " + i + " del alumno");
                int nota = leer.nextInt();
                notas.add(nota);

                alumnos.add(al1);
                al1.setNotaAlumno(notas);

            }
            System.out.println("Quieres agregar otro alumno? (y/n)");
            String respuesta = leer.next();

            if (respuesta.equalsIgnoreCase("n")) {
                crearOtroAlumno = false;
            }
        }

        return al1;
    }

    public double notaFinal(String nombreAlumno, List<Alumno> lista){
        
        for (Alumno alumno : lista) {
            if (alumno.getNombre().equalsIgnoreCase(nombreAlumno)) {
                List <Integer> notas = alumno.getNotaAlumno();
                double promedio =0; 
                for (Integer nota : notas) {
                    promedio += nota;
                }
                promedio /= notas.size();
                return promedio;
            }
            
        }
        return -1;
        
    }
    
    
    
}

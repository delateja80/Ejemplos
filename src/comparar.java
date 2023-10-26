import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparar {
    public static void main(String[] args) {
  
        ArrayList<Integer> numeros = new ArrayList<>();
        numeros.add(33);
        numeros.add(11);
        numeros.add(44);
        numeros.add(22);

        ArrayList<String> colores = new ArrayList<>();
        colores.add("Azul");
        colores.add("Blanco");
        colores.add("Rojo");
        colores.add("Verde");
        colores.add("Violeta");

        ArrayList<Alumno> alumnos = new ArrayList<>();
        alumnos.add(new Alumno(3333, "Luis", "Perez", 1.82, SituacionAcademica.REGULAR));
        alumnos.add(new Alumno(1111, "Maria", "Gomez", 1.66, SituacionAcademica.REGULAR));
        alumnos.add(new Alumno(4444, "Pepe", "Lopez", 1.78, SituacionAcademica.IRREGULAR));
        alumnos.add(new Alumno(2222, "Ana", "Jerez", 1.69, SituacionAcademica.BAJA));

        //Collections.sort(alumnos);
        ComparaAlumnos ca =new ComparaAlumnos();
        Collections.sort(alumnos,ca);
        mostrarLista(alumnos);
    }

    public static void mostrarLista(List<?> lista) {
        for (Object x : lista) {
            System.out.println(x);
        }
    }
}
   


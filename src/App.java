import java.util.ArrayList;
import java.util.Iterator;


public class App {
    public static void main(String[] args)  {
        //lista de mandado        
/*         ArrayList<String> mandado =new ArrayList<String>();

        mandado.add("peras");
        mandado.add("manzanas");
        mandado.add("tomates");
        mandado.add("calabazas");

        Iterator<String> it = mandado.iterator();

        while(it.hasNext()){
            if(it.next().equals("tomates"))
            {it.remove();}           
        }
 
        for (String s : mandado) {
            if(s.equals("tomates"))
            {mandado.remove(mandado.indexOf(s));}
        }
        System.out.println(mandado);
 */

        
        Grupo ico27 =new Grupo("ICO27");
        ico27.agregarAlumno(new Alumno(3333, "Luis", "Perez", 1.82, SituacionAcademica.REGULAR));
        ico27.agregarAlumno(new Alumno(1111, "Maria", "Gomez", 1.66, SituacionAcademica.REGULAR));
        ico27.agregarAlumno(new Alumno(4444, "Pepe", "Lopez", 1.78, SituacionAcademica.IRREGULAR));
        ico27.agregarAlumno(new Alumno(2222, "Ana", "Jerez", 1.69, SituacionAcademica.BAJA));

        Iterator<Alumno> iterarGpo = ico27.iterator();
        
        while(iterarGpo.hasNext()){
            System.out.println(iterarGpo.next());           
        } 

    }
}

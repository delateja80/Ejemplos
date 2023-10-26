import java.util.ArrayList;
import java.util.Iterator;

public class Grupo implements Iterable<Alumno> {

    private String nombre;
    private ArrayList<Alumno> alumnos;

    public Grupo(String nombre) {
        this.nombre = nombre;
        this.alumnos= new ArrayList<>();
    }

    public void agregarAlumno(Alumno alumno){
        this.alumnos.add(alumno);
    }
     public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    @Override
    public Iterator iterator() {
        //return alumnos.iterator();
        return new IterarGrupo();
    }

    private class IterarGrupo implements Iterator<Alumno>{
        private int posicion=0;
        @Override
        public boolean hasNext() {
            while(posicion < alumnos.size()&&
            alumnos.get(posicion).getSituacionAcademica()==
            SituacionAcademica.BAJA){
                posicion++;
            }
            return posicion < alumnos.size();
        }
        @Override
        public Alumno next() {
            return alumnos.get(posicion++);
        }
        

    }

    
    
}

import java.util.Comparator;

public class ComparaAlumnos implements Comparator<Alumno> {

    @Override
    public int compare(Alumno o1, Alumno o2) {
        return o2.getNoCuenta() - o1.getNoCuenta();
    }
    
}

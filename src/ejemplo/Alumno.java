package ejemplo;

public class Alumno {
    private int numeroCuenta;
    private String nombre;
    public Alumno(int numeroCuenta, String nombre) {
        this.numeroCuenta = numeroCuenta;
        this.nombre = nombre;
    }
    public int getNumeroCuenta() {
        return numeroCuenta;
    }
    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    
}

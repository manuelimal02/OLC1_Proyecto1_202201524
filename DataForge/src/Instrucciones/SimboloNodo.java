package Instrucciones;
/**
 *
 * @author manuel
 */
public class SimboloNodo { 
    private String nombre;
    private String tipo;
    private String rol;
    private String valor;

    public SimboloNodo(String nombre, String tipo, String rol, String valor) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rol = rol;
        this.valor = valor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getRol() {
        return rol;
    }

    public void setRol(String rol) {
        this.rol = rol;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

           
}

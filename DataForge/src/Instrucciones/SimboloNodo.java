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
    private String linea;
    private String columna;

    public SimboloNodo(String nombre, String tipo, String rol, String valor, String linea, String columna) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.rol = rol;
        this.valor = valor;
        this.linea = linea;
        this.columna = columna;
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

    public String getLinea() {
        return linea;
    }

    public void setLinea(String linea) {
        this.linea = linea;
    }

    public String getColumna() {
        return columna;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    
}

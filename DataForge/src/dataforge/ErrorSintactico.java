package dataforge;
/**
 *
 * @author manuel
 */
public class ErrorSintactico {
    private String tipo;
    private String token;
    private int linea;
    private int columna;

    public ErrorSintactico(String tipo, String token, int linea, int columna) {
        this.tipo = tipo;
        this.token = token;
        this.linea = linea;
        this.columna = columna;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getLinea() {
        return linea;
    }

    public void setLinea(int linea) {
        this.linea = linea;
    }

    public int getColumna() {
        return columna;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }
    
    
}

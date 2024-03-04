package Instrucciones;
/**
 *
 * @author manuel
 */
public class Variable {
    private String ID;
    private String valor;

    public Variable(String ID, String valor) {
        this.ID = ID;
        this.valor = valor;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
           
}

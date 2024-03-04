package dataforge;
import java.util.LinkedList;
import Instrucciones.Variable;
/**
 *
 * @author manuel
 */
public class AppState {
    public static LinkedList<Token> listaToken = new LinkedList<>();
    public static LinkedList<ErrorLexico> listaErrorLexico = new LinkedList<>();
    public static LinkedList<Variable> listaVariable = new LinkedList<>();
}

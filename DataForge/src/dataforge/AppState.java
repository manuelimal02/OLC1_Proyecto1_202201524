package dataforge;
import java.util.LinkedList;
import Instrucciones.SimboloNodo;
/**
 *
 * @author manuel
 */
public class AppState {
    public static LinkedList<Token> listaToken = new LinkedList<>();
    public static LinkedList<ErrorLexico> listaErrorLexico = new LinkedList<>();
    public static LinkedList<ErrorSintactico> listaErrorSintactico = new LinkedList<>();
    public static LinkedList<SimboloNodo> tablaSimbolo = new LinkedList<>();
}

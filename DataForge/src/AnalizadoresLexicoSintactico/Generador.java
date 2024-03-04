package AnalizadoresLexicoSintactico;
/**
 *
 * @author manuel
 */
public class Generador {
    public static void main(String[] args) {
        try {
            String ruta = "./src/AnalizadoresLexicoSintactico/"; 
            String[] opJFlex = {ruta+"lexico.jflex","-d",ruta};
            jflex.Main.generate(opJFlex);
            String[] opCup = {"-destdir",ruta,"-parser","Parser",ruta+"sintactico.cup"};
            java_cup.Main.main(opCup);
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

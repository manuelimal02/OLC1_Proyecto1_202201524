package Instrucciones;
import java.util.LinkedList;
import javax.swing.*;
import java.util.*;
import Reportes.*;
/**
 *
 * @author manuel
 */
public class ArbolSintactico {
    //-----------------------------------------------------------------------------------------------------------------------------------
    private String Elemento;
    public String Result;
    private LinkedList<ArbolSintactico> Hijos;

    public ArbolSintactico(String Elemento) {
        this.Elemento = Elemento;
        this.Hijos = new LinkedList();
    }
    public void AgregarHijo(ArbolSintactico Hijo){
        this.Hijos.add(Hijo);
    }
    
    public String BuscarVariable(LinkedList<SimboloNodo> TablaS, String Variable){
        for (SimboloNodo Simbolo : TablaS) {
            if(Simbolo.getNombre().equals(Variable)){
                return Simbolo.getValor();  
            }
        }
        return "ERROR SEMANTICO";
    }
    //-----------------------------------------------------------------------------------------------------------------------------------
    public static String calcularMedia(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        double suma = 0;
        int cantidadNumeros = 0;
        for (String numeroComoString : numerosComoStrings) {
            try {
                double numero = Double.parseDouble(numeroComoString.trim());
                suma += numero;
                cantidadNumeros++;
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el número Media: " + numeroComoString);
            }
        }
        if (cantidadNumeros > 0) {
            double media = suma / cantidadNumeros;
            return String.format("%.2f", media);
        } else {
            return "No hay números válidos para calcular la media.";
        }
    }
    //--------------------------------------------------------------------------
    public static String calcularMediana(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        double[] numeros = new double[numerosComoStrings.length];
        for (int i = 0; i < numerosComoStrings.length; i++) {
            try {
                numeros[i] = Double.parseDouble(numerosComoStrings[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el número Mediana: " + numerosComoStrings[i]);
            }
        }
        Arrays.sort(numeros);
        double mediana;
        if (numeros.length % 2 == 0) {
            int medio1 = numeros.length / 2 - 1;
            int medio2 = numeros.length / 2;
            mediana = (numeros[medio1] + numeros[medio2]) / 2.0;
        } else {
            int medio = numeros.length / 2;
            mediana = numeros[medio];
        }
        return String.format("%.2f", mediana);
    }
    //--------------------------------------------------------------------------
    public static String calcularModa(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        Map<Double, Integer> frecuenciaMap = new HashMap<>();
        for (String numeroComoString : numerosComoStrings) {
            try {
                double numero = Double.parseDouble(numeroComoString.trim());
                frecuenciaMap.put(numero, frecuenciaMap.getOrDefault(numero, 0) + 1);
            } catch (NumberFormatException e) {
                // Manejar excepción si la conversión a double falla
                System.out.println("Error al convertir el número: " + numeroComoString);
            }
        }
        double moda = Double.NaN;
        int frecuenciaMaxima = 0;
        for (Map.Entry<Double, Integer> entry : frecuenciaMap.entrySet()) {
            if (entry.getValue() > frecuenciaMaxima) {
                moda = entry.getKey();
                frecuenciaMaxima = entry.getValue();
            }
        }
        for (Map.Entry<Double, Integer> entry : frecuenciaMap.entrySet()) {
            if (entry.getValue() == frecuenciaMaxima && entry.getKey() != moda) {
                return "MULTIPLES MODAS";
            }
        }
        return String.format("%.2f", moda);
    }
    //--------------------------------------------------------------------------
    public static String calcularVarianza(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        double[] numeros = new double[numerosComoStrings.length];
        for (int i = 0; i < numerosComoStrings.length; i++) {
            try {
                numeros[i] = Double.parseDouble(numerosComoStrings[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el número: " + numerosComoStrings[i]);
            }
        }
        double media = Media(numeros);
        double sumaCuadradosDiferencias = 0;
        for (double numero : numeros) {
            sumaCuadradosDiferencias += Math.pow(numero - media, 2);
        }
        double varianza = sumaCuadradosDiferencias / numeros.length;
        return String.format("%.2f", varianza);
    }
    private static double Media(double[] numeros) {
        double suma = 0;
        for (double numero : numeros) {
            suma += numero;
        }
        return suma / numeros.length;
    }
    //--------------------------------------------------------------------------
    public static String encontrarValorMaximo(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        double[] numeros = new double[numerosComoStrings.length];
        for (int i = 0; i < numerosComoStrings.length; i++) {
            try {
                numeros[i] = Double.parseDouble(numerosComoStrings[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el número: " + numerosComoStrings[i]);
            }
        }
        double valorMaximo = Double.NEGATIVE_INFINITY;
        for (double numero : numeros) {
            if (numero > valorMaximo) {
                valorMaximo = numero;
            }
        }
        return String.format("%.2f", valorMaximo);
    }
    //--------------------------------------------------------------------------
    public static String encontrarValorMinimo(String cadena) {
        String[] numerosComoStrings = cadena.split(",");
        double[] numeros = new double[numerosComoStrings.length];
        for (int i = 0; i < numerosComoStrings.length; i++) {
            try {
                numeros[i] = Double.parseDouble(numerosComoStrings[i].trim());
            } catch (NumberFormatException e) {
                System.out.println("Error al convertir el número: " + numerosComoStrings[i]);
            }
        }
        double valorMinimo = Double.POSITIVE_INFINITY;
        for (double numero : numeros) {
            if (numero < valorMinimo) {
                valorMinimo = numero;
            }
        }
        return String.format("%.2f", valorMinimo);
    }
    //--------------------------------------------------------------------------
    public static String imprimirVariable(String cadena) {
        String[] elementos = cadena.split(",");
        StringBuilder resultado = new StringBuilder();
        for (String elemento : elementos) {
            if (resultado.length() > 0) {
                resultado.append(", ");
            }
            String elementoTrimmed = elemento.trim().replaceAll("^\"|\"$", "");
            resultado.append(elementoTrimmed);
        }
        return resultado.toString();
    }
    //--------------------------------------------------------------------------
    public static String imprimirArreglo(String titulo, String lista) {
        StringBuilder resultado = new StringBuilder();
        titulo = titulo.replaceAll("^\"|\"$", "");
        resultado.append("-----\n");
        resultado.append(titulo).append("\n");
        resultado.append("-----\n");
        String[] elementos = lista.split(",");
        for (String elemento : elementos) {
            String elementoTrimmed = elemento.trim().replaceAll("^\"|\"$", "");
            resultado.append(elementoTrimmed).append("\n");
        }
        return resultado.toString().trim();
    }
    //-----------------------------------------------------------------------------------------------------------------------------------
    public void EjecutarInterprete(ArbolSintactico Raiz, JTextArea Consola, LinkedList<SimboloNodo> TablaS, JTabbedPane tabbedPane){
        for (ArbolSintactico Hijo: Raiz.Hijos){
            EjecutarInterprete(Hijo, Consola, TablaS, tabbedPane);
        }
        if(Raiz.getElemento()=="Declaracion Variable"){
            SimboloNodo SimboloNuevo = new SimboloNodo(
                    Raiz.getHijos().get(5).getElemento(),  
                    Raiz.getHijos().get(2).getElemento(),
                    "Variable",
                    Raiz.getHijos().get(8).Result
            );
            TablaS.add(SimboloNuevo);
            
        }else if(Raiz.getElemento()=="Declaracion Arreglo"){
            SimboloNodo SimboloNuevo = new SimboloNodo(
                    Raiz.getHijos().get(5).getElemento(),
                    Raiz.getHijos().get(2).getElemento(),
                    "Array",
                    Raiz.getHijos().get(8).Result
            );
            TablaS.add(SimboloNuevo);
        }
        else if(Raiz.getElemento()=="Declaracion Imprimir" && Raiz.getHijos().size()==8){
            String Variable = imprimirVariable(Raiz.getHijos().get(5).Result);
            Consola.append(Variable+"\n");
        }
        else if(Raiz.getElemento()=="Declaracion Imprimir" & Raiz.getHijos().size()==11){
            String Arreglo = imprimirArreglo(Raiz.getHijos().get(5).Result, Raiz.getHijos().get(8).Result);
            Consola.append(Arreglo+"\n");
        }
        else if(Raiz.getElemento()=="Declaracion Imprimir" & Raiz.getHijos().size()==2){
            String Arreglo = imprimirArreglo(Raiz.getHijos().get(0).Result, Raiz.getHijos().get(1).Result);
            Consola.append(Arreglo+"\n");
        }
        else if(Raiz.getElemento()=="Declaracion Grafica" & Raiz.getHijos().size()==10){
            if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("GRAPHBAR")){
                String Graph = GraficaBarra.crearGrafica(Raiz.getHijos().get(2).Result, tabbedPane);
                Consola.append(Graph+"\n");
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("GRAPHPIE")){
                String Graph = GraficaCircular.crearGraficaCircular(Raiz.getHijos().get(2).Result, tabbedPane);
                Consola.append(Graph+"\n");
            }
            else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("GRAPHLINE")){
                String Graph = GraficaLineal.crearGraficaLineas(Raiz.getHijos().get(2).Result, tabbedPane);
                Consola.append(Graph+"\n");
            }
            else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("HISTOGRAM")){
                String Graph = GraficaHistograma.crearHistograma(Raiz.getHijos().get(2).Result, tabbedPane);
                Consola.append(Graph+"\n");
            }
        }
        else if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().size()==1){
            Raiz.Result=Raiz.getHijos().get(0).getElemento();
            if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().get(0).getElemento().startsWith("\"")){
                Raiz.Result=Raiz.getHijos().get(0).getElemento();
            }else{
                try{
                    double PRUEBA = Double.parseDouble(Raiz.getHijos().get(0).getElemento()); 
                    Raiz.Result=Raiz.getHijos().get(0).getElemento(); 
                }catch (Exception e){
                    String Valor = this.BuscarVariable(TablaS, Raiz.getHijos().get(0).getElemento());
                    if (Valor.equals("ERROR SEMANTICO")){
                        System.out.println("ERROR SEMANTICO-VARIABLE NO ENCONTRADA");
                    }else{
                        Raiz.Result=Valor;
                    }
                }
            }
        }else if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().size()==1){
            Raiz.Result=Raiz.getHijos().get(0).getElemento();
            if(Raiz.Elemento=="valor Variable" && (Raiz.getHijos().get(0).getElemento().startsWith("\""))){
                Raiz.Result=Raiz.getHijos().get(0).getElemento();
            }else{
                try{
                    double PRUEBA = Double.parseDouble(Raiz.getHijos().get(0).getElemento()); 
                    Raiz.Result=Raiz.getHijos().get(0).getElemento(); 
                }catch (Exception e){
                    String Valor = this.BuscarVariable(TablaS, Raiz.getHijos().get(0).getElemento());
                    if (Valor.equals("ERROR SEMANTICO")){
                        System.out.println("ERROR SEMANTICO-VARIABLE NO ENCONTRADA");
                    }else{
                        Raiz.Result=Valor;
                    }
                }
            }
        }else if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().size()==4){
            if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MEDIA")){
                String Media = calcularMedia(Raiz.getHijos().get(2).Result);
                Raiz.Result=Media;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MEDIANA")){
                String Mediana = calcularMediana(Raiz.getHijos().get(2).Result);
                Raiz.Result=Mediana;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MODA")){
                System.out.println("-------------"+Raiz.getHijos().get(2).Result);
                String Moda = calcularModa(Raiz.getHijos().get(2).Result);
                Raiz.Result=Moda;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("VARIANZA")){
                String Varianza = calcularVarianza(Raiz.getHijos().get(2).Result);
                Raiz.Result=Varianza;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MAX")){
                String Maximo = encontrarValorMaximo(Raiz.getHijos().get(2).Result);
                Raiz.Result=Maximo;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MIN")){
                String Minimo = encontrarValorMinimo(Raiz.getHijos().get(2).Result);
                Raiz.Result=Minimo;
            }
        }else if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().size()==2){
            if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MEDIA")){
                String Media = calcularMedia(Raiz.getHijos().get(1).Result);
                Raiz.Result=Media;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MEDIANA")){
                String Mediana = calcularMediana(Raiz.getHijos().get(1).Result);
                Raiz.Result=Mediana;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MODA")){
                System.out.println("-------------"+Raiz.getHijos().get(1).Result);
                String Moda = calcularModa(Raiz.getHijos().get(1).Result);
                Raiz.Result=Moda;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("VARIANZA")){
                String Varianza = calcularVarianza(Raiz.getHijos().get(1).Result);
                Raiz.Result=Varianza;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MAX")){
                String Maximo = encontrarValorMaximo(Raiz.getHijos().get(1).Result);
                Raiz.Result=Maximo;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MIN")){
                String Minimo = encontrarValorMinimo(Raiz.getHijos().get(1).Result);
                Raiz.Result=Minimo;
            }      
        }else if(Raiz.getElemento()=="valor Variable" && Raiz.getHijos().size()==6){
             if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("SUM")){
                Double Primero = Double.parseDouble(Raiz.getHijos().get(2).Result);
                Double Segundo = Double.parseDouble(Raiz.getHijos().get(4).Result);
                Raiz.Result = String.valueOf(Primero+Segundo);
             }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("RES")){
                Double Primero = Double.parseDouble(Raiz.getHijos().get(2).Result);
                Double Segundo = Double.parseDouble(Raiz.getHijos().get(4).Result);
                Raiz.Result = String.valueOf(Primero-Segundo);
             }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MUL")){
                Double Primero = Double.parseDouble(Raiz.getHijos().get(2).Result);
                Double Segundo = Double.parseDouble(Raiz.getHijos().get(4).Result);
                Raiz.Result = String.valueOf(Primero*Segundo);
             }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("DIV")){
                Double Primero = Double.parseDouble(Raiz.getHijos().get(2).Result);
                Double Segundo = Double.parseDouble(Raiz.getHijos().get(4).Result);
                Raiz.Result = String.valueOf(Primero/Segundo);
             }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("MOD")){
                Double Primero = Double.parseDouble(Raiz.getHijos().get(2).Result);
                Double Segundo = Double.parseDouble(Raiz.getHijos().get(4).Result);
                Raiz.Result = String.valueOf(Primero%Segundo);
             }
        }else if(Raiz.getElemento()=="Lista Array" && Raiz.getHijos().size()==3){
            Raiz.Result=Raiz.getHijos().get(0).Result + Raiz.getHijos().get(1).getElemento()+Raiz.getHijos().get(2).Result; 
        }else if(Raiz.getElemento()=="Lista Array" && Raiz.getHijos().size()==1){
            Raiz.Result=Raiz.getHijos().get(0).Result; 
        }else if(Raiz.getElemento()=="Contenido Array"){
            Raiz.Result=Raiz.getHijos().get(1).Result;
        }else if(Raiz.getElemento()=="Lista Grafica" && Raiz.getHijos().size()==2){
            Raiz.Result=Raiz.getHijos().get(0).Result + " | "+Raiz.getHijos().get(1).Result; 
        }else if(Raiz.getElemento()=="Lista Grafica" && Raiz.getHijos().size()==1){
            Raiz.Result=Raiz.getHijos().get(0).Result; 
        }else if(Raiz.getElemento()=="Contenido Grafica"){
            if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("TITULO")){
                Raiz.Result="TITULO: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("EJEX")){
                Raiz.Result="EJEX: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("EJEY")){
                Raiz.Result="EJEY: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("TITULOX")){
                Raiz.Result="TITULOX: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("TITULOY")){
                Raiz.Result="TITULOY: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("VALUES")){
                Raiz.Result="VALUES: "+Raiz.getHijos().get(5).Result;
            }else if(Raiz.getHijos().get(0).getElemento().toUpperCase().equals("LABEL")){
                Raiz.Result="LABEL: "+Raiz.getHijos().get(5).Result;
            }else{
                 Raiz.Result=Raiz.getHijos().get(5).Result;
            }
        }
    }
    
    public String getElemento() {
        return Elemento;
    }

    public void setElemento(String Elemento) {
        this.Elemento = Elemento;
    }

    public LinkedList<ArbolSintactico> getHijos() {
        return Hijos;
    }

    public void setHijos(LinkedList<ArbolSintactico> Hijos) {
        this.Hijos = Hijos;
    }
            
}

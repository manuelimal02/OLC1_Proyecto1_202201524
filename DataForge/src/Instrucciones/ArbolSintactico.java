package Instrucciones;
import java.util.LinkedList;
import javax.swing.*;
/**
 *
 * @author manuel
 */
public class ArbolSintactico {
    
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
    
    public void ImprimirArbol(ArbolSintactico Raiz){
        for(ArbolSintactico Hijo: Raiz.Hijos){
            ImprimirArbol(Hijo);
        }
        System.out.println(Raiz.getElemento());
    }
    
    public String BuscarVariable(LinkedList<SimboloNodo> TablaS, String Variable){
        for (SimboloNodo Simbolo : TablaS) {
            if(Simbolo.getNombre().equals(Variable)){
                return Simbolo.getValor();
                
            }
        }
        return "ERROR SEMANTICO";
    }
    public void EjecutarInterprete(ArbolSintactico Raiz, JTextArea Consola, LinkedList<SimboloNodo> TablaS){
        for (ArbolSintactico Hijo: Raiz.Hijos){
            EjecutarInterprete(Hijo, Consola, TablaS);
        }
        if(Raiz.Elemento=="Declaracion Variable"){
            SimboloNodo SimboloNuevo = new SimboloNodo(
                    Raiz.getHijos().get(5).getElemento(),  
                    Raiz.getHijos().get(2).getElemento(),
                    "Variable",
                    Raiz.getHijos().get(8).Result
            );
            TablaS.add(SimboloNuevo);
            
        }else if(Raiz.Elemento=="Declaracion Arreglo"){
            SimboloNodo SimboloNuevo = new SimboloNodo(
                    Raiz.getHijos().get(5).getElemento(),
                    Raiz.getHijos().get(2).getElemento(),
                    "Array",
                    Raiz.getHijos().get(9).Result
            );
            TablaS.add(SimboloNuevo);
        }
        else if(Raiz.Elemento=="valor Variable" && Raiz.Hijos.size()==1){
            Raiz.Result=Raiz.getHijos().get(0).getElemento();
        }
        else if(Raiz.Elemento=="valor Variable" && Raiz.getHijos().get(0).getElemento().substring(0,1)=="\""){
                 Raiz.Result=Raiz.getHijos().get(0).getElemento();    
        }
        else if(Raiz.Elemento=="Lista Array" && Raiz.Hijos.size()==3){
            Raiz.Result=Raiz.getHijos().get(0).Result + Raiz.getHijos().get(1).getElemento()+Raiz.getHijos().get(2).Result; 
        }else if(Raiz.Elemento=="Lista Array" && Raiz.Hijos.size()==1){
            Raiz.Result=Raiz.getHijos().get(0).Result; 
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

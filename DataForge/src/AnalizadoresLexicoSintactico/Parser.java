
//----------------------------------------------------
// The following code was generated by CUP v0.11b 20160615 (GIT 4ac7450)
//----------------------------------------------------

package AnalizadoresLexicoSintactico;

import java_cup.runtime.*;
import Instrucciones.ArbolSintactico;
import java_cup.runtime.XMLElement;

/** CUP v0.11b 20160615 (GIT 4ac7450) generated parser.
  */
@SuppressWarnings({"rawtypes"})
public class Parser extends java_cup.runtime.lr_parser {

 public final Class getSymbolContainer() {
    return sym.class;
}

  /** Default constructor. */
  @Deprecated
  public Parser() {super();}

  /** Constructor which sets the default scanner. */
  @Deprecated
  public Parser(java_cup.runtime.Scanner s) {super(s);}

  /** Constructor which sets the default scanner. */
  public Parser(java_cup.runtime.Scanner s, java_cup.runtime.SymbolFactory sf) {super(s,sf);}

  /** Production table. */
  protected static final short _production_table[][] = 
    unpackFromStrings(new String[] {
    "\000\021\000\002\002\004\000\002\002\005\000\002\003" +
    "\004\000\002\003\003\000\002\006\003\000\002\006\003" +
    "\000\002\006\003\000\002\006\003\000\002\006\003\000" +
    "\002\006\010\000\002\006\006\000\002\006\006\000\002" +
    "\004\015\000\002\004\015\000\002\007\005\000\002\010" +
    "\005\000\002\010\003" });

  /** Access to production table. */
  public short[][] production_table() {return _production_table;}

  /** Parse-action table. */
  protected static final short[][] _action_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\040\005\001\002\000\004\002\067\001" +
    "\002\000\006\004\006\037\011\001\002\000\004\010\055" +
    "\001\002\000\010\004\006\037\011\041\053\001\002\000" +
    "\010\004\ufffe\037\ufffe\041\ufffe\001\002\000\004\010\012" +
    "\001\002\000\004\005\013\001\002\000\004\010\014\001" +
    "\002\000\004\010\015\001\002\000\004\036\016\001\002" +
    "\000\004\011\017\001\002\000\004\007\020\001\002\000" +
    "\004\016\022\001\002\000\004\006\051\001\002\000\020" +
    "\032\023\033\030\034\024\035\033\036\027\042\026\043" +
    "\031\001\002\000\012\006\ufffb\017\ufffb\021\ufffb\022\ufffb" +
    "\001\002\000\012\006\ufffc\017\ufffc\021\ufffc\022\ufffc\001" +
    "\002\000\006\017\047\022\046\001\002\000\004\020\041" +
    "\001\002\000\012\006\ufff9\017\ufff9\021\ufff9\022\ufff9\001" +
    "\002\000\012\006\ufffd\017\ufffd\021\ufffd\022\ufffd\001\002" +
    "\000\004\020\034\001\002\000\006\017\ufff1\022\ufff1\001" +
    "\002\000\012\006\ufffa\017\ufffa\021\ufffa\022\ufffa\001\002" +
    "\000\022\016\022\032\023\033\030\034\024\035\033\036" +
    "\027\042\026\043\031\001\002\000\004\021\040\001\002" +
    "\000\004\021\037\001\002\000\012\006\ufff7\017\ufff7\021" +
    "\ufff7\022\ufff7\001\002\000\012\006\ufff6\017\ufff6\021\ufff6" +
    "\022\ufff6\001\002\000\020\032\023\033\030\034\024\035" +
    "\033\036\027\042\026\043\031\001\002\000\004\022\043" +
    "\001\002\000\020\032\023\033\030\034\024\035\033\036" +
    "\027\042\026\043\031\001\002\000\004\021\045\001\002" +
    "\000\012\006\ufff8\017\ufff8\021\ufff8\022\ufff8\001\002\000" +
    "\020\032\023\033\030\034\024\035\033\036\027\042\026" +
    "\043\031\001\002\000\006\006\ufff3\021\ufff3\001\002\000" +
    "\006\017\ufff2\022\ufff2\001\002\000\004\012\052\001\002" +
    "\000\010\004\ufff4\037\ufff4\041\ufff4\001\002\000\004\002" +
    "\000\001\002\000\010\004\uffff\037\uffff\041\uffff\001\002" +
    "\000\004\005\056\001\002\000\004\010\057\001\002\000" +
    "\004\010\060\001\002\000\004\035\061\001\002\000\004" +
    "\011\062\001\002\000\004\007\063\001\002\000\020\032" +
    "\023\033\030\034\024\035\033\036\027\042\026\043\031" +
    "\001\002\000\004\006\065\001\002\000\004\012\066\001" +
    "\002\000\010\004\ufff5\037\ufff5\041\ufff5\001\002\000\004" +
    "\002\001\001\002" });

  /** Access to parse-action table. */
  public short[][] action_table() {return _action_table;}

  /** <code>reduce_goto</code> table. */
  protected static final short[][] _reduce_table = 
    unpackFromStrings(new String[] {
    "\000\065\000\004\002\003\001\001\000\002\001\001\000" +
    "\006\003\006\004\007\001\001\000\002\001\001\000\004" +
    "\004\053\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\007" +
    "\020\001\001\000\002\001\001\000\006\006\031\010\024" +
    "\001\001\000\002\001\001\000\002\001\001\000\002\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\006\006\034\007\035\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\041\001\001\000\002\001\001\000\004\006\043\001\001" +
    "\000\002\001\001\000\002\001\001\000\004\006\047\001" +
    "\001\000\002\001\001\000\002\001\001\000\002\001\001" +
    "\000\002\001\001\000\002\001\001\000\002\001\001\000" +
    "\002\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001\000\002\001\001\000\004\006" +
    "\063\001\001\000\002\001\001\000\002\001\001\000\002" +
    "\001\001\000\002\001\001" });

  /** Access to <code>reduce_goto</code> table. */
  public short[][] reduce_table() {return _reduce_table;}

  /** Instance of action encapsulation class. */
  protected CUP$Parser$actions action_obj;

  /** Action encapsulation object initializer. */
  protected void init_actions()
    {
      action_obj = new CUP$Parser$actions(this);
    }

  /** Invoke a user supplied parse action. */
  public java_cup.runtime.Symbol do_action(
    int                        act_num,
    java_cup.runtime.lr_parser parser,
    java.util.Stack            stack,
    int                        top)
    throws java.lang.Exception
  {
    /* call code in generated class */
    return action_obj.CUP$Parser$do_action(act_num, parser, stack, top);
  }

  /** Indicates start state. */
  public int start_state() {return 0;}
  /** Indicates start production. */
  public int start_production() {return 0;}

  /** <code>EOF</code> Symbol index. */
  public int EOF_sym() {return 0;}

  /** <code>error</code> Symbol index. */
  public int error_sym() {return 1;}



        
        public void syntax_error(Symbol s){
            System.out.println("Error Sintactico: "+s.value+" , Linea: "+s.left+" Columna: "+s.right);
        }
        public void unrecovered_syntax_error(Symbol s) throws java.lang.Exception{
            System.out.println("Error SintActico unrecovered: "+s.value+" , linea: "+s.left+" columna: "+s.right);
        }


/** Cup generated class to encapsulate user supplied action code.*/
@SuppressWarnings({"rawtypes", "unchecked", "unused"})
class CUP$Parser$actions {
  private final Parser parser;

  /** Constructor */
  CUP$Parser$actions(Parser parser) {
    this.parser = parser;
  }

  /** Method 0 with the actual generated action code for actions 0 to 300. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action_part00000000(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
      /* Symbol object for return from actions */
      java_cup.runtime.Symbol CUP$Parser$result;

      /* select the action based on the action number */
      switch (CUP$Parser$act_num)
        {
          /*. . . . . . . . . . . . . . . . . . . .*/
          case 0: // $START ::= inicio EOF 
            {
              Object RESULT =null;
		int start_valleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int start_valright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico start_val = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		RESULT = start_val;
              CUP$Parser$result = parser.getSymbolFactory().newSymbol("$START",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          /* ACCEPT */
          CUP$Parser$parser.done_parsing();
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 1: // inicio ::= PROGRAM declaraciones END_PROGRAM 
            {
              ArbolSintactico RESULT =null;
		int programleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int programright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object program = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int sentenciasleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sentenciasright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico sentencias = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int end_programleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int end_programright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object end_program = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico inicio = new ArbolSintactico("Inicio");
    inicio.AgregarHijo(new ArbolSintactico(program.toString()));
    inicio.AgregarHijo(sentencias);
    inicio.AgregarHijo(new ArbolSintactico(end_program.toString()));
    RESULT = inicio;   

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("inicio",0, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 2: // declaraciones ::= declaraciones declaracion 
            {
              ArbolSintactico RESULT =null;
		int sentenciasleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int sentenciasright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico sentencias = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int sentencialeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sentenciaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArbolSintactico sentencia = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico declaraciones = new ArbolSintactico("Declaracion");
    declaraciones.AgregarHijo(sentencias);
    declaraciones.AgregarHijo(sentencia);
    RESULT = declaraciones;
    

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 3: // declaraciones ::= declaracion 
            {
              ArbolSintactico RESULT =null;
		int sentencialeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int sentenciaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArbolSintactico sentencia = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico declaraciones = new ArbolSintactico("Declaracion");
    declaraciones.AgregarHijo(sentencia);
    RESULT = declaraciones;
    

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaraciones",1, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 4: // valor_variable ::= ENTERO 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object valor1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(valor1.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 5: // valor_variable ::= DECIMAL 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object valor1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(valor1.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 6: // valor_variable ::= CADENA 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object valor1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(valor1.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 7: // valor_variable ::= EXPRESION 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object valor1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(valor1.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 8: // valor_variable ::= EXPRESION_ARRAY 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object valor1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(valor1.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 9: // valor_variable ::= ARITMETICA PARENTESIS_IZQUIERDO valor_variable COMA valor_variable PARENTESIS_DERECHO 
            {
              ArbolSintactico RESULT =null;
		int aritmeticaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int aritmeticaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object aritmetica = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int parentesis_izquierdoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int parentesis_izquierdoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object parentesis_izquierdo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		ArbolSintactico valor1 = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int comaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int comaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object coma = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int valor2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int valor2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico valor2 = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int parentesis_derecholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int parentesis_derechoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object parentesis_derecho = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(aritmetica.toString()));
    valor.AgregarHijo(new ArbolSintactico(parentesis_izquierdo.toString()));
    valor.AgregarHijo(valor1);
    valor.AgregarHijo(new ArbolSintactico(coma.toString()));
    valor.AgregarHijo(valor2);
    valor.AgregarHijo(new ArbolSintactico(parentesis_derecho.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 10: // valor_variable ::= ESTADISTICA PARENTESIS_IZQUIERDO contenido_array PARENTESIS_DERECHO 
            {
              ArbolSintactico RESULT =null;
		int estadisticaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int estadisticaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object estadistica = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int parentesis_izquierdoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int parentesis_izquierdoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object parentesis_izquierdo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int contenidoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int contenidoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico contenido = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int parentesis_derecholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int parentesis_derechoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object parentesis_derecho = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(estadistica.toString()));
    valor.AgregarHijo(new ArbolSintactico(parentesis_izquierdo.toString()));
    valor.AgregarHijo(contenido);
    valor.AgregarHijo(new ArbolSintactico(parentesis_derecho.toString()));
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 11: // valor_variable ::= ESTADISTICA PARENTESIS_IZQUIERDO valor_variable PARENTESIS_DERECHO 
            {
              ArbolSintactico RESULT =null;
		int estadisticaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int estadisticaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object estadistica = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int parentesis_izquierdoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int parentesis_izquierdoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object parentesis_izquierdo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int valor2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int valor2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico valor2 = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int parentesis_derecholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int parentesis_derechoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object parentesis_derecho = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("valor Variable");
    valor.AgregarHijo(new ArbolSintactico(estadistica.toString()));
    valor.AgregarHijo(valor2);
    RESULT = valor;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("valor_variable",4, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 12: // declaracion ::= VAR DOS_PUNTOS TIPO_VARIABLE DOS_PUNTOS DOS_PUNTOS EXPRESION MENOR_QUE MENOS valor_variable END PUNTO_COMA 
            {
              ArbolSintactico RESULT =null;
		int varleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int varright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Object var = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int dos_puntos1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int dos_puntos1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Object dos_puntos1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int tipo_variableleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int tipo_variableright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Object tipo_variable = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int dos_puntos2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int dos_puntos2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Object dos_puntos2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int dos_puntos3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int dos_puntos3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object dos_puntos3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int expresionleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int expresionright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object expresion = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int menor_queleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int menor_queright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object menor_que = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int menosleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int menosright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object menos = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int valorleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int valorright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArbolSintactico valor = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int endright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int punto_comaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int punto_comaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object punto_coma = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico declaracion = new ArbolSintactico("Declaracion Variable");
    declaracion.AgregarHijo(new ArbolSintactico(var.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos1.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(tipo_variable.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos2.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos3.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(expresion.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(menor_que.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(menos.toString()));
    declaracion.AgregarHijo(valor);
    declaracion.AgregarHijo(new ArbolSintactico(end.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(punto_coma.toString()));
    RESULT = declaracion; 

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 13: // declaracion ::= ARRAY DOS_PUNTOS TIPO_VARIABLE DOS_PUNTOS DOS_PUNTOS EXPRESION_ARRAY MENOR_QUE MENOS contenido_array END PUNTO_COMA 
            {
              ArbolSintactico RESULT =null;
		int arrayleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).left;
		int arrayright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)).right;
		Object array = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-10)).value;
		int dos_puntos1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).left;
		int dos_puntos1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-9)).right;
		Object dos_puntos1 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-9)).value;
		int tipo_variableleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).left;
		int tipo_variableright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-8)).right;
		Object tipo_variable = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-8)).value;
		int dos_puntos2left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).left;
		int dos_puntos2right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-7)).right;
		Object dos_puntos2 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-7)).value;
		int dos_puntos3left = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).left;
		int dos_puntos3right = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-6)).right;
		Object dos_puntos3 = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-6)).value;
		int expresion_arrayleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).left;
		int expresion_arrayright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-5)).right;
		Object expresion_array = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-5)).value;
		int menor_queleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).left;
		int menor_queright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-4)).right;
		Object menor_que = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-4)).value;
		int menosleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).left;
		int menosright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-3)).right;
		Object menos = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-3)).value;
		int contenidoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int contenidoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArbolSintactico contenido = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int endleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int endright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object end = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int punto_comaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int punto_comaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object punto_coma = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico declaracion = new ArbolSintactico("Declaracion Arreglo");
    declaracion.AgregarHijo(new ArbolSintactico(array.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos1.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(tipo_variable.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos2.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(dos_puntos3.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(expresion_array.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(menor_que.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(menos.toString()));
    declaracion.AgregarHijo(contenido);
    declaracion.AgregarHijo(new ArbolSintactico(end.toString()));
    declaracion.AgregarHijo(new ArbolSintactico(punto_coma.toString()));
    RESULT = declaracion;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("declaracion",2, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-10)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 14: // contenido_array ::= CORCHETE_IZQUIERDO lista_array CORCHETE_DERECHO 
            {
              ArbolSintactico RESULT =null;
		int corchete_izquierdoleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int corchete_izquierdoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		Object corchete_izquierdo = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int listaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int listaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		ArbolSintactico lista = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int corchete_derecholeft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int corchete_derechoright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		Object corchete_derecho = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico contenido_array = new ArbolSintactico("Contenido Array");
    contenido_array.AgregarHijo(new ArbolSintactico(corchete_izquierdo.toString()));
    contenido_array.AgregarHijo(lista);
    contenido_array.AgregarHijo(new ArbolSintactico(corchete_derecho.toString()));
    RESULT = contenido_array;
    

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("contenido_array",5, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 15: // lista_array ::= lista_array COMA valor_variable 
            {
              ArbolSintactico RESULT =null;
		int listaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).left;
		int listaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)).right;
		ArbolSintactico lista = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-2)).value;
		int comaleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).left;
		int comaright = ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-1)).right;
		Object coma = (Object)((java_cup.runtime.Symbol) CUP$Parser$stack.elementAt(CUP$Parser$top-1)).value;
		int valor_varleft = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor_varright = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArbolSintactico valor_var = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico lista_array = new ArbolSintactico("Lista Array");
    lista_array.AgregarHijo(lista);
    lista_array.AgregarHijo(new ArbolSintactico(coma.toString()));
    lista_array.AgregarHijo(valor_var);
    RESULT = lista_array;

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_array",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.elementAt(CUP$Parser$top-2)), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /*. . . . . . . . . . . . . . . . . . . .*/
          case 16: // lista_array ::= valor_variable 
            {
              ArbolSintactico RESULT =null;
		int valor1left = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).left;
		int valor1right = ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()).right;
		ArbolSintactico valor1 = (ArbolSintactico)((java_cup.runtime.Symbol) CUP$Parser$stack.peek()).value;
		
    ArbolSintactico valor = new ArbolSintactico("Lista Array");
    valor.AgregarHijo(valor1);
    RESULT = valor;   

              CUP$Parser$result = parser.getSymbolFactory().newSymbol("lista_array",6, ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), ((java_cup.runtime.Symbol)CUP$Parser$stack.peek()), RESULT);
            }
          return CUP$Parser$result;

          /* . . . . . .*/
          default:
            throw new Exception(
               "Invalid action number "+CUP$Parser$act_num+"found in internal parse table");

        }
    } /* end of method */

  /** Method splitting the generated action code into several parts. */
  public final java_cup.runtime.Symbol CUP$Parser$do_action(
    int                        CUP$Parser$act_num,
    java_cup.runtime.lr_parser CUP$Parser$parser,
    java.util.Stack            CUP$Parser$stack,
    int                        CUP$Parser$top)
    throws java.lang.Exception
    {
              return CUP$Parser$do_action_part00000000(
                               CUP$Parser$act_num,
                               CUP$Parser$parser,
                               CUP$Parser$stack,
                               CUP$Parser$top);
    }
}

}

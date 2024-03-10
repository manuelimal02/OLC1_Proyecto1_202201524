package AnalizadoresLexicoSintactico;
import java.util.LinkedList;
import dataforge.Token;
import java_cup.runtime.Symbol;
import dataforge.ErrorLexico;

//------------------------------------------------------------------------------
%%
%class Lexico
%public
%line
%char
%cup
%unicode
%ignorecase
%column

%{
public LinkedList<ErrorLexico> lexicalErrors;
public LinkedList<Token> tokens;
%}

%init{
lexicalErrors = new LinkedList<>();
tokens = new LinkedList<>();
yyline = 1;
yycolumn = 1;
%init}

//------------------------------------------------------------------------------
EN_BLANCO = [ \r\t]+
COMENTARIO_LINEA = ("!".*\r\n)|("!".*\n)|("!".*\r)
SIMBOLO_EXCLAMAC = [^!]
COMENTARIO_MULTI = "<!"{SIMBOLO_EXCLAMAC}* "!>"

//------------------------------------------------------------------------------
CADENA = \"([^\"\r\n]*)\"
EXPRESION = [a-zA-Z][a-zA-Z0-9]*
EXPRESION_ARRAY = \@{EXPRESION}
ENTERO = [0-9]+
DECIMAL = {ENTERO}\.{ENTERO} 

//------------------------------------------------------------------------------
%%

"PROGRAM"               {
                    tokens.add(new Token("PROGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PROGRAM, yyline, yycolumn, yytext());
                    }
"END PROGRAM"               {
                    tokens.add(new Token("END PROGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.END_PROGRAM, yyline, yycolumn, yytext());
                    }
"var"                   {
                    tokens.add(new Token("VAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.VAR, yyline, yycolumn, yytext());
                    }
"double"                {
                    tokens.add(new Token("DOUBLE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_VARIABLE, yyline, yycolumn, yytext());
                    }
"char[]"                  {
                    tokens.add(new Token("CHAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_VARIABLE, yyline, yycolumn, yytext());
                    }
"end"                   {
                    tokens.add(new Token("END", yytext(), yyline, yycolumn));
                    return new Symbol(sym.END, yyline, yycolumn, yytext());
                    }
"arr"                   {
                    tokens.add(new Token("ARRAY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARRAY, yyline, yycolumn, yytext());
                    }
"SUM"                   {
                    tokens.add(new Token("SUMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARITMETICA, yyline, yycolumn, yytext());
                    }
"RES"                   {
                    tokens.add(new Token("RESTA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARITMETICA, yyline, yycolumn, yytext());
                    }
"MUL"                   {
                    tokens.add(new Token("MULTIPLICACION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARITMETICA, yyline, yycolumn, yytext());
                    }
"DIV"                   {
                    tokens.add(new Token("DIVISION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARITMETICA, yyline, yycolumn, yytext());
                    }
"MOD"                   {
                    tokens.add(new Token("MODULO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ARITMETICA, yyline, yycolumn, yytext());
                    }
"Media"                 {
                    tokens.add(new Token("MEDIA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
                    }
"Mediana"               {
                    tokens.add(new Token("MEDIANA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
}
"Moda"                  {
                    tokens.add(new Token("MODA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
}
"Varianza"              {
                    tokens.add(new Token("VARIANZA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
}
"Max"                   {
                    tokens.add(new Token("MAXIMO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
}
"Min"                   {
                    tokens.add(new Token("MINIMO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ESTADISTICA, yyline, yycolumn, yytext());
}
"console"               {
                    tokens.add(new Token("CONSOLE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CONSOLE, yyline, yycolumn, yytext());
}
"print"                 {
                    tokens.add(new Token("PRINT", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PRINT, yyline, yycolumn, yytext());
}
"column"                {
                    tokens.add(new Token("COLUMN", yytext(), yyline, yycolumn));
                    return new Symbol(sym.COLUMN, yyline, yycolumn, yytext());
}
"EXEC"                  {
                    tokens.add(new Token("EXEC", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EXEC, yyline, yycolumn, yytext());
}
"graphBar"              {
                    tokens.add(new Token("GRAPHBAR", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_GRAFICA, yyline, yycolumn, yytext());
}
"titulo"                {
                    tokens.add(new Token("TITULO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_GRAFICA, yyline, yycolumn, yytext());
}
"ejeX"                  {
                    tokens.add(new Token("EJEX", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_EJE, yyline, yycolumn, yytext());
}
"ejeY"                  {
                    tokens.add(new Token("EJEY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_EJE, yyline, yycolumn, yytext());
}
"tituloX"               {
                    tokens.add(new Token("TITULOX", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_GRAFICA, yyline, yycolumn, yytext());
}
"tituloY"               {
                    tokens.add(new Token("TITULOY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_GRAFICA, yyline, yycolumn, yytext());
}
"graphPie"              {
                    tokens.add(new Token("GRAPHPIE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_GRAFICA, yyline, yycolumn, yytext());
}
"values"                {
                    tokens.add(new Token("VALUES", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_EJE, yyline, yycolumn, yytext());
}
"label"                 {
                    tokens.add(new Token("LABEL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TITULO_EJE, yyline, yycolumn, yytext());
}
"graphLine"             {
                    tokens.add(new Token("GRAPHLINE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_GRAFICA, yyline, yycolumn, yytext());
}
"Histogram"             {
                    tokens.add(new Token("HISTOGRAM", yytext(), yyline, yycolumn));
                    return new Symbol(sym.TIPO_GRAFICA, yyline, yycolumn, yytext());
}
":"                     {
                    tokens.add(new Token("DOS_PUNTOS", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DOS_PUNTOS, yyline, yycolumn, yytext());
}
"<"                     {
                    tokens.add(new Token("MENOR_QUE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MENOR_QUE, yyline, yycolumn, yytext());
}
">"                     {
                    tokens.add(new Token("MAYOR_QUE", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MAYOR_QUE, yyline, yycolumn, yytext());
}
"-"                     {
                    tokens.add(new Token("MENOS", yytext(), yyline, yycolumn));
                    return new Symbol(sym.MENOS, yyline, yycolumn, yytext());
}
";"                     {
                    tokens.add(new Token("PUNTO_COMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PUNTO_COMA, yyline, yycolumn, yytext());
}
"["                     {
                    tokens.add(new Token("CORCHETE_IZQUIERDO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CORCHETE_IZQUIERDO, yyline, yycolumn, yytext());
}
"]"                     {
                    tokens.add(new Token("CORCHETE_DERECHO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CORCHETE_DERECHO, yyline, yycolumn, yytext());
}
","                     {
                    tokens.add(new Token("COMA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.COMA, yyline, yycolumn, yytext());
}
"("                     {
                    tokens.add(new Token("PARENTESIS_IZQUIERDO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PARENTESIS_IZQUIERDO, yyline, yycolumn, yytext());
}
")"                     {
                    tokens.add(new Token("PARENTESIS_DERECHO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.PARENTESIS_DERECHO, yyline, yycolumn, yytext());
}
"="                     {
                    tokens.add(new Token("IGUAL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.IGUAL, yyline, yycolumn, yytext());
}

\n                    {yycolumn=1;}

{EN_BLANCO}             {}

{COMENTARIO_LINEA}      {}

{COMENTARIO_MULTI}      {}

{CADENA}            {
                    tokens.add(new Token("CADENA", yytext(), yyline, yycolumn));
                    return new Symbol(sym.CADENA, yyline, yycolumn, yytext());
}

{ENTERO}            {
                    tokens.add(new Token("ENTERO", yytext(), yyline, yycolumn));
                    return new Symbol(sym.ENTERO, yyline, yycolumn, yytext());
}
{DECIMAL}           {
                    tokens.add(new Token("DECIMAL", yytext(), yyline, yycolumn));
                    return new Symbol(sym.DECIMAL, yyline, yycolumn, yytext());
                    }
{EXPRESION}         {
                    tokens.add(new Token("EXPRESION", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EXPRESION, yyline, yycolumn, yytext());
}
{EXPRESION_ARRAY}         {
                    tokens.add(new Token("EXPRESION ARRAY", yytext(), yyline, yycolumn));
                    return new Symbol(sym.EXPRESION_ARRAY, yyline, yycolumn, yytext());
}


. {
lexicalErrors.add(new ErrorLexico("Lexico", yytext(), yyline, yycolumn));
}
/* 1. Package e importaciones */
package Analizadores;
import java_cup.runtime.Symbol;
import Errores.Excepcion;
import java.util.ArrayList;

%%
/* 2. Configuraciones para el analisis (Opciones y Declaraciones) */
%{
    //Codigo de usuario en sintaxis java
    //Agregar clases, variables, arreglos, objetos etc...
    
    public ArrayList<Excepcion> Errores = new ArrayList();

%}

//Directivas
%class Lexico
%public 
%cup
%char
%column
%full
%line
%unicode

//Inicializar el contador de columna y fila con 1
%init{ 
    yyline = 1; 
    yychar = 1; 
%init}

//Expresiones regulares


D=[0-9]+
DD=[0-9]+("."[  |0-9]+)?
LMAYUS =[A-Z]
LMINUS =[a-z]
ESPECIALESC =(\\\")|(\\\')|(\\n)|("\\\"")|("\\\'")|("\\n")
EXCEPCION_S =[^\'\"]
BLANCOS=[\r\t\ ]+
IDENTIFICADOR =[a-zA-Z][a-zA-Z0-9_]+
CODEANSI = [\ -/:-@\[-`{-}]
INDIVIDUAL =(\"{EXCEPCION_S}\")|{ESPECIALESC}
CADENA = \" ([^\"]|"\\\"")+\"
LineTerminator = \r|\n|\r\n
InputCharacter = [^\r\n]
EntradaM = \t|[^\t]
comentariosimple    = "//" {InputCharacter}* {LineTerminator}?
comentariomultiple    = [<][!][^\!\>]*[!][>]

%%
/* 3. Reglas Semanticas */

<YYINITIAL> "CONJ" {  System.out.println("Reconocio declaracion: "+yytext()); return new Symbol(sym.DCONJ,yyline,yychar,yytext());} 
<YYINITIAL> "{" { System.out.println("Reconocio "+yytext()+" llave abre"); return new Symbol(sym.LLAVA,yyline,yychar, yytext());} 
<YYINITIAL> "}" { System.out.println("Reconocio "+yytext()+" llave cierra"); return new Symbol(sym.LLAVC,yyline,yychar, yytext());}
<YYINITIAL> "," { System.out.println("Reconocio "+yytext()+" coma"); return new Symbol(sym.COMA,yyline,yychar, yytext());}  
<YYINITIAL> ";" { System.out.println("Reconocio "+yytext()+" punto y coma"); return new Symbol(sym.PCOMA,yyline,yychar, yytext());} 
<YYINITIAL> ":" { System.out.println("Reconocio "+yytext()+" dos puntos"); return new Symbol(sym.PP,yyline,yychar, yytext());} 
<YYINITIAL> ">" { System.out.println("Reconocio "+yytext()+" mayor que "); return new Symbol(sym.MAYOR,yyline,yychar, yytext());} 
<YYINITIAL> "-" { System.out.println("Reconocio "+yytext()+" guion"); return new Symbol(sym.GUION,yyline,yychar, yytext());} 

<YYINITIAL> "~" { System.out.println("Reconocio "+yytext()+" guion ondulado"); return new Symbol(sym.ONDGUION,yyline,yychar, yytext());}
<YYINITIAL> "%%" { System.out.println("Reconocio "+yytext()+" porcentajes"); return new Symbol(sym.SPORCENT,yyline,yychar, yytext());}
<YYINITIAL> "+" { System.out.println("Reconocio "+yytext()+" cerradura positiva");return new Symbol(sym.CPOSITIVA,yyline,yychar, yytext());} 
<YYINITIAL> "*" { System.out.println("Reconocio "+yytext()+" cerradura Kleene"); return new Symbol(sym.CKLEENE,yyline,yychar, yytext());} 
<YYINITIAL> "." { System.out.println("Reconocio "+yytext()+" concatenacion"); return new Symbol(sym.CONCATENAR,yyline,yychar, yytext());} 
<YYINITIAL> "|" { System.out.println("Reconocio "+yytext()+" disyuncion "); return new Symbol(sym.DISYUNCION,yyline,yychar, yytext());} 
<YYINITIAL> "?" { System.out.println("Reconocio "+yytext()+" cerradora una o cero veces "); return new Symbol(sym.CBOOL,yyline,yychar, yytext());} 

\n {yychar=1;}
<YYINITIAL> {BLANCOS} {} 
<YYINITIAL> {comentariosimple} {System.out.println("Comentario: "+yytext()); }
<YYINITIAL> {comentariomultiple} {System.out.println("Comentario multilinea: "+yytext()); }
<YYINITIAL> {D} {System.out.println("Reconocio "+yytext()+" numeros"); return new Symbol(sym.NUMEROS,yyline,yychar, yytext());} 
<YYINITIAL> {DD} {System.out.println("Reconocio "+yytext()+" numeros decimales"); return new Symbol(sym.DECIMAL,yyline,yychar, yytext());}
<YYINITIAL> {LMAYUS} {System.out.println("Reconocio "+yytext()+" letras mayusculas"); return new Symbol(sym.ALFAMAYUS,yyline,yychar, yytext());}
<YYINITIAL> {INDIVIDUAL} {System.out.println("Reconocio individual: "+yytext()); return new Symbol(sym.INDIV,yyline,yychar, yytext());} 
<YYINITIAL> {CADENA} {System.out.println("Reconocio cadena: " +yytext()); return new Symbol(sym.CADENA,yyline,yychar, yytext());}
<YYINITIAL> {CODEANSI} {System.out.println("Reconocio caracter especial: "+yytext()); return new Symbol(sym.CESPECIAL,yyline,yychar, yytext());} 
<YYINITIAL> {LMINUS} {System.out.println("Reconocio "+yytext()+" letras minusculas"); return new Symbol(sym.ALFAMINUS,yyline,yychar, yytext());} 

<YYINITIAL> {IDENTIFICADOR} {System.out.println("Reconocio identificador: "+yytext()); return new Symbol(sym.IDTEXT,yyline,yychar, yytext());} 


. {
    //Aqui se debe guardar los valores (yytext(), yyline, yychar ) para posteriormente generar el reporte de errores Léxicos.
    System.out.println("Este es un error lexico: "+yytext()+ ", en la linea: "+yyline+", en la columna: "+yychar);
    Errores.add(new Excepcion("Léxico", "Caracter no válido detectado: " + yytext(), yyline + "", yychar + ""));
}

/* Importaciones*/
package analizadores
import java_cup.runtime.Symbol;

%%
/* Configuraciones para el analisis (opciones y declaraciones)*/
%{
    //codigo de usuario en sintaxis java
    // Agregar clases, variables, arreglos, objetos etc...

%}

//Directivas
%class Lexivo
%public
%cup
%char
%column
%full
%line
%unicode

%init{
    yyline = 1
    yychar = 1
%init}


//Expresiones regulares


%%
/* Reglas semanticas*/


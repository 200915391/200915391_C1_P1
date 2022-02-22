package scaner_01;
import java_cup.runtime.*;
%%
%class LexicoCup
%cup
%public
%unicode
%line
%char
%full

D = [0-9]+
L = [a-zñA-ZÑ_]+
espacio=[ ,\t,\r,\n]+

%{
    private Symbol symbol(int type, Object value){
        return new Symbol(type, yyline, yycolumn, value);
    }
    private Symbol symbol(int type){
        return new Symbol(type, yyline, yycolumn);
    }
%}
%%



("//"(.)*)                           {return new Symbol(sym.COMENTUNILINEA_, yychar, yyline, yytext());}
("<!"((.)*|"\n")*"!>")               {return new Symbol(sym.COMENTMULTILINEA_, yychar, yyline, yytext());}
({L}+({L}|{D}|"_")*)                 {return new Symbol(sym.IDENTIFICADOR_, yychar, yyline, yytext());}
({D}+("."{D}+)?)                     {return new Symbol(sym.NUMEROCOMPUESTO_, yychar, yyline, yytext());}
(CONJ)                               {return new Symbol(sym.CONJUNTO_, yychar, yyline, yytext());}
("%%")                               {return new Symbol(sym.SEPARADOR_, yychar, yyline, yytext());}


("!")                                {return new Symbol(sym.ADMIRACION_, yychar, yyline, yytext());}
("\"")                               {return new Symbol(sym.COMILLADOBLE_, yychar, yyline, yytext());}
("#")                                {return new Symbol(sym.NUMERAL_, yychar, yyline, yytext());}
("$")                                {return new Symbol(sym.DOLAR_, yychar, yyline, yytext());}
("%")                                {return new Symbol(sym.PORCENTAJE_, yychar, yyline, yytext());}
("&")                                {return new Symbol(sym.AMPERSAND_, yychar, yyline, yytext());}
("'")                                {return new Symbol(sym.COMILLASIMPLE_, yychar, yyline, yytext());}
("(")                                {return new Symbol(sym.PARENTESISABIERTO_, yychar, yyline, yytext());}
(")")                                {return new Symbol(sym.PARENTESISCERRADO_, yychar, yyline, yytext());}
("*")                                {return new Symbol(sym.ASTERISCO_, yychar, yyline, yytext());}
("+")                                {return new Symbol(sym.MAS_, yychar, yyline, yytext());}
(",")                                {return new Symbol(sym.COMA_, yychar, yyline, yytext());}
("-")                                {return new Symbol(sym.MENOS_, yychar, yyline, yytext());}
(".")                                {return new Symbol(sym.PUNTO_, yychar, yyline, yytext());}
("/")                                {return new Symbol(sym.BARRA_, yychar, yyline, yytext());}

("0")                                {return new Symbol(sym.CERO_, yychar, yyline, yytext());}
("1")                                {return new Symbol(sym.UNO_, yychar, yyline, yytext());}
("2")                                {return new Symbol(sym.DOS_, yychar, yyline, yytext());}
("3")                                {return new Symbol(sym.TRES_, yychar, yyline, yytext());}
("4")                                {return new Symbol(sym.CUATRO_, yychar, yyline, yytext());}
("5")                                {return new Symbol(sym.CINCO_, yychar, yyline, yytext());}
("6")                                {return new Symbol(sym.SEIS_, yychar, yyline, yytext());}
("7")                                {return new Symbol(sym.SIETE_, yychar, yyline, yytext());}
("8")                                {return new Symbol(sym.OCHO_, yychar, yyline, yytext());}
("9")                                {return new Symbol(sym.NUEVE_, yychar, yyline, yytext());}

(":")                                {return new Symbol(sym.DOSPUNTOS_, yychar, yyline, yytext());}
(";")                                {return new Symbol(sym.PUNTOYCOMA_, yychar, yyline, yytext());}
("<")                                {return new Symbol(sym.MENORQUE_, yychar, yyline, yytext());}
("=")                                {return new Symbol(sym.IGUAL_, yychar, yyline, yytext());}
(">")                                {return new Symbol(sym.MAYORQUE_, yychar, yyline, yytext());}
("?")                                {return new Symbol(sym.INTERROGACION_, yychar, yyline, yytext());}
("@")                                {return new Symbol(sym.ARROBA_, yychar, yyline, yytext());}

("A")                                {return new Symbol(sym.LETRAAMAY_, yychar, yyline, yytext());}
("B")                                {return new Symbol(sym.LETRABMAY_, yychar, yyline, yytext());}
("C")                                {return new Symbol(sym.LETRACMAY_, yychar, yyline, yytext());}
("D")                                {return new Symbol(sym.LETRADMAY_, yychar, yyline, yytext());}
("E")                                {return new Symbol(sym.LETRAEMAY_, yychar, yyline, yytext());}
("F")                                {return new Symbol(sym.LETRAFMAY_, yychar, yyline, yytext());}
("G")                                {return new Symbol(sym.LETRAGMAY_, yychar, yyline, yytext());}
("H")                                {return new Symbol(sym.LETRAHMAY_, yychar, yyline, yytext());}
("I")                                {return new Symbol(sym.LETRAIMAY_, yychar, yyline, yytext());}
("J")                                {return new Symbol(sym.LETRAJMAY_, yychar, yyline, yytext());}
("K")                                {return new Symbol(sym.LETRAKMAY_, yychar, yyline, yytext());}
("L")                                {return new Symbol(sym.LETRALMAY_, yychar, yyline, yytext());}
("M")                                {return new Symbol(sym.LETRAMMAY_, yychar, yyline, yytext());}
("N")                                {return new Symbol(sym.LETRANMAY_, yychar, yyline, yytext());}
("O")                                {return new Symbol(sym.LETRAOMAY_, yychar, yyline, yytext());}
("P")                                {return new Symbol(sym.LETRAPMAY_, yychar, yyline, yytext());}
("Q")                                {return new Symbol(sym.LETRAQMAY_, yychar, yyline, yytext());}
("R")                                {return new Symbol(sym.LETRARMAY_, yychar, yyline, yytext());}
("S")                                {return new Symbol(sym.LETRASMAY_, yychar, yyline, yytext());}
("T")                                {return new Symbol(sym.LETRATMAY_, yychar, yyline, yytext());}
("U")                                {return new Symbol(sym.LETRAUMAY_, yychar, yyline, yytext());}
("V")                                {return new Symbol(sym.LETRAVMAY_, yychar, yyline, yytext());}
("W")                                {return new Symbol(sym.LETRAWMAY_, yychar, yyline, yytext());}
("X")                                {return new Symbol(sym.LETRAXMAY_, yychar, yyline, yytext());}
("Y")                                {return new Symbol(sym.LETRAYMAY_, yychar, yyline, yytext());}
("Z")                                {return new Symbol(sym.LETRAZMAY_, yychar, yyline, yytext());}

("[")                                {return new Symbol(sym.CORCHETEABIERTO_, yychar, yyline, yytext());}
("\\")                               {return new Symbol(sym.BARRAINVERTIDA_, yychar, yyline, yytext());}
("]")                                {return new Symbol(sym.CORCHECERRADO_, yychar, yyline, yytext());}
("^")                                {return new Symbol(sym.ACENTOCIRCUNFLEJO_, yychar, yyline, yytext());}
("_")                                {return new Symbol(sym.GUIONBAJO_, yychar, yyline, yytext());}
("`")                                {return new Symbol(sym.ACENTOGRAVE_, yychar, yyline, yytext());}

("a")                                {return new Symbol(sym.LETRAAMIN_, yychar, yyline, yytext());}
("b")                                {return new Symbol(sym.LETRABMIN_, yychar, yyline, yytext());}
("c")                                {return new Symbol(sym.LETRACMIN_, yychar, yyline, yytext());}
("d")                                {return new Symbol(sym.LETRADMIN_, yychar, yyline, yytext());}
("e")                                {return new Symbol(sym.LETRAEMIN_, yychar, yyline, yytext());}
("f")                                {return new Symbol(sym.LETRAFMIN_, yychar, yyline, yytext());}
("g")                                {return new Symbol(sym.LETRAGMIN_, yychar, yyline, yytext());}
("h")                                {return new Symbol(sym.LETRAHMIN_, yychar, yyline, yytext());}
("i")                                {return new Symbol(sym.LETRAIMIN_, yychar, yyline, yytext());}
("j")                                {return new Symbol(sym.LETRAJMIN_, yychar, yyline, yytext());}
("k")                                {return new Symbol(sym.LETRAKMIN_, yychar, yyline, yytext());}
("l")                                {return new Symbol(sym.LETRALMIN_, yychar, yyline, yytext());}
("m")                                {return new Symbol(sym.LETRAMMIN_, yychar, yyline, yytext());}
("n")                                {return new Symbol(sym.LETRANMIN_, yychar, yyline, yytext());}
("o")                                {return new Symbol(sym.LETRAOMIN_, yychar, yyline, yytext());}
("p")                                {return new Symbol(sym.LETRAPMIN_, yychar, yyline, yytext());}
("q")                                {return new Symbol(sym.LETRAQMIN_, yychar, yyline, yytext());}
("r")                                {return new Symbol(sym.LETRARMIN_, yychar, yyline, yytext());}
("s")                                {return new Symbol(sym.LETRASMIN_, yychar, yyline, yytext());}
("t")                                {return new Symbol(sym.LETRATMIN_, yychar, yyline, yytext());}
("u")                                {return new Symbol(sym.LETRAUMIN_, yychar, yyline, yytext());}
("v")                                {return new Symbol(sym.LETRAVMIN_, yychar, yyline, yytext());}
("w")                                {return new Symbol(sym.LETRAWMIN_, yychar, yyline, yytext());}
("x")                                {return new Symbol(sym.LETRAXMIN_, yychar, yyline, yytext());}
("y")                                {return new Symbol(sym.LETRAYMIN_, yychar, yyline, yytext());}
("z")                                {return new Symbol(sym.LETRAZMIN_, yychar, yyline, yytext());}

("{")                                {return new Symbol(sym.LLAVEA_, yychar, yyline, yytext());}
("|")                                {return new Symbol(sym.BARRAVERTICAL_, yychar, yyline, yytext());}
("}")                                {return new Symbol(sym.LLAVEC_, yychar, yyline, yytext());}
("~")                                {return new Symbol(sym.TILDE_, yychar, yyline, yytext());}

{espacio}                            {/*Ignore*/}

 . {return new Symbol(sym.ERROR, yychar, yyline, yytext());}
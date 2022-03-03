package scaner_01;
import static scaner_01.Tokens.*;
%%
%class Lexer
%type Tokens
%public
%unicode
%line
%char
%full

D = [0-9]+
L = [a-zñA-ZÑ_]+
espacio=[ ,\t,\r]+

%{
    public String lexeme;
%}
%%




("!")                                {lexeme=yytext(); return ADMIRACION_;}
("\"")                               {lexeme=yytext(); return COMILLADOBLE_;}
("#")                                {lexeme=yytext(); return NUMERAL_;}
("$")                                {lexeme=yytext(); return DOLAR_;}
("%")                                {lexeme=yytext(); return PORCENTAJE_;}
("&")                                {lexeme=yytext(); return AMPERSAND_;}
("'")                                {lexeme=yytext(); return COMILLASIMPLE_;}
("(")                                {lexeme=yytext(); return PARENTESISABIERTO_;}
(")")                                {lexeme=yytext(); return PARENTESISCERRADO_;}
("*")                                {lexeme=yytext(); return ASTERISCO_;}
("+")                                {lexeme=yytext(); return MAS_;}
(",")                                {lexeme=yytext(); return COMA_;}
("-")                                {lexeme=yytext(); return MENOS_;}
(".")                                {lexeme=yytext(); return PUNTO_;}
("/")                                {lexeme=yytext(); return BARRA_;}

("0")                                {lexeme=yytext(); return CERO_;}
("1")                                {lexeme=yytext(); return UNO_;}
("2")                                {lexeme=yytext(); return DOS_;}
("3")                                {lexeme=yytext(); return TRES_;}
("4")                                {lexeme=yytext(); return CUATRO_;}
("5")                                {lexeme=yytext(); return CINCO_;}
("6")                                {lexeme=yytext(); return SEIS_;}
("7")                                {lexeme=yytext(); return SIETE_;}
("8")                                {lexeme=yytext(); return OCHO_;}
("9")                                {lexeme=yytext(); return NUEVE_;}

(":")                                {lexeme=yytext(); return DOSPUNTOS_;}
(";")                                {lexeme=yytext(); return PUNTOYCOMA_;}
("<")                                {lexeme=yytext(); return MENORQUE_;}
("=")                                {lexeme=yytext(); return IGUAL_;}
(">")                                {lexeme=yytext(); return MAYORQUE_;}
("?")                                {lexeme=yytext(); return INTERROGACION_;}
("@")                                {lexeme=yytext(); return ARROBA_;}

("A")                                {lexeme=yytext(); return LETRAAMAY_;}
("B")                                {lexeme=yytext(); return LETRABMAY_;}
("C")                                {lexeme=yytext(); return LETRACMAY_;}
("D")                                {lexeme=yytext(); return LETRADMAY_;}
("E")                                {lexeme=yytext(); return LETRAEMAY_;}
("F")                                {lexeme=yytext(); return LETRAFMAY_;}
("G")                                {lexeme=yytext(); return LETRAGMAY_;}
("H")                                {lexeme=yytext(); return LETRAHMAY_;}
("I")                                {lexeme=yytext(); return LETRAIMAY_;}
("J")                                {lexeme=yytext(); return LETRAJMAY_;}
("K")                                {lexeme=yytext(); return LETRAKMAY_;}
("L")                                {lexeme=yytext(); return LETRALMAY_;}
("M")                                {lexeme=yytext(); return LETRAMMAY_;}
("N")                                {lexeme=yytext(); return LETRANMAY_;}
("O")                                {lexeme=yytext(); return LETRAOMAY_;}
("P")                                {lexeme=yytext(); return LETRAPMAY_;}
("Q")                                {lexeme=yytext(); return LETRAQMAY_;}
("R")                                {lexeme=yytext(); return LETRARMAY_;}
("S")                                {lexeme=yytext(); return LETRASMAY_;}
("T")                                {lexeme=yytext(); return LETRATMAY_;}
("U")                                {lexeme=yytext(); return LETRAUMAY_;}
("V")                                {lexeme=yytext(); return LETRAVMAY_;}
("W")                                {lexeme=yytext(); return LETRAWMAY_;}
("X")                                {lexeme=yytext(); return LETRAXMAY_;}
("Y")                                {lexeme=yytext(); return LETRAYMAY_;}
("Z")                                {lexeme=yytext(); return LETRAZMAY_;}

("[")                                {lexeme=yytext(); return CORCHETEABIERTO_;}
("\\")                               {lexeme=yytext(); return BARRAINVERTIDA_;}
("]")                                {lexeme=yytext(); return CORCHECERRADO_;}
("^")                                {lexeme=yytext(); return ACENTOCIRCUNFLEJO_;}
("_")                                {lexeme=yytext(); return GUIONBAJO_;}
("`")                                {lexeme=yytext(); return ACENTOGRAVE_;}

("a")                                {lexeme=yytext(); return LETRAAMIN_;}
("b")                                {lexeme=yytext(); return LETRABMIN_;}
("c")                                {lexeme=yytext(); return LETRACMIN_;}
("d")                                {lexeme=yytext(); return LETRADMIN_;}
("e")                                {lexeme=yytext(); return LETRAEMIN_;}
("f")                                {lexeme=yytext(); return LETRAFMIN_;}
("g")                                {lexeme=yytext(); return LETRAGMIN_;}
("h")                                {lexeme=yytext(); return LETRAHMIN_;}
("i")                                {lexeme=yytext(); return LETRAIMIN_;}
("j")                                {lexeme=yytext(); return LETRAJMIN_;}
("k")                                {lexeme=yytext(); return LETRAKMIN_;}
("l")                                {lexeme=yytext(); return LETRALMIN_;}
("m")                                {lexeme=yytext(); return LETRAMMIN_;}
("n")                                {lexeme=yytext(); return LETRANMIN_;}
("o")                                {lexeme=yytext(); return LETRAOMIN_;}
("p")                                {lexeme=yytext(); return LETRAPMIN_;}
("q")                                {lexeme=yytext(); return LETRAQMIN_;}
("r")                                {lexeme=yytext(); return LETRARMIN_;}
("s")                                {lexeme=yytext(); return LETRASMIN_;}
("t")                                {lexeme=yytext(); return LETRATMIN_;}
("u")                                {lexeme=yytext(); return LETRAUMIN_;}
("v")                                {lexeme=yytext(); return LETRAVMIN_;}
("w")                                {lexeme=yytext(); return LETRAWMIN_;}
("x")                                {lexeme=yytext(); return LETRAXMIN_;}
("y")                                {lexeme=yytext(); return LETRAYMIN_;}
("z")                                {lexeme=yytext(); return LETRAZMIN_;}

("{")                                {lexeme=yytext(); return LLAVEA_;}
("|")                                {lexeme=yytext(); return BARRAVERTICAL_;}
("}")                                {lexeme=yytext(); return LLAVEC_;}
("~")                                {lexeme=yytext(); return TILDE_;}

("->")                               {lexeme=yytext(); return ASIGNACIONCONJUNTO_;}
("//"(.)*)                           {lexeme=yytext(); return COMENTUNILINEA_;}
("<!"((.)*|"\n")*"!>")               {lexeme=yytext(); return COMENTMULTILINEA_;}
(CONJ)                               {lexeme=yytext(); return CONJUNTO_;}
({L}+({L}|{D}|"_")*)                 {lexeme=yytext(); return IDENTIFICADOR_;}
({D}+("."{D}+)?)                     {lexeme=yytext(); return NUMEROCOMPUESTO_;}
("%%")                               {lexeme=yytext(); return SEPARADOR_;}

{espacio}                            {/*Ignore*/}
("\n")                               {return Linea;}
 . {lexeme=yytext(); return ERROR;}
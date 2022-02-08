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


("//"(.)*)                           {lexeme=yytext(); return COMENTUNILINEA_;}
("<!"((.)*|"\n")*"!>")               {lexeme=yytext(); return COMENTMULTILINEA_;}
({L}+({L}|{D}|"_")*)                 {lexeme=yytext(); return IDENTIFICADOR_;}
(CONJ)                               {lexeme=yytext(); return CONJUNTO_;}
("%%")                               {lexeme=yytext(); return SEPARADOR_;}


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

(":")                                {lexeme=yytext(); return DOSPUNTOS_;}
(";")                                {lexeme=yytext(); return PUNTOYCOMA_;}
("<")                                {lexeme=yytext(); return MENORQUE_;}
("=")                                {lexeme=yytext(); return IGUAL_;}
(">")                                {lexeme=yytext(); return MAYORQUE_;}
("?")                                {lexeme=yytext(); return INTERROGACION_;}
("@")                                {lexeme=yytext(); return ARROBA_;}

("[")                                {lexeme=yytext(); return CORCHETEABIERTO_;}
("\\")                                {lexeme=yytext(); return BARRAINVERTIDA_;}
("]")                                {lexeme=yytext(); return CORCHECERRADO_;}




("{")                                {lexeme=yytext(); return LLAVE_A;}
("}")                                {lexeme=yytext(); return LLAVE_C;}

("\""({L}|{D}|"_"|"-"|":"|"/"|"\\"|"."|" ")+"\"")                             {lexeme=yytext(); return COMILLA_D;}







({D}+("."{D}+)?)                     {lexeme=yytext(); return NUMERO;}

 ("'"({L}|{D}|"_"|"-"|":"|"/"|"\\"|"."|" ")+"'")                         {lexeme=yytext(); return DIR_ARCHIVO;}
{espacio}                            {/*Ignore*/}
("\n")                               {return Linea;}
 . {lexeme=yytext(); return ERROR;}



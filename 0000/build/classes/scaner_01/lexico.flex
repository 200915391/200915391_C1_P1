package scaner_01;
import static scaner_01.Tokens.*;
%%
%class Lexer
%type Tokens
%public
%unicode
%line
%char
%ignorecase
%full

D = [0-9]+
L = [a-zñA-ZÑ_]+
espacio=[ ,\t,\r]+

%{
    public String lexeme;
%}
%%

(GenerarReporteEstadistico)          {lexeme=yytext(); return GenerarReporteEstadistico;}
(Compare)                            {lexeme=yytext(); return Compare;}
(DefinirGlobales)                    {lexeme=yytext(); return DefinirGlobales;}
(GraficaBarras)                      {lexeme=yytext(); return GraficaBarras;}
(GraficaPie)                         {lexeme=yytext(); return GraficaPie;}
(GraficaLineas)                      {lexeme=yytext(); return GraficaLineas;}
(string)                             {lexeme=yytext(); return string_V;}
(double)                             {lexeme=yytext(); return double_V;}
(Titulo)                             {lexeme=yytext(); return Titulo;}
(Ejex)                               {lexeme=yytext(); return Ejex;}
(Valores)                            {lexeme=yytext(); return Valores;}
(TituloX)                            {lexeme=yytext(); return TituloX;}
(TituloY)                            {lexeme=yytext(); return TituloY;}
(Archivo)                            {lexeme=yytext(); return Archivo;}
("[")                                {lexeme=yytext(); return CORCHETE_A;}
("]")                                {lexeme=yytext(); return CORCHETE_C;}
("{")                                {lexeme=yytext(); return LLAVE_A;}
("}")                                {lexeme=yytext(); return LLAVE_C;}
("(")                                {lexeme=yytext(); return PAREN_A;}
(")")                                {lexeme=yytext(); return PAREN_C;}
("\""({L}|{D}|"_"|"-"|":"|"/"|"\\"|"."|" ")+"\"")                             {lexeme=yytext(); return COMILLA_D;}
("=")                                {lexeme=yytext(); return IGUAL;}
("$")                                {lexeme=yytext(); return DOLAR;}
(":")                                {lexeme=yytext(); return DOS_PUNTOS;}
(";")                                {lexeme=yytext(); return PUNTOYCOMA;}
(",")                                {lexeme=yytext(); return COMA;}
("##"(.)*)                           {lexeme=yytext(); return COMENT_UNILINEA;}
("#*"((.)*|"\n")*"*#")               {lexeme=yytext(); return COMENT_MULTILINEA;}
({D}+("."{D}+)?)                        {lexeme=yytext(); return NUMERO;}
({L}+({L}|{D}|".")*)                     {lexeme=yytext(); return Identificador;}
 ("'"({L}|{D}|"_"|"-"|":"|"/"|"\\"|"."|" ")+"'")                         {lexeme=yytext(); return DIR_ARCHIVO;}
{espacio}                            {/*Ignore*/}
("\n")                               {return Linea;}
 . {lexeme=yytext(); return ERROR;}



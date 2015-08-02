package com.example.lezs.graficadorfiguras;
import java_cup.runtime.Symbol;

%%

%class Scanner
%cupsym simbolo
%cup
%public
%unicode
%line
%char
%ignorecase

numero =[0-9]+ "."? [0-9]*


%%
"graficar"          {return new Symbol(simbolo.graficar, yychar,yyline); }

"circulo"           {return new Symbol(simbolo.circulo, yychar,yyline);}
"cuadrado"          {return new Symbol(simbolo.cuadrado, yychar,yyline); }
"rectangulo"        {return new Symbol(simbolo.rectangulo, yychar,yyline); }
"linea"             {return new Symbol(simbolo.linea, yychar,yyline);}
"poligono"          {return new Symbol(simbolo.poligono, yychar,yyline); }

"azul"              {return new Symbol(simbolo.azul, yychar,yyline);}
"rojo"              {return new Symbol(simbolo.rojo, yychar,yyline); }
"verde"             {return new Symbol(simbolo.verde, yychar,yyline); }
"amarillo"          {return new Symbol(simbolo.amarillo, yychar,yyline);}
"naranja"           {return new Symbol(simbolo.naranja, yychar,yyline); }
"morado"            {return new Symbol(simbolo.morado, yychar,yyline); }
"cafe"              {return new Symbol(simbolo.cafe, yychar,yyline);}
"negro"             {return new Symbol(simbolo.negro, yychar,yyline); }

"("                 {return new Symbol(simbolo.aparentesis, yychar,yyline); }
")"                 {return new Symbol(simbolo.cparentesis, yychar,yyline); }
","                 {return new Symbol(simbolo.coma, yychar,yyline); }
"*"                 {return new Symbol(simbolo.por, yychar,yyline); }
"/"                 {return new Symbol(simbolo.dividido, yychar,yyline); }
"+"                 {return new Symbol(simbolo.mas, yychar,yyline); }
"-"                 {return new Symbol(simbolo.menos, yychar,yyline); }

{numero}            {return new Symbol(simbolo.numero, yychar, yyline, new String(yytext())); }

[ \t\r\f\n]+       { /* Se ignoran */}

.   { System.out.println("Error lexico: "+yytext()); }
package Lexer;
import Lexer.SimpleToken.*;


%%
%{
    private int line_begin = 0;
    private int char_begin = 0;
    private String comment = "";
%}

%class SimpleLexer
%line
%char
%unicode
%public
%column

Letter=[A-Za-z]
D=[0-9]
IGNOR=[\n\r\t\b\012\s]
NUM = {D}+{D}*
IDENT = {Letter}({Letter}|{D}|_)*
SEPARATOR=" "
OP=["+","-","*","/","%","==","!=",">",">=","<","<=","&&","||","**"]
KW="skip"|"write"|"read"|"while"|"do"|"then"|"else"|"if"
COMMENT="//"+([^\n])*

%%
<YYINITIAL> {KW}                    { return (Yytoken) (new KeywordToken(yytext(), yyline, yycolumn, yycolumn+yylength()-1)); }
<YYINITIAL> {IDENT}                 {return (Yytoken)(new VarToken(yytext(), yyline, yycolumn, yycolumn+yylength()-1));}
<YYINITIAL> {NUM}                   {return (Yytoken)(new NumToken(yytext(),yyline, yycolumn, yycolumn+yylength()-1));}
<YYINITIAL> {IGNOR}                 {}
<YYINITIAL>  "("                    { return (Yytoken)(new LeftBrackets(yyline,yycolumn,yycolumn)); }
<YYINITIAL>  ")"                    { return (Yytoken)(new RightBrackets(yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "+"                    { return (Yytoken)(new OpToken("Plus",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "-"                    { return (Yytoken)(new OpToken("Minus",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "*"                    { return (Yytoken)(new OpToken("Mult",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "/"                    { return (Yytoken)(new OpToken("Div",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "%"                    { return (Yytoken)(new OpToken("Mod",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "=="                   { return (Yytoken)(new OpToken("Eq",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "!="                   { return (Yytoken)(new OpToken("NotEq",yyline,yycolumn,yycolumn+1)); }
<YYINITIAL> ">"                     { return (Yytoken)(new OpToken("Greater",yyline,yycolumn,yycolumn)); }
<YYINITIAL> ">="                    { return (Yytoken)(new OpToken("GreaterOrEq",yyline,yycolumn,yycolumn+1)); }
<YYINITIAL>  "<"                    { return (Yytoken)(new OpToken("Less",yyline,yycolumn,yycolumn)); }
<YYINITIAL>  "<="                   { return (Yytoken)(new OpToken("LessOrEq",yyline,yycolumn,yycolumn+1)); }
<YYINITIAL> "&&"                    { return (Yytoken)(new OpToken("And",yyline,yycolumn,yycolumn+1)); }
<YYINITIAL> "||"                    { return (Yytoken)(new OpToken("Or",yyline,yycolumn,yycolumn+1)); }
<YYINITIAL> ":="                    {return (Yytoken)(new OpToken("Assignment", yyline,yycolumn,yycolumn+1));}
<YYINITIAL> ":"                     { return (Yytoken)(new ColonToken(yyline,yycolumn,yycolumn)); }
<YYINITIAL> ";"                     { return (Yytoken)(new Semicolon(yyline,yycolumn,yycolumn)); }
<YYINITIAL> {COMMENT}               {return (Yytoken) (new CommentToken(yytext().substring(2),yyline,yycolumn+2,yyline,yycolumn+yylength()-2));}


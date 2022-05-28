lexer grammar  Lexerp;
INCLUDE:
SEA_WS* '@include' SEA_WS*
;
AA:'@';
LINK:
SEA_WS* 'link' SEA_WS* OPENC TAG_NAME CLOSEC
  (TO OPENC (TAG_NAME (COMMA TAG_NAME)? )CLOSEC  )? CLOSE
 ;
 DATA:
 SEA_WS* 'data' SEA_WS* OPENC TAG_NAME CLOSEC
  (TO OPENC (TAG_NAME (COMMA TAG_NAME)? )CLOSEC  )? CLOSE
  ;

CASE:
 TAG_WHITESPACE* 'case'TAG_WHITESPACE*':' TAG_WHITESPACE*
;
PREAK:
 TAG_WHITESPACE*'break'TAG_WHITESPACE* CLOSE TAG_WHITESPACE*
;
INNAME: SEA_WS'in'SEA_WS;

ENDSWITCH: TAG_WHITESPACE* 'endswitch' TAG_WHITESPACE*;
CONTROLLER:
TAG_WHITESPACE* 'controller' SEA_WS*
;
TO:TAG_WHITESPACE* '->'TAG_WHITESPACE* 'val'TAG_WHITESPACE*;


CONTROLS:
'controls'SEA_WS*
;
PAGE:
'page'SEA_WS*
;
EXTENDS:
'extends'SEA_WS*
;
HEADER:
'header'SEA_WS*
;
VAL:
'valid('SEA_WS*
;
GOTONAME:
'goto'SEA_WS*
;
PRINTNAME:TAG_WHITESPACE*'print'TAG_WHITESPACE*;


REQUEST:
TAG_WHITESPACE*'request'TAG_WHITESPACE*
;
GO:
'->'TAG_WHITESPACE*
;


PR:
REQUEST GO TAG_NAME
;

EQUAL:
' '*'=' ' '*
;
OPENBRACKET:
TAG_WHITESPACE* '{' TAG_WHITESPACE*
;
CLOSEBRACKET:
TAG_WHITESPACE* '}' TAG_WHITESPACE*
;
OPENC:
 TAG_WHITESPACE* '(' TAG_WHITESPACE*
 ;
CLOSEC:
TAG_WHITESPACE*')' TAG_WHITESPACE*
;
STRINGARR:
TAG_WHITESPACE*'"'(TAG_NAME|TAG_WHITESPACE*)'"'TAG_WHITESPACE*
;

VAR:
SEA_WS* '$' TAG_NAME
;
NUM:DIGIT;
HTML_COMMENT
    : '<!--' .*? '-->'
    ;
CLOSE:
TAG_WHITESPACE*';'TAG_WHITESPACE*
;
COMMA:
SEA_WS*','SEA_WS*
;
SWAN:'\n'
;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;
SINGLE_QOUTE:TAG_WHITESPACE* '\\'TAG_WHITESPACE*;
TAG_NAME
    : TAG_WHITESPACE* TAG_NameStartChar TAG_NameChar*  TAG_WHITESPACE*
    ;

fragment
HEXDIGIT
    : [a-fA-F0-9]
    ;

fragment
DIGIT
    : [0-9]
    ;

fragment
TAG_NameChar
    : TAG_NameStartChar
    | '-'
    | '_'
    | '.'
    | DIGIT
    | '\u00B7'
    | '\u0300'..'\u036F'
    | '\u203F'..'\u2040'
    ;

fragment
TAG_NameStartChar
    : [a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

 IF_OPEN
        :TAG_WHITESPACE*'if'TAG_WHITESPACE*'('->pushMode(IF)
        ;
 FOR_OPEN
         :'for'TAG_WHITESPACE*'('->pushMode(FOR_M)
         ;
 ARRAY_OPEN
             :TAG_WHITESPACE*'array'TAG_WHITESPACE*'['->pushMode(ARRAY)
             ;
SWITCH_OPEN
:
'switch'TAG_WHITESPACE*'('->pushMode(SWITCH)
;

FOREACH_OPEN
:
'foreach'TAG_WHITESPACE*'('->pushMode(FOREACH_M)
;

PRINT_OPEN
:
PRINTNAME TAG_WHITESPACE*'('TAG_WHITESPACE*->pushMode(PRINT_M)
;

VAREQUAL_OPEN
:
VAR TAG_WHITESPACE*'='TAG_WHITESPACE*->pushMode(VAREQUAL)
;

IN_OPEN
:
 TAG_WHITESPACE*('in') TAG_WHITESPACE*':'TAG_WHITESPACE*->pushMode(IN)
;

OUT_OPEN
:
 TAG_WHITESPACE*('out') TAG_WHITESPACE*':'TAG_WHITESPACE*->pushMode(OUT)
;


mode OUT;
TEXT:TAG_WHITESPACE*'text'TAG_WHITESPACE*;
IMAGEOUT:TAG_WHITESPACE*'image'TAG_WHITESPACE*;
OPENPOUT: TAG_WHITESPACE*'('TAG_WHITESPACE*;
CLOSEPOUT:TAG_WHITESPACE* ')'TAG_WHITESPACE*;
NOUT:TAG_NAME;
PATHOUT :  TAG_WHITESPACE*(TAG_NAME ':' (SINGLE_QOUTE (TAG_NAME|(TAG_NAME SINGLE_QOUTE))*)?TAG_WHITESPACE*)TAG_WHITESPACE*;
COMMAMOUT:',';
TOOUT:TO;
OUT_CLOSE:
      TAG_WHITESPACE*  ';'    TAG_WHITESPACE*-> popMode
        ;

mode IN;

FILE:'file';
IMAGEIN:'image';
EMAIL:'email';
COLOR:'color';
NUMBERn:'number';
NUAMIN:TAG_WHITESPACE*
('field'|'radio'| 'checkbox' |'password'|'text'
)TAG_WHITESPACE*
;
NU:  DIGIT+ (COMMA DIGIT+ )* ;
OPENP: TAG_WHITESPACE*'('TAG_WHITESPACE*;
CLOSEP:TAG_WHITESPACE* ')'TAG_WHITESPACE*;
TOIN:TO;
N:TAG_NAME;
PATH : TAG_WHITESPACE*(TAG_NAME ':' (SINGLE_QOUTE (TAG_NAME|(TAG_NAME SINGLE_QOUTE))*)?TAG_WHITESPACE*)TAG_WHITESPACE*;
H:HEXDIGIT;
COMMAM:COMMA;
E : TAG_NAME '@' TAG_NAME+ '.' TAG_NAME+ TAG_WHITESPACE*;
IN_CLOSE:
      TAG_WHITESPACE*  ';'TAG_WHITESPACE* -> popMode
        ;

FUNCTON:
TAG_NAME OPENC (ATT (COMMA  ATT)* )* CLOSEC
;
BODY_CLOSE:
        TAG_WHITESPACE*'}' -> popMode
        ;
////controller mode
mode FOREACH_M;
VAREACH:VAR;
BDYFOREACH:  'as' ;
FOREACH_CLOSE:
        TAG_WHITESPACE*')' -> popMode
        ;
mode FOR_M;
VARF:VAR;
BDYFOR:  'in' ;
FOR_CLOSE:
        TAG_WHITESPACE*')' -> popMode
        ;
mode SWITCH;
PRSWITCH:PR ;
VARSWITCH:VAR;
TN:TAG_NAME;
SWITCH_CLOSEC:
       TAG_WHITESPACE* ')'TAG_WHITESPACE*  -> popMode
        ;

SWITCH_CLOSEP:
        TAG_WHITESPACE* '@endswitch' TAG_WHITESPACE*-> popMode
        ;
mode VAREQUAL;

OPENARRV:
  TAG_WHITESPACE*'array'TAG_WHITESPACE*'['->pushMode(ARRAY)
;
NUME:DIGIT;
FUNCTIONE:FUNCTON
;

W:TAG_WHITESPACE;
STRINGG:TAG_NAME;
ST:STRINGARR;
VAREQUAL_CLOSE:
     TAG_WHITESPACE*   CLOSE -> popMode
        ;

mode PRINT_M;
STRINGP:'"' .*? '"';
NUMP:DIGIT;
VARP:SEA_WS* '$'TAG_NAME;
PRP:REQUEST GO TAG_NAME;
F:FUNCTON;
PRINT_CLOSE:
        TAG_WHITESPACE*')' -> popMode
        ;

mode ARRAY;
NUMarr:TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE*;
COMMAARR:COMMA;
STRINGARR1:STRINGARR;
VARARR:VAR;
 ARRAY_CLOSE:
        TAG_WHITESPACE*']' -> popMode
        ;


   //////if mode


mode IF;
//valid(name1,name2,...)
ELSEIF:'else';
ELSE:'else' SEA_WS*;
VALID: VAL TAG_NAME (COMMA TAG_NAME)* ')';
//checked(name)//to on checkbox
CHECKED:'checked' TAG_WHITESPACE*'('TAG_NAME  ')';
//required(name) must be there
REQUIRED:'required' TAG_WHITESPACE*'('TAG_NAME  ')';
///novalied
NOVALIED:'novalied';
VALIDMM:'valeid('TAG_WHITESPACE* DIGIT TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE*')';
VALIEDPASSDIGIT:'valpasswordmm''(' TAG_NAME COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE*')';
VALIEDPASSinputmode:'valpasswordinmode'TAG_WHITESPACE*'(' TAG_NAME COMMA TAG_NAME ')';
VALIDEMAIL: 'valemail' TAG_WHITESPACE*'(' TAG_NAME')';
FIF:
FUNCTON
;
REQ:PR;
VAREQ:EQUAL STRINGARR;
VIF:VAR;
TAG_OPERATOR
:'<' TAG_WHITESPACE* DIGIT+
|'>' TAG_WHITESPACE* DIGIT+
|'='TAG_WHITESPACE* DIGIT+
|'<='TAG_WHITESPACE* DIGIT+
|'>='TAG_WHITESPACE* DIGIT+
;
   IF_CLOSE:
    TAG_WHITESPACE*    ')' TAG_WHITESPACE*-> popMode
        ;
ATT:VAR|DIGIT+;

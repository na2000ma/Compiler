lexer grammar  Lexerp;
IFN:'if' SEA_WS*;
ELSEIF:'elseif' SEA_WS*;
ELSE:'else' SEA_WS*;


CONTROLLER:'controller' SEA_WS*;
CONTROLS:'controls'SEA_WS*;
PAGE:'page'SEA_WS*;
EXTENDS:'extends'SEA_WS*;
HEADER:'header'SEA_WS*;
VAL:'valid('SEA_WS*;
GOTONAME:'goto'SEA_WS*;

HTML_COMMENT
    : '<!--' .*? '-->'
    ;
CLOSE:
';'
;
COMMA:
','
;

SEA_WS
    :  (' '|'\t'|'\r'? '\n')+
    ;

CLASS_NAME:TAG_NAME;

TAG_NAME
    : TAG_WHITESPACE* TAG_NameStartChar TAG_NameChar*  TAG_WHITESPACE*
    ;
TAG_WHITESPACE
    : [ \t\r\n] -> channel(HIDDEN)
    ;
SINGLE_QOUTE: '\'';

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
    : [:a-zA-Z]
    | '\u2070'..'\u218F'
    | '\u2C00'..'\u2FEF'
    | '\u3001'..'\uD7FF'
    | '\uF900'..'\uFDCF'
    | '\uFDF0'..'\uFFFD'
    ;

 OPENPage
    :PAGE CLASS_NAME   (EXTENDS (CLASS_NAME (COMMA CLASS_NAME)*)
      HEADER)*'{'->pushMode(PAGEMODE)
    ;
    IF_OPEN
        :'('->pushMode(IF)
        ;
     OPEN_CONTROLLER
        :CONTROLLER CLASS_NAME CONTROLS (CLASS_NAME (COMMA CLASS_NAME)*)'{'->pushMode(CONTROLLERMODE)
        ;



        ////controller mode


    mode CONTROLLERMODE;
  //ifc:if( )
  IFC:TAG_WHITESPACE* IF_OPEN (VALIDEMAIL|VALID|CHECKED|REQUIRDE|NOVALIED|VALIDMM|VALIEDPASSDIGIT|VALIEDPASSinputmode) IF_CLOSE TAG_WHITESPACE*;
  //goto p2
  GOTO: GOTONAME CLASS_NAME TAG_WHITESPACE*;
  //print("sss");
  PRINT:'print'TAG_WHITESPACE* '("' (TAG_NAME*|TAG_WHITESPACE*) '")';
  //{},{goto ffg;|print("asd");}
  BODYIF:( (GOTO|PRINT) CLOSE ) ;
  //if(..){},if(..){}elseif(..){}elseif(...){} ..else{}
  IF_NAME:IFN IFC '{' TAG_WHITESPACE* BODYIF* TAG_WHITESPACE*'}'(ELSEIF IFC '{'BODYIF'}')* (ELSE'{'BODYIF'}')? ;

   CONTROLLERCLOSE:
    TAG_WHITESPACE* '}' -> popMode
       ;




/////page mode

mode PAGEMODE;
INNAME:'in:';
S:TAG_WHITESPACE;
IN:  TAG_WHITESPACE* INNAME TAG_WHITESPACE* (  FIELD | RADIO | CHECKBOX |
//BUTTON
| COLOR | EMAIL | FILE  | IMAGE | PASSWORD | NUMBER ) TAG_WHITESPACE* CLOSE;
FIELD : 'field' TAG_WHITESPACE* '(' TAG_NAME ')';
RADIO : 'radio' TAG_WHITESPACE*'(' TAG_NAME ')';
COLOR : 'color' TAG_WHITESPACE* '(' HEXDIGIT ')';
CHECKBOX : ' checkbox'TAG_WHITESPACE* '(' TAG_NAME ')';
//BUTTON : 'button' TAG_WHITESPACE*'(' TAG_NAME  ')' ;
EMAIL : 'email' TAG_WHITESPACE*'(' TAG_NAME '@' TAG_NAME+ '.' TAG_NAME+ ')';
FILE : 'file' TAG_WHITESPACE*'(' PATH ')';
PATH : (TAG_NAME ':'SINGLE_QOUTE (TAG_NAME SINGLE_QOUTE)*)|(TAG_NAME);
IMAGE : 'image'TAG_WHITESPACE* '(' PATH ')' ;
NUMBER: 'number'TAG_WHITESPACE* '(' DIGIT+ (COMMA DIGIT+ COMMA DIGIT+)? ')' ;
///////////////////////////
PASSWORD: 'password'TAG_WHITESPACE* '(' TAG_NAME ')' ;
OUT : 'out:'TAG_WHITESPACE* (TEXT | IMAGE ) ;
TEXT : 'text'TAG_WHITESPACE* '(' TAG_NAME ')';
LINK : 'link' TAG_WHITESPACE*'(' TAG_NAME ')'  ;
DATA : 'data'TAG_WHITESPACE* '(' TAG_NAME ')'  ;

Close_PAGE:
   TAG_WHITESPACE* '}' -> popMode
    ;


   //////if mode


mode IF;
//valid(name1,name2,...)
VALID: VAL TAG_NAME (COMMA TAG_NAME)* ')';
//checked(name)//to on checkbox
CHECKED:'checked' TAG_WHITESPACE*'('TAG_NAME  ')';
//requirde(name) must be there
REQUIRDE:'requirde' TAG_WHITESPACE*'('TAG_NAME  ')';
///novalied
NOVALIED:'novalied';
VALIDMM:'valeid('TAG_WHITESPACE* DIGIT TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE*')';
VALIEDPASSDIGIT:'valpasswordmm''(' TAG_NAME COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE* COMMA TAG_WHITESPACE* DIGIT+ TAG_WHITESPACE*')';
VALIEDPASSinputmode:'valpasswordinmode'TAG_WHITESPACE*'(' TAG_NAME COMMA TAG_NAME ')';
VALIDEMAIL: 'valemail' TAG_WHITESPACE*'(' TAG_NAME')';
   IF_CLOSE:
        ')' -> popMode
        ;

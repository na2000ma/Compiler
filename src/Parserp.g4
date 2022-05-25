parser grammar Parserp;

options { tokenVocab= Lexerp; }
pages : (def_page|def_controller)+
;
def_controller:OPEN_CONTROLLER  IF_NAME* CONTROLLERCLOSE ;
def_page : OPENPage S* ( IN | OUT | LINK | DATA S*)* S* Close_PAGE;
//page p1{in: radio(name);}
//page p1{in: field(name);}
//controller c1 controls gg{if(valid(name, pass)){}}
//page p1{in: radio(name)->ff(ff);}
//page p1{in: email(name@fvd.dd);}
parser grammar Parserp;

options { tokenVocab= Lexerp; }
pages :
 TAG_WHITESPACE*  include* TAG_WHITESPACE*
 (def_page|def_controller)+
;
 body_controller:
 (arr CLOSE)|varequal|if|print|switch|foreach|f|for
 ;
def_controller:
 CONTROLLER TAG_NAME CONTROLS (TAG_NAME (COMMA TAG_NAME)*)OPENBRACKET
 (body_controller TAG_WHITESPACE*)*
 CLOSEBRACKET ;
def_page :

 TAG_WHITESPACE* PAGE TAG_NAME   (EXTENDS (TAG_NAME (COMMA TAG_NAME)*) HEADER)*
 OPENBRACKET body_page* TAG_WHITESPACE* CLOSEBRACKET;


body_page:(in|out|LINK|DATA|print|varequal|ifp|foreachp|forp|switchp|f);


bodyIN:(TOIN OPENP (N (COMMAM N)?) CLOSEP);
bodyOUT:(TOOUT OPENPOUT (NOUT (COMMAMOUT NOUT)?) CLOSEPOUT);
in:IN_OPEN ((COLOR OPENP H) |(EMAIL OPENP E ) |( (FILE|IMAGEIN)  OPENP PATH )
|(NUMBERn  OPENP NU)|(NUAMIN OPENP N)) CLOSEP bodyIN? IN_CLOSE ;
out:
(OUT_OPEN) ((TEXT  OPENPOUT NOUT )|(IMAGEOUT  OPENPOUT PATHOUT ) )CLOSEPOUT bodyOUT? OUT_CLOSE ;

print:
PRINT_OPEN
((STRINGP)+|VARP|NUMP+|PRP|F)TAG_WHITESPACE*
 PRINT_CLOSE CLOSE
 ;
arr:
 ARRAY_OPEN bodyarr  ARRAY_CLOSE
  ;
arrv:
 OPENARRV bodyarr  ARRAY_CLOSE
   ;

bodyarr:
(STRINGARR1  (COMMAARR STRINGARR1)*)
|(NUMarr+  (COMMAARR NUMarr+)*)
|(VARARR  (COMMAARR VARARR)*)
;
varequal:VAREQUAL_OPEN
(arrv |STRINGG|NUME+|FUNCTIONE|ST )
 VAREQUAL_CLOSE
 ;
 foreach:
  FOREACH_OPEN bodyforeach FOREACH_CLOSE
  OPENBRACKET body+ CLOSEBRACKET
  ;
  foreachp:
  AA  FOREACH_OPEN bodyforeach FOREACH_CLOSE
    OPENBRACKET bodyP+ CLOSEBRACKET
    ;
 for:
 FOR_OPEN bodyfor FOR_CLOSE
  OPENBRACKET body+ CLOSEBRACKET
  ;
   forp:
   AA FOR_OPEN bodyfor FOR_CLOSE
    OPENBRACKET bodyP+ CLOSEBRACKET
    ;
bodyfor:
 VARF BDYFOR VARF
;
bodyforeach:
VAREACH BDYFOREACH VAREACH
;
bodyifc:
((REQ VAREQ )|FIF|VIF( (TAG_OPERATOR)?|(VAREQ)))
;
body:
TAG_WHITESPACE*
(varequal|if|for|print|goto|foreach|switchp| FUNCTON|(arr CLOSE))
 TAG_WHITESPACE*
 ;
 bodyP:
 TAG_WHITESPACE*
 (varequal|ifp|forp|print|goto|foreachp|switchp|
  FUNCTON|(arr CLOSE)|LINK|DATA|in|out)
  TAG_WHITESPACE*
  ;
goto:
GOTONAME TAG_NAME
(TAG_WHITESPACE* OPENC VAR (COMMA VAR)*CLOSEC)?
 TAG_WHITESPACE* CLOSE
 ;
ifc:
 IF_OPEN bodyifc IF_CLOSE
  ;
if:
 ifc
 OPENBRACKET body* CLOSEBRACKET
 (ELSEIF ifc OPENBRACKET (body)*CLOSEBRACKET)*
 (ELSE OPENBRACKET(body)*CLOSEBRACKET)?
  ;
  ifp:
   AA ifc
   OPENBRACKET bodyP* CLOSEBRACKET
   (ELSEIF ifc OPENBRACKET (bodyP)*CLOSEBRACKET)*
   (ELSE OPENBRACKET(bodyP)*CLOSEBRACKET)?
    ;
switch:
 SWITCH_OPEN body_switch SWITCH_CLOSEC
 (CASE STRINGARR (body)+  PREAK)+ ENDSWITCH
 ;
 switchp:
 AA SWITCH_OPEN body_switch SWITCH_CLOSEC
  (CASE STRINGARR (bodyP)+  PREAK)+ ENDSWITCH
  ;
body_switch:
 PRSWITCH|TN|VARSWITCH
 ;
 f:TAG_NAME OPENC ((VAR (COMMA  VAR)*)|(NUM (COMMA  NUM)*) )* CLOSEC CLOSE;

include:
INCLUDE OPENC  TAG_NAME CLOSEC CLOSE TAG_WHITESPACE*
;
//(cs * TAG_WHITESPACE+ PREAK CLOSE  TAG_WHITESPACE+)+
//page p1{in: radio(name);}
//page p1{in: field(name);}
//controller c1 controls gg{if(valid(name, pass)){print ($x);}}
//page p1{in: radio(name)->ff(ff);}
//page p1{in: email(name@fvd.dd);}
/*
page p1{
 @switch(request->name)
  	case:"nwar"
 $A1 = array["red","green","blue"];
  	break;

  	case:"mohammad"
 @if($fd)
  {
  goto p($d);
  print("d");
  in: radio(name);
  }
  @for($f in $g){
  $s=4;
  in: radio(name);
   @if($fd)
  {
  goto p($d);
  print("d");
  }
  }
  in: radio(name);
  	break;
endswitch
}
  @include(p4);
  controller c1 controls gg{
   $A1 = array["red","green","blue"];
   array["kn"];
   if($d = 1){
 foreach ($A1 as $colors){
  goto p($d,$fgf);
  print ($cloors);
  $F= "SFS" ;
array["kn"];
print (request->name);
 if($fd > 5)
  {
    print (request->name);
  goto p($d);
  print("d");
  if($fd)
  {
  goto p($d);
  print("d");
  }
  }
}}
}
controller c1 controls gg{
 switch(request->name)
  	case:"nwar"
 $A1 = array["red","green","blue"];
  	break;

  	case:"mohammad"
 if($fd)
  {
  goto p($d);
  print("d");
  }
  	break;
endswitch
}

  @for($x in $n)

  print $x;

  @endfor
  @include(p4);
in:number(1,23,2);
in:file(d:\ds\);
in:image(d:\ds\)->val(sdf,sdas);
out :image(dsdfcom :\bkj\b\)->val(sdf,sdas);

  }*/
/**
 * Define a grammar called C
 */
grammar C;
c         :start global main;
start     :(('#include''<'HEADFILE'>')*) HEAD_DECLARE;

//global添加了structure
global    :(func|both|structure)*;
func      :TYPE STRING'('defvarfun?(','defvarfun)* ')''{'both*'}';
bot		  :'{'both*'}';
both      :stat ';'      
          |block         
          ;
//添加了structure和structurebody
structure :'typedef'? 'struct' STRING structure_body (STRING('['INTEGER']')?)?';';
structure_body:'{'struct_body_body*'}';
struct_body_body:defvar ';'
				|func
				;
defvar    :TYPE tem (',' tem)*;
tem       :assign     #defineassign
          |STRING     #desimplevar
          |STRING('['INTEGER']')* #definarrayvar
          ;


//assign改了   
assign      :(STRING '.')? assign_rear;
assign_rear :STRING '=' value	#variable
            |STRING('['INTEGER']')*'='value      #array
            |STRING'++'            #selfincrease
            |STRING'--'            #selfdecrease
	        ;

defvarfun :TYPE (STRING|STRING('['INTEGER']')*'['']');
value     :INTEGER
          |'"'ANYSTRING'"'
		  |FLOAT_NUMBER
		  |BOOL_NUMBER
		  |expr
		  |call
		  ;
expr      :addexpr
          |STRING'++'            
		  |STRING'--'            
		  ;
addexpr   :mulexpr (('+'|'-') mulexpr)*;
mulexpr   :atom (('*'|'/') atom)*;

//atom改了
atom      :INTEGER
          |FLOAT_NUMBER
	      |(STRING '.')?STRING
	      |(STRING '.')?STRING ('['INTEGER']')*
		  ;


main      :'int main()''{'both*'}';
stat      :return_val	
          |defvar     	
		  |assign		
		  |in			
		  |out			
		  |call			
		  ;
block     :if_lable		
          |for_lable	
		  |while_lable	
		  ;
return_val:'return' value?;
in        :'cin' ('>>'STRING)+;
out       :'cout' ('<<'STRING)+ ('<<''endl')?;
call      :STRING '('STRING? (',' STRING)*')';



if_lable  :if_part else_if_part* else_part;
if_part   :'if' '('condition')' bot;
else_if_part:'else if' '('condition')' bot;
else_part :('else' bot)?;

//bracket   :'('condition')' ;

condition :and ('||' and)*;	
and       :atomc ('&&' atomc)*;
atomc     :'!'? call       
          |'!'? conexpr
		  |'!'? expr
		  |'!'? BOOL_NUMBER;
		  

/*
if_lable  :'if''('condition')''{'both*'}'
           ('else if''('condition')''{'both*'}')*
           ('else' '{'both*'}')?;
condition :and ('||' and)*;	
and       :atomc ('&&' atomc)*;
atomc     :'!'? call       
          |'!'? conexpr
		  |'!'? expr
		  |'!'? BOOL_NUMBER;
*/
		  
		  
conexpr   :condition_part'=='condition_part #equal
          |condition_part'!='condition_part    #unequal
          |condition_part'>' '='? condition_part    #greater
          |condition_part'<' '='? condition_part     #less
          ;
condition_part:expr
			  |call
			  ;		  
		  

/*		  	  
conexpr   :(expr|call|BOOL_NUMBER)'=='(expr|call|BOOL_NUMBER)   #equal
          |(expr|call|BOOL_NUMBER)'!='(expr|call|BOOL_NUMBER)     #unequal
          |(expr|call)'>' '='? (expr|call)        #greater
          |(expr|call)'<' '='? (expr|call)        #less
          ;
*/
		  
		  
for_lable :'for' '(' defvar? ';' condition? ';' assign? ')' '{'both* '}' ;
while_lable:'while''('condition')' '{' both* '}';

LINE_COMMENT:'//' .*? '\n' -> skip;
COMMENT     :'/*' .*?  '*/'     -> skip;
HEADFILE    :'cstdio'|'algorithm'|'cstring'|'ctime'|'iomanip'|'iostream';
HEAD_DECLARE:'using namespace std;';
TYPE        :'void'
            |'float'
			|'int'
			|'bool'
			|'double'
			|'char'
			;
STRING      :[a-zA-Z]([a-zA-Z]|'_'|[0-9])*;
ANYSTRING   :[a-zA-Z]+;
INTEGER     :'-'? '0' 
            | [1-9] [0-9]*
			;
FLOAT_NUMBER:'-'? [0-9]+'.'[0-9]+;
BOOL_NUMBER :'true'
            |'false'
			;
WS          :[ \t\n\r]+ -> skip ;

/* TODO:
**  - regra/expressão para tempo
**  - input do utilizador
**
*/

grammar Geometrics;

prog: 
        grammar_declaration
        stat* EOF;

grammar_declaration:
        'Geometrics' name=Label ';';


//
//      Operações que o utilizador pode fazer
//
stat: 
                render 
        |       primitive_figure_declaration 
        |       normal_primitive_declaration
        |       normal_primitive_assignment   
        |       figure_declaration 
        |       create_instance
        //|       instantiate_figure    Acho que isto não deveria de estar aqui  
        |       cond_statement
        |       loop_statement
        |       set_frame_rate
        |       canvas_size
        |       figure_operation
        |       wait_for_key
        |       input
        |       create_group
        |       destroy_instance
        |       load_bank
        |       animation
        |       animate
        |       pew
        ;

//
//      Métodos disponiveis
//

load_bank:
        'load' 'from' String ';'                        # loadBank
        ;

render: 'render' expr? ';'                      
        ;

create_instance:
        'create' instantiate_figure ';'         
        ;

destroy_instance:
        'destroy' Label ';'                     
        ;

set_frame_rate:
        'Frame' 'Rate' expr ';'               
        ;

canvas_size:
        'Canvas Size' width=expr height=expr ';'    
        ;

//
//      Declaração e instanciação de figuras 
//

instantiate_figure locals[int context = -1, String figName = ""]:
        obj=Label instance_name=Label position?          
        ;

figure_declaration:
        'figure' id=Label '{' (figure_properties)* '}' 
        ;

figure_properties locals[String figName = ""]:
                primitive_figure_declaration (position ';')?    # figureDeclarePrimitiveFigure
        |       normal_primitive_declaration                    # figureDeclarePrimitive
        |       instantiate_figure ';'                          # figureInstanciateFigure
        |       change_property                                 # figureChangeInstanceProperty
        |       property_assignment                             # figurePropertyAssignment
        ;

primitive_figure_type:
                'circle'                                        
        |       'line'
        |       'rectangle'
        |       'square'                
        |       'ellipse'
        |       'polyline'
        |       'polygon'
        |       'arc'
        ;
//
//      Declaração de Primitivas
//


primitive_figure_declaration locals[int context = -1, String figName = ""]:
        type=primitive_figure_type id=Label primitive_figure_block?
        ;

primitive_figure_block locals[FigureType primType = null, String label = ""]:
        '{'  property_assignment* '}'
        ;

property_assignment locals[String label = ""]:
        name=property_name ':' value=expr ';' 
        ;

property_name:
        'hidden'  
    |   'center'    
    |   'points' 
    |   'scale'  
    |   'angle' 
    |   'fill'
    |   'fill_color' 
    |   'border_color' 
    |   'border' 
    |   'thickness' 
    |   'radius' 
    |   'length'
    |   'width'
    |   'height'
    |   'position'
    |   'pivot'
    |   'layer'
    ;

normal_primitive_type returns[Type type = null]:
                'point'                         # pointType
        |       'int'                           # intType
        |       'double'                        # doubleType
        |       'string'                        # stringType
        |       'boolean'                       # booleanType
        |       'time'                          # timeType
        ;
        
normal_primitive_declaration:
                normal_primitive_type id=Label ';'                              # normalPrimitiveDeclaration
        |       normal_primitive_type id=Label '=' value=expr ';'               # normalPrimitiveDeclarationAssignment
        |       normal_primitive_type id=Label '=' inp=input ';'                # normalPrimitiveDeclarationAssignmentInput
        ;

normal_primitive_assignment:
                id=Label '=' value=expr ';'     # assignValue
        |       id=Label '=' inp=input ';'      # assignInput
        ;

point:
        '('x=expr','y=expr')'                    # literalPoint
        ;   

position: 'at' expr;    

time:
                value=Int type=time_unit
        |       value=Double type=time_unit
        ;

time_unit:
                's'
        |       'ms'
        |       'ns'
        ;

create_group:
                'group' id=Label group ';'              
        ;


group returns [Type type]:
        '[' expr* ']'                           # groupEntities
        ;


//
//      Manipulação de figuras
//

// move (by/to), rotate(by/to), scale(by/to), hide

animation:
        'animation' name=Label '(' sub=Label (',' argument_declaration )* ')' '{' block=animation_block '}'
        ;

animation_block locals[int objType = -1]:
                animation_statments*
        ;

argument_declaration returns [Symbol s]:
        normal_primitive_type id=Label
        ;

animate:
        'animate' animationName=Label '(' first=Label (',' expr)* ')' ';'
        ; 

animation_statments:
                figure_operation
        |       cond_statement
        |       loop_statement
        |       normal_primitive_declaration
        |       normal_primitive_assignment
        |       render
        |       wait_for_key
        |       input
        |       set_frame_rate
        |       canvas_size
        ;

figure_operation:
                move_figure 
        |       rotate_figure 
        |       scale_figure 
        |       hide_figure 
        |       show_figure 
        |       change_property 
        ;

figure_label returns[Symbol symbol = null, Type type = null]:                                           
                figure_label'.'Label                            # figureLabelChain
        |       Label                                           # figureLabelBase
        ;

move_figure:
                'move'  figure_label 'by' expr ';'             # moveBy
        |       'move'  figure_label 'to' expr ';'             # moveTo
        ;

rotate_figure:
                'rotate'  figure_label 'by' expr ';'                        # rotateBy
        |       'rotate'  figure_label 'to' expr ';'                        # rotateTo
        |       'rotate'  figure_label 'by' expr rotate_around ';'          # rotateByAround
        |       'rotate'  figure_label 'to' expr rotate_around ';'          # rotateToAround
        ;

rotate_around: 'around' expr;

scale_figure:
                'scale'  figure_label 'by' expr ';'            # scaleBy
        |       'scale'  figure_label 'to' expr ';'            # scaleTo
        ;

hide_figure:    
        'hide'  figure_label ';'                               # hideFigure
        ;

show_figure:    
        'show'  figure_label ';'                               # showFigure
        ;

// isto é um assignment, devia ser apanhado por outra regra?
change_property:
                figure_label'.'property_name '=' expr ';'      # changeProperty
        |       figure_label'.'Label '=' expr ';'              # changePrimitive
        ;

//
//      Lógica Condicional e Operacional
//

cond_statement:
                if_statement                       
                (else_if_statement)*
                (else_statment)?
        ;

if_statement:
        'if' '(' cond=expr ')' '{' block=condition_block  '}'                      # ifStatement
        ;
else_if_statement:
        'else if' '(' cond=expr ')' '{' block=condition_block   '}'                     # elseIfStatement
        ;
else_statment:
        'else' '{' block=condition_block  '}'                         # elseStatment
        ;

expr returns[Type type = null]:
                op=('+' | '-') expr                                           # exprUnary
        |       op='!' expr                                                   # exprNegation
        |       e1=expr op='^' e2=expr                                        # exprPower
        |       e1=expr op=('*' | '/' |'%') e2=expr                           # exprMultDivRem
        |       e1=expr op=('+' | '-') e2=expr                                # exprAddSub
        |       '(' expr ')'                                                  # exprParentisis
        |       e1=expr op=('=='|'!=') e2=expr                                # exprEquality
        |       e1=expr op=('<'|'>'|'<='|'>=') e2=expr                        # exprGreaterLesser
        |       e1=expr op=('and'|'or') e2=expr                               # exprAndOr
        |       e1=expr 'just' 'collided' e2=expr                             # collisionJust
        |       e1=expr 'is' 'colliding' e2=expr                              # collisionIs
        |       e1=expr 'stopped' 'colliding' e2=expr                         # collisionStop
        |       e1=expr ('intersects'|'union') e2=expr                        # setLogic 
        |       key_pressed                                                   # keyPressed //Não sei se isto se encaixa aqui 
        |       point                                                         # exprPoint
        |       group                                                         # exprGroup
        |       Label                                                         # exprLabel
        |       Int                                                           # exprInt
        |       Double                                                        # exprDouble
        |       Boolean                                                       # exprBoolean
        |       color                                                         # exprColor
        |       String                                                        # exprString
        |       time                                                          # exprTime
        |       figure_label                                                  # exprFigure
        |       figure_label'.'property_name                                  # exprFigureProperty
        ;

color returns[Type type = null]:
                Color                                                         # colorNormal
        |       'HSV'  (i1=Int i2=Int i3=Int | HexColor)                      # colorHSV
        |       'RGB'  (i1=Int i2=Int i3=Int | HexColor)                      # colorRGB
        ;

//
//      Sintaxe de loops
//

loop_statement:
                'do' '{' block=condition_block '}'  'while' '(' expr ')' ';'                                                                                       # doWhile
        |       'for' expr 'times' '{' block=condition_block  '}'                                                                                               # forTimes
        |       'for' '(' Label 'in' expr ')' '{' block=condition_block   '}'                                                                                   # forIn
        |       'while' '(' expr ')' '{' block=condition_block   '}'                                                                                            # whileCondition
;

condition_block:
                valid_statments*  
        ;
valid_statments:
                figure_operation
        |       cond_statement
        |       loop_statement
        |       normal_primitive_declaration
        |       normal_primitive_assignment
        |       render
        |       wait_for_key
        |       input
        |       create_instance
        |       destroy_instance
        |       breakInLoop   
        |       set_frame_rate
        |       canvas_size 
        |       animate
        |       pew   
        ; 



breakInLoop: 'break' ';' ;


//
//      User Input
// 

wait_for_key:
                'wait' 'for' Key ';'            #waitCommand
        |       'wait' expr ';'                 #waitTime
        ;

input:
        'input' String ';'              #inputCommand
        ;


key_pressed:
        'key' 'pressed' Key         #keyPressedMethod
        ;     

pew:
        'pew;'                           #PewCommand
        ;


//
//      Expressões Léxicas 
//


Int: [0-9]+;
Double: Int'.'Int;
Boolean: 
                'True'
        |       'False'
        ;
Color: 
                'Red'
        |       'Blue'
        |       'Green'
        |       'Yellow'
        |       'Orange'
        |       'Pink'
        |       'White'
        |       'Black'
        |       'Purple'
        |       'Brown'
        ;
HexColor: '#' [0-9a-fA-F]+;
Key:    'key.' [a-zA-Z];
Label: [A-Za-z_]+ ([A-Za-z0-9_]+)?;
String: '"' .*? '"';
SingleLineComment:      '//' .* ? ('\n'|EOF) -> skip;
MultiLineComment:       '/*' .*?  '*/' -> skip;
WS: [ \r\n\t] -> skip;
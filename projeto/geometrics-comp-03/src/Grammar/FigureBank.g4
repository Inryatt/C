grammar FigureBank;

prog: stat* EOF;

stat: figure;

figure: ID '(' figure_properties (',' figure_properties)* ')';

figure_properties locals[String str = ""]:
        primitive_declaration                   # primitiveProperty
    |   normal_primitive_declaration            # normalPrimitiveProperty
    |   property_assignment                     # assignmentProperty
    |   inst=ID ':' fig=ID 'at' point           # figureProperty
    ;

point:  '(' x=(Int|Double) ',' y=(Int|Double) ')';

primitive_declaration:
    id=ID ':' type=primitive_type '('  property_assignment (',' property_assignment)* ')' 'at' point
    ;

normal_primitive_declaration:
        ID ':' normal_primitive_type  value        # normalPrimitiveDeclaration
        ;

primitive_type:
                'circle'                                        
        |       'line'
        |       'rectangle'
        |       'square'                
        |       'elipse'
        |       'polyline'
        |       'polygon'
        |       'arc'
        ;

normal_primitive_type returns[Type type = null]:
                'point'                         # pointType
        |       'int'                           # intType
        |       'double'                        # doubleType
        |       'string'                        # stringType
        |       'boolean'                       # booleanType
        |       'time'                          # timeType
        ;

property_assignment returns[String name]:
        pName=property_name '=' val=value 
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
    
value returns[Type type]:
        Int                             #valueInt
    |   Double                          #valueDouble
    |   Boolean                         #valueBoolean
    |   Color                           #valueColor
    |   'HSV'  (i1=Int i2=Int i3=Int | HexColor)                      # valueHSVColor
    |   'RGB'  (i1=Int i2=Int i3=Int | HexColor)                      # valueRGBColor
    |   point                           #valuePoint
    |   '[' point (',' point)* ']'      #valueMultPoints
    ;

Int: [0-9]+;
Double: [0-9]+ '.' [0-9]+;
Boolean: 'True' | 'False';
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
HexColor: '#' HexThing;
HexThing: [0-9a-fA-F]+;
ID:  [A-Za-z_]+ ([A-Za-z0-9_]+)?; 
SingleLineComment:      '//' .* ? ('\n'|EOF) -> skip;
WS: [ \n\t\r] -> skip;

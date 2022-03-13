Geometrics Overlapping;

polyline ramp {
    points : [(0,0) (0,2) (-5,8) (-5,10)];
    border_color : Green;
    layer : 3;
}

figure fig {
    rectangle container {
        height : 5;
        width : 8;
        fill : False;
        border_color : Orange;
        layer : 0;
    }
    circle cir {
        radius : 1.5;
        fill : False;
        border_color : Orange;
        layer : 300;
    } at (2.5,2.5);
    line l1 {
        points : [(0,0) (-3,2)];
        border_color : Orange;
        layer : 0;
    } at (4,5);
    line l2 {
        points : [(0,0) (3,2)];
        border_color : Orange;
        layer : 0;
    } at (1,5);
    layer : 2;
}

square sq {
    length : 3;
    fill : False;
    border_color : Red;
    layer : 1;
}

Canvas Size 14 9;

create ramp r at (6,1);
create fig f at (2,4);
create sq ss at (5,9);

while(True) {
    render;
}
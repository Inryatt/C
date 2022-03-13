Geometrics RotateFigure;

figure fig {
    rectangle container {
        width : 5;
        height : 3;
        fill : False;
        border_color : Pink;
    }
    circle c1 {
        radius : 0.5;
        fill : False;
        border_color : Pink;
    } at (1.5,1.5);
    line l1 {
        points : [(0,0) (-1,1)];
        border_color : Pink;
    } at (2,3);
}

figure bigger_fig {
    rectangle container {
        width : 8;
        height : 5;
        fill : False;
        border_color : Green;
    }
    line l2 {
        points : [(0,0) (-3,0)];
        border_color : Green;
    } at (4,7);
    fig f at (1,1);
}

circle dot {
    fill_color : Red;
    border_color : Red;
    radius : 0.1;
}

create bigger_fig bf at (5,2);

while(True) {
    render;
    rotate bf by 1 around (5,8);
}
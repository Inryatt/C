Geometrics FigureEatFigure;

Canvas Size 20 14;

polygon triangle {
    points : [(0,0) (-2,1) (0,2)]; 
    fill : False;
    border_color : Orange;
}

figure tri_in_circ {
    triangle t1 at (1,-1);
    circle c1 {
        radius : 3;
        fill : False;
        border_color : Blue;
    } at (0,0);
}

figure tri_in_circ_in_rect {
    rectangle r1 {
        height : 8;
        width : 11; 
        fill : False;
        border_color : Red;
    } at (0,0);
    tri_in_circ b1 at (4,4);
    ellipse e1 {
        width : 1;
        height : 2;
        fill : False;
        border_color : Red;
    } at (4,9);
}

figure big_fig {
    rectangle r1 {
        height : 12;
        width : 18;
        fill : False;
        border_color : Purple;
    } at (0,0);
    tri_in_circ_in_rect fig1 at (3,1);
    line l1 {
        points : [(0,0) (1,9)];
        border_color : Purple;
    } at (1,2);
    polyline pl1 {
        points : [(0,0) (-4,4) (-8,0) (-10,4)];
        border_color : Purple;
    } at (11,13);
}

create big_fig fig1 at (1,1);

int count = 0;
while(True) {
    if( count % 2 == 0 ) {
        fig1.l1.border_color = Green;
    }
    else {
        fig1.l1.border_color = Purple;
    }
    render;
    count = count + 1;
}
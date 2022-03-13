Geometrics Primitives;

// Constructing a grid with the use of lines 
line horizontal_grid_line {
    points : [(0,0) (0,20)];
    thickness : 1;
}

line vertical_grid_line {
    points : [(0,0) (20,0)];
    thickness : 1;
}

ellipse default_ellipse {
    height : 1;
    width : 1.5;
    border_color : White;
    fill_color : Purple;
    thickness : 3;
}

circle default_circle {
    radius : 1;
    fill : True;
    fill_color : Pink;
    border_color : Green;
    thickness : 5;
}

circle empty_circle {
    radius : 1;
    fill : False;
    border_color : Yellow;
    thickness : 5;
}

line default_line {
    points : [(0,0) (-2,2)];
    thickness : 3;
    border_color : Red;
}

polyline unfinished_triangle {
    points : [(0,0) (-2,2) (0,2)];
    border_color : Orange;
}

square default_square {
    length : 2;
    fill : True;
    fill_color : Brown;
    border_color : Yellow;
}

square empty_square {
    length : 2;
    fill : False;
    border_color : Pink;
}

rectangle default_rect {
    height : 2;
    width : 3;
    fill : True;
    fill_color : Green;
    border_color : Red;
}

polygon heart {
    points : [(2,1) (0.8,2) (0.4,2) (0,1.6) (0,1.2) (0.4,1) (0,0.8) (0,0.4) (0.4,0) (0.8,0)];
    fill : True;
    fill_color : Orange;
    border_color : Blue;
}

polygon empty_heart {
    points : [(2,1) (0.8,2) (0.4,2) (0,1.6) (0,1.2) (0.4,1) (0,0.8) (0,0.4) (0.4,0) (0.8,0)];
    fill : False;
    border_color : White;
}

create horizontal_grid_line h1 at (4,0);
create horizontal_grid_line h2 at (8,0);
create horizontal_grid_line h3 at (12,0);
create horizontal_grid_line h4 at (16,0);

create vertical_grid_line v1 at (0,4);
create vertical_grid_line v2 at (0,8);
create vertical_grid_line v3 at (0,12);
create vertical_grid_line v4 at (0,16);

create default_circle c1 at (2,2);
create empty_circle c2 at (6,2);
create default_circle c3 at (10,1);
create default_ellipse e1 at (14,2);
create default_ellipse e2 at (18,1.5);

create default_line l1 at (3,5);
create default_line l2 at (7,5);
create unfinished_triangle t1 at (11,5);
create unfinished_triangle t2 at (15,5);

create default_square s1 at (1,9);
create empty_square s2 at (5,9);
create default_square s3 at (9,9);
create default_rect r1 at (13,8.5);
create default_rect r2 at (17,8.5);

create heart p1 at (1,13);
create empty_heart p2 at (5,13);
create heart p3 at (9,13);

Frame Rate 24;

int i = 0;

while (True) {
    if (i%10 == 0) {
        c1.fill_color = Brown;
        c1.border_color = Yellow;
        c2.border_color = Purple;
        c3.fill_color = Blue;
        c3.border_color = Red;
    }
    rotate c3 by 1 around (0,1);
    rotate l2 by 1 around (-1,1);
    rotate t2 by 1 around (-1,1);
    rotate e2 by 1 around (0,0.5);
    rotate s3 by 1 around (1,1);
    rotate r2 by 1 around (1,1.5);
    rotate p3 by 1 around (1,1);
    i = i+1;
    render;
}




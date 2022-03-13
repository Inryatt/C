Geometrics Parabola;

circle ball { 
    radius:5; 
    fill_color: red;
}

animation parabola(figureName,x,y,gravity) {
    initialY = y;
    do {
        y = y - gravity
        if (y < initialY) {
            // acontece se a bola iria ficar com um offset negativo de altura no final
            y = initialY;
        }
        move figureName by (x,y);
        render;
    } while (y > initialY)
}

create ball b1;

animate parabola(b1,5,10,1);


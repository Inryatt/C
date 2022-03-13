Geometrics bonk;

polygon heart {
    points : [(2,1) (0.8,2) (0.4,2) (0,1.6) (0,1.2) (0.4,1) (0,0.8) (0,0.4) (0.4,0) (0.8,0)];
    fill : True;
    fill_color : Orange;
    border_color : Blue;
}

ellipse ell {
    height : 1;
    width : 1.5;
    border_color : White;
    fill_color : Purple;
    thickness : 3;
}


square sq {
    length : 2;
    fill : True;
    fill_color : Brown;
    border_color : Yellow;
}


rectangle rect {
    height : 2;
    width : 3;
    fill : True;
    fill_color : Green;
    border_color : Red;
}

create heart p2 at (5,5);
create ell p1 at (8,8);
create sq p3 at (2,2);
create rect p4 at (7,3);

double polyX=5;
double polyY=5;

double sqX=2;
double sqY=2;

double retX=2;
double retY=2;

while(! key pressed key.p ){
    if( key pressed key.d ){
		move p2 by (0,0.5) ;
        polyX = polyX+0.5 ;
	}
	if ( key pressed key.a ) {
		move p2 by (0,-0.5) ;
        polyX = polyX-0.5;
	}
	if ( key pressed key.w ) {
		move p2 by (-0.5,0) ;
        polyY = polyY-0.5;
	}
	if ( key pressed key.s ) {
		move p2 by (0.5,0) ;
        polyY = polyY+0.5;
	}

    //COLISOES
    if ( p2 is colliding p1) {
        
    rotate p1 by 15 around (1,1);
	}

    if ( p2 is colliding p3 ) {
        if( polyY>sqY and key pressed key.w ){
            move p3 by (-0.5,0) ;
            sqY=sqY-0.5;
        }
        if( polyY<=sqY and key pressed key.s ){
            move p3 by (0.5,0) ;
            sqY=sqY+0.5;
        }
        if( polyX<sqX and key pressed key.d ){
            move p3 by (0,0.5) ;
            sqX=sqX+0.5;
        }
        if( polyX>=sqX and key pressed key.a ){
            move p3 by (0,-0.5) ;
            sqX=sqX-0.5;
        }
    }

  if ( p2 is colliding p4 ) {
k
        if( polyY>retY and key pressed key.w ){
            move p4 by (-0.5,0) ;
            retY=retY-0.5;
        }
        if( polyY<=retY and key pressed key.s ){
            move p4 by (0.5,0) ;
            retY=retY+0.5;
        }
        if( polyX<retX and key pressed key.d ){
            move p4 by (0,0.5) ;
            retX=retX+0.5;
        }
        if( polyX>=retX and key pressed key.a ){
            move p4 by (0,-0.5) ;
            retX=retX-0.5;
        }
    }


render;
}
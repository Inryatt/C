Geometrics TestWaitKey;

line Line {             // criar tipo de line "Line"
	points: [(5,5) (2,2)];      
	// primeiro ponto da linha -> (0,0) (estamos a trabalhar num plano relativo à linha)
	// segundo ponto da linha -> (2,0)
}
double a = 24 ;
create Line L1 at (10,10);         // criar uma instância "L1" da figura "Line"

Frame Rate 24;
boolean gofast = True;
while(True) {                // animação infinita
	if ( gofast ){
		a = a + a*0.1;
		if ( a ==360) {
			gofast = False;
		}
	}
	else{

    a = a -a * 0.1; 
	if ( a ==1) {
			gofast = True;
		}
	}

	if(  key pressed key.d ){
		move L1 by (0,0.5) ;
	}
	else if ( key pressed key.a ) {
		move L1 by (0,-0.5) ;
	}
	else if ( key pressed key.w) {
		move L1 by (-0.5,0) ;
	}
	else if ( key pressed key.s ) {
		move L1 by (0.5,0) ;
	}
	else if (key pressed key.p) {
		wait for key.p;
	}
	else {
		rotate L1 by 15 around (0,0);
	}
	render;             // desenhar

	
}

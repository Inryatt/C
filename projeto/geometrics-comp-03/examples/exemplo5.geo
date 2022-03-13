Geometrics EXEMPLO5;

polygon triangle {
    points : [(0,0) (-2,1) (0,2)]; 
    fill : False;
    border_color : Orange;
}


animation walkTo(obj, point end, int x, int y){

	while(obj.position != end){
		move obj by (x,y);
	}
}

circle c {
	radius: 10;
}


create triangle t at (0,0);
create triangle t1 at (1,1);
create triangle t2 at (1,1);
create c c1 at (1,1);

group g1 [t1 t2 c1];
group g2 [1 2 3 3];

//Normal function Call
animate walkTo(t,(5,0),1,0);
//Can also call on a group of instances
animate walkTo(g1,(5,0),1,0);


//Call function with invalid number of arguments
animate walkTo(t,(5,0));

//Call function with invalid type in arguments
animate walkTo(t,(5,0),(1,0),0);
int i = 0;
animate walkTo(i,(5,0),1,0);
animate walkTo(w,(5,0),1,0); // w does not exist
destroy t;
animate walkTo(t,(5,0),1,0); // t has already been destroyed
animate walkTo(g2,(5,0),1,0);// group must be of figures instance



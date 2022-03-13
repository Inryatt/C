Geometrics EXEMPLO4;

//
// Descomentar os erros que se quer testar
//

figure tri_in_circ {
	// figura 'c1' ainda não foi defenida
	//c1 c at (1,1);

	circle c1 {
		radius : 3;
		fill : False;
		border_color : Blue;
		//width : 4;		// Circulo não suporta esta propriedade
		//fill_color: 3;	// 'fill_color' aceita 'Color' não 'int' 
	} at (0,0);
	
	// Neste caso já foi declarada por isso não ocorre erro
	c1 c at (1,1);
}


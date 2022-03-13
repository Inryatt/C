Geometrics EXEMPLO6;


// Normal figure bank load
load from "../../examples/errosSemanticos/exemplo6.f3";

// File does not exist
//load from "aaaaaa.f3";

//File is not compatible
//load from "exemplo6.geo";

create oculos o at (0,0); // oculos foi declarado no Figure Bank
create boca b at (0,0);   // boca não foi declarado no Figure Bank

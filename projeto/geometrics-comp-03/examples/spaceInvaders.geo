Geometrics SpaceInvaders;

Canvas Size 18 12;

figure spaceship {
    rectangle base {
        width: 1;
        height: 1;
        fill_color: Red;
    }
    polygon left_wing {
        points: [(1,0) (1,-0.5) (0,0)];
        fill_color: Blue;
    }
    polygon right_wing {
        points: [(1,1) (1,1.5) (0,1)];
        fill_color: Blue;
    }
    polygon front {
        points: [(0,0) (-1,0.5) (0,1)];
        fill_color: Yellow;
    }
}

figure eye {
    circle left_eye {
        fill_color: Black;
        border_color: Black;
        radius: 0.075;
    } 
}

figure alien {
    rectangle base {
        fill_color: Green;
        width: 0.5;
        height: 0.5;
        thickness: 1;
    }
    eye left_eye at (0.25,0.125);
    eye right_eye at (0.25,0.375);
}

rectangle bullet {
    //points: [(0,0) (-1,0)];
    width: 0.25;
    height: 1;
    fill_color: Yellow;
    hidden: True;
}

circle teste {
    radius: 5;
    fill_color: Green;
}

double x = 5;
double y = 10;
double ySpeed = 0.5;
double bY = -1;
double enemySpeed = 0.05;
double alienX = 2;
boolean isDestroyed = True;
boolean gameOver = False;
boolean firstRound = True;
create spaceship ship at (100,100);



create alien a1 at (2,2);
create alien a2 at (2,3);
create alien a3 at (2,4);
create alien a4 at (2,5);

create alien a5 at (3,2);
create alien a6 at (3,3);
create alien a7 at (3,4);
create alien a8 at (3,5);

create alien a9 at (4,2);
create alien a10 at (4,3);
create alien a11 at (4,4);
create alien a12 at (4,5);

//group monsters [ a1 a2 a3 a4 a5 a6 a7 a8 a9 a10 a11 a12 ];
create bullet b at (-5,-5);

move ship to (x,y);

while (!gameOver) {
    if (key pressed key.a) {
        x = x - 0.5;
    }

    if (key pressed key.d) {
        x = x + 0.5;
    }

    if (x < 0) {
        x = 0;
    }

    if (x > 17) {
        x = 17;
    }


    if (bY < 0) {
        if (!isDestroyed) {
            hide b;
            //destroy b;
            move b to (-5,-5);
            isDestroyed = True;
        }
        if (key pressed key.k) {
            //create bullet b at (y,x);
            move b to (y,x+0.4);
            show b;
            bY = 10;
            isDestroyed = False;
            pew;
        }
    }
    
    else if (!isDestroyed) {    
        move b by (-ySpeed,0);
        bY = bY - ySpeed;
    }
    /*
    for (al in monsters) {
        move al by (0,enemySpeed);
    }
    */

    move a1 by (0,enemySpeed);
    move a2 by (0,enemySpeed);
    move a3 by (0,enemySpeed);
    move a4 by (0,enemySpeed);
    move a5 by (0,enemySpeed);
    move a6 by (0,enemySpeed);
    move a7 by (0,enemySpeed);
    move a8 by (0,enemySpeed);
    move a9 by (0,enemySpeed);
    move a10 by (0,enemySpeed);
    move a11 by (0,enemySpeed);
    move a12 by (0,enemySpeed);

    alienX = alienX + enemySpeed;

    if (alienX > 14 or alienX < 1) {
        enemySpeed = enemySpeed * (-1);
        /*
        for (al in monsters) {
            move al by (1,0);
        }
        */
        move a1 by (1,0);
        move a2 by (1,0);
        move a3 by (1,0);
        move a4 by (1,0);
        move a5 by (1,0);
        move a6 by (1,0);
        move a7 by (1,0);
        move a8 by (1,0);
        move a9 by (1,0);
        move a10 by (1,0);
        move a11 by (1,0);
        move a12 by (1,0);
    }
    if(!firstRound){
        boolean hit = False;

        if ((!isDestroyed) and (b is colliding a1)) {
            //destroy al;
            hide a1;
            move a1 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a2)) {
            //destroy al;
            hide a2;
            move a2 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a3)) {
            //destroy al;
            hide a3;
            move a3 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a4)) {
            //destroy al;
            hide a4;
            move a4 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a5)) {
            //destroy al;
            hide a5;
            move a5 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a6)) {
            //destroy al;
            hide a6;
            move a6 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a7)) {
            //destroy al;
            hide a7;
            move a7 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a8)) {
            //destroy al;
            hide a8;
            move a8 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a9)) {
            //destroy al;
            hide a9;
            move a9 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a10)) {
            //destroy al;
            hide a10;
            move a10 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a11)) {
            //destroy al;
            hide a11;
            move a11 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if ((!isDestroyed) and (b is colliding a12)) {
            //destroy al;
            hide a12;
            move a12 to (100,100);
            hit = True;
            isDestroyed = True;
        }

        if (hit) {
            hide b;
            move b to (-5, 0);
            //destroy b;
            bY = -1;
            if (enemySpeed < 0) {
                enemySpeed = enemySpeed - 0.02;
            }
            else {
                enemySpeed = enemySpeed + 0.02;
            }
        }

        if ((ship is colliding a1) or 
        (ship is colliding a2) or 
        (ship is colliding a3) or 
        (ship is colliding a4) or 
        (ship is colliding a5) or 
        (ship is colliding a6) or 
        (ship is colliding a7) or 
        (ship is colliding a8) or 
        (ship is colliding a9) or 
        (ship is colliding a10) or 
        (ship is colliding a11) or 
        (ship is colliding a12)) {
            gameOver = True;
            break;
        }

        /*
        for (al in monsters) {

            if ((!isDestroyed) and (b is colliding al)) {
                //destroy al;
                hide al;
                move al to (100,100);
                hide b;
                move b to (-5, 0);
                //destroy b;
                isDestroyed = True;
                bY = -1;
                if (enemySpeed < 0) {
                    enemySpeed = enemySpeed - 0.02;
                }
                else {
                    enemySpeed = enemySpeed + 0.02;
                }
            }
            if (ship is colliding al) {
                gameOver = True;
                break;
            }
        }
        */
    } else {
        firstRound=False;
    }
    
    move ship to (y,x);

    render;
}
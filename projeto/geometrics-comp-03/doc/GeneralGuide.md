# General Guide to Geometrics

## Program Structure

A ``.geo`` program has the following structure:
- The header line ``Geometrics <name>;``, where name is composed of alphanumeric characters and underscores
- Any number of statements, such as declarations, assignments, logic checks, and loops

All statements must be terminated with a ``;``, unless the final character in the statement is a ``}``, which closes a code block.
<br>Extra whitespace like tabs and new lines is ignored.

Language is case-sensitive, so the keyword `for` is different from `For`, for example.

Single-line comments start with `//`, while multi-line comments are delimited by `/*` and `*/`, like in Java.

Example of a valid program:
```
Geometrics banana_12;

int rad = 3;
create circle c1 at (1, 4);

/* this line won't run
c1.radius = rad;
*/

for 5 times {
	move c1 by (1,0);
    render;
}   // no ';' needed, as this line ends with '}'
```

<br />

# Data Types

In this language, data types can be divided into two main groups: **geometric types** and **regular types**.

**Geometric types** are the figures that are shown on screen. Programs in `geometrics` revolve around creating and manipulating these types to produce animation.

**Regular types** consist of values that help define figures and control program flow.

Creation and modification of data types differs between these two groups, and will be explained in the following sections.

<br />

# Working with Regular Types

## Declaring and Assigning Regular Types

Regular types are declared and assigned similarly to Java.
Before a variable may be used, it must declared by specifying its type, followed by its name. After being declared, the assignment operator `=` may be used to change its value.

Examples:
```
double var;          // declaring a double named `var`
var = 3.7;           // ...and assigning it a value

point pnt = (3, 0);  // this also works
```

A variable name has two rules:
- It may only contain alphanumeric characters and digits (A to Z, lowercase or uppercase, and 0 to 9) as well as underscores.
- It cannot begin with a digit.

A variable name is unique, and cannot be used again in future declarations, unless working in another context (more on that later).

These rules will also apply to figure names.

## Expressions with Regular Types

Most regular types support some form of arithmatic or logic comparisons through various operators like `+`, `*`, `==`, *et cetera*.

The result of these expressions can be used in most places where a value of the same type is expected.

Here are some examples:
```
int i = 1 + 2;
point p = (2, -1);

// points can be multiplied by ints
p = p * i^2;       // i^2 is resolved first due to operator priority

// will evaluate to true
boolean bool = p == (18, -9);

// can't multiply points however
p = (2, 3) * (0, 7)  // this will cause an error
```

The full list of regular types and their supported opperations can be found in `doc/Geometrics.md`.

<br />

# Working with Geometric Types

## Primitive Figures and Composite Figures

The Geometrics language is statically-typed (as in, all variables must first be declared before they can be used). This involves stating the variable's type and name.

There is a collection of 8 primitive figures, which are the simplest kind of figures the user can draw. The primitive types, which allow for the declaration and instantiation of primitive figures, are predefined by the language and named by reserved keywords, which are as follows: `circle`, `line`, `rectangle`, `square`, `ellipse`, `polyline` and `polygon`.

Apart from primitive figures, the user can also declare and instantiate composite figures, which are, as the name suggests, made up of other composite figures and/or primitive ones.

## Instancing Primitive Figures

To instance a primitive figure, the `create` command is used. It has the following syntax: `create <type> <name> [at <point>];`<br/>
The position syntax `at <point>` is optional, if ommited position (0, 0) will be used.

Here are some examples:
```
create circle ball;
create rectangle box at (2, 2);
create polyline pol_line_1;
```

## Accessing and Altering Properties 

A figure has many properties which, alongside its type, define how it looks.
Several properties are common to all types of figures, while others can be found only in certain types.

A figure's properties may be accessed with the following syntax: `<figure_name>.<property_name>`.
 
Properties values are changed with the assigment operator `=`, and can also be used in expressions with regular types:
```
create circle ball;
create rectangle box at (2, 2);
create polyline pol_line_1;

// changing properties
box.width = 4;
ball.radius = 3.2;           // circles don't have width, but they have radius
pol_line_1.points = [(0,0) (1,0) (2,-0.5)];

// reading properties
double triple_box_thick = box.thickness * 3;
```

The full list of primitive figure types and their properties can be found in `doc/GeometricsReference.md`

## Defining New Figures

### Templates of Primitives

Sometimes we find ourselves creating many similar instances, and as such repeat the same assignments for each one of those instances.
```
// Lets make a bunch of blue squares with size 2
create square sq1;
sq1.fill_color = Blue;
sq1.length = 2;

create square sq2;
sq2.fill_color = Blue;
sq2.length = 2;

create square sq3;
sq3.fill_color = Blue;
sq3.length = 2;
```
To solve this issue, templates of primitive types can be defined as such:
```
<type> <name> {
    // any number of properties can be set
    <property>: <value>;
    <property>: <value>;
    // ...
}
```

Here it is applied to the previous "blue squares" example :
```
square my_square {
    fill_color: Blue;
    length: 2;
}
```

Now new squares can be instanced using `my_square` as a template, like so:
```
create my_square sq4;
create my_square sq5;
create my_square sq6;
``` 
No need to assign color and length for each one anymore, as they will use the template's own as a default!

<br />

### Composite Figures

While it is certainly possible to use just the primitive types, it is preferable to define new types for complex shapes.
This is done using **composite figures**.

A composite figure is, as the name implies, composed of other figures, which can be primitive types or other composite figures.
They can also contain variables of regular types.

To define a new composite figure, the following syntax is used:
```
figure <name> {
    // order is irrelevant

    // any number of these
    <figure_type> <name> {
        // any number of properties can be set
        <property>: <value>;
        <property>: <value>;
        // ...
    } [at <point>;]  // position is optional

    // any number of these
    <property>: <value>;
    
    // any number of these
    <regular_type> <name> [= <value>];
}
```
Positions for sub-figures are relative to the parent figure's center.

Here's an example of how a pair of glasses might be defined:
```
figure glasses {
    thickness: 2;

    circle left_lens {
        radius: 2;
    }
    circle right_lens {
        radius: 2;
    } at (6, 0);
    line bridge {
        points: [(2,0) (4,0)]; // relative to glasses' (0,0)
    }
}
```

When a composite figure's properties are altered, the changes are applied to every component it has. If we wish to access a component's properties, we may do so by chaining their names, separated by periods.

The two following code blocks achieve the same result:
```
create glasses gl;
glasses.border_color = RGB #d1d1d1;
```
```
create glasses gl;
glasses.left_lens.border_color = RGB #d1d1d1;
glasses.right_lens.border_color = RGB #d1d1d1;
glasses.bridge.border_color = RGB #d1d1d1;
```
## Destroying Instances
To destroy an instance, is necessary the `destroy` command, which follows the syntaxe: `destroy <name>`. The destroyed instance can't be operated until it has been created again, causing an Run Time Error otherwise.

Here's simple example of destroying an instance:

```
create glasses gl;

// some code ...

destroy gl;

// if some operation with gl is made after being destroyed, the program will throw an error
```

# Program Flow - Loops and Conditionals

## Conditional Execution
### `if-then` statement

The `if-then` statement tells the program to execute a certain section of code only if a particular test evaluates to `True`. If this test evaluates to `False`, control jumps to the end of the `if-then` statement. An example is given below:
```
if (test){ 
    // statement(s)
}
```
### `if-then-else` statement
The `if-then-else` statement provides a secondary path of execution when an `if` clause evaluates to `False`. We provide an example with a simple `if ... else if ... else` structure:
```
if (test){ 
    // statement(s)
}
else if {
    // statement(s)
}
else {
    // statement(s)
}
```
The `else if` statement can be used zero or more times.

## For Loops and While Loops

### `while` and `do ... while`

The `while` loop is, in every sense, similar to Java. It continually executes a block of statements while a particular boolean expression, which is specified inside `()`, is true. Its syntax is as follows:
```
while(boolean_expression) {
    // statement(s)
}
```
The `while` statement evaluates the expression inside `()`, which must return a boolean value. If the expression evaluates to `True`, the while statement executes the statement(s) in the `while` block. The `while` statement continues testing the expression and executing its block until the expression evaluates to `False`.

The `do ... while` loop works similarly to the `while` loop, except it evaluates its expression at the bottom of the loop instead of the top. This means that the statements within the `do` block are always executed at least once. An example of its syntax is provided:
```
do {
    // statement(s)
} while(boolean_expression);
```
### `for ... times` and `for ... in`
The `for ... times` statement provides a compact way to iterate over a range of values, allowing a block of code to be executed a certain number of times. An example is provided:
```
for [expression] times {
    // statement(s)
}
```

The `for ... in` statement is an array traversing technique. It starts with the keyword `for`, similarly to the `for ... times` loop. Instead of declaring and initializing a loop counter variable, you declare a variable that is the same type as the base type of the array, followed by the keyword `in`, which is then followed by the array name. Consider the example below:

```
for ([element] in [array]) {
    // statement(s)
}
```

### Breaking Loops
A `break` statement can be used to break out of or terminate any of the `for` and `while` loops described previously. Its syntax is as follows:
```
while(boolean_expression) {
    // statement(s)
    if (another_boolean_expression) {
        break;
    }
}
```

<br />

# Animating Figures

So far we've seen how to create figures, alter their look, and how to control the flow of program execution. Now, we can apply these to the creation of animations.

Animating figures is quite simple: simply change the figure's properties and redraw it after an amount of time (specificaly, after an amount of frames).

You can compare this animation flow to making a flipnote, where every page is a "frame", and motion is created by drawing successive pages differently.

## Figure Manipulation

Apart from flow control statements, declarations, assignments and other general statements that can be included in an animation block, the Geometrics language has a set of figure operations that can be used to manipulate them and have them do specific movements on the canvas.

### `move ... to` and `move ... by`

The `move ... to` statement starts off with the keyword `move`, followed by the name of the figure that is to be moved. The statement follows with the keyword `to` and an expression that either is a literal `point` or results in one. This statement will move the given figure to the absolute point on the canvas, according to the given coordinates.

An example is given:
```
move blueCircle to (2,2); // here, (2,2) is a point 
```

The `move ... by` statement starts off with the keyword `move`, followed by the name of the figure that is to be moved. The statement follows with the keyword `by` and an expression that either is a literal `point` or results in one. However, this `point` actually represents a vector. This statement will move the given figure (relative to its current position) according to the provided vector, defined by the coordinates in the statement.

An example is given:
```
move blueCircle by (2,2); // here, (2,2) represents a vector
```

### `rotate ... to` and `rotate ... by`

The `rotate ... to` statement starts off with the keyword `rotate`, followed by the name of the figure that is to be rotated. The statement follows with the keyword `to` and an expression that either is an `int` or results in one. This statement will rotate the given figure to the absolute angle provided (as in,relative to its original position).

An example is given:
```
// rotates redSquare 20 degrees relative to its original position
rotate redSquare to 20;
```

The `rotate ... by` statement starts off with the keyword `rotate`, followed by the name of the figure that is to be rotated. The statement follows with the keyword `by` and an expression that either is an `int` or results in one. This statement will rotate the given figure to the relative angle provided (as in, relative to its current position).

An example is given:
```
// rotates redSquare 20 degrees relative to its current position
rotate redSquare by 20;
```

In both of these rotations, the rotation axis is, by default, the reference point of the figure.

### `rotate ... to ... around` and `rotate ... by ... around`

The `rotate ... to ... around` statement starts off with the keyword `rotate`, followed by the name of the figure that is to be rotated. The statement follows with the keyword `to` and an expression that either is an `int` or results in one. The command ends with the keyword `around`, followed by an expression that either is an `point` or results in one. This statement will rotate the given figure to the absolute angle provided (as in,relative to its original position).

An example is given:
```
// rotates greenArc 20 degrees relative to its original position
rotate greenArc to 20 around (1,1);
```

The `rotate ... by ... around` statement starts off with the keyword `rotate`, followed by the name of the figure that is to be rotated. The statement follows with the keyword `by` and an expression that either is an `int` or results in one. The command ends with the keyword `around`, followed by an expression that either is an `point` or results in one. This statement will rotate the given figure to the relative angle provided (as in, relative to its current position).

An example is given:
```
// rotates greenArc 20 degrees relative to its current position
rotate greenArc by 20 around (1,1);
```

In both of these rotations, the rotation axis is the `point` provided after the `around` keyword.

### `scale ... to` and `scale ... by`

The `scale ... to` statement starts off with the keyword `scale`, followed by the name of the figure that is to be scaled. The statement follows with the keyword `to` and an expression that either is a literal `int` or `double`, or results in one of them. This statement will scale the given figure (relative to its original size) according to the provided factor.

An example is given:
```
scale purpleRain to 0.5; 
```

The `scale ... by` statement starts off with the keyword `scale`, followed by the name of the figure that is to be scaled. The statement follows with the keyword `by` and an expression that either is a literal `int` or `double`, or results in one of them. This statement will scale the given figure (relative to its current size) according to the provided factor.

An example is given:
```
scale purpleRain by 0.5;
```

### `hide` and `show`

The `hide` statement is quite simple: it starts with the `hide` keyword, followed by the name of the figure that is to be hidden. This results in the figure's `hidden` property value changing to `True`, effectively making it invisible to the user on the canvas.

Consider the example:
```
hide blueCircle;
```

Similarly, the `show` statement starts with the `show` keyword, followed by the name of the figure that is to be shown. This results in the figure's `hidden` property value changing to `False`, effectively making it visible to the user on the canvas.

Consider the example:
```
show blueCircle;
```

## Framerate

Frame rate (expressed in frames per second) is the frequency (rate) at which consecutive frames appear on display. By default, it is set to 24 frames per second, but that value can be altered through the `Frame Rate` statement.

This statement begins with the keywords `Frame Rate`, followed by an expression that either is an `int` or results in one. A simple example is provided:
```
Frame Rate 50;
```

## `render` Command

The `render` statement draws all the visible figures that were instanced in the script, as in, it makes these figures appear on the canvas after a given number of frames.

The statement itself is simple: it begins with the keyword `render` and, optionally, the number of frames after which the `render` command should act. If this number is not provided, the default value is set to 1.

Consider the following example:
```
render;    // will draw figures on the next frame
// ...
render 5;  // will draw figures after 5 frames
```

## Example Animation
```
animation parabola(figureName,double x,double y,double gravity) {
    double initialY = y;
    do {
        y = y - gravity;
        if (y < initialY) {
            // acontece se a bola iria ficar com um offset negativo de altura no final
            y = -initialY;
        }
        move figureName by (y,x);
        render;
    } while (y > initialY);
}

rectangle rect {
    width: 2;
    height: 1;
}

create rect box;

animate parabola(box,5,10,1);
```

## Defining and Calling Reusable Animations

Animating figures can be done by creating an `animation` block, and then calling it when we want the animation to be executed. Creating an `animation` block starts off with the keyword `animation`, followed by the name the user wants to give that animation. What follows is a series of input arguments given inside `()`. The first one is **always** the figure which the animation is to be applied to. The user must then provide a variable number of other input arguments, which will vary depending on what the animation itself entails.

Animations can also contain declarations of regular types that exist only within it.

In order to execute the animation, the keyword `animate` is used, followed by the animation's name and the proper input arguments inside `()`.

Here's how the syntax looks:
```
// creating an animation block
animation <animation_name>(<figure_name>, [arg1], [arg2], ...) {
    // statement(s)
}

// executing the animation block
animate <animation_name>(<figure>, <arg1>, <arg2>, ...);
```

And here's a practical example:
```
animation move_and_rotate(fig, point offset, int ang) {
    move fig by offset;
    rotate fig by ang around fig.center;
}

create square sq;
animate move_and_rotate(sq, (3,4), 20);
render;
```

Something to keep in mind is that the `render` command can be used inside animations, but this will have the effect of freezing all the other figures while the animation runs.

<br />

# Detecting User Input

There are two main statements to detect whether a user has attempted to manipulate the figures on the canvas using the letter keys for input. We shall explore them further below.

### `key-pressed` statement

In order to detect user input, the `if` statement can receive a boolean expression in the form of a `key-pressed` statement. This statement simply begins with the keywords `key pressed`, followed by the key itself.

Consider the example below:
```
boolean testKey = key pressed [key];
```
In order to provide the key element in the statement above, an `enumeration` is used according to the following syntax: `key.<letter_lowercase>`.

### `wait-for` statement
The `wait-for` statement freezes all the animation until a specific key is pressed. The syntax, just like the `key pressed`, are the keywords followed by the key.

Consider the example:

```
wait for [key];
```
Also, just like `key pressed`, the key is an `enumeration` that follows the syntax: `key.<letter_lowercase>`.

## Usage Example

```
rectangle character {
    /* 
        defines the player, the object
        which will be move on input
    */
    fill_color: Red;
    width: 2;
    height: 1;
}

// create the instance of character
create character player; 

while (True) {
    if (key pressed key.a) {
        // if the 'a' on the keyboard is pressed, this condition will happen
        move player by (0,-1);
    }
    if (key pressed key.d) {
        // sames apply here, but for 'd' on the keyboard
        move player by (0,1);
    }

    if (key pressed key.p) {
        /*  
            if 'p' (pause) was pressed on the keyboard
            all the animation will freeze until
            'p' be pressed again
        */  
        wait for key.p;
    }
    render;
}
```

<br />

# Detecting Figure Collision

The Geometrics language has a set of statements that can be used to detect collision situations, and which can be quite helpful in assisting the user to deal with them when they arise.

A collision is defined as the **superposition of two geometric figures** (whether either of them is primitive or a composite) on the canvas.

### `just-collided` statement

The `just collided` statement detects if any two figures have collided, given that they were previously in a state of non-collision, and returns the result as a `boolean`.

The command is straightforward: it begins with a figure `Label`, followed by the keywords `just collided` and another figure `Label`.

Consider the example:
```
if (blueCircle just collided greenArc) {
    // code
}
```

### `is-colliding` statement

The `is colliding` statement evaluates to `True` if the two figure `Labels` provided as arguments represent figures that are in collision with each other.

The command statement follows a similar syntax to the previous one. It starts off with a figure `Label`, followed by the keywords `is colliding` and another figure `Label`.

An example follows:
```
if (blueCircle is colliding greenArc) {
    // code
}
```

### `stopped-colliding` statement

The `stopped colliding` statement detects if any two figures are not in collision with each other, given that they were previously colliding.

The command is straightforward: it begins with a figure `Label`, followed by the keywords `stopped colliding` and another figure `Label`.

Consider the example:
```
boolean collCheck = blueCircle stopped colliding greenArc;
```

**Warning:** It is important to take notice of the fact that only the `is-colliding` statement is fully implemented and functional, which is why the usage example provided below is illustrative of that particular command only.

## Usage Example
We'll create a scene where, when a projectile hits a creature, the creature will be destroyed.

```
rectangle character {
    /* 
        defines the player, the object
        which will be move on input
    */
    fill_color: Red;
    width: 2;
    height: 1;
}

rectangle projectile {
    fill_color: Yellow;
    width: 0.5;
    height: 2;
}

create character enemy at (15,15);
create projectile bullet at (15,0);

boolean isDestroyed = False; // When the bullet hits, this boolean will change to True

// The bullet will move horizontally until hits the enemy

while (!isDestroyed) {
    move bullet by (0,1);
    if (bullet is colliding enemy) {

        // will trigger the moment that their hitboxes
        // contact each other

        isDestroyed = True;
        destroy bullet;
        destroy enemy;
    }
}
```

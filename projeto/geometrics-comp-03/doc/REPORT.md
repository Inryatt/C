## Group members
&nbsp;

| NMec | Name | email | Contribution (%) | Detailed contribution [1]
|:-:|:--|:--|:-:|:--|
| 93343 | Isabel Rosário | isabel.rosario@ua.pt | 16% | code-generation (30%) <br> secondary-interpretation/secondary-code-generation(33%) <br> examples(16%) <br> testing (16%) <br> documentation (40%) <br> designing the language (16%)|
| 96123 | Lucius Vinicius | luciusviniciusf@ua.pt | 16% | primary-grammar(30%) <br> primary-semantic-analysis(30%) <br> code-generation (10%) <br> secondary-grammar(30%) <br> secondary-semantic-analysis(30%) <br> examples(16%) <br> testing (16%) <br> documentation (20%) <br> designing the language (16%)|
| 97880 | Camila Fonseca | cffonseca@ua.pt | 16% | code-generation (30%) <br> secondary-interpretation/secondary-code-generation(33%) <br> examples(16%) <br> testing (16%) <br> designing the language (16%)|
| 97606 | Diogo Monteiro | diogo.mo.monteiro@ua.pt | 16% | primary-grammar(30%) <br> primary-semantic-analysis(30%) <br> secondary-grammar(30%) <br> secondary-semantic-analysis(30%) <br> examples(16%) <br> testing (16%) <br> documentation (40%) <br> designing the language (16%)|
| 98452 | Dinis Lei | dinis.lei@ua.pt | 16% | primary-grammar(40%) <br> primary-semantic-analysis(40%) <br> secondary-grammar(40%)<br> secondary-semantic-analysis(40%) <br> examples(16%) <br> testing (16%) <br> designing the language (16%) |
| 100055 | Afonso Campos | afonso.campos@ua.pt | 16% | code-generation (30%) <br> secondary-interpretation/secondary-code-generation(33%) <br> examples(16%) <br> testing (16%) <br> designing the language (16%) |
|   |   |   |   |   |

[1] Topics:<br>
   primary-grammar (%)<br>primary-semantic-analysis (%)<br>code-generation (%)<br>secondary-grammar (%)<br>secondary-semantic-analysis (%)<br>secondary-interpretation/secondary-code-generation (%)<br>examples (%)<br>testing (%)<br>other (%) (explain)

- Beware that within the group the sum for each topic must be 100% (obviously).

## Material to be evaluated

- Beware that **only** the code in the **master** branch will be considered for evaluation.

- Everything <3

## Compilation & Run

```
cd ./examples
./compile.sh <example_name>.geo
```

The compile.sh must have read write permissions.

## Working examples (at least two)

Use examples to show the language functionalities.

1. `./examples/Primitives.geo`

    Showcases all primitive types, how they can rotate, change color and many of their properties.

2. `./examples/FigureEatFigure.geo`

    Showcases how figures can be encapsulated within eachother and how it's possible to individually change the many elements of the figure.

3. `./examples/Overlapping.geo`

    Showcases how figures can be placed in layers, a figure in a higher layer will be displayer above the other whenever they overlap figures with lower layers.

4. `./examples/FB.geo`
    `./examples/FB.f3`

    Showcases loading figures from a figure bank.

5. `./examples/RotateFigure.geo`

    Showcases a figure with figures within them rotating.

6. `./examples/RotateFigure.geo`

    Showcases a figure with figures within them rotating.

7. `./examples/TesteWaitKey.geo`

    Showcases user input, how the user can stop the animation, or move the rotating line.

8. `./examples/bonkTest.geo`

    Showcases collisions between objects.

9. `./examples/spaceInvaders.geo`

    Showcases a mini space invaders (TM) with collisions between figures, bullet firing, loops, flow control, and user input.
...

## Semantic error examples

1. `./examples/exemplo1.geo`

    Incorrect value attribution.

2. `./examples/exemplo2.geo`

    Previously declared variable error.

3. `./examples/exemplo3.geo`

    Break statement out of cycle.

4. `./examples/exemplo4.geo`

    Unsupported properties, wrong type assign to property, undefined figure instantiated. 

5. `./examples/exemplo5.geo`

    Call animation with invalid number of arguments, call animation with wrong argument types, undefined variable, use destroyed figure, group used in animation must be figure instance group.

6. `./examples/exemplo6.geo` `./examples/exemplo6.f3`

    Load unexistent file, load incompatible file, use non-declared figure.

...

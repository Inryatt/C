# Geometrics Reference

## Regular Data Types

| Type | Description | Operations |
| ---- | ----------- | ---------- |
| `int`| Integer, in other words, a whole number.<br/>Can be used in place of `double` types. | <ul><li>`+`, `-` : with `ints`, `doubles`, `points`</li><li>`*`, `/`, `%` : with `ints`, `doubles`</li><li>`^` : with `ints`, `doubles`</li><li>`==`, `!=`, `<`, `>`, `>=`, `<=` : with `ints`, `doubles`</li></ul> |
|`double`| A floating point value, in other words, a fractionary number. | <ul><li>`+`, `-` : with `ints`, `doubles`, `points`</li><li>`*`, `/`, `%` : with `ints`, `doubles`</li><li>`^` : with `ints`, `doubles`</li><li>`==`, `!=`, `<`, `>`, `>=`, `<=` : with `ints`, `doubles`</li></ul> |
|`point`| A pair of `ints` or `doubles`, in the format `(y, x)` | <ul><li>`+`, `-` : with `ints`, `doubles`, `points`</li><li>`*`, `/`, `%` : with `ints`, `doubles`</li><li>`==`, `!=` : with `points`</li></ul> |
|`boolean`| A value of `True` or `False` | <ul><li>`==`, `!=`, `<`, `>`, `>=`, `<=` : with `booleans`</li><li>`!` : before itself</li><li>`and`, `or` : with `booleans`</li></ul> |
|`string`| A text sequence delimited by `"` | <ul><li>`==`, `!=` : with `strings`</li></ul> |
|`time`| A duration of time, defined by an `int` or `double` literal followed by a time unit (`s`, `ms` or `ns`) | <ul><li>`+`, `-` : with `times`</li><li>`*`, `/` : with `ints`, `doubles`</li><li>`==`, `!=` : with `times`</li></ul> |


## Color Type

The `border_color` and `fill_color` figure properties require a `color` type, which can be passed in 3 different ways:
- One of several color presets: `Red`, `Blue`, `Green`, `Yellow`, `Orange`, `Pink`, `White`, `Black`, `Purple` and `Brown`
- An RGB or HSV color represented as 3 `ints`: `RGB <red> <green> <blue>` or `HSV <hue> <saturation> <value>`
- An RGB or HSV color represented as a hex code: `RGB #<code>` or `HSV #<code>`

Colors can be compared with `==` and `!=`, but cannot be declared as variables, the only place they can be assigned are previously mentioned figure properties.

## General Figure Properties

There is a collection of properties that are common to all figure types, those being:
- `border`: `boolean` type. Default `True`. Visibility of the border.
- `border_color`: `color` type. Default `Black`. Color of the border.
- `thickness`: `int` type. Default `1`. Thickness of the border.
- `fill`: `boolean` type. Default `False`. Visibility of the fill color.
- `fill_color`: `color` type. Default `White`. Color of the figure's fill.
- `hidden`: `boolean` type. Default `False`. Visibility of the figure.
- `position`: `point` type. Default `(0,0)`. Current position of the figure. Relative when a component of a composite figure.
- `center`: `point` type. Default `(0,0)`. Figure's point of reference for positions.
- `pivot`: `point` type. Default `(0,0)`. Default pivot for figure rotation.
- `scale`: `double` type. Default `1`. Current scale of the figure.
- `angle`: `int` type. Default `0`. Current rotation of the figure.
- `layer`: `int` type. Default `0`. How to overlay this figure over others. Figures with lower values drawn below those with higher values.

<br/>

## Primitive Figure Types

| Type | Properties |
| ---- | ---------- |
|`circle`| <ul><li>`radius`: `double` type</li></ul> |
|`line`| <ul><li>`points`: [`point` `point`] type</li></ul> |
|`rectangle`| <ul><li>`width`: `double` type</li><li>`height`: `double` type</li></ul> |
|`square`| <ul><li>`length`: `double` type</li></ul> |
|`ellipse`| <ul><li>`width`: `double` type</li><li>`height`: `double` type</li></ul> |
|`polyline`| <ul><li>`points`: [`point` ... `point`] type</li></ul> |
|`polygon`| <ul><li>`points`: [`point` ... `point`] type</li></ul> |
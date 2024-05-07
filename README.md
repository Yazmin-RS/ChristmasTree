# ChristmasTree
Imprime un bonito árbol de Navidad con su propia estrella en la punta usando el código más corto posible. 

La estrella del árbol es un asterisco (*) y el cuerpo del árbol está hecho de 0.
El árbol debe tener 10 filas de altura. 
Cada fila debe estar correctamente identada de manera que la fila anterior quede centrada sobre la nueva. 
Cualquier fila dada debe tener dos 0s más que la anterior, excepto la primera que es la estrella y la segunda, con solamente un 0. 

// Explicación del código

* Definimos una variable de altura que utilizaremos para crear la identación.

Imprimir la estrella
* Utilizamos la instrucción de impresión y definimos un formato que imprime una cadena de espacios para mover el árbol hacia la derecha. La expresión %" + height + "s" es una cadena de formato que se utiliza con printf. El valor height nos da calcula el número de espacios que se imprimirán antes del caracter. La s al final indica que se imprimirá una cadena.
* Llamamos la función de impresión que da un salto de linea después de realizar la impresión.

Imprimir el árbol
* Definimos un for para imprimir los 0 del árbol se debe empezar con un cero pero la estrella ocupa un altura por lo que se le resta a la altura.
* Volvemos a utilizar la función para imprimir los espacios. Esta vez se modifica la expresión %" + (heigth - 1) + "s" para restar espacio en la identación con cada piso.
* Para imprimir los ceros de utilizamos la expresión 0.repeat(2 * i + 1)) que imprime el caracter (2 * i + 1) en cada linea, expresión que cumple agregar dos 0 en cada piso.





# Busqueda Lineal:
Este algoritmo funciona secuencialmente por todo el Array, desde un extremo hasta encontrar el elemento objetivo.-Si se encuentra el elemento en cuestion, devuelve su indice, sino devolvera (-1).
Si el elemento objetivo se encuentra en el primer subindice[ ] , la complejidad temporal es 0(1). Si el elmento objetivo se encuentra en el subindice en la mitad (N/2) del Array,la complejidad temporal es 0(N).
Si recorre todo el array para encontrar el elemento objetivo, la complejidad temporal es 0N.
# Busqueda Binaria:
El algoritmo de busqueda binaria se utiliza para encontrar la posicion de un valor especifico dentro de un Array.
El funcionamiento de este algoritmo, es segun el principio de "Divide y Venceras" es considerado el mejor algoritmo de busqueda, por la velocidad de ejecucion
con un array ordenado, ej. [1, 3, 5, 8, 11, 15, 17, 19, 21] elemento objetivo [15].  
Compara el elemento objetivo, con el elemento medio del Array, si el elmento objetivo es mayor que el elemento central, la busqueda continuara la mitad izquierda, este proceso se repite hasta que elemento medio==elemento objetivo, o el elemento no esta en el Array. Si encuentra el elemento objetivo devolvera subindice, sino devolvera -1.

# Busqueda Agnostica:
La implementacion es similar a la busqueda binaria,necesitamos identificar si el array está ordenado de forma ascendente o descendente.Si el Array está ordenado en forma ascendente y el objetivo es menor que el elemento del medio o está ordenada en forma descendente y el objetivo es mayor que el elemento del medio, entonces continuamos la búsqueda en la mitad hacia la izquierda del Array estableciendo ultimo=medio-1.
En caso contrario, realizamos la busqueda en la mitad hacia la derecha del array estableciendo  primero=medio+1

# metodoMontecarloP1
Obtención de una aproximación iterativa al número pi

Implemente un programa iterativo que permita obtener una aproximación al número pi mediante el método de Montecarlo.

- El algoritmo estará implementado en la clase Matematicas.java de acuerdo con la siguiente estructura:

package mates;
public class Matematicas{
/**
 Genera una aproximació n al nú mero pi mediante el mé todo de
 Montecarlo. El pará metro ` pasos` indica el nú mero de puntos
 generado.
*/
public static double generarNumeroPiIterativo(long pasos){
return 0; // Este código hay que cambiarlo.
}
}

- El programa principal para mostrar el resultado es el siguiente:

package aplicacion;
import mates.Matematicas;
public class Principal{
public static void main(String[] args){
System.out.println("El número PI es " +
Matematicas.generarNumeroPiIterativo(Integer.parseInt(args[0])));
}
}

- Estructura del programa por carpetas:

Pactica1/
|--> src/
|    |
|    |--> aplicacion
|    |       |--> MetodoMontecarloP1
|    |
|    |--> mates
|            |--> Matematicas.java
|--> bin/
|--> out/
|--> makefile 
|--> .idea/
|--> .gitignore

  - Forma de compilado (en base al make file): 

Compilado de codigo --> make
Ejecutar el programa sin argumentos --> make run
Ejecutar el progrma con argumentos --> make run_args
Limpiar los archivos compilados --> make clean

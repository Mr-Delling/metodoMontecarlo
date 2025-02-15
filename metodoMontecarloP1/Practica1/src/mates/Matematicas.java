package mates;

public class Matematicas {
    /**
     * Genera una aproximació n al número pi mediante el método de
     * Montecarlo. El pará metro ` pasos` indica el número de puntos
     * generado.
     */
    public static double generarNumeroPiIterativo(long pasos){
        int dentro =  0;

        for (int i = 0; i < pasos; i++){
            double x = Math.random();
            //System.out.println("x = " + x); (coprobar los randome se gereran correctamente)
            double y = Math.random();
            //System.out.println("y = " + y); (coprobar los randome se gereran correctamente)

            if (1 >= ((x * x) + (y * y))){
                dentro ++;
                //System.out.println("dentro = " + dentro); (comprobar que el contador sume correctamerte)
            }
        }
        double pi;
        pi = 4.0 * ((double) dentro / pasos); // (tines que pasar los datos a double sino no es capaz de realizar la operacion)
        // System.out.println("pi = " + pi); (Comprobacion de slida de resultado correcta)
        return pi;
    }
}

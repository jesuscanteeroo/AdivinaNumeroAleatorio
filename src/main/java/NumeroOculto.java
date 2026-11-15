
public class NumeroOculto {
    private int numero;                             // Guarda el numero que los hilos tienen que adivinar
    private boolean terminado = false;              // Indicamos si algun hilo ya ha acvertado el numero

    public NumeroOculto(int numero) {
        this.numero = numero;               // Guardamos el numero recibido en el atributo
    }

    public synchronized int propuestaNumero(int num) {      // Metodo sincronizado para comprobar cada opcion

        if (terminado) {        // Comprobamos si otro hilo ya ha acertado el numero
            return -1;          // Devolvemos -1 si el juego ya ha terminado
        }

        if (num == numero) {    // Comprobamos si el numero propuesto es correcto
            terminado = true;   // Indicamos que el juego ha terminado
            return 1;           // Devolvemos 1 porque el hilo ha acertado
        }

        return 0;               // Devolvemos 0 si el numero proponido es incorrecto

    }
}

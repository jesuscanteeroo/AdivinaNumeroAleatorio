import java.util.Random;

public class Hilo extends Thread {                             // Creamos la clase Hilo herendando de Thread

    private NumeroOculto oculto;                              // Guardamos una referencia al numero oculto

    public Hilo(NumeroOculto oculto) {
        this.oculto = oculto;                                // Recibimos y guardamos el objeto compartido
    }

    public void run() {                                     // Metodo que ejecuta cada hilo al iniciarse
        Random r = new Random();                            // Creamos el generador de numeros aleatorios

        while (true) {                                       // Repetimos los intentos hasta que el juego finalize
            int num = r.nextInt(101);                 //  Generamos una propuesta entre 0 y 100
            int resultado = oculto.propuestaNumero(num);    // Comprobamos la prpuesta

            if (resultado == 1) {                                           // Si el resultado es 1 hemos acertado
                System.out.println(getName() + " ha acertado: " + num);
                break;
            }

            if (resultado == -1) {                                          // Si devuelve -1 otro hilo ya ha acertado
                System.out.println(getName() + " termina porque otro hilo ya ha acertado");
                break;
            }

            System.out.println(getName() + " propone el numero: " + num);   // Mostramos el numero que ha propuesto el hilo y no ha acertado
        }
    }
}

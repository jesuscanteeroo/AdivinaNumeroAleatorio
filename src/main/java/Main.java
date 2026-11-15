import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();                     // Creamos un objeto para generar numeros Aleatorios
        int numero = r.nextInt(101);          // Aqui generamos un numero entre 0 y 100

        NumeroOculto oculto = new NumeroOculto(numero);         // Creamos el objeto que guarda el numero a adivinar

            for (int i = 0; i < 10; i++) {          // Repetimos el proceso 10 veces para crear 10 hilos
                Hilo h = new Hilo(oculto);          // Creamos un hilo y le pasamos el numero a adivinar
                h.start();                          // Iniciamos la ejecucion del hilo
            }
        }
    }

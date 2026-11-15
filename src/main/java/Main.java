import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Random r = new Random();
        int numero = r.nextInt(101);

        NumeroOculto oculto = new NumeroOculto(numero);

            for (int i = 0; i < 10; i++) {
                Hilo h = new Hilo(oculto);
                h.start();
            }
        }
    }

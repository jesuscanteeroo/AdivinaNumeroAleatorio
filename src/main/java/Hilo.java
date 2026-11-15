import java.util.Random;

public class Hilo extends Thread {

    private NumeroOculto oculto;

    public Hilo(NumeroOculto oculto) {
        this.oculto = oculto;
    }

    public void run() {
        Random r = new Random();

        while (true) {
            int num = r.nextInt(101);
            int resultado = oculto.propuestaNumero(num);

            if (resultado == 1) {
                System.out.println(getName() + " ha acertado: " + num);
                break;
            }

            if (resultado == -1) {
                System.out.println(getName() + " termina porque otro hilo ya ha acertado");
                break;
            }

            System.out.println(getName() + " propone el numero: " + num);
        }
    }
}

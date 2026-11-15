
public class NumeroOculto {
    private int numero;
    private boolean terminado = false;

    public NumeroOculto(int numero) {
        this.numero = numero;
    }

    public synchronized int propuestaNumero(int num) {

        if (terminado) {
            return -1;
        }

        if (num == numero) {
            terminado = true;
            return 1;
        }

        return 0;
    }
}

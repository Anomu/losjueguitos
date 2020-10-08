import java.util.Random;


public class Dau {

    private int valor;

    Random dados = new Random();

    public void tirada(){
        valor = dados.nextInt(6)+1;
    }

    public int getValor(){
        return valor;
    }

    public Dau(int valor) {
        this.valor = valor;
    }
}

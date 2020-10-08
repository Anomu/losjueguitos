import java.util.Scanner;

public class jocDaus {
    Dau dado1;
    Dau dado2;
    Dau dado3;

    public jocDaus() {
        dado1 = new Dau(3);
        dado2 = new Dau(2);
        dado3 = new Dau(3);
    }

    public void jugar() {
        Scanner scanner = new Scanner(System.in);
        boolean contuniar = true;
        int victorias = 0;
        int derrotas = 0;
        int partidas = 1;
        while(contuniar){
            System.out.println("¿Cuántas veces quieres tirar los dados?");
            int tiradas = scanner.nextInt();
            System.out.println("Se tiran los dados "+ tiradas + " veces.");
                for (int i = 0; i <tiradas ; i++) {
                dado1.tirada();
                dado2.tirada();
                dado3.tirada();
                if (dado1.getValor() == dado2.getValor() && dado2.getValor() == dado3.getValor()) {
                    victorias++;
                } else {
                    derrotas++;
                }
             }
                System.out.println("¿Quieres continuar? (Y/N)");
                String respuesta = scanner.next();
                if (respuesta.equals("Y") || respuesta.equals("y")){
                    partidas++;
                } else if (respuesta.equals("N") || respuesta.equals("n")){
                    System.out.println("Has ganado " + victorias + " partidas.");
                    System.out.println("Has perdido " + derrotas + " partidas.");
                    System.out.println("Has jugado " + partidas + " partidas.");
                    contuniar = false;
                }
        }
    }
}

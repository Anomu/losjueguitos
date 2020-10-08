import java.util.Scanner;

public class Menu {

    jocDaus jocDaus = new jocDaus();

    public void menu() {
        Scanner scanner = new Scanner(System.in);



        int selector=0;

        while(selector!=4) {
            System.out.println("LOS JUEGUITO!!!");
            System.out.println("1.Juego de los Dados");
            System.out.println("2.TicTacToe");
            System.out.println("3.Cyberpunk 2077");
            System.out.println("4.Exit");
            selector = scanner.nextInt();
            switch (selector) {
                case 1:
                    jocDaus.jugar();
                    break;
                case 2:
                    System.out.println("I wish lol.");
                    break;
                case 3:
                    System.out.println("I wish lol.");
                    break;
                case 4:
                    break;
            }
        }
    }
}

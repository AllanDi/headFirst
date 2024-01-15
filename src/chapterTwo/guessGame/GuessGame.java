package chapterTwo.guessGame;

import java.util.Random;
import java.util.Scanner;

public class GuessGame {

    public String p1;
    public String p2;
    public String p3;

    public GuessGame(String p1, String p2, String p3){
        this.p1 = p1;
        this.p2 = p2;
        this.p3 = p3;

    }

    public void startGame(){
        Player player1 = new Player();
        Player player2 = new Player();
        Player player3 = new Player();

        Random random = new Random();
        int numero = random.nextInt(10) + 1;

        Scanner scanner = new Scanner(System.in);

        Player vencedor = null;

        while (vencedor == null) {


            System.out.println(player1 + "Digite um numero: ");
            int numeroJogadorP1 = scanner.nextInt();
            System.out.println(player2 + "Digite um numero: ");
            int numeroJogadorP2 = scanner.nextInt();
            System.out.println(player3 + "Digite um numero: ");
            int numeroJogadorP3 = scanner.nextInt();


            if (numeroJogadorP1 == numero) {
                vencedor = player1;
            } else if (numeroJogadorP2 == numero) {
                vencedor = player2;
            } else if (numeroJogadorP3 == numero) {
                vencedor = player3;
            } else {
                vencedor = null;
            }

            if (vencedor == null) {
                System.out.println("Nenhum jogador adivinou o numero, tentem novamente.");
                System.out.println("O numero era " + numero);
            } else {
                System.out.println("O jogador " + vencedor + " venceu, ele escolheu o numero " + numero + " e acertou, parabéns!!!");
            }

        }




    }

}

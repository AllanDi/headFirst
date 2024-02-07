package chapterTwo.guessGameTwo;

public class GuessGame {

    Player p1;
    Player p2;
    Player p3;


    public void startGame() {
        p1 = new Player();
        p2 = new Player();
        p3 = new Player();

        int guessP1 = 0;
        int guessP2 = 0;
        int guessP3 = 0;

        boolean p1IsRight = false;
        boolean p2IsRight = false;
        boolean p3IsRight = false;

        int tagetNumber = (int) (Math.random() * 10);
        System.out.println("Estou pensando em um numero entre 0 e 9...");

        while (true) {
            System.out.println("O numero a adivinhar é " + tagetNumber);

            p1.guess();
            p2.guess();
            p3.guess();

            guessP1 = p1.number;
            System.out.println("O jogador 1 forneceu o palpite " + guessP1);
            guessP2 = p2.number;
            System.out.println("O jogador 2 forneceu o palpite " + guessP2);
            guessP3 = p3.number;
            System.out.println("O jogador 3 forneceu o palpite " + guessP3);

            if (guessP1 == tagetNumber) {
                p1IsRight = true;
            }
            if (guessP2 == tagetNumber) {
                p2IsRight = true;
            }
            if (guessP3 == tagetNumber) {
                p3IsRight = true;
            }

            if (p1IsRight || p2IsRight || p3IsRight) {
                System.out.println("Temos um vencerdor!");
                System.out.println("O jogador 1 acertou? " + p1IsRight);
                System.out.println("O jogador 2 acertou? " + p2IsRight);
                System.out.println("O jogador 3 acertou? " + p3IsRight);
                System.out.println("Fim do jogo");

                break; // fim do jogo e saida do loop.

            } else { // devemos continuar ninguem acertou.

                System.out.println("Os jogadores teram que tentar novamente.");
            }
        }
    }
}

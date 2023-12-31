package misc;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Misc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tentativas = 3;

        System.out.println("Bem-vindo, Mestre das Chaves. Digite o código mágico:");




        while (tentativas > 0) {
            try {
                int codigoMagico = scanner.nextInt();
                System.out.println("Muito bem isso é um numero");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Isso não é um numero, deu ruim, estourou a excessão");
                scanner.next();
            }
            tentativas = tentativas -1;
        }

        if (tentativas == 0) {
            System.out.println("As tentativas acabaram. A chave se desintegra em faíscas mágicas.");
        }
    }
}

package chapterOne;

public class PoolPuzzleOne {

    static void impressao(String texto){
        System.out.print(texto.toString());
    }
    public static void main(String[] args) {

        int x = 0;

        while (x < 4) {
            impressao("a");
            if (x < 1) {
                System.out.print(" ");
            }
            System.out.print("n");
            if (x > 1) {
                System.out.print(" oyster");
                x = x + 2;
            }
            if (x == 1) {
                System.out.print("noys");
            }
            if (x < 1) {
                System.out.print("oise");
            }
            System.out.println("");
            x = x + 1;
        }
    }
}

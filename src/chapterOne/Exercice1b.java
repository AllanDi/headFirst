package chapterOne;

public class Exercice1b {
    public static void main(String[] args) {

        int x = 1;

        while (x<10){
            if (x>3){
                System.out.println("big x");
            }
            x=x+1;
        }

        x = 5;

        while ( x > 1){
            x = x - 1;
            if ( x < 3 ){
                System.out.println("small x");
            }
        }

        int y = 5;
        while (y > 1){
            y = y - 1;
            if (y < 3){
                System.out.println("small y");
            }
        }

    }


}

package chapterThree;

public class TestArray {

    public static void main(String[] args) {

        String [] island = new String[4];

        island [0] = "Bermuda";
        island [1] = " fiji";
        island [2] = "azores";
        island [3] = "Cozumel";

        int [] index = new int [4];

        index [0] = 1;
        index [1] = 3;
        index [2] = 0;
        index [3] = 2;

        int y = 0;
        int ref;

        ref = index[y];

        while (y < 4){

            System.out.print("island = ");
            System.out.println(island[index[y]]);

            y = y + 1;

        }
    }
}


// island = fiji
// island = Cozumel
// island = Bermuda
// island = Azores

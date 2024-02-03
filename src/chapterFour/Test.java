package chapterFour;

public class Test {
    static int x = 7;
     static void go(int z){


        x = z;



    }

    public static void main(String[] args) {

        System.out.println(x);
        int z = 15;
        System.out.println(z);
        System.out.println("-----------------");
        go(z);
        System.out.println(x);



    }





}

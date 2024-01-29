package chapterThree;

public class Triangle {

    double area;
    int height;
    int length;


    public static void main(String[] args) {

        Triangle[] ta = new Triangle[4];

        ta[0] = new Triangle();
        ta[1] = new Triangle();
        ta[2] = new Triangle();
        ta[3] = new Triangle();





        int x = 0;
        int y = x;




        while (x < 4){



            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();



            System.out.print("triangle " + x + ", area");
            System.out.println(" = "+ ta.area);

            x++;

        }


        x = 27;

        Triangle t5 = ta[2];
        ta[2].area = 343;

        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);

    }

    void setArea(){

           area = (height * length) / 2;

    }


}

//triangle 0, area = 4.0
//triangle 1, area = 10.0
//triangle 2, area = 18.0
//triangle 3, area =______
//y=________________

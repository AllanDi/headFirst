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
        int y = 0;

        while (x < 4) {
            ta[x].height = (x + 1) * 2;
            ta[x].length = x + 4;
            ta[x].setArea();

            System.out.print("triangle " + x + ", area");
            System.out.println(" = " + ta[x].area);

            x++;
        }

        y = x;

        Triangle t5 = ta[2];
        System.out.print("y = " + y);
        System.out.println(", t5 area = " + t5.area);
    }

    void setArea() {
        area = (height * length) / 2.0;
    }
}

package chapterFour;

public class GoodDog {

    private int size;
    String name;

    public int getSize() {
        return size;
    }
    public String getName(){ return name;}

    public void setSize(int size){
        this.size = size;
    }

    void bark(){

        if (size > 60){
            System.out.println("auau grande");
        } else if (size > 14) {
            System.out.println("auau médio");
        } else {
            System.out.println("auau pequeno");
        }
    }
}

class GoodDogTestDrive{

    public static void main(String[] args) {
        GoodDog one = new GoodDog();

        one.setSize(70);

        GoodDog two = new GoodDog();

        two.setSize(15);

        GoodDog three = new GoodDog();

        three.setSize(8);

        one.bark();
        two.bark();
        three.bark();

        GoodDog[] pets;

        pets = new GoodDog[7];

        pets[0] = new GoodDog();
        pets[1] = new GoodDog();

        pets[0].setSize(10);

        pets[0].bark();
        pets[1].bark();

        GoodDog test = new GoodDog();

        System.out.println(test.getSize());
        System.out.println(test.getName());



    }




}
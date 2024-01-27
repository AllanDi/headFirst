package chapterThree;
public class ObjectReference {
        public static void main(String[] args) {

//        Book b = new Book();
//        Book c = new Book();
//        Book d = c;
//
//
//        b.name = "Livro (B)";
//        c.name = "Livro (C)";
//        d.name = "Livro (D)";
//
//        System.out.println(b.name);
//        System.out.println(c.name);
//        System.out.println(d.name);
//
//            System.out.println("Fazendo as atribuições testes: ");
//
//
//        System.out.println(b.name);
//        System.out.println(c.name);
//        System.out.println(d.name);



            int[] nums;
            nums = new int[7];
            nums[0] = 6;
            nums[1] = 19;
            nums[2] = 44;
            nums[3] = 42;
            nums[4] = 10;
            nums[5] = 20;
            nums[6] = 1;

            System.out.println(nums[5]);

            Dog[] pets = new Dog[7];
            pets[0] = new Dog("rex");

            System.out.println(pets[0].name);
            pets[0].name = "fido";
            System.out.println(pets[0].name);
            pets[0].bark();



    }





}
class Book {
    int pages;
    String name;

}

class Dog{
    String name;

    public Dog(String name){
        this.name = name;
    }
    public void bark(){
        System.out.println("auau");
    }

}

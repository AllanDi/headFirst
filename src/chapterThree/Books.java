package chapterThree;

public class Books {
    String title;
    String author;
}
class BooksTestDrive {
    public static void main(String[] args) {
        Books[] myBooks = new Books[3];
        int x = 0;
        myBooks[0] = new Books();
        myBooks[1] = new Books();
        myBooks[2] = new Books();
        myBooks[0].title = "0 title";
        myBooks[1].title = "1 title";
        myBooks[2].title = "2 title";
        myBooks[0].author = "0 author";
        myBooks[1].author = "1 author";
        myBooks[2].author = "2 author";

        while (x < 3) {
            System.out.print(myBooks[x].title);
            System.out.print(" by ");
            System.out.println(myBooks[x].author);
            x = x + 1;
        }
    }
}

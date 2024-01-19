package chapterTwo.drumkit;

public class DrumKit {

    boolean tophat = true;
    boolean snare = true;

    void playSnare(){
        System.out.println("bang bang ba-bang");
    }

    void playTopHAt(){
        System.out.println("ding ding da-ding");

    }
}
 class DrumKitTestDrive {
    public static void main(String[] args) {

        DrumKit d = new DrumKit();

        d.playSnare();
        d.playTopHAt();

        d.snare = false;

        if(d.snare == true){
            d.playSnare();
        }
    }
}

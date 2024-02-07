package chapterFour;

public class Clock {

    String time;

    void setTime(String t){
        this.time = t;
    }

    public String getTime(){
        return this.time;
    }

    public static void main(String[] args) {

        Clock c = new Clock();

        c.setTime("1234");
        String tod = c.getTime();
        System.out.println("time: " + tod);

    }

}

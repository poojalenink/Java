interface Playable1 {
    void play();
}

class Violin implements Playable1 {
    @Override
    public void play() {
        System.out.println("It's a violin");
    }
}

class Drum implements Playable1 {
    @Override
    public void play() {
        System.out.println("It's a drum");
    }
}
public class Playable {
    public static void main(String[] args) {

        Playable1 v = new Violin();
        Playable1 d = new Drum();

        v.play();
        d.play();
    }
}
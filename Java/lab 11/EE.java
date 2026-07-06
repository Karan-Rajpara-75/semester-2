interface Playable {
    void play();
}
class Football implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Football: Kicking the ball, scoring goals, and defending!");
    }
}
class Volleyball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Volleyball: Serving, spiking, and blocking the ball over the net!");
    }
}
class Basketball implements Playable {
    @Override
    public void play() {
        System.out.println("Playing Basketball: Dribbling, shooting hoops, and dunking!");
    }
}
public class EE {
    public static void main(String[] args) {
        Playable[] sports = new Playable[3];
        sports[0] = new Football();
        sports[1] = new Volleyball();
        sports[2] = new Basketball();
        for (int i = 0; i < sports.length; i++) {
            sports[i].play();
            System.out.println();
        }
    }
}

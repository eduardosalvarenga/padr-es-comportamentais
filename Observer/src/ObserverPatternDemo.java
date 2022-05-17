public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();

        new HexaObserver(subject);
        new OctalObserver(subject);
        new BinaryObserver(subject);

        System.out.println("Primeira mudança de estado: 15");
        subject.setState(15);
        System.out.println("Segunda mudança de estado: 10");
        subject.setState(10);
    }
}

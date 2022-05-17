public class MementoPatternDemo {
    public static void main(String[] args) {

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("Estado 1");
        originator.setState("Estado 2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Estado 3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("Estado 4");
        System.out.println("Estado atual: " + originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("Primeiro estado salvo: " + originator.getState());
        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Segundo estado salvo: " + originator.getState());
    }
}

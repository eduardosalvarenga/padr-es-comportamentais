public class MediatorPatternDemo {
    public static void main(String[] args) {
        User roberto = new User("Roberto");
        User joao = new User("João");

        roberto.sendMessage("Oi! João!");
        joao.sendMessage("Oi! Roberto!");
    }
}

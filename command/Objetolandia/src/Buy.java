public class Buy implements Order {

    private Burger burger;
    private Shake shake;

    public Buy(Burger burger, Shake shake) { this.burger = burger; this.shake = shake; }

    public void execute() { burger.makeBurger(); shake.makeShake();}
}

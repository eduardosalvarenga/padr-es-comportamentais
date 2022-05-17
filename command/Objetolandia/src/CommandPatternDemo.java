public class CommandPatternDemo {
    public static void main(String[] args) {
        Burger burger = new Burger();
        Shake shake = new Shake();

        Buy pedido = new Buy(burger, shake);
        
        Cook cook = new Cook();
        cook.takeOrder(pedido);

        cook.placeOrders();

    }
}

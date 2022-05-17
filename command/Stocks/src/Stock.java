public class Stock {

    private String name = "AAA";
    private int quantity = 100;

    public void buy(){
        System.out.println("Ação [ Nome: " +name+", Quantidade: " +quantity +" ] comprada");
    }

    public void sell(){
        System.out.println("Ação [ Nome: " +name+", Quantidade: " +quantity +" ] vendida");
    }
}

public class InterpreterPatternDemo {

    public static Expression getMaleExpression() {
        Expression roberto = new TerminalExpression("Roberto");
        Expression joao = new TerminalExpression("João");
        return new OrExpression(roberto, joao);
    }

    public static Expression getMarriedWomanExpression(){
        Expression julia = new TerminalExpression("Julia");
        Expression married = new TerminalExpression("Married");
        return new AndExpression(julia,married);
    }

    public static void main(String[] args) {
        Expression isMale = getMaleExpression();
        Expression isMarriedWoman = getMarriedWomanExpression();

        System.out.println("João é homem? " + isMale.interpret("João"));
        System.out.println("Julia é uma mulher casada? " + isMarriedWoman.interpret("Married Julia"));
    }
}

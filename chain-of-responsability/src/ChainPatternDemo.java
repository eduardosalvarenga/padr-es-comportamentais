public class ChainPatternDemo {

    private static AbstractLogger getChainOfLoggers(){

        // Criação de diferentes tipos de registradores.
        AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
        AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
        AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);

        // Próximo registrador de cada registrador.
        errorLogger.setNextLogger(fileLogger);
        fileLogger.setNextLogger(consoleLogger);

        return errorLogger;
    }

    public static void main(String[] args) {
        AbstractLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbstractLogger.INFO,"Essa é uma informação.");

        loggerChain.logMessage(AbstractLogger.DEBUG,"Essa é uma informação nível debug");

        loggerChain.logMessage(AbstractLogger.ERROR,"Essa é uma informação de erro.");
    }
}

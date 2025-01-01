package logger;

public class Main {
    public static void main(String[] args){
        LogProcessor logger = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        System.out.println("Welcome!");
        logger.log(2, "Some exceptions has happend");
    }

}

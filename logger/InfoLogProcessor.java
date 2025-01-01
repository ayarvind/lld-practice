package logger;

public class InfoLogProcessor extends LogProcessor{
    InfoLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logType, String message){
        if(logType == LogProcessor.INFO){
            System.out.println("INFO : " + message);
            return;
        }
        super.log(logType, message);
    }
}

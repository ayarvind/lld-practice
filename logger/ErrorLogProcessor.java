package logger;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logType, String message){
        if(logType == LogProcessor.ERROR){
            System.out.println("ERROR : " + message);
            return;
        }
        super.log(logType, message);
    }
}

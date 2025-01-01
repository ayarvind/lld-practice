package logger;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }
    public void log(int logType, String message){
        if(logType == LogProcessor.DEBUG){
            System.out.println("DEBUG : " + message);
            return;
        }
        super.log(logType, message);
    }
}

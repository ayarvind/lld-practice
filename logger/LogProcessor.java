package logger;

abstract class LogProcessor {
    public static int DEBUG = 0;
    public static int INFO = 1;
    public static int ERROR = 2;

    LogProcessor nextLogProcessor;

    LogProcessor(LogProcessor nextLogProcessor) {
        this.nextLogProcessor = nextLogProcessor;

    }

    public void log(int logType, String message) {
        if (nextLogProcessor != null) {
            nextLogProcessor.log(logType, message);
        }
    }

}

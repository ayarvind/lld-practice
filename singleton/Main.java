class Config {
    volatile public static Config config = null;

    private Config() {
    };

    public static Config getConfig() {
        if (config == null) {
            synchronized (Config.class) {
                if (config == null) {
                    config = new  Config();
                }
            }
        }
        return config;
    }

    void message() {
        System.out.println("Hello ji");
    }

}

public class Main extends Thread {
    public static void main(String args[]) {
        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                Config config = Config.getConfig();
                System.out.println(config.hashCode());
                config.message();
            }

        });
        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                Config config = Config.getConfig();
                System.out.println(config.hashCode());
                config.message();
            }

        });

        t1.start();
        t2.start();
    }

}

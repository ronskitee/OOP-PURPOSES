package creational.singleton;

import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        Logger logger = Logger.getInstance();

        logger.info("Test Log");
    }
}

class Logger {
    private static Logger instance;

    public static Logger getInstance() {
        if (instance == null) {
            instance = new Logger();
        }

        return instance;
    }

    public void info(String message) {
        System.out.printf("%s [INFO] %s\n", LocalDateTime.now(), message);
    }
}

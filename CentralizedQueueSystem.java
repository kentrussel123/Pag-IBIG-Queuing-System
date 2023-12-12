public class CentralizedQueueSystem {

    private static CentralizedQueueSystem instance;
    private int currentQueueNumber;

    private CentralizedQueueSystem() {
        // Private constructor to prevent instantiation from outside the class
        currentQueueNumber = 0;
    }

    public static CentralizedQueueSystem getInstance() {
        if (instance == null) {
            synchronized (CentralizedQueueSystem.class) {
                if (instance == null) {
                    instance = new CentralizedQueueSystem();
                }
            }
        }
        return instance;
    }

    public int getCurrentQueueNumber() {
        return currentQueueNumber;
    }

    public void incrementQueueNumber() {
        currentQueueNumber++;
    }

    public void resetQueueNumber(int newQueueNumber) {
        currentQueueNumber = newQueueNumber;
    }
}

public class HelpDesk {

    private String name;

    public HelpDesk(String name) {
        this.name = name;
    }

    public void serveCustomer() {
        CentralizedQueueSystem queueSystem = CentralizedQueueSystem.getInstance();

        // Simulate serving a customer by displaying the help desk's name and the current queue number
        System.out.println(name + " is serving Customer with Queue Number: " + queueSystem.getCurrentQueueNumber());

        // Simulate completing the service and incrementing the queue number
        queueSystem.incrementQueueNumber();
    }

    public void resetQueue(int newQueueNumber) {
        CentralizedQueueSystem queueSystem = CentralizedQueueSystem.getInstance();

        // Simulate a reset by displaying the help desk's name and the new queue number
        System.out.println(name + " resets Queue Number to: " + newQueueNumber);

        // Reset the queue number
        queueSystem.resetQueueNumber(newQueueNumber);
    }

    public static void main(String[] args) {
        // Example usage of HelpDesk interacting with CentralizedQueueSystem
        HelpDesk helpDesk1 = new HelpDesk("Help Desk 1");
        HelpDesk helpDesk2 = new HelpDesk("Help Desk 2");

        helpDesk1.serveCustomer();  // Help Desk 1 is serving Customer with Queue Number: 0
        helpDesk2.serveCustomer();  // Help Desk 2 is serving Customer with Queue Number: 1

        helpDesk1.resetQueue(5);    // Help Desk 1 resets Queue Number to: 5
        helpDesk2.serveCustomer();  // Help Desk 2 is serving Customer with Queue Number: 5
    }
}
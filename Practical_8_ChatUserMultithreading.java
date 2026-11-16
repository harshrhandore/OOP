class ChatUser extends Thread {
    private String userName;
    private volatile boolean running = true;
    private volatile boolean paused = false;

    public ChatUser(String name, int priority) {
        this.userName = name;
        setPriority(priority);
    }

    public synchronized void pauseThread() {
        paused = true;
    }

    public synchronized void resumeThread() {
        paused = false;
        notify();
    }

    public void stopThread() {
        running = false;
        resumeThread();
    }

    @Override
    public void run() {
        while (running) {
            synchronized (this) {
                while (paused && running) {
                    try {
                        wait();
                    } catch (InterruptedException e) {
                        break;
                    }
                }
            }
            if (!running) {
                break;
            }
            System.out.println(userName + " is sending a message.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
            System.out.println(userName + " is receiving a message.");
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                break;
            }
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ChatUser user1 = new ChatUser("Alice", Thread.MIN_PRIORITY);
        ChatUser user2 = new ChatUser("Bob", Thread.NORM_PRIORITY);
        ChatUser user3 = new ChatUser("Charlie", Thread.MAX_PRIORITY);

        user1.start();
        user2.start();
        user3.start();

        System.out.println("User 1 is alive: " + user1.isAlive());
        System.out.println("User 2 is alive: " + user2.isAlive());
        System.out.println("User 3 is alive: " + user3.isAlive());

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        user1.pauseThread();
        System.out.println("User 1 paused.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        user1.resumeThread();
        System.out.println("User 1 resumed.");

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
        }

        user1.stopThread();
        user2.stopThread();
        user3.stopThread();

        try {
            user1.join();
            user2.join();
            user3.join();
        } catch (InterruptedException e) {
        }

        System.out.println("User 1 is alive: " + user1.isAlive());
        System.out.println("User 2 is alive: " + user2.isAlive());
        System.out.println("User 3 is alive: " + user3.isAlive());
    }
}

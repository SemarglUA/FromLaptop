import Testing.A;
import Testing.Access.B;
import Testing.Z;


public class TestingQuestions {
    private static boolean running = false;
    private static volatile boolean flag = true;

    public static void main(String[] args) throws InterruptedException {
        new Thread(new Runnable() {
            @Override
            public void run() {
                while (flag) {
                    while (!running) {
                    }
                    System.out.println("Started");

                    while (running) {
                    }
                    System.out.println("Stoped");
                }
            }
        }).start();

        for(int i = 0; i < 100; i++) {
            Thread.sleep(1000);
            System.out.println("Starting");
            running = true;

            Thread.sleep(1000);
            System.out.println("Stoping");
            running = false;
        }
        flag = false;
        running = !running;
        System.out.println("Out");
    }
}


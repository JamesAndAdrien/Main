public class TimeIsMoney {
    public static void main(String[] args) {
        System.out.println("Ready for Takeoff!");

        long lastStepDate = System.nanoTime();
        boolean running = true;

        while (running) {
            long currentDate = System.nanoTime();
            long elapsedTime = currentDate - lastStepDate;
            lastStepDate = currentDate;

            System.out.println(elapsedTime); // nanoseconds 
        }
    }
}
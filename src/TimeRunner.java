public class TimeRunner {
    public static void main(String[] args) {
        for(int i = 0; i < 10; i ++){
            Time time = new Time((int)(Math.random() * 24), (int)(Math.random() * 60), (int)(Math.random() * 60));
            System.out.println("Current time is: " + time);
            int randomTick = (int)(Math.random() * 100);
            for(int n = 0; n < randomTick; n ++){
                time.tick();
            }
            System.out.println("After " + randomTick + " ticks, the time is: " + time);
            Time randomTime = new Time((int)(Math.random() * 24), (int)(Math.random() * 60), (int)(Math.random() * 60));
            System.out.println("The original time is " + time);
            System.out.println("The added time is " + randomTime);
            time.add(randomTime);
            System.out.println("The final time is " + time);
            System.out.println();
        }
    }
}

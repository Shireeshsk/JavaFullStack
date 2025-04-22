public class Deadlock {
    public static void main(String args[]){
        System.out.println("start of main...");
        String lock1 = "Shireesh";
        String lock2 = "Kumar";

        new Thread(()->{
            synchronized(lock1){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock2){
                    System.out.println("lock accquired");
                }
            }
        }).start();

        new Thread(()->{
            synchronized(lock2){
                try{
                    Thread.sleep(1);
                }catch(InterruptedException e){
                    e.printStackTrace();
                }
                synchronized(lock1){
                    System.out.println("lock accquired");
                }
            }
        }).start();
        System.out.println("main is exiting...");
    }
}

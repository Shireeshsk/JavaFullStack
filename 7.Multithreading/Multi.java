class Thread1 extends Thread{
    public Thread1(String Threadname){
        super(Threadname);
    }
    public void run(){
        for(int i = 0 ;i<5;i++){
            System.out.println("inside "+Thread.currentThread().getName()+" "+ i );
        }
    }
}

class Thread2 implements Runnable{
    public void run(){
        for(int i = 0 ; i < 5 ;i++){
            System.out.println("inside "+Thread.currentThread()+' '+i);
        }
    }
}
public class Multi{
    public static void main(String args[]){
        System.out.println("start of main thread");
        Thread1 sk = new Thread1("Thread_sk");
        sk.setDaemon(true);
        sk.start();
        Thread shireesh = new Thread(new Thread2(),"thread_sunnny");
        shireesh.run();
        System.out.println("end of main thread");
    }
}
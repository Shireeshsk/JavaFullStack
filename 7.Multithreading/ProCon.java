import java.io.IOException;

class buffer{
    int x;
    boolean produced = false;
    public synchronized void producer(int a) throws InterruptedException{
        if(produced){
            System.out.println("producer is waiting...");
            wait();
        }
        x = a;
        System.out.println("produced "+a+" product");
        produced = true;
        notify();
    }

    public synchronized void consumer(int a) throws InterruptedException{
        if(!produced){
            System.out.println("consumer is waiting...");
            wait();
        }
        x = a;
        System.out.println("consumed "+a+" product");
        produced = false;
        notify();
    }
}

class producer extends Thread{
    buffer k;
    producer(buffer sk){
        this.k = sk;
    }
    public void run(){
        System.out.println("producer started producing...");
        for(int i = 1 ; i<5;i++){
            try{
                k.producer(i);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}

class consumer extends Thread{
    buffer k;
    consumer(buffer sk){
        this.k = sk;
    }
    public void run(){
        System.out.println("consumer started consuming...");
        for(int i = 1 ; i<5;i++){
            try{
                k.consumer(i);
            }catch(Exception e){
                System.out.println(e);
            }
        }
    }
}
public class ProCon {
    public static void main(String args[]){
        buffer sk = new buffer();
        producer pro = new producer(sk);
        consumer con = new consumer(sk);
        pro.start();
        con.start()
    }
}

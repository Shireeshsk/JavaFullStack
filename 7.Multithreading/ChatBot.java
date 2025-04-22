class Chat {
    boolean flag = false;
    public synchronized void Question(String msg){
        if(flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = true;
        notify();
    }
    public synchronized void Answer(String msg){
        if(!flag){
            try{
                wait();
            }catch(InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println(msg);
        flag = false;
        notify();
    }
}
class QRunnable implements Runnable{
    Chat m;
    QRunnable(Chat m1){
        this.m = m1;
    }
    public void run(){
        for(int i = 0 ;i<3;i++){
            m.Question("What is your Name??"+i);
        }
        
    }
}
class ARunnable implements Runnable{
    Chat m;
    ARunnable(Chat m1){
        this.m = m1;
    }
    public void run(){
        for(int i = 0 ;i<3;i++){
            m.Answer("My name is sanjana"+i);
        }
    }
}
public class ChatBot{
    public static void main(String[] args){
        Chat m1 = new Chat();
        QRunnable q = new QRunnable(m1);
        ARunnable a = new ARunnable(m1);
        Thread question = new Thread(q,"questioning_thread");
        Thread answer = new Thread(a,"answering_thread");
        question.start();
        answer.start();
    }
}
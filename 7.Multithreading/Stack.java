public class Stack {
    private int[] array;
    private int stacktop;
    Object lock;
    public Stack(int capacity){
        array = new int[capacity];
        stacktop = -1;
        lock = new Object();
    }

    public boolean isempty(){
        return stacktop<0;
    }

    public boolean isfull(){
        return stacktop >= array.length - 1;
    }

    public synchronized boolean push(int element){
        // synchronized(lock){
            if(isfull()) return false;
            ++stacktop;

            try{Thread.sleep(1000);}catch(Exception e){}
            array[stacktop] = element;
            return true;
        // }
    }

    public synchronized int pop(){
        // synchronized(this){
            if(isempty())return Integer.MIN_VALUE;
            int obj = array[stacktop];
            array[stacktop] = Integer.MIN_VALUE;
        
            try{Thread.sleep(1000);}catch(Exception e){}

            stacktop--;
            return obj;
        // }
    }

    public static void main(String args[]){
        System.out.println("main is starting...");
        Stack stack = new Stack(5);

        new Thread(()->{
            int counter = 0;
            while(++counter < 10)
                System.out.println("Pushed: "+stack.push(100));
        },"Pusher").start();

        new Thread(()->{
            int counter = 0;
            while(++counter < 10)
                System.out.println("Popped : "+stack.pop());
        },"Popper").start();

        System.out.println("main is ending...");
    }

}

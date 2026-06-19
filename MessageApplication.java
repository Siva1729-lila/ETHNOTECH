import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class messagesender extends Thread{
    public messagesender(String name){
        super(name);
    }
    public void run(){
            try {
                for (int i = 1;i<=2; i++) {
                    System.out.println(getName()+" "+"sending message"+" "+i);
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                System.out.println(e);
            }
            System.out.println("Message sent successfully");
    }
}
public class MessageApplication{
    public static void main(String[] args) throws InterruptedException {
        ExecutorService objectName=Executors.newFixedThreadPool(I)
        for (int i=0;i<5;i++){
            Runnable messageSender1=new messageSender(name:""+ i);
            objectName.execute(messageSender1);

        }
        objectName.shutdown();
        while





        messagesender s=new messagesender("Yash");
        messagesender s2=new messagesender("Hello");

        //set priority
        s.setPriority(Thread.MAX_PRIORITY);
        s2.setPriority(Thread.MIN_PRIORITY);
        System.out.println("message sender started"+s.getName()+s.getState());
        System.out.println("message sender started"+s2.getName()+s2.getState());        

        s.start();
        s2.start();
        System.out.println("message sent"+s.isAlive());
        System.out.println("message sent"+s2.isAlive());
        //main thread waits
        s.join();
        s2.join();

    }
}
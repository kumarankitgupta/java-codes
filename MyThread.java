public class MyThread extends Thread {
    public void run(){
        System.out.println("New Thread class");
    }
}
class Main{
    public static void main(String[] args) {
        MyThread th = new MyThread();
        th.start();
    }
}


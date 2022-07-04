public class Mythreadv2 extends Thread{
    public void run(){
        for(int i = 0 ;  i <= 10  ; i++){
            System.out.println(i);
        }
    }
}
class Main1{
    public static void main(String[] args) {
        Mythreadv2 th1 = new Mythreadv2();
        Mythreadv2 th2 = new Mythreadv2();
        th1.start();
        th2.start();
    }
}

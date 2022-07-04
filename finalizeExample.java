public class finalizeExample {
    int a; // final variable
    int b;
    static int count = 0;
     finalizeExample(int x , int y){
        this.a = x;
        this.b = y;
    }
    void show(){
        System.out.println("A = "+a+" B = "+b);
    }
    void change(){
        System.out.println(this.b);
    }
    static void name(){
        System.out.println("My name is gupta");
    }
    void countobj(){
        count++;
        System.out.println("Count = "+count);
    }
    public static void main(String[] args) {
        finalizeExample ob = new finalizeExample(3,4);
        finalizeExample ob1 = new finalizeExample(5,6);

        ob.show();
        ob.a = 4;   // a reassign error because a is declared as final
        ob. b = 5;
        System.out.println(ob.a);
        ob1.show();
        ob1.b = 55;
        ob1.change();
        ob1.show();
        name();
        ob.countobj();
        ob1.countobj();
    }
}

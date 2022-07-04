public class cons {
    int roll;
    public cons(){   // user defined const..
        roll = -1;
    }
    public cons(int x){  // parameter 
        roll = x;
    }
    public cons(cons ob){
        roll = ob.roll;
    }

    public static void main(String[] args) {
        //  user defined default type const....
        cons ob = new cons();
        ob.roll = 32;
        System.out.println("for ob "+ob.roll);

        // parametrized const...
        cons ob1 = new cons(3);
        System.out.println("for ob1 "+ob1.roll);

        // copy constructor...
        cons obp =  new cons();
        obp.roll = 34;

        cons obn = new cons(obp);
        System.out.println(obn.roll);

        
    }
}

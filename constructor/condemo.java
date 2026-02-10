class demo {
    int x = 10;  // instance variable
    static int y = 20;  // static variable
    static {
        System.out.println("in static block");     // static block 
    }
    demo(){
        System.out.println("in construtor");     // constructor
    }
    void fun(){
        System.out.println("in fun");        // instance method
    }
    static void run(){                    // static method
        System.out.println("in run");
    }
    public static void main(String[] args){     // static method
        System.out.println("in main");
        run();
        demo obj =new demo(); 
                                                // object 
        obj.fun();
    }
}                                                   //prirority
                                                    //static variable 
                                                    // static block
                                                    // static method
                                                    // instance variable
                                                    // instance block
                                                    // constructor
                                                    // instance method
                                                    // important is static block are merge
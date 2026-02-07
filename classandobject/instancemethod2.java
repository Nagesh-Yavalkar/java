class demo {
    int x= 10;
    int y = 20;
    void fun(){
        System.out.println("in fun");
    }
    void run(){
        System.out.println("in run");
    }
    public static void main(String[] args){
        demo obj = new demo();
        System.out.println(obj.x);   // instance variable access using object
        System.out.println(obj.y);
        obj.fun();              // instance method access using object because method reference present in object
        obj.run();
    }
}
class demo {
    int x = 10;
    int y = 20;
    void fun(){
        System.out.println(x);
        System.out.println(y);
    }
    public static void main(String[] args){
        demo obj= new demo();                  // first stemp create object then object call to the constructor for assigning instance variable
                                                // so whenever assign is complete then fun method call and its print x and y
        obj.fun();
    }
}
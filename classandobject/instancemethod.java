class demo{
    int x = 10;
    void fun(){
        System.out.println("in fun");
    }
    public static void main(String[] args){
        demo obj =new demo();
        System.out.println(obj.x);
        obj.fun();                // in that case memory assign ny the object for instance variable and instance method 
                                    // if you write only fun(); then it gives error because reference present in object 
                                    // so you should declare obj.fun();
}
}
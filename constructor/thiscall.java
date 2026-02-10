class demo{
    demo(){
        System.out.println("non argument constructor");
    }
    demo(int x){
        this();   // in this store object reference for passing consturctor so it call to the non argument constructor 
        System.out.println("parameterized constructor");
    }
    public static void main(String[] args){
        demo obj = new demo(10);  // here parameter is pass so it call to the parameterized constructor
    }
}
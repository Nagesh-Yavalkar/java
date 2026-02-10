class demo{
    demo(){
        System.out.println("in non argument constructor");
    }
    demo(int z){
        System.out.println("in parameterized constructor");
    }
    public static void main(String[] args){
        demo obj = new demo();     // whenever you pass parameter it call to the parameterized constructor otherwise non argument constructor
    }
}
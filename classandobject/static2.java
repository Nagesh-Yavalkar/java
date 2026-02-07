class demo{
    static int x = 10;
    static{
        System.out.println("in static block"); 
            }
    static void fun(){
        System.out.println("static method fun");
    }
    public static void main(String[] args){
        System.out.println(x);
        fun();
       
    }
}                                                            // first static block run in that priority first for static variable 
                                                            // here static variable print on main method so it come next on static block
                                                            // priority is 
                                                            // static variable 
                                                            // static block
                                                            // static method
                                                            //instance variable
                                                            // instance block
                                                            // constructor
                                                            // instance method

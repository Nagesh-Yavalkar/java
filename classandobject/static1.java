class demo{
    static{
        System.out.println("in static block");        // here static block execute first because in special character first priority for static block
                                                        // after main method
                                                        // see bytecode
    }
    public static void main(String[] args){
        System.out.println("in main");
    }
}
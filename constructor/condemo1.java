class demo{
    demo(){
        System.out.println("in constructor");
        System.out.println(this);

    }
    public static void main(String[] args){         // output is :  in constructor
                                                                    //demo@7ad041f3
                                                                    //demo@7ad041f3 
                                                                    // because reference of the object store in this for intialize instance variable
        demo obj = new demo();           // here whenever create an object there two works is happen that is memory create and call constructor
        System.out.println(obj);
    }
}
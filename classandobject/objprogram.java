class demo{
    int x = 10;
    public static void main(String[] args){
        demo obj = new demo();    
        System.out.println(x);       // non-static variable x cannot be referenced from a static context
    }
}
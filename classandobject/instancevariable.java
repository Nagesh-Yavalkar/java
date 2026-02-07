public class instancevariable{
    int x = 10;
    int y = 20;         // here both are instance variable or non static variable 


public static void main(String[] args){
    System.out.println(x);      // this method is static so non static variable cannot access or it gives error
    System.out.println(y);
}
}  
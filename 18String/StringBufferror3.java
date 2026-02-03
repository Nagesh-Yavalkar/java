// Error in StringBuffer
public class StringBufferror3{
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("Nagesh");
        StringBuffer str2 = new StringBuffer("Yavalkar");
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
        System.out.println(str2);
        System.out.println(System.identityHashCode(str2));
        str1 = str1.concat(str2);                             // it gives also error that is cannot find symbol
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));
        System.out.println(str2);
        System.out.println(System.identityHashCode(str2));
    }
}
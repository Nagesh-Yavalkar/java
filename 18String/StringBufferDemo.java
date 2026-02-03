// Correct code for StringBuffer
public class StringBufferDemo{
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("Nagesh");
        StringBuffer str2 = new StringBuffer("Yavalkar");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(System.identityHashCode(str1)); 
        str1 = str1.append(str2);               // this is correct method for StringBuffer
        System.out.println(str1);
         System.out.println(System.identityHashCode(str1));    // the object is created in same object beacuse of same hashcode so 
                                                                // StringBuffer is mutuable

    }
}
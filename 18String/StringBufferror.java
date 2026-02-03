// Errors in StringBuffer


public class StringBufferror{
    public static void main(String[] args){
        StringBuffer str1 = new StringBuffer("Nagesh");     // there is only one method for representing the stringbuffer
        System.out.println(str1);                 //Nagesh
        System.out.println(System.identityHashCode(str1));
        str1 = str1 +"Yavalkar";                // it gives error that is incompatable types
                                                //  because "Yavalkar" is String and String is not converted into StringBuffer 
        System.out.println(str1);
        System.out.println(System.identityHashCode(str1));


        

    }
}
import java.util.*;
public class StringDemo{
    public static void main(String[] args){
        String str1 = "Nagesh";
        String str2= new String("Nagesh");
        String str3= "Nagesh";
        
        String str4= new String("Nagesh");
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
        if(str1==str3){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        if(str2==str4){
            System.out.println("equal");
        }
        else{
            System.out.println("not equal");
        }
        System.out.println(System.identityHashCode(str1));
        System.out.println(System.identityHashCode(str2));
        System.out.println(System.identityHashCode(str3));
        System.out.println(System.identityHashCode(str4));
    }
}
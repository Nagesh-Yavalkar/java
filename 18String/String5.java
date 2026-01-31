
public class String5{
    public static void main(String[] args){
        String str1 = "Kanha";
        String str2 = "Ashish";
        String str3 = "KanhaAshish";                    
        String str4 = str3.intern();                  // intern means go on scp and compare and copy address in java stack so last condition is true this is help for memory management.
        System.out.println(str1);                    
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str3==str4);
    }
} 
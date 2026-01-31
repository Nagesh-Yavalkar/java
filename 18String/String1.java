// refrence and content compare
public class String1{
    public static void main(String[] args){
        String str1 = "Kanha";
        String str2 = new String("Kanha");
        System.out.println(str1==str2);
        System.out.println(str1.equals(str2));

    }
}
public class stringobject{
    public static void main(String[] args){
        String str1 = "Nagesh";         // first object on scp
        String str2 = "Anil";           //second object on scp
        System.out.println(str1);
        System.out.println(str2);
        
        System.out.println(str1+"Yavalkar");                // In this line tempory object is created
                 
        System.out.println(System.identityHashCode(str1));      // hashcode of first string
        System.out.println(System.identityHashCode(str2));      // hashcode of second string
        
    }
}
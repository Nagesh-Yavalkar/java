public class immutable1{
    public static void main(String[] args){
        String str1 = "Nagesh";
        String str2 = "Anil";
        String str3 = "Yavalkar";
        System.out.println(System.identityHashCode(str1));      // hashcode of first string
        System.out.println(System.identityHashCode(str2));      // hashcode of second string
        System.out.println(System.identityHashCode(str3));     // hashcode of third string
        str3 = str3+"IIT";
         System.out.println(System.identityHashCode(str1));      // hashcode of first string
        System.out.println(System.identityHashCode(str2));      // hashcode of second string
        System.out.println(System.identityHashCode(str3));      // in that case hase code is change because
                                                                //  new string is created on heap section so str3 reference 
                                                                // to new string not a scp section string so garbage collector collect 
                                                                // the scp string.
                                                                // due to that string is immutable

    }

        
}
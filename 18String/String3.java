// what changes occur in heap when concatanation perform
public class String3{
    public static void main(String[] args){
        String str1 = "Kanha";
        String str2 = "Ashish";
        String str3 = "KanhaAshish";                    
        String str4 = str1 +str2;                   // here memory allocation in Heap because whenever operation performed it create new string which on heap secrion
        System.out.println(str1);                   // String str4 = str1.concat(str2); it is also same it create new memory on heap section 
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
} 
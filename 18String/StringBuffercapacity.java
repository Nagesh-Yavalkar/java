// capacity of StringBuffer
public  class StringBuffercapacity{
static public void main(String[] args){
    StringBuffer sb1 =  new StringBuffer();                 // empty StringBuffer capacity is 16 
    StringBuffer sb2 = new StringBuffer("Nagesh");          // here capacity is 16+6 = 22 
    StringBuffer sb3 = new StringBuffer("Yavalkar");       // here capacity is 16+8=24           
    System.out.println(sb1.capacity());
    System.out.println(sb2.capacity());
    System.out.println(sb3.capacity());
}
}
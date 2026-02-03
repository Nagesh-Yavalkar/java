public class Capacity{
    public static void main(String[] args){
        StringBuffer sb = new StringBuffer();
        System.out.println(sb.capacity());              // 16 here empty stringbuffer capacity is 16
        sb.append("Nagesh");
        System.out.println(sb.capacity());              //16  here nagesh contains only 6 so it is range in 16 or below 16 so output is 16
        sb.append("Anil");
        System.out.println(sb.capacity());              //16 anil contains only 4 and Nagesh 6 so total is 10 it is range in 16 or below 16 so output is 16 
        sb.append("Yavalkar");                          
        System.out.println(sb.capacity());              //34 Whenever add Yavalkar it break 16 then it use formula that is current (capacity+1)*2 so size is 34
    }
}
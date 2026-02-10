class company{
    String cmpName= "Microsoft";
    String cmpLoc = "pune";
    company(){
        System.out.println("in comapany constructor");
    }
    void cmpInfo(){
        System.out.println(cmpName);
        System.out.println(cmpLoc);
    }
}
class employee extends company{
    String empName = "Nagesh";
    double empSal = 2.5;
    employee(){
        System.out.println("in employee constructor");
    }
    void empInfo(){
        System.out.println(empName);
        System.out.println(empSal);
    }
}
class client {
    public static void main(String[] args){
        company cmp =new company();
        cmp.cmpInfo();
        employee emp = new employee();
        emp.empInfo();
    }
}
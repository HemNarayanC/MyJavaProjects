public class JavaObject01 {
    String name;
    int roll_no;
    public void getNameRollNo(String n, int roll){
        name=n;
        roll_no=roll;
        System.out.println("Name= "+name);
        System.out.println("Roll_No= "+roll_no);
    }

    public static void main(String[] args)
    {
        JavaObject01 sc = new JavaObject01();
        sc.getNameRollNo("John", 2);
    }
}

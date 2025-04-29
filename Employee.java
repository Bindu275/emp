public class Employee{
    String name;
    int id ;
    double salary;
    String address;
    public Employee(String name,int id,double salary,String address){
        this.name=name;
        this.id=id;
        this.salary=salary;
        this.address=address;
    }
    public void displayInfo(){
        System.out.println("Employee ID:" + id);
        System.out.println("Employee Name:" +name);
        System.out.println("Emloyee Salary:" +salary);
        System.out.println("Employee Address:" +address);
    }
    public static void main(String[] args) {
        Employee emp1=new Employee("Bindu",101,50000.0,"Davanagere");
        emp1.displayInfo();
    }
}
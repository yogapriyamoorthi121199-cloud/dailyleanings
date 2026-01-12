 class Employee1 {
     String Employeename;
     int Employeeid;
     int Employeesalary;
 }
     public class Employee {
        public static void main(String[] args)
        {
            Employee1 a=new Employee1();
            a.Employeename="Priya";
            a.Employeeid=567;
            a.Employeesalary=5000;
            Employee1 b=new Employee1();
            b.Employeename="Shalini";
            b.Employeeid=789;
            b.Employeesalary=3000;
            System.out.println(a.Employeename);
            System.out.println(a.Employeeid);
            System.out.println(a.Employeesalary);
            System.out.println(b.Employeename);
            System.out.println(b.Employeeid);
            System.out.println(b.Employeesalary);
        }
     }



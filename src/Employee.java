import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CompanyEmployee[] employees=new CompanyEmployee[10];

        for(int i=0;i<10;i++){
            System.out.print("Enter your name:");
            String name=sc.next();

            System.out.print("Enter your Id:");
            int id= sc.nextInt();

            System.out.print("Enter our basesalary:");
            double salary=sc.nextDouble();

            System.out.print("enter the job type:");
            String type= sc.next();



switch (type){

    case "Manager":
    Manager manage=new Manager();
     manage.setName(name);
     manage.setId(id);
     manage.setTeamSize(20);
     manage.setBaseSalary(salary);
     manage.calculate();
     employees[i]=manage;
     System.out.println("Total salary of Manager: " + (salary + manage. calculate()));
     break;

    case "Developer":
    Developer developer=new Developer();
    developer.setName(name);
    developer.setId(id);
    developer.setLanguage("English");
    developer.setBaseSalary(salary);
    developer.calculate();
    employees[i]=developer;
    System.out.println("Total salary of Developer: " + (salary + developer. calculate()));
break;

    case "Intern":
    Intern intern=new Intern();
    intern.setName(name);
    intern.setId(id);
    intern.setUniversity("Jaffna");
    intern.setBaseSalary(salary);
    intern.calculate();
    employees[i]=intern;
        System.out.println("Total salary of intern: " + (salary + intern. calculate()));
break;

    default:
        System.out.println("Invalid job type!");
        break;
}



        }


    }
}

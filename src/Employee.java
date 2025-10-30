import java.util.Scanner;
public class Employee {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        CompanyEmployee[] employees=new CompanyEmployee[10];

        for(int i=0;i<10;i++){
            System.out.print("Enter your name:");
            String name=sc.next();

            System.out.print("Enter your Id");
            int id= sc.nextInt();

            System.out.println("Enter our basesalary");
            double salary=sc.nextDouble();

            System.out.println("enter the job type");
            String type= sc.next();



switch (type){

    case "Manager":
    Manager manage=new Manager();
     manage.setName(name);
     manage.setId(id);
     manage.setTeamSize(20);
     manage.setBaseSalary(salary);
     System.out.println("Total salary of manager"+salary+salary*0.3);

    case "Developer":
    Developer developer=new Developer();
    developer.setName(name);
    developer.setId(id);
    developer.setLanguage("English");
    developer.setBaseSalary(salary);
    System.out.println("Total salary of developer"+salary+salary*0.2);


        
}



        }

    }
}

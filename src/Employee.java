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

        
}



        }

    }
}

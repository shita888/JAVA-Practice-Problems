import java.util.ArrayList;
import java.util.Scanner;
class Student{ 
    int id;
    String name;
    int age;

    Student(int id,String name ,int age){
        this.id = id;
        this.name = name;
        this.age = age;
    }

    void manuStd(){
        System.out.print("Enter ID:");
        System.out.print("Enter Name:");
        System.out.print("Enter Email:");
  
    }
    

    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    
}



public class SMain{
    public static void main(String[] args) {
      ArrayList<Student> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Name:");
        String name = sc.nextLine();

        System.out.print("Enter Age:");
        int age = sc.nextInt();
 

        Student obj = new Student(id , name, age);
        obj.manuStd();
        int choice=0;

        // do{ 
        //     switch (choice) {
        //        case 1:
        //            System.out.println("Add New Student");
        //            break;
        //        case 2:
        //            System.out.println("Display Students");
        //            break;
        //        case 3:
        //            System.out.println("Exit");
        //            break;
        //        default:
        //            System.out.println("Invalid Choice");
        //            break;
        //     }
        // }while(choice!=3); 
 
        al.add(obj);

        System.out.println("\n----Student Details----");
        obj.display();
  }
}

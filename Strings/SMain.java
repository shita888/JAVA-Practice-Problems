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

    void display(){
        System.out.println("ID:"+id);
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
    }
    
}
public class SMain{
  public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter ID:");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name:");
        String name = sc.nextLine();
        System.out.print("Enter Age:");
        int age = sc.nextInt();

        Student obj = new Student(id , name, age);
        System.out.println("\n----Student Details----");
        obj.display();
  }
}

package ArrayList_Java;
//3 Student objects banao aur ArrayList<Student> me store karo. 
// Phir sabke naam print karo.
import java.util.*;  

public class Student1 {
        int ID;
        String Name;
        int Age;

    Student1(int ID,String Name,int Age){
        this.ID = ID;
        this.Name = Name;
        this.Age = Age;
    }

    // void setID(){
    //     System.out.println("Old ID:"+ID);
    //     System.out.print("Enter New ID:");
    //     int a = sc.nextInt();
    //     ID = a;
    // }

    void display(){
        System.out.println("------Students Details------");
        System.out.println("ID:"+ID);
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
    } 



    public static void main(String[] args) {
        ArrayList<Student1> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 

        System.out.print("No. of Students:");
        int n = sc.nextInt(); 

        while(n>0){
            System.out.print("Enter ID:");
            int id = sc.nextInt();
            sc.nextLine();
            System.out.print("Enter Name:");
            String name = sc.nextLine();
            System.out.print("Enter Age:");
            int age = sc.nextInt();

            Student1 obj = new Student1(id,name,age);
            al.add(obj);
            n--;
        }

        // for(Student1 i : al){ 
        //     i.display();  
        // }

        // System.out.print("Enter Rollno to Search:");
        //  int Id= sc.nextInt(); 
        //  for(Student1 i : al){ 
        //     if(Id == i.ID){ 
        //         i.display();
        //         break;
        //     }
        // }  

        System.out.print("Enter Rollno for Updates:");
         int Id= sc.nextInt();  
         for(Student1 i : al){ 
            if(Id == i.ID){  
                i.display(); 

                System.out.println("\n----Manu----");
                System.out.println("1: Update ID");
                System.out.println("2: Update Name");
                System.out.println("3: Update Age");

                System.out.print("Enter your choice:");
                int c=sc.nextInt();

                switch (c) {
                    case 1:
                                System.out.println("Old ID:"+i.ID);
                                System.out.print("Enter New ID:");
                                int a = sc.nextInt();
                                i.ID = a;
                        break;
                    case 2:
                        System.out.println("Update Name");
                        break;
                    case 3:
                        System.out.println("Update Age");
                        break;
                    default:
                        System.out.println("Invalid Choice");
                        break;
                }

                System.out.println("------Updated Detail------");
                i.display();
                break;
            }
        }  







    }

}

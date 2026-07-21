package ArrayList_Java;
// 3 Student objects banao aur ArrayList<Student> me store karo. 
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

    void manuSMS(){
        System.out.println("\n------- Manu Of SMS -------");
        System.out.println("1: add Student");
        System.out.println("2: display Student"); 
        System.out.println("3: search Student"); 
        System.out.println("4: update Student");
        System.out.println("5: remove Student"); 
        System.out.println("6: Exit");
    }

    void display(){
        System.out.println("------Students Details------");
        System.out.println("ID:"+ID);
        System.out.println("Name:"+Name);
        System.out.println("Age:"+Age);
    } 
 
    public static void main(String[] args) {

        ArrayList<Student1> al = new ArrayList<>();
        Scanner sc = new Scanner(System.in); 
        Student1 std = new Student1(0, null, 0);
        int p=0;
        do{
            std.manuSMS();
            System.out.print("Enter your choice:");
            p = sc.nextInt();

            switch(p){
                case 1:
                    // add
                    System.out.print("Enter ID:");
                    int id = sc.nextInt();
                    sc.nextLine();

                    boolean b = false;
                    for(Student1 i : al){ 
                    if(id == i.ID){  
                        System.out.println("Error!, ID Already Exist.");
                        b = true;
                        break; 
                      }
                    } 
                    if(b==true){
                        continue;
                    }

                    System.out.print("Enter Name:");
                    String name = sc.nextLine();
                    System.out.print("Enter Age:");
                    int age = sc.nextInt();

                    Student1 obj = new Student1(id,name,age);
                    al.add(obj);
                    break;
                case 2:
                    // display
                    
                    for(Student1 i : al){ 
                        i.display();  
                        }
                    break;
                case 3:
                    // search
                    System.out.print("Enter Rollno to Search:");
                    int Id= sc.nextInt(); 
                    for(Student1 i : al){ 
                        if(Id == i.ID){ 
                            i.display();
                        break;
                        }
                    } 
                    break;
                case 4:
                    // update
                    System.out.print("Enter Rollno for Updates:");
                       Id= sc.nextInt();  
                    for(Student1 i : al){ 
                        if(Id == i.ID){  
                // i.display(); 

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
                            System.out.println("Old Name:"+i.Name);
                            sc.nextLine();
                            System.out.print("Enter New Name:");
                            String a1 = sc.nextLine();
                            i.Name = a1;
                        break;
                    case 3:
                            System.out.println("Old Age:"+i.Age);
                            System.out.print("Enter New Age:");
                            int a3 = sc.nextInt();
                            i.Age = a3;
                        break;
                    default:
                            System.out.println("Invalid Choice");
                        break;
                    }
                    System.out.println();
                    i.display();
                    break;
                    }
                }
                    break;
                case 5:
                    // remove
                    break;
                case 6:
                    // exit
                    break;
                default :
                    System.out.println("Invalid Choice");
            }

        }while(p!=6);


        // System.out.print("No. of Students:");
        // int n = sc.nextInt(); 

        // while(n>0){
        //     System.out.print("Enter ID:");
        //     int id = sc.nextInt();
        //     sc.nextLine();

        //   boolean b = false;
        //  for(Student1 i : al){ 
        //     if(id == i.ID){  
        //          System.out.println("Error!, ID Already Exist.");
        //          b = true;
        //          break; 
        //     }
        //  } 
        //   if(b==true){
        //      continue;
        //   }

        //     System.out.print("Enter Name:");
        //     String name = sc.nextLine();
        //     System.out.print("Enter Age:");
        //     int age = sc.nextInt();

        //     Student1 obj = new Student1(id,name,age);
        //     al.add(obj);
        //     n--;
        // }


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

        // System.out.print("Enter Rollno for Updates:");
        //  int Id= sc.nextInt();  
        //  for(Student1 i : al){ 
        //     if(Id == i.ID){  
        //         // i.display(); 

        //         System.out.println("\n----Manu----");
        //         System.out.println("1: Update ID");
        //         System.out.println("2: Update Name");
        //         System.out.println("3: Update Age");

        //         System.out.print("Enter your choice:");
        //         int c=sc.nextInt();

        //         switch (c) {
        //             case 1:
        //                     System.out.println("Old ID:"+i.ID);
        //                     System.out.print("Enter New ID:");
        //                     int a = sc.nextInt(); 
        //                     i.ID = a;
        //                 break;
        //             case 2:
        //                     System.out.println("Old Name:"+i.Name);
        //                     sc.nextLine();
        //                     System.out.print("Enter New Name:");
        //                     String a1 = sc.nextLine();
        //                     i.Name = a1;
        //                 break;
        //             case 3:
        //                     System.out.println("Old Age:"+i.Age);
        //                     System.out.print("Enter New Age:");
        //                     int a3 = sc.nextInt();
        //                     i.Age = a3;
        //                 break;
        //             default:
        //                     System.out.println("Invalid Choice");
        //                 break;
        //         }
        //         System.out.println();
        //         i.display();
        //         break;
        //     }
        // }  







    }

}

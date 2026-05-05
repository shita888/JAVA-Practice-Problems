import java.util.Scanner;
public class Manu{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("* * * * * MANU * * * * *");
        System.out.println();
        System.out.println("1.Register");
        System.out.println("2.Login");
        System.out.println("3.Exit");

         
        System.out.print("Choose number from the given Option: ");
        int num = sc.nextInt();

        if(num==1){

            User obj = new User("Shital","emailname","hel123");
            String a = obj.getname();
            System.out.println(a);
            String b = obj.getemail();
            System.out.println(b);
            String c = obj.getpassword();
            System.out.println(c);

        }else if(num==2){
            System.out.println("L");
        }else if(num==3){
            System.out.println("E");
        }else{
            System.out.println("Invalid Option");
        }

       
        
    }

}

class User{
         
      private  String name ;
      private  String email ;
      private  String password ; 

    User(String name,String email,String password){
        this.name = name;
        this.email = email;
        this.password = password;
    } 
    
    public String getname(){
        return name;
    }
    public String getemail(){
        return email;
    }
    public String getpassword(){
        return password;
    }

    }
public class Constructor01 {
    String name;
    int age;
    int roll;
    String cllg;

     Constructor01(){
         name = "Shital";
         age = 20;
         roll = 15090;
         cllg = "SVVV";
        } 
        

     Constructor01(String n,int a,int r,String c){
         name = n;
         age = a;
         roll = r;
         cllg = c;
        }
    
    public static void main(String[] args) {
        //  Constructor01 obj = new Constructor01();
        // obj.name = "Shital";
        // obj.age = 20;
        // obj.roll = 15090;
        // obj.cllg = "SVVV";

        // System.out.println(obj.name);
        // System.out.println(obj.age);
        // System.out.println(obj.roll);
        // System.out.println(obj.cllg); 


       Constructor01 obj2 = new Constructor01("Shital",19,15090,"Svvv"); 

        System.out.println(obj2.name);
        System.out.println(obj2.age);
        System.out.println(obj2.roll);
        System.out.println(obj2.cllg);

    }
}
